package JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {
	
	MyFrame(){
		this.setTitle("JFrame title goes here"); // set title of a this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application but there are others options
		this.setResizable(true);  // prevent this for being resized
		//this.setSize(420,420); // set the x and y dimensions of a this
		
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		JLabel label = new JLabel(); 
		label.setText("Yo boy!");    
		label.setHorizontalTextPosition(JLabel.CENTER);     // set text LEFT,CENTER,RIGHT of imageIcon
		label.setVerticalTextPosition(JLabel.TOP);          // set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(new Color(0x00FF00));           
		label.setFont(new Font("MV Boli", Font.PLAIN, 20));
		label.setIconTextGap(50);    // set gap of text to image
		label.setBackground(Color.black);   // set BG color
		label.setOpaque(true);     // display BG color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		// label.setBounds(100, 100, 250, 250);        // set x,y position within frame as well as dimensions

		// Utilisation du chemin absolu																				// 
		String imagePath = "/home/laurent/git/repository/BroCode/src/JFrame/logo-chocolatine.png";					//
		ImageIcon imageIcon = new ImageIcon(imagePath);  // create an ImageIcon										//     	Probleme pour
		// Get image from ImageIcon																					//     
		Image image = imageIcon.getImage();																			//     	l'affichage de l'icone
		//
		// Scale the image to fit as window icon																	//	   	qui n'apparait pas	
		Image scaledImage = image.getScaledInstance(32, 32, Image.SCALE_SMOOTH);									//
		//	   	mais est-ce que le probleme
		// Vérifier si l'image est chargée correctement																//
		if (imageIcon.getImageLoadStatus() == java.awt.MediaTracker.COMPLETE) {										//	   	vient de linux?
			this.setIconImage(image.getScaledInstance(32, 32, Image.SCALE_SMOOTH));  // change icon of this		//
			System.out.println("Image loaded successfully.");														//
		} else {																									//
			System.err.println("Failed to load image: " + imagePath);												//
		}	
		
		ImageIcon imageLabel = new ImageIcon(scaledImage);
		
		label.setIcon(imageLabel);
		
		// this.getContentPane().setBackground(Color.GREEN);
		this.getContentPane().setBackground(new Color(123,50,250));
		// this.setLayout(null);
		this.setVisible(true); // make this visible		
		this.add(label);
		this.pack();
	}
	
}
