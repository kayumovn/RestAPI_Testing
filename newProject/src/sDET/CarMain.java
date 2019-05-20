package sDET;

public class CarMain {

	public static void main(String[] args) {
		// Assigning values for class by using constructor:
		Car c1 = new Car("Hyndai", 2008, "Blue");
		c1.display();
		// Assigning values for class variables by using reference of class:
		c1.model = "Toyota";
		c1.producedYear = 2005;
		c1.color = "white";
		c1.display();
		// Assigning values for class variables by using methods:
		c1.disp("Honda", 2006, "Black");
		c1.display();
		c1.display();

	}

}
