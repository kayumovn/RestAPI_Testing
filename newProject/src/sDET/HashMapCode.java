package sDET;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCode {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
hm.put(101, "CTO");
hm.put(102, "QA Lead");
hm.put(103, "QA Engineer");
hm.put(104, "Business Analist");
hm.put(105, "Developer");
System.out.println("Before removing one pair" +hm);
hm.remove(103);
System.out.println("After removing one pair" +hm);
 
// reading pair of hashmap by using for loop
for (Map.Entry m : hm.entrySet()){


System.out.println(m.getKey()+ " " + m.getValue());
	}

}
}