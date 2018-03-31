import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Hooses {
	static NewHouse housy = new NewHouse();

	public static void main(String[] args) {

		Robot robo = new Robot();
		robo.setSpeed(10);
		robo.moveTo(50, 550);
		robo.penDown();
		int hite = 0;
		Color color = null;

		String height = JOptionPane
				.showInputDialog("How high do you want the building to be?\n Small, medium, or large?");
		String colour = JOptionPane
				.showInputDialog("What color do you want the building to be?\n Red, Green, or Blue?");
		String ruf = JOptionPane.showInputDialog("DO you want a flat roof or pointy roof?");

		if (height.equals("small")) {
			hite = 100;

		} else if (height.equals("medium")) {
			hite = 300;
		} else if (height.equals("large")) {
			hite = 500;
		}
		if (colour.equals("red")) {
			color = Color.RED;
		} else if (colour.equals("green")) {
			color = Color.GREEN;
		} else if (colour.equals("blue")) {
			color = Color.BLUE;
		}
		if (hite == 500) {
			JOptionPane.showMessageDialog(null, "large houses have to have flat roofs");
		}
		for (int i = 0; i < 10; i++) {
			housy.house(robo, hite, color, ruf);
		hotline(robo);
		}
	}

	public static void hotline(Robot robo) {

		housy.flatroof(robo);
	}
}