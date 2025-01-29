//Create a LinkedHashMap to store names and phone numbers,
//maintain insertion order, and print the map.


package Collection_framwork;

import java.util.LinkedHashMap;

public class LinkedHash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		
		lhm.put("sanika","79");
		lhm.put("samu", "35");
		
		System.out.println(lhm);
	}

}
