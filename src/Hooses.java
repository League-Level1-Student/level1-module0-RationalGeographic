import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Hooses {
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
			house(robo, hite, color, ruf);
		}
	}
NewHouse housy = new NewHouse();

	public static void house(Robot robo, int hite, Color color, String ruf) {
		robo.setPenColor(color);
		robo.move(hite);
		if (hite == 500) {
			flatroof(robo);

		}

		else if (ruf.equals("flat")) {
			flatroof(robo);
		} else {
			pointyroof(robo);
		}

		robo.move(hite);
		robo.setAngle(90);
		robo.setPenColor(Color.green);
		robo.move(30);
		robo.setAngle(360);

	}

	public static void flatroof(Robot robo) {

		robo.turn(90);
		robo.move(40);
		robo.setAngle(180);

	}

	public static void pointyroof(Robot robo) {
		robo.turn(45);
		robo.move(30);
		robo.turn(90);
		robo.move(30);
		robo.setAngle(180);
	}

}
