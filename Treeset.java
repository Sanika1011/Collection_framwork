//Write a program to sort a TreeSet of strings in reverse order (use a custom Comparator).


package Collection_framwork;

import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<String>(Comparator.reverseOrder());
		
		ts.add("java");
		ts.add("html");
		ts.add("css");
		ts.add("js");
		
//		System.out.println("unsorted treeset : " + ts);
		
		System.out.println("TreeSet in reverse order: " + ts);
		
//		System.out.println("treeset sorted in descending order : " + ts);
//		ts.descendingSet();
				
		
	}

}