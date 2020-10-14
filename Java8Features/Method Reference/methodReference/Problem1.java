/* Define class, instance method - int factorial(int n), which should return factorial of given input (n),
 * Define FunctionalInterface, refer to this instance method and invoke it to get factorial result.
 */

package methodReference;

@FunctionalInterface
interface interf {
	int calcFact(int m);
}

public class Problem1 {
	
	///method to calculate factorial using Recursion
	public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * (factorial(n-1)); 
	}
	
	///main method
	public static void main(String[] args) {
		
		Problem1 p1 = new Problem1();	///Creating instance of class
		interf functInterf = p1::factorial;	////referring instance method factorial using method reference.
		
		System.out.println("Factorial of 4: "+functInterf.calcFact(4));
		System.out.println("Factorial of 0: "+functInterf.calcFact(0));
		System.out.println("Factorial of 1: "+functInterf.calcFact(1));
		System.out.println("Factorial of 7: "+functInterf.calcFact(7));
	}

}
