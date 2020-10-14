/*Create one more class EmployeeDB with the following attributes and behaviors.
(i)ArrayList list;
ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EmployeeDB {
	
	ArrayList<Employee> list = new ArrayList<Employee>();
	
	boolean addEmployee(Employee e) {
		//System.out.println("Size of list before entry is "+list.size());
		list.add(e);
		//itr.add(e);
		//System.out.println("Size of list after entry is "+list.size());
		return true;
	}
	
	boolean deleteEmployee(int empID) {
		ListIterator<Employee> itr = list.listIterator();
		Employee e1;
		while(itr.hasNext()) { 
			//System.out.println("in deleting loop");
			e1 = itr.next();
			//System.out.println("EmpId to delete = " +e1.empId);
			if(e1.empId == empID) {
				//System.out.println("deleting");
				itr.remove();	
				return true;
			}
		}
		return false;
	}
		
	String showPaySlip(int empID) {
		
		ListIterator<Employee> itr = list.listIterator();
		Employee e1;
		while(itr.hasNext()) { 
			e1 = itr.next();
			if(e1.empId == empID) {
				return (e1.empName+" has Employee ID "+empID+" and salary is "+e1.salary);
			}
		}
		return null;
	}
	
}
