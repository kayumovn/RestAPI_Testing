package sDET;

public class ExampleOfArrays {

	public static void main(String[] args) {
		int [] a =new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		// reading specific array
		System.out.println(a[2]);
		//finding size of array;
		System.out.println("Size of array is:" +a.length);
		//reading all value of array:
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		//reading value of array by using enhanced for loop:
		for (int j : a) {
			System.out.println(j);
		}
			
		// using two dimensional array:
		int [][] b = new int [3][4];
		b[0][0] = 12;
		b[0][1] = 21;
		b[0][2] = 13;
		b[0][3] = 33;
		
		b[1][0] = 14;
		b[1][1] = 41;
		b[1][2] = 23;
		b[1][3] = 44;
		
		b[2][0] = 33;
		b[2][1] = 55;
		b[2][2] = 66;
		b[2][3] = 32;
		
		// using array literals:
		/*int [][] b1 = {{12,22}, {32,13}, {43,32},};
			
		System.out.println("size of rows:" + b.length);
		System.out.println(" size of columns:" + b[1].length);
		
		// reading values of array:
		for(int i=0; i<b.length; i++) {
			for(int k=0; k<b[i].length; k++) {
				System.out.println(b[i][k]);
			}*/
			
		// using enhanced for loop for reading values of two dimensional array:
		for(int p[] : b) {
			for(int s : p) {
				System.out.println(s);
			}
		}
			
		}
				
		}

	


