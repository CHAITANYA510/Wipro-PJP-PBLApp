/*Write a program that will have a Properties class object 
 * which is capable of storing some States of India and their Capital. 
 * Use an Iterator to list all the elements stored in the Properties.
 * */
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

public class Problem3 {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Properties p1 = new Properties();
		
		p1.setProperty("Maharastra", "Mumbai");
		p1.setProperty("Gujarat", "Ahemdabad");
		p1.setProperty("Delhi", "Delhi");
		p1.setProperty("Goa", "Panji");
		
		System.out.println("Entire list of propeties is: \n"+p1);
		
		Iterator<Object> itr1 = p1.keySet().iterator();
		Collection<Object> c1 = p1.values();
		Iterator<Object> itr2 = c1.iterator();
		
		System.out.println("List of all keys is: "+p1.keySet());
		System.out.println("List of all values is: "+p1.values());
		
		System.out.println("List of all elements is as follows: ");
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			System.out.println(itr2.next());
		}
	}

}
