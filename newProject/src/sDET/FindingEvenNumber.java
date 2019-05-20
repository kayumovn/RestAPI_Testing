package sDET;

public class FindingEvenNumber {

	public static void main(String[] args) {
//  print even number 1-20;
		int i =2;
		while(i<=20) {
			System.out.println(i);
			i+=2; //i=i+2;
		}
		System.out.println("Seperating line########################");
//print odd numbers:		
		int a =1;
		while(a<=20) {
			System.out.println(a);
			a+=2;
			}
// descending number 20-1;
		int j=20;
		while(j>0) {
			System.out.println(j);
			j--; //j-=1;
		}
		System.out.println("Seperating line########################");
//print 1-10 numbers  using do while loop:
		int p=1;
		do {
			System.out.println(p);
			p++;
		}while(p<=10);
		System.out.println("Seperating line########################");
//example of break:
		for(int b=1; b<=10; b++) {
			if(b==5) {
				
				break;
			}
			System.out.println(b);
		}
		System.out.println("Seperating line########################");
//example of continue:	
		for(int x=1; x<=10; x++) {
			if(x==3 || x==5 || x==7) {
				continue;
			}
			System.out.println(x);
		}
	}
	}


