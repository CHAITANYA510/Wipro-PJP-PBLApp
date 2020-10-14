/*Develop a java class with a instance variable H1 (HashSet)  
 
 add a method saveCountryNames(String CountryName) , 
 the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
 
Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Problem1 {
	
	
	HashSet<String> H1 = new HashSet<String>();
	
	HashSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	
	String getCountry(String CountryName) {
		Iterator<String> itr = H1.iterator ();
		int i=0;
		while(itr.hasNext()) {
			if(itr.next().equals(CountryName)) {
				i++;
				return CountryName;
			}
		}
		if(i==0) {
			return null;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
			
			Problem1 obj = new Problem1(); 
			obj.saveCountryNames("India");
			obj.saveCountryNames("Zimbabwe");
			obj.saveCountryNames("England");
			obj.saveCountryNames("China");
			obj.saveCountryNames("Africa");
			
			System.out.println("HashSet has elements "+obj.H1);
			
			System.out.println(obj.getCountry("India"));
			System.out.println(obj.getCountry("P"));
			System.out.println(obj.getCountry("Pakistan"));
			System.out.println(obj.getCountry("England"));
			
		}
	
}
