package Checkbox;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;



public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon;
	ImageIcon checkIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("/home/laurent/git/repository/BroCode/images/x-check.png");
		checkIcon = new ImageIcon("/home/laurent/git/repository/BroCode/images/check.png");
		
		Image xImage = xIcon.getImage();
		Image checkImage = checkIcon.getImage();
		
		Image xScaled = xImage.getScaledInstance(42, 42, Image.SCALE_SMOOTH);
		Image checkScaled = checkImage.getScaledInstance(42, 42, Image.SCALE_SMOOTH);

		
		ImageIcon xIconScaled = new ImageIcon(xScaled);
		ImageIcon checkIconScaled = new ImageIcon(checkScaled);

		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(xIconScaled);
		checkBox.setSelectedIcon(checkIconScaled);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
		
	}

}
