//Use an Iterator to iterate over a List of integers and print all the elements.

package Collection_framwork;

import java.util.*;

public class It_rator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(11);
		list.add(20);
		list.add(1);
		list.add(25);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			Integer li = iterator.next();
			System.out.println(li);
		}
	}

}




