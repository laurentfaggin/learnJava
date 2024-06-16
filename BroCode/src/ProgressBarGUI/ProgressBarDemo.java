package ProgressBarGUI;
import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500);
	
	ProgressBarDemo(){
		
		bar.setValue(50);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();		
	}
	
	public void fill() {
		int counter = 0;
		
		while(counter<=500) {
			bar.setValue(counter);
			
			try {
				Thread.sleep(50);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			counter += 1;
		}
		bar.setString("Done! :)");		
	}
}
