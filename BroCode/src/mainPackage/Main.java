package mainPackage;
/*import java.util.Scanner;  */
//import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * try(Scanner scanner = new Scanner(System.in)) {
		 * System.out.println("What is your name? "); String name = scanner.nextLine();
		 * 
		 * System.out.println("How old are you? "); int age = scanner.nextInt();
		 * 
		 * System.out.println("Hello "+ name); System.out.println("You have " + age +
		 * " years old"); }
		 */
		
		/*
		 * String name = JOptionPane.showInputDialog("Enter your name");
		 * JOptionPane.showMessageDialog(null, "Hello" + name);
		 */
		/*
		 * DiceRoller dice = new DiceRoller();
		 * 
		 * Car car = new Car(); 
		 * System.out.println(car.model); 
		 * car.drive();
		 */
		
		Car car = new Car();
		car.go();
		
		Bicycle bicycle = new Bicycle();
		bicycle.stop();
	}

}
