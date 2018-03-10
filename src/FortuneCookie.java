import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {

		new FortuneCookie().showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);

		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		button.setText("Sir But of Ton");
		
		frame.pack();
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if( rand == 0) {
			System.out.println("you will be eaten by a giant cartoon kitten");
		}
		if(rand == 1) {
			System.out.println("you will read this");
		}
		if(rand == 2) {
			System.out.println("you will win a prize sometime in the next 10 years");
		}
		if(rand == 3) {
			System.out.println("Bowser Jr. will beat you at mario cart");
		}
		if(rand == 4) {
			System.out.println("You will walk under a doorway within 20 ft of you");
		}
		}

}
