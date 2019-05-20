package javaSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestScoreAverage {

	public static void main(String[] args)  {

		final int Number_OF_Students=6;

		int [] marks=new int[Number_OF_Students];

		try{BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		for(int i=0; i< Number_OF_Students; i++) {
	
			System.out.println("Enter marks for student #" + (i+1) + ":");
	
			String str=reader.readLine();
	
			marks[i]=Integer.parseInt(str);
}
	}
catch(Exception e) {
	e.printStackTrace();
}
int total=0;
for(int i=0; i<Number_OF_Students; i++) {
	total +=marks[i];
	}
System.out.println("Average Marks" + (float) total/Number_OF_Students);
	

	}
}
