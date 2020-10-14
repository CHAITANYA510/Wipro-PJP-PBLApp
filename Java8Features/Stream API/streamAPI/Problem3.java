/*
 * Create an Student class with: 
 * 1. Instance variables: rollNo, name, mark.
 * 2. Parameterized constructor to initialize them.
 * 
 * WAP to
 * 1. Add 5 Student object into ArrayList,
 * 2. Filter students whose cleared the test, criteria for clearing test -  marks>50,
 * 3. Get number of students passed.
 */

package streamAPI;

import java.util.ArrayList;

class Student {
	
	String name;
	int rollNo;
	int mark;
	
	public Student(String name, int rollNo, int mark) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.mark = mark;
	}
	
	public String toString() {
		return "Student name: "+name+"\nRoll Number: "+rollNo+"\nMarks obtained: "+mark+"\n";
	}
}

public class Problem3 {

	public static void main(String[] args) {
		
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(new Student("Raj",1,55));
		arr.add(new Student("Ramesh",2,45));
		arr.add(new Student("Rakesh",3,66));
		arr.add(new Student("Rahul",4,78));
		arr.add(new Student("Raju",5,40));
		
		System.out.println("Student data: ");
		System.out.println(arr.toString());
		
		System.out.println();
		long count = arr.stream().filter(m -> m.mark<50).count();
		System.out.println("Number of students passed: "+count);
	}

}
