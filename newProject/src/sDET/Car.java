package sDET;

public class Car {
String model;
int producedYear;
String color;

void display() {
	System.out.println(model);
	System.out.println(producedYear);
	System.out.println(color);
	// print by using single line statements:
	System.err.println(model+ " " +producedYear+ " " +color);}

void disp(String smodel, int Year, String scolor) {
	model = smodel;
	producedYear = Year;
	color = scolor;}
	
	Car(String smodel, int Year, String scolor){
		model = smodel;
		producedYear = Year;
		color = scolor;	
	}
}


