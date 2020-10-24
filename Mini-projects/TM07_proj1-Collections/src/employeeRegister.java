import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//using customized sorting order for class Employee
//implementing Comparator,overriding compare()
class myComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		String s1 = e1.getFirstname();
		String s2 = e2.getFirstname();
		
		return s1.compareTo(s2);
	}
}

public class employeeRegister{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Employees: ");
		int entries = sc.nextInt();
		TreeSet<Employee> set = new TreeSet<Employee>(new myComparator());
		
		///get input from user
		for(int i=0;i<entries;i++) {
			Employee e = new Employee();
			System.out.println("Enter Employee "+(i+1)+" Details:");
			System.out.print("Enter the Firstname: ");
			e.setFirstname(sc.next());
			System.out.print("Enter the Lastname: ");
			e.setLastname(sc.next());
			System.out.print("Enter the MobileNumber: ");
			e.setMobileNumber(sc.next());
			System.out.print("Enter the Email: ");
			e.setEmail(sc.next());
			System.out.print("Enter the Address: ");
			e.setAddress(sc.next());
			//System.out.println(e);
			set.add(e);
		}
		sc.close();
		
		//display the database
		Iterator<Employee> itr = set.iterator();
		System.out.format("%-15s %-15s %-15s %-25s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		while(itr.hasNext()) {
			Employee e = (Employee) itr.next();
			//System.out.println(e.toString());
			System.out.format("%-15s %-15s %-15s %-25s %-15s\n",
					e.getFirstname(),e.getLastname(),e.getMobileNumber(),e.getEmail(),e.getAddress());
		}
		
	}

}
