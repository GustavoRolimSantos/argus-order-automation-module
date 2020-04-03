package utils;

import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Utils {

	public static boolean isColorInRange(Color color1, Color color2) {
		int minRed1 = color1.getRed() - (color1.getRed() / 10);
		int minGreen1 = color1.getGreen() - (color1.getGreen() / 10);
		int minBlue1 = color1.getBlue() - (color1.getBlue() / 100 * 25);

		int maxRed1 = color1.getRed() + (color1.getRed() / 10);
		int maxGreen1 = color1.getGreen() + (color1.getGreen() / 10);
		int maxBlue1 = color1.getBlue() + (color1.getBlue() / 100 * 25);

		int red = color2.getRed(), green = color2.getGreen(), blue = color2.getBlue();

		return (red >= minRed1 && red <= maxRed1) && (green >= minGreen1 && green <= maxGreen1) && (blue >= minBlue1 && blue <= maxBlue1);
	}

	public static void alt(Robot robot, int event1, int event2, int event3, int event4) {
		robot.delay(50); // Optional
		robot.keyPress(KeyEvent.VK_ALT);

		robot.keyPress(event1);
		robot.keyRelease(event1);

		robot.keyPress(event2);
		robot.keyRelease(event2);

		robot.keyPress(event3);
		robot.keyRelease(event3);

		robot.keyPress(event4);
		robot.keyRelease(event4);

		robot.keyRelease(KeyEvent.VK_ALT);
	}
	
	public static void sendKeys(Robot robot, String keys) {
		for (char c : keys.toCharArray()) {

			boolean needUpper = Character.isUpperCase(c);

			c = Character.toLowerCase(c);
			
			if (c == '/') {
				Utils.alt(robot, KeyEvent.VK_NUMPAD0, KeyEvent.VK_NUMPAD0, KeyEvent.VK_NUMPAD4, KeyEvent.VK_NUMPAD7);
				continue;
			}

			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			if (KeyEvent.CHAR_UNDEFINED == keyCode) {
				throw new RuntimeException("[ERROR] Key code not found for character '" + c + "'");
			}
			if (needUpper) {
				robot.delay(25);
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.delay(25);
				robot.keyPress(KeyEvent.VK_SHIFT);
				robot.delay(25);
			}
			robot.keyPress(keyCode);
			robot.delay(25);
			robot.keyRelease(keyCode);
			robot.delay(25);
			if (needUpper) {
				robot.keyRelease(KeyEvent.VK_SHIFT);
				robot.delay(25);
			}
		}
	}
	
}
