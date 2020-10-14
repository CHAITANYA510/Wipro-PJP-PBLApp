/* 
1. Develop a java class with a instance variable M1 (Hashtable)  
create a method saveCountryCapital(String CountryName, String capital), the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
Key- Country  Value - Capital
India  Delhi
Japan  Tokyo
2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
Key – Capital Value – Country
Delhi   India
Tokyo   Japan
5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
NOTE: You can test the methods using a main method.
*/

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Problem6 {
	
	Hashtable<String, String> M1 = new Hashtable<String, String>();
	
	//Method 1
	Hashtable<String, String> saveCountryCapital(String CountryName, String capital){
		M1.put(CountryName, capital);
		return M1;
	}
	//Method 2
	String getCapital(String CountryName) {
		
		Set<Entry<String, String>> s1 = M1.entrySet();
		Iterator<Entry<String, String>> itr = s1.iterator();
		String capital=null;
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			if(m1.getKey().equals(CountryName)) {
				return "Capital of "+CountryName+" is "+(String) m1.getValue();
			}
		}
		return "Capital does not exist in Hashtable";
	}
	//Method 3
	String getCountry(String capitalName) {
			
			Set<Entry<String, String>> s1 = M1.entrySet();
			Iterator<Entry<String, String>> itr = s1.iterator();
			
			while(itr.hasNext()) {
				Map.Entry m1 = (Map.Entry) itr.next();
				if(m1.getValue().equals(capitalName)) {
					return capitalName+" is capital of "+(String) m1.getKey();
				}
			}
			return "Country does not exist in Hashtable";
	}
	//Method 4
	Hashtable<String, String> newHashtable() {
		
		Hashtable<String, String> M2 = new Hashtable<String, String>();
		Set<Entry<String, String>> s1 = M1.entrySet();
		Iterator<Entry<String, String>> itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			M2.put((String)m1.getValue(), (String)m1.getKey());
		}
		return M2;
	}
	//Method 5
	ArrayList<String> createArrayList() {
		ArrayList<String> l1 = new ArrayList<String>(M1.keySet());
		return l1;
	}
	//main method
	public static void main(String[] args) {
		
		Problem6 p6 = new Problem6();
		p6.saveCountryCapital("India", "Delhi");
		p6.saveCountryCapital("England", "London");
		p6.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println("Hasetable M1 is: \n"+p6.M1);
		
		System.out.println(p6.getCapital("England"));
		System.out.println(p6.getCapital("Pakistan"));
		System.out.println(p6.getCapital("India"));
		
		System.out.println(p6.getCountry("Delhi"));
		System.out.println(p6.getCountry("Karachi"));
		System.out.println(p6.getCountry("Tokyo"));
		
		System.out.println("Hasetable M1 is: \n"+p6.M1);
		System.out.println("Hasetable M2 is: \n"+p6.newHashtable());
		System.out.println("ArrayList with all the Country names stored as keys: \n"+p6.createArrayList());
		
		//p6.M1.remove("England");
		//System.out.println(p6.M1);
		
	}

}
