package Oop_a2.ass2.ass2re2.presenter;

/**
 * imagePresenter used as a slide show
 * uses the constructor of super class to make the frame with the center compontent that is displaying pictures 
 * the constructor of the slideshow takes in a string array in order to insert the files into the framework 
 * then the horizontal buttons go through the array of picture paths
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@SuppressWarnings("serial")
public class imagePresenter extends presenter {
	private JLabel panel;
	private int i = 0;
	private String[] images;
	
	public imagePresenter(String[] filepaths) {
		images = new String[filepaths.length];
		for(int i = 0; i < filepaths.length; i++) {
			images[i] = filepaths[i];
		}
	}
	
	public void showImage(String filename) {
		BufferedImage myPicture;
		try {
			myPicture = ImageIO.read(new File(filename));
			panel.setIcon(new ImageIcon(myPicture));
		} catch (IOException e) {
			System.out.println("suga min fak ju");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Component CreateCenterComponent() {
		panel = new JLabel();
		//panel.setPreferredSize(new Dimension(500,400));
		panel.setBackground(new Color(255,255,255));
		return panel;
	}

	@Override
	public void westButtonPressed() {
		if(i > 0) {
			i-=1;
		}
		showImage(images[i]);
		showText("Picture #" + (i+1));
	}

	@Override
	public void eastButtonPressed() {
		if(i < images.length-1) {
			i+=1;
		}
		showImage(images[i]);
		showText("Picture #" + (i+1));
	}

	@Override
	public void northButtonPressed() {
		// TODO Auto-generated method stub
	}

	@Override
	public void southButtonPressed() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		String[] image = new String[3];
		image[0] = "/home/asdf/Aoop/src/Oop_a2/ass2/ass2re2/presenter/dog.png";
		image[1] = "/home/asdf/Aoop/src/Oop_a2/ass2/ass2re2/presenter/duck.png";
		image[2] = "/home/asdf/Aoop/src/Oop_a2/ass2/ass2re2/presenter/empty.png";
		JFrame f = new JFrame();
		imagePresenter p = new imagePresenter(image);
		f.add(p);
		f.setPreferredSize(new Dimension(500,500));
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);	
	}
}
