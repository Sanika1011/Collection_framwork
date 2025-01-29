//Create a HashSet of strings, add a few elements, and 
//then check if a specific element exists in the set.
//Remove an element and print the set.



package Collection_framwork;

import java.util.HashSet;

public class hash_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("dog");
		hs.add("cat");
		hs.add("bean");
		hs.add("stars");
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("sand");
		hs1.add("ocean");
		
		System.out.println("HashSet is : " + hs);
		
		System.out.println("HashSet is : " + hs1);
		
		
		System.out.println(hs.contains("bean"));
		
		hs.removeAll(hs1);
		System.out.println("after removing elements : " + hs);
		
	}

}
