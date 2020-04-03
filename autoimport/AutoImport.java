package autoimport;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import data.Client;
import data.Payment;
import data.Product;
import data.extraction.Extractor;
import data.sections.HeaderSection;
import data.validation.Validator;

public class AutoImport {

	private Robot robot;

	private Client client;
	private Payment payment;

	private Extractor extractor;
	private Validator validator;

	private ArrayList<Product> products = new ArrayList<>(), problem = new ArrayList<>();

	public AutoImport() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		validator = new Validator(robot);
		extractor = new Extractor(this);
	}

	public void execute(File file) {
		cleanUp();

		extractor.execute(file);

		System.out.println("[Extraction] " + products.size() + " loaded to " + payment.getTipo_do_registro());

		if (!canExecute())
			return;

		try {
			Thread.sleep(500);

			if (hasError())
				return;

			new HeaderSection(this);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	/* Reset */

	private void cleanUp() {
		validator.cleanUp();

		client = null;
		products.clear();
		problem.clear();
		payment = null;
	}
	
	/* Error avoiding */
	
	private boolean canExecute() {
		int opt = JOptionPane.showConfirmDialog(null,
				"Importação de " + products.size() + " produtos.\nCliente: " + client.getNome_do_cliente()
						+ "\n\nEntre na tela Emissão no sistema Argus, quando estiver pronto clique em Sim.",
				"AutoImport - MaxterCreations", JOptionPane.INFORMATION_MESSAGE);

		if (opt != 0) {
			System.out.println("[EVENT] The user has cancelled the import.");
			return false;
		}
		return true;
	}
	
	private boolean hasError() {
		if (validator.checkError()) {
			if (!validator.isStopped()) {
				JOptionPane.showMessageDialog(null, "O AutoImport encontrou um erro no sistema Argus!", "AutoImport - MaxterCreations", JOptionPane.INFORMATION_MESSAGE);
			}
			System.out.println("[ERROR] Was found a problem on Argus.");
			return true;
		}
		
		return false;
	}
	
	/* Getters and Setters */

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public ArrayList<Product> getProblem() {
		return problem;
	}
	
	public Validator getValidator() {
		return validator;
	}
	
	public Robot getRobot() {
		return robot;
	}

}
