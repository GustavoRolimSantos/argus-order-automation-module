package data.sections;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import autoimport.AutoImport;
import data.Product;
import data.validation.Validator;
import utils.Utils;

public class ProductSection {

	private AutoImport autoImport;
	private Validator validator;

	public ProductSection(AutoImport autoImport) {
		this.autoImport = autoImport;
		this.validator = autoImport.getValidator();

		for (Product product : autoImport.getProducts()) {
			insertProduct(product);
		}

		bonus();
		new EmissionSection(autoImport);

	}

	private void insertProduct(Product product) {
		if (validator.checkError()) {
			if (!validator.isStopped()) {
				JOptionPane.showMessageDialog(null,
						"O AutoImport encontrou um erro no sistema Argus!\nProduto: " + product.getNome_do_produto()
								+ " (" + product.getCodigo_do_produto() + ")",
						"AutoImport - MaxterCreations", JOptionPane.INFORMATION_MESSAGE);
			}
			System.out.println("[ERROR] Was found a problem on Argus.");
			return;
		}

		if (validator.isError()) {
			autoImport.getProblem().add(product);
		}

		Robot robot = autoImport.getRobot();

		// Product code
		robot.delay(200);
		Utils.sendKeys(robot, product.getCodigo_do_produto());
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_ENTER);

		// Product quantity
		robot.delay(200);
		Utils.sendKeys(robot, product.getQuantidade());
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(200);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(200);
	}

	private void bonus() {
		Robot robot = autoImport.getRobot();

		robot.delay(200);

		if (autoImport.getClient().getStatus_do_pedido().contains("Bonifica")) {
			for (int i = 0; i < 3; i++) {
				robot.delay(200);
				robot.keyPress(KeyEvent.VK_TAB);
			}

			robot.delay(200);
			Utils.sendKeys(robot, "100");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(300);
		}
	}

}
