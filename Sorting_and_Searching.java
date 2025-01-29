//Create an ArrayList of integers and sort it in ascending order. 
//Then, use the binarySearch() method to find a specific number.


package Collection_framwork;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_and_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		
		arr_list.add(90);
		arr_list.add(80);
		arr_list.add(60);
		arr_list.add(20);
		arr_list.add(5);
		
		System.out.println("unsorted list : " + arr_list);
		
		Collections.sort(arr_list);
		
		System.out.println("sorted list : " + arr_list);
		
		
	}

}
