/*
 * Define class, instance method - int digitCount(int n), which should return number of digits in given input (n),
 * Define FunctionalInterface, refer to this static method and invoke it to get number of digits.
 */

package methodReference;

@FunctionalInterface
interface interf2 {
	int count(int n);
}

public class Problem2 {

	///method to calculate number of digits of given input
	static int digitCount(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		interf2 funct = Problem2::digitCount; ////referring static method digitCount using method reference.
		
		System.out.println("Number of digits of 789 is: "+funct.count(789));
		System.out.println("Number of digits of 1234 is: "+funct.count(1234));
		System.out.println("Number of digits of 5643567 is: "+funct.count(5643567));
	}

}
