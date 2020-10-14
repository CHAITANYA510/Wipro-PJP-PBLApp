/*Develop a java class with a instance variable TS1 (TreeSet)  
 
 add a method saveCountryNames(String CountryName) , 
 the method should add the passed country to a TreeSet (TS1) and return the added TreeSet(TS1).
 
Develop a method getCountry(String CountryName) which iterates through the TreeSet and returns the country if exist else return null. 
NOTE: You can test the methods using a main method.
*/

import java.util.TreeSet;
import java.util.Iterator;

public class Problem4 {

	TreeSet<String> TS1 = new TreeSet<String>();
	
	TreeSet<String> saveCountryNames(String CountryName){
		TS1.add(CountryName);
		return TS1;
	}
	
	String getCountry(String CountryName) {
		Iterator<String> itr = TS1.iterator ();
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
		
		Problem4 obj = new Problem4(); 
		obj.saveCountryNames("India");
		obj.saveCountryNames("Zimbabwe");
		obj.saveCountryNames("England");
		obj.saveCountryNames("China");
		obj.saveCountryNames("Africa");
		
		System.out.println("TreeSet has elements "+obj.TS1);
		
		System.out.println(obj.getCountry("India"));
		System.out.println(obj.getCountry("P"));
		System.out.println(obj.getCountry("Pakistan"));
		System.out.println(obj.getCountry("England"));
		
	}
}
