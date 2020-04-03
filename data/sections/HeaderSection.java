package data.sections;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import autoimport.AutoImport;
import utils.Utils;

public class HeaderSection {

	public HeaderSection(AutoImport autoImport) {
		
		Robot robot = autoImport.getRobot();

		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		// Salesman code

		robot.delay(200);
		Utils.sendKeys(robot, "20");
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_ENTER);

		// Client code

		robot.delay(200);
		Utils.sendKeys(robot, autoImport.getClient().getCodigo_do_cliente());
		robot.delay(100);
		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(200);
		
		new ProductSection(autoImport);
	}
	
}
