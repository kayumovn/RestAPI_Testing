package javaSession;

public class Point1 {
private int x;
private int y;

public Point1() {
	x=10;
	y=10;
	
}
public Point1(int x) {
	this.x=x;
	y=4;
}
public Point1(int x, int y) {
	this.x =x;
	this.y =y;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}

}