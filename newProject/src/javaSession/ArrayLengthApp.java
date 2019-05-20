package javaSession;

public class ArrayLengthApp {

	public static void main(String[] args) {
		final int SIZE=5;
		int [] integerArray=new int[SIZE];
		float [] floatArray= { 2.12f, 3.13f, 4.3f, 5.23f,};
		String [] weekDays= {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"};
		int [][] jaggedArray= {
				{5,4},
				{23,21,4,12,45},
				{10,23,5},
				{66,43,3,34}
		};
		System.out.println("Length of integerArray:" + integerArray.length);
		System.out.println("Lenght of floatArray:" + floatArray.length);
		System.out.println("Number of days in a week:" + weekDays.length);
		System.out.println("Lenght of jaggedArray:" + jaggedArray.length);
		
		int row=0;
		for(int [] memberRow : jaggedArray) {
		System.out.println("\tArray length for row" + ++row + ":" + memberRow.length);

	}

}
}