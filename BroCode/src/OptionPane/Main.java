package OptionPane;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		// 			     or inform them of something.
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Your computer doesn't have linux", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Call tech support", "title", JOptionPane.ERROR_MESSAGE);
		
		//YES_NO return an integer Yes = 0, No = 1, Cancel = 2, Close = -1
		 
		//int answer = JOptionPane.showConfirmDialog(null, "Lau, did you realize how coding is fun!", "coding is fun",JOptionPane.YES_NO_CANCEL_OPTION);
		
		// String name = JOptionPane.showInputDialog("What is you fu**in' name?: ");
		// System.out.println("Hello "+name+"!");
		
		String[] responses = {"No, you're awesome!", "thank you!", "*blush*"}; 
		
		String imagePath = "/home/laurent/git/repository/BroCode/src/JFrame/logo-chocolatine.png";
		ImageIcon imageIcon = new ImageIcon(imagePath);     
		Image image = imageIcon.getImage();	
		Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
		
		JOptionPane.showOptionDialog(
				null,
				"You're AWESOME !!!!",
				"Just for you",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
	}

}
