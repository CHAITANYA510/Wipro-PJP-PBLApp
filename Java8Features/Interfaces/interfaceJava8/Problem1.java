//Vehicle(I) - default method message();
//FourWheeler(I) - default method message();
//Class Car implementing Vehicle(I) and FourWheeler(I) and override message() and call message() of Vehicle(I) using "super".
//Instantiate class Car and call message().

package interfaceJava8;

interface Vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
class Car implements Vehicle,FourWheeler{
	@Override
	public void message() {
		Vehicle.super.message();
	}
}

public class Problem1 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.message();
	}

}
