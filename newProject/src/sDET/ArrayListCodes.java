package sDET;

import java.util.ArrayList;

public class ArrayListCodes {

	public static void main(String[] args) {
		//ArrayList <String> list = new ArrayList <String>(); // string type of arraylist
		ArrayList list  = new ArrayList(); // any data type of arraylist 
		
		
list.add("BMW");
list.add("Toyota");
list.add("Honda");
list.add("Hyndai");
list.add(100);
list.add('B');

System.out.println(list.size());
list.remove(2);
System.out.println(list.size());
list.add(3, "Lincoln");
System.out.println(list.size());
System.out.println(list);

/*for(String s : list) {
	 System.out.println(s);
 }*/
for(Object s : list) {
	System.out.println(s); // object type arraylist 
}

	}

}
