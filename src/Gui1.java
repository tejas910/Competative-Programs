import java.awt.Color;

import javax.swing.*;
public class Gui1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setLocation(100, 30);
		frame.setTitle("My Frame");
		frame.setBackground(Color.RED);
	}
}
