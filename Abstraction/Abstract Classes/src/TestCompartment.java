/*
Create an abstract class Compartment to represent a rail coach. 
Provide an abstract function notice in this class. 
public abstract String notice();
Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
Override the notice function in each of them 
to print notice message that is suitable to the specific type of  compartment.
Create a class TestCompartment.Write main function to do the following:
Declare an array of Compartment of size 10.
Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.
[i.e based on the random  number genererated, 
the first compartment can be Luggage, the second one could be Ladies and so on..]
*/

import java.util.Scanner;

abstract class Compartment{
	public abstract String notice();	
}

class FirstClass extends Compartment{
	public String notice() {
		return "First class Compartment";
	}
}

class Ladies extends Compartment{
	public String notice() {
		return "Ladies Compartment";
	}
}

class General extends Compartment{
	public String notice() {
		return "General Compartment";
	}
}

class Luggage extends Compartment{
	public String notice() {
		return "Luggage Compartment";
	}
}

public class TestCompartment {

	public static void main(String[] args) {
		
		Compartment[] compartment = new Compartment[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Assign 1 for First class"+"\nAssign 2 for Ladies coach"
							+"\nAssign 3 for General coach"+"\nAssign 4 for Luggage coach");
		System.out.println("\nEnter option to assign compartments [1,2,3,4]");
		for(int i=0;i<5;i++) {
			int c1 = sc.nextInt();
			if(c1==1) {
				compartment[i] = new FirstClass();
			}
			else if(c1==2) {
				compartment[i] = new Ladies();
			}
			else if(c1==3) {
				compartment[i] = new General();
			}
			else if(c1==4) {
				compartment[i] = new Luggage();
			}
			else {
				System.out.println("Enter valid option");
				i--;
				continue;
			}
			System.out.println("Compartment "+(i+1)+" is "+compartment[i].notice());
		}
		sc.close();
	}

}
