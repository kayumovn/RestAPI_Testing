package javaSession;

import java.util.Formatter;
import java.util.Locale;

public class TestPoint {

	public static void main(String[] args) {
		System.out.println("Creating a Point Object.....");
		Point p1 = new Point();
		System.out.println("Initializing object....");
		p1.x=3;
		p1.y=4;
		double distance = p1.getDistance();
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("Distance of Point p1 ("+ p1.x + "," + p1.y + ")from origin is %.02f", distance);
        System.out.println(sb);
        System.out.println();
        sb.delete(0, sb.length());
        
        System.out.println("Creating another Point Object....");
        Point p2 = new Point();
        System.out.println("Initializing object....");
        p2.x = 8;
        p2.y = 9;
        distance=p2.getDistance();
        formatter.format("Distance of Point p2(" + p2.x + "," + p2.y + ")from origin is %.02f, ", distance);
        System.out.println(sb);
	}   
	

}
