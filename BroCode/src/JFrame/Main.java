package JFrame;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JFrame = a GUI window to add component to
		
//		JFrame frame = new JFrame(); // create a frame
//		frame.setTitle("JFrame title goes here"); // set title of a frame
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application but there are others options
//		frame.setResizable(false);  // prevent frame for being resized
//		frame.setSize(420,420); // set the x and y dimensions of a frame
//		
//        // Utilisation du chemin absolu																				// 
//        String imagePath = "/home/laurent/git/repository/BroCode/src/JFrame/logo-chocolatine.png";					//
//        ImageIcon imageIcon = new ImageIcon(imagePath);  // create an ImageIcon										//     	Probleme pour
//     // Get image from ImageIcon																					//     
//        Image image = imageIcon.getImage();																			//     	l'affichage de l'icone
//        																											//
//        // Scale the image to fit as window icon																	//	   	qui n'apparait pas	
//        Image scaledImage = image.getScaledInstance(32, 32, Image.SCALE_SMOOTH);									//
//        																											//	   	mais est-ce que le probleme
//        // Vérifier si l'image est chargée correctement																//
//        if (imageIcon.getImageLoadStatus() == java.awt.MediaTracker.COMPLETE) {										//	   	vient de linux?
//            frame.setIconImage(image.getScaledInstance(32, 32, Image.SCALE_SMOOTH));  // change icon of frame		//
//            System.out.println("Image loaded successfully.");														//
//        } else {																									//
//            System.err.println("Failed to load image: " + imagePath);												//
//        }																											//
//        
//        // frame.getContentPane().setBackground(Color.GREEN);
//        frame.getContentPane().setBackground(new Color(123,50,250));
//        frame.setVisible(true); // make frame visible
		
		MyFrame myframe = new MyFrame();
	}

}
