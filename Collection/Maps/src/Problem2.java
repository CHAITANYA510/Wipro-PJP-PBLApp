/*Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
a) Check if a particular key exists or not.
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem2 {
	
	HashMap<String, String> m1 = new HashMap<String, String>();
	
	String checkKey(String key) {
		
		Set<String> s1 = m1.keySet();
		Iterator<String> itr = s1.iterator();
		int i=0;
		while(itr.hasNext()) {
			if(key.equals(itr.next())) {
				i++;
			}
		}
		if(i==0) {
			return "key "+key+" does not exist";
		}
		else {
			return "key "+key+" exist";
		}
	}
	
	
	String checkValue(String value) {
		
		Collection<String> s1 = m1.values();
		Iterator<String> itr = s1.iterator();
		int i=0;
		while(itr.hasNext()) {
			if(value.equals(itr.next())) {
				i++;
			}
		}
		if(i==0) {
			return "value "+value+" does not exist";
		}
		else {
			return "value "+value+" exist";
		}
	}
	
	public static void main(String[] args) {
		
		Problem2 p1 = new Problem2();
		p1.m1.put("Cricket","Bat");
		p1.m1.put("Soccer","Football");
		p1.m1.put("Badminton","Racket");
		
		System.out.println("HashMap has following entries: ");
		System.out.println(p1.m1);
		
		System.out.println(p1.checkKey("Cricket"));
		System.out.println(p1.checkKey("Hockey"));
		
		System.out.println(p1.checkValue("Racket"));
		System.out.println(p1.checkValue("Stick"));
	}

}
