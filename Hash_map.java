//Create a HashMap that stores the name of a city as the key and its population as the value. 
//Populate it with data and print all keys and values.


package Collection_framwork;

import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("pune", 2);
		hm.put("mumbai", 4);
		hm.put("delhi", 6);
		hm.put("kk", 8);
		
		System.out.println(hm);
		
	
		}

}