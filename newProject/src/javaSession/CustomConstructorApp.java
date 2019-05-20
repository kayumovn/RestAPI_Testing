package javaSession;

public class CustomConstructorApp {

	public static void main(String[] args) {
		System.out.println("Creating a Point1 object....");
		Point1 p= new Point1();
		Point1 p1 = new Point1(6);
		Point1 p2 = new Point1(20,30);
		System.out.println("\nPrinting Point1 object....");
		System.out.println(" Point1 p("+ p2.getX() +", "+ p2.getY() + ")");

	}

}
