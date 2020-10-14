/*Write a Java program to create an LinkedList, 
add all the months of a year and print the same.
*/
import java.util.Iterator;
import java.util.LinkedList;

public class Problem5 {

	public static void main(String[] args) {
		
		LinkedList<String> linked_list = new LinkedList<String>();
		linked_list.add("January");
		linked_list.add("February");
		linked_list.add("March");
		linked_list.add("April");
		linked_list.add("May");
		linked_list.add("June");
		linked_list.add("July");
		linked_list.add("August");
		linked_list.add("September");
		linked_list.add("October");
		linked_list.add("November");
		linked_list.add("December");
		
		Iterator<String> itr = linked_list.iterator();
	     System.out.println("Elements of LinkedList are: ");
	     while(itr.hasNext()) {
	         System.out.println(itr.next());
	     }	
	}

}
