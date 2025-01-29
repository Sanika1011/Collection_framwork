//Write a program to demonstrate the use of LinkedList to store names.
//Add names at the beginning, middle, and end of the list, and then print the list.


package Collection_framwork;

import java.util.LinkedList;

public class link_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("sanika");
		list.addFirst("Ravindra");
		
		list.addLast("saloni");
		list.addLast("Rasika");
		
		list.add(2,"samu");
		
		System.out.println(list);
		
	}

}
