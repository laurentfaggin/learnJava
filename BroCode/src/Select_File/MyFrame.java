package Select_File;
import java.awt.FlowLayout;


import java.awt.event.*;
import java.io.File;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		System.out.println(this.getSize());
		
		button = new JButton("Select a file");
		button.addActionListener(this);
		
		this.add(button);
		this.pack();
		this.setSize(420,420);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File(".")); // sets current directory
			
			int response = fileChooser.showOpenDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		
	}

}
