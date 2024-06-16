package RadioButton;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	 
	MyFrame(){
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLayout(new FlowLayout());
	  
	 pizzaIcon = new ImageIcon("/home/laurent/git/repository/BroCode/images/pizza.png");
	 hamburgerIcon = new ImageIcon("/home/laurent/git/repository/BroCode/images/hamburger.png");
	 hotdogIcon = new ImageIcon("/home/laurent/git/repository/BroCode/images/hot-dog.png");
	  
	 pizzaButton = new JRadioButton("pizza");
	 hamburgerButton = new JRadioButton("hamburger");
	 hotdogButton = new JRadioButton("hotdog");
	  
	 ButtonGroup group = new ButtonGroup();
	 group.add(pizzaButton);
	 group.add(hamburgerButton);
	 group.add(hotdogButton);
	  
	 pizzaButton.addActionListener(this);
	 hamburgerButton.addActionListener(this);
	 hotdogButton.addActionListener(this);
	 
	 Image pizzaScaled = pizzaIcon.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	 Image hamburgerScaled = hamburgerIcon.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	 Image hotdogScaled = hotdogIcon.getImage().getScaledInstance(42, 42, Image.SCALE_SMOOTH);
	 	  
	 pizzaButton.setIcon(new ImageIcon(pizzaScaled));
	 hamburgerButton.setIcon(new ImageIcon(hamburgerScaled));
	 hotdogButton.setIcon(new ImageIcon(hotdogScaled));
	  
	 this.add(pizzaButton);
	 this.add(hamburgerButton);
	 this.add(hotdogButton);
	 this.pack();
	 this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizzaButton) {
			System.out.println("You ordered pizza!");
		}
		else if(e.getSource()==hamburgerButton) {
			System.out.println("You ordered a hamburger!");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered a hotdog!");
		}
	}

}
