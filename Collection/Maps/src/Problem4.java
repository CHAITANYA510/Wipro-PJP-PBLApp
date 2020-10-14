
/* Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
The program should use appropriate generics (String, Integer) and have the following abilities:
a) Check if a particular key exists or not. 
b) Check if a particular value exists or not.
c) Use Iterator to loop through the map.
*/
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Problem4 {
	
	HashMap<String,Integer> ContactList = new HashMap<String,Integer>();
	
	String checkKey(String key) {
			Set<String> s1 = ContactList.keySet();
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
		
		
		String checkValue(int value) {
			
			Collection<Integer> s1 = ContactList.values();
			Iterator<Integer> itr = s1.iterator();
			int i=0;
			while(itr.hasNext()) {
				if(value == itr.next()) {
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
		
		Problem4 p4 = new Problem4();
		
		p4.ContactList.put("Raju", 987);
		p4.ContactList.put("John", 345);
		p4.ContactList.put("Ron", 874);
		p4.ContactList.put("Batman", 565);
		
		System.out.println("HashMap ContactListhas following entries: ");
		System.out.println(p4.ContactList);
		
		System.out.println(p4.checkKey("Raju"));
		System.out.println(p4.checkKey("Ram"));
		
		System.out.println(p4.checkValue(565));
		System.out.println(p4.checkValue(23));
		
	}

}
