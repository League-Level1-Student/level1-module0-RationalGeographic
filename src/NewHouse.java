import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class NewHouse {
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
