/*Create an ArrayList that can store only numbers like int,float,double,etc,
but not any other data type.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Problem4 {

	public static void main(String[] args) {
		
		ArrayList<Number> numbers_array = new ArrayList<Number>();
		numbers_array.add(10);
		numbers_array.add(0);
		numbers_array.add(10.5);
		numbers_array.add(-10.5);
		numbers_array.add(-10);
		numbers_array.add(10e5);
		//numbers_array.add("we"); //// give error if we try to add String type argument
		Iterator<Number> itr = numbers_array.iterator();
		System.out.println("Elements are as follows");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}

}
