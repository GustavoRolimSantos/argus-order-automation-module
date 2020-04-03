package data.validation;

import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import utils.Utils;

public class Validator {
	
	private Robot robot;
	private boolean error = false, stopped = false, request = false;
	
	public Validator(Robot robot) {
		this.robot = robot;
	}

	public boolean checkError() {
		if (error)
			stopped = true;

		Color color2 = robot.getPixelColor(548, 385);

		if (Utils.isColorInRange(new Color(243, 201, 49), color2) || Utils.isColorInRange(new Color(243, 206, 59), color2) || Utils.isColorInRange(new Color(243, 206, 60), color2) || Utils.isColorInRange(new Color(243, 207, 62), color2)) {
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			request = true;
			robot.delay(700);
			return false;
		}

		return error;
	}

	public boolean isError() {
		Color color = robot.getPixelColor(602, 379), color2 = robot.getPixelColor(548, 385);

		if (Utils.isColorInRange(new Color(243, 201, 49), color2) || Utils.isColorInRange(new Color(243, 206, 59), color2) || Utils.isColorInRange(new Color(243, 206, 60), color2) || Utils.isColorInRange(new Color(243, 207, 62), color2)) {
			robot.keyPress(KeyEvent.VK_ENTER);
			request = true;
			robot.delay(500);
			return false;
		}

		if (!request && color.getRed() != 255 || color.getGreen() != 255 || color.getBlue() != 225)
			return true;

		return false;
	}
	
	public void cleanUp() {
		error = false;
		stopped = false;
		request = false;
	}
	
	public boolean isStopped() {
		return stopped;
	}
	
}
