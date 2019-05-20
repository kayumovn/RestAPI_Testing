import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		//By using stringbuilder
		String str1 = "Uzbekistan";
		StringBuilder str2 = new StringBuilder();
		str2.append(str1);
		str2 = str2.reverse();
		System.out.println(str2);
		
		//By converting to character array
		String sr = "Nuriddin Kayumov";
		char [] ch = sr.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			System.out.println(ch[i]);
		}
		String st;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string");
        st = in.nextLine();
        String [] taken = st.split(" ");
        for (int i = taken.length-1; i>=0; i--) {
        	System.out.println(taken[i] + " ");
        }
	}

}
