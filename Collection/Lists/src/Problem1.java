/*Write a Java program to create an ArrayList, 
 * add all the months of a year and print the same.
 * */

import java.util.ArrayList;
import java.util.Iterator;

public class Problem1 {

	public static void main(String[] args) {
		
		ArrayList<String> array_list1 = new ArrayList<String>(12);
		array_list1.add("January");
		array_list1.add("February");
		array_list1.add("March");
		array_list1.add("April");
		array_list1.add("May");
		array_list1.add("June");
		array_list1.add("July");
		array_list1.add("August");
		array_list1.add("September");
		array_list1.add("October");
		array_list1.add("November");
		array_list1.add("December");
		
		Iterator<String> itr = array_list1.iterator();
	     System.out.println("Elements of ArrayList are: ");
	     while(itr.hasNext()) {
	         System.out.println(itr.next());
	     }
	}

}
