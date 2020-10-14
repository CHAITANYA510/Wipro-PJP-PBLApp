
/*Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.
*/

package Animal;

class animal{
	
	public void eat() {
		System.out.println("Animal eat method called");
	}

	public void sleep() {
		System.out.println("Animals sleep method called");
	}

}

class bird extends animal{
	
	public void eat() {
		System.out.println("Birds eat method called");
	}
	
	public void sleep() {
		System.out.println("birds Sleep method called");
	}

	public void fly() {
		System.out.println("Birds fly method called");
	}

}

public class testanimal{	
	
	public static void main(String[] args) {
		
		animal a = new animal();
		bird b = new bird();
		
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();
	}
}

