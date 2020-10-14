/*
Create  a base class Fruit with name ,taste and size as its attributes. 
Create a method called eat() which describes the name of the fruit and its taste. 
Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
 */

package overriding;

class Fruit{
	
	String name;
	String taste;
	String size;
		
	Fruit(String name,String taste){
		this.name = name;
		this.taste = taste;
	}
	
	void eat() {
		
		System.out.println("Name of fruit is: "+name);
		System.out.println("Taste of fruit is: "+taste);
	}
}

class Apple extends Fruit{
	 
	Apple(String name, String taste) {
		super(name, taste);
	
	}

	String taste = "sweet";
	
	 void eat() {
		 System.out.println("Apple's taste is "+taste);
	 }
	 
 }

class Orange extends Fruit{

	Orange(String name, String taste) {
		super(name, taste);
	}

	String taste = "Sour";
	 
	 void eat() {
		 
		 System.out.println("Orange's taste is "+taste);
	 } 
}

public class testFruit {

	public static void main(String[] args) {
		
			Fruit f1;
			
			f1 = new Fruit("Apple","sweet");
			f1.eat();
			f1 = new Apple("Apple","sweet");
			f1.eat();
			f1 = new Orange("Orange","sour");
			f1.eat();
			
		}
}


