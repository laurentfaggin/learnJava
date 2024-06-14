package HowToOpenANewWindow;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	static int occurenceNumber = 1;
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("window number " + occurenceNumber);

	NewWindow(){
		occurenceNumber ++;	
		label.setBounds(0,0,500,50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
}
