package mainPackage;

public class Car extends Vehicle {
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2020;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive a car");
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}

}
