/*
 * Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same.
 *  After making the clone, change the properties of the original employee object
 *  and print the properties of both the original and clone object and note down your observation.
 */

class Employee implements Cloneable {
	
	String name;
	int age;
	
	void getName() {
		System.out.println("Name is "+name);
	}
	void getAge() {
		System.out.println("Age is "+age);
	}
	
	////method to clone 
	Employee cloneTest() {
		
		try {
			return(Employee) super.clone();
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e.toString());
			System.out.println("Cloning not allowed");
			return this;
		}
	}
	
}

public class Problem4{
	
	public static void main(String[] args){
		
		Employee e1,e2;
		
		e1 = new Employee();
		System.out.println("Original object before cloaning");
		e1.name = "Reena";
		e1.age = 45;
		e1.getName();
		e1.getAge();
		System.out.println("");
		///cloning
		e2 = e1.cloneTest();
		System.out.println("New object after cloning, before changing values");
		e2.getName();
		e2.getAge();
		
		///changing clonned object values
		e2.name = "Ram";
		e2.age = 40;
		//printing 
		System.out.println("");
		System.out.println("Original object after cloaning");
		e1.getName();
		e1.getAge();
		System.out.println("");
		System.out.println("New object after cloning, after changing values");
		e2.getName();
		e2.getAge();
		
		
	}
}
