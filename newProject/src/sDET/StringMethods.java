package sDET;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Uzbekistan";
		// Length of string
		System.out.println(s.length());
		 s = "is in Central Asia";
		// Joining two strings
		System.out.println(s.concat(s));
		// Trimming space
		 s = " selenium ";
		System.out.println(s.trim());
		// Returning char value based on index:
		 s = "tashkent";
		System.out.println(s.charAt(3));
		//contains() methods:
		 s = "Universal";
		System.out.println(s.contains("Uni"));
		// Comparing two strings:
		 s = "TCFbank";
		System.out.println(s.equals("TcfBank"));// false
		System.out.println(s.equalsIgnoreCase("Tcfbank"));//true
		//Replacing characters:
		s= "London";
		System.out.println(s.replace('o', 'i'));// Lindin
		s= "Welcome to Uzbekistan";
		System.out.println(s.replace("Uzbekistan", "Tashkent"));// Welcome to Tashkent

	}

}
