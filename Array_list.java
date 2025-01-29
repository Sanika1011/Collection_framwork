//Create an ArrayList of integers, add 10 random numbers, 
//remove the first and last elements, and print the updated list.


package Collection_framwork;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr_list = new ArrayList<Integer>();
		
		arr_list.add(10);
		arr_list.add(11);
		arr_list.add(1);
		arr_list.add(20);
		arr_list.add(3);
		arr_list.add(25);
		arr_list.add(56);
		arr_list.add(46);
		arr_list.add(23);
		arr_list.add(19);
		
		
		System.out.println("original list : "+arr_list);
		arr_list.removeFirst();
		System.out.println("1st element removed : " + arr_list);
		arr_list.removeLast();
		System.out.println("last element removed : " + arr_list);
		System.out.println("updated list : "+arr_list);
		
	}
	}






