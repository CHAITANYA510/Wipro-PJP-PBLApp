/*Create an ArrayList that can store only Strings. 
Create a printAll method that will print all the elements of the ArrayList using an Iterator.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class Problem3 {
	
	static void printAll(ArrayList<String> string_list) {
		Iterator<String> itr = string_list.iterator();
		System.out.println("Printing all elements: ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> string_list = new ArrayList<String>();
		
		string_list.add("Ram");
		//string_list.add(100); // give error if we try to add integer
		string_list.add("John");
		string_list.add("Ram");
		string_list.add("Seema");
		
		printAll(string_list);	
	}

}
