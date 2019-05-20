package sDET;

import java.util.HashMap;

public class Hashmap2 {

	public static void main(String[] args) {
	HashMap <Integer,String>hm=new HashMap <Integer,String>();
	hm.put(1,"a");
	hm.put(2,"b");
	hm.put(3,"c");
	hm.put(1,"d");
	System.out.println(hm.toString());
	}

}
