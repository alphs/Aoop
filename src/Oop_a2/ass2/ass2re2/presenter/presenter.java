package Oop_a2.ass2.ass2re2.presenter;

/* Presenter Framework
 * uses a constructor to make a panel that contains 4 buttons and a text field (display)
 * it can update text with showText() function in the text field to a desired output 
 * the framework can also use buttons in order to manipulate the actions with actionListener
 * to complete the application the programmer needs to update the label to desigred output in the frame
 * of the superclass
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public abstract class presenter extends JPanel implements ActionListener {	
	JButton wButton = new JButton("West");
	JButton eButton = new JButton("East");
	JButton nButton = new JButton("North");
	JButton sButton = new JButton("South");

	JLabel textL = new JLabel("This box is not empty at default");
	
	public presenter() {
		JPanel bPanel = new JPanel();
		JPanel tPanel = new JPanel();
		
		setLayout(new BorderLayout());
		
		bPanel.setLayout(new BorderLayout());
		bPanel.add(wButton, BorderLayout.WEST);
		bPanel.add(eButton, BorderLayout.EAST);		
		bPanel.add(nButton, BorderLayout.NORTH);
		bPanel.add(sButton, BorderLayout.SOUTH);
		
		wButton.addActionListener(this);
		eButton.addActionListener(this);
		nButton.addActionListener(this);
		sButton.addActionListener(this);
		
		tPanel.setLayout(new BorderLayout());
		tPanel.add(textL, BorderLayout.CENTER);
		tPanel.add(bPanel, BorderLayout.WEST);		
		
		add(tPanel, BorderLayout.SOUTH);
		add(CreateCenterComponent(), BorderLayout.CENTER);

		this.setPreferredSize(new Dimension(500,500));
		
		setVisible(true);
	}

	public void showText(String text) {
		textL.setText(text);
	}
	
	public abstract Component CreateCenterComponent();
	
	public abstract void northButtonPressed();

	public abstract void eastButtonPressed();

	public abstract void southButtonPressed();

	public abstract void westButtonPressed();

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == wButton) {
			westButtonPressed();
		}
		else if(e.getSource() == eButton) {
			eastButtonPressed();
		}
		else if(e.getSource() == nButton) {
			northButtonPressed();
		}
		else if(e.getSource() == sButton) {
			southButtonPressed();
		}
	}
}