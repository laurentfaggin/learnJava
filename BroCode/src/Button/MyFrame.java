package Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	
	MyFrame(){
		String imagePath = "/home/laurent/git/repository/BroCode/src/JFrame/logo-chocolatine.png";
		ImageIcon imageIcon = new ImageIcon(imagePath);     
		Image image = imageIcon.getImage();	
		Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(scaledImage);
			
		button = new JButton();
		button.addActionListener(e -> System.out.println("lambda"));
		button.setText("Click Me!");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic sans", Font.BOLD, 25));
		button.setIconTextGap(0);
		button.setForeground(Color.cyan);
		button.setBackground(Color.lightGray);
		button.setEnabled(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		
		this.addComponentListener(new ComponentAdapter(){
			public void componentResized(ComponentEvent e) {
				int frameWidth = getWidth();
				int frameHeight = getHeight();
				int buttonWidth = 200;
				int buttonHeight = 100;
				int x = (frameWidth - buttonWidth) / 2;
				int y = (frameHeight - buttonHeight) / 2;
				button.setBounds(x, y, buttonWidth, buttonHeight);

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("I was clicked");
		}
		
	}
	
	
}
