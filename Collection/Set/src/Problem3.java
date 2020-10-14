
/*Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
a) Reverse the elements of the Collection.
b) Iterate the elements of the TreeSet using Iterator.
c) Check if a particular element exists or not.
*/
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class mycomparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}

public class Problem3 {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts1;
		
		ts1 = new TreeSet<String>(); 
		ts1.add("Ajay");
		ts1.add("Cathorine");
		ts1.add("Zack");
		ts1.add("Sumit");
		ts1.add("Bhavik");
		System.out.println("Tress set in default or natural sorting order: "+ts1);
		
		ts1 = new TreeSet<String>(new mycomparator()); 
		ts1.add("Ajay");
		ts1.add("Cathorine");
		ts1.add("Zack");
		ts1.add("Sumit");
		ts1.add("Bhavik");
		System.out.println("Tress set in reverse order: "+ts1);
		
		System.out.println("Elements of the TreeSet using Iterator:");
		Iterator<String> itr1 = ts1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println();
		
		//String toCheck = "S";
		String toCheck = "Cathorine";
		
		Iterator<String> itr2 = ts1.iterator();
		int i=0;
		while(itr2.hasNext()) {
			if(itr2.next().equals(toCheck)) {
				i++;
				System.out.println("String "+toCheck+" exists.");
				break;
			}
		}
		if(i == 0) {
			System.out.println("String "+toCheck+" do not exists.");
		}
		
	}

}
