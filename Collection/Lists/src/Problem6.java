/*Write a Java program to create a Vector, 
 * add all the months of a year and print the same.
 * */
import java.util.Iterator;
import java.util.Vector;

public class Problem6 {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>(12);
		vector.add("January");
		vector.add("February");
		vector.add("March");
		vector.add("April");
		vector.add("May");
		vector.add("June");
		vector.add("July");
		vector.add("August");
		vector.add("September");
		vector.add("October");
		vector.add("November");
		vector.add("December");
		
		Iterator<String> itr = vector.iterator();
	     System.out.println("Elements of Vector are: ");
	     while(itr.hasNext()) {
	         System.out.println(itr.next());
	     }	
	}

}
