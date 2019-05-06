package Oop_a2.lecture5.gui;

import javax.swing.*;
import java.awt.*;

public class TestButton {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("TestButton");

		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.NORTH);
		f.add(new JButton("Hej"), BorderLayout.CENTER);
		f.add(new JButton("Wojciech"), BorderLayout.SOUTH);
		f.add(new JButton("and"), BorderLayout.EAST);
		f.add(new JButton("Friends"), BorderLayout.WEST);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
	}

}