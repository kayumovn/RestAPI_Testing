package sDET;

public class TypeOfMethods {

	int i =100;
	int j =200;
	
	// No params no return type
	void total() {
		System.out.println(i+j);
	}
	//No params, return type
	int total1() {
		return(i+j);
	}
	//Taking params, but no return type
	void total2(int a , int b) {
		System.out.println(a+b);
	}
	//Taking params and return type:
	int total3(int a, int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
TypeOfMethods mt = new TypeOfMethods();
mt.total();
int r =mt.total1();
System.out.println(r);
System.out.println(mt.total1());
mt.total2(10, 20);
System.out.println(mt.total3(5, 15));
	}

}
