package data.sections;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

import autoimport.AutoImport;
import data.Client;
import data.Payment;
import data.Product;
import utils.Utils;

public class EmissionSection {

	public EmissionSection(AutoImport autoImport) {
		Robot robot = autoImport.getRobot();
		Client client = autoImport.getClient();
		Payment payment = autoImport.getPayment();
		
		robot.delay(200);
		robot.keyPress(KeyEvent.VK_F9);
		
		// boleto, dinheiro ou cheque

		if (client.getForma_pagto().toLowerCase().startsWith("b")) {
			robot.delay(500);
			Utils.sendKeys(robot, "B");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(100);
			Utils.sendKeys(robot, "S");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			Utils.sendKeys(robot, payment.getPrazo_em_dias());
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
		} else if (client.getForma_pagto().toLowerCase().startsWith("d")) {
			robot.delay(500);
			Utils.sendKeys(robot, "D");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(100);
			Utils.sendKeys(robot, "A");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
		} else if (client.getForma_pagto().toLowerCase().startsWith("c")) {
			robot.delay(500);
			Utils.sendKeys(robot, "CCH");
			robot.delay(200);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_ENTER);
			Utils.sendKeys(robot, payment.getPrazo_em_dias());
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

		if (client.getStatus_do_pedido().contains("Bonifica")) {
			robot.delay(200);
			robot.mouseMove(692, 448);
			robot.delay(300);
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(200);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(700);
			Utils.sendKeys(robot, "BONIFICADO");
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

		robot.delay(300);
		robot.keyPress(KeyEvent.VK_F9);
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_ENTER);

		if (!autoImport.getProblem().isEmpty()) {
			String problemNames = "";
			for (Product p : autoImport.getProblem()) {
				problemNames += "\n-" + p.getNome_do_produto() + " (Código: " + p.getCodigo_do_produto() + "): "
						+ p.getQuantidade() + " unid";
			}

			JOptionPane.showMessageDialog(null, "Não foi possível importar os seguintes produtos:" + problemNames,
					"AutoImport - MaxterCreations", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
