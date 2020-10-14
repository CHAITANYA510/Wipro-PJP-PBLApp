/*
 * Define class with parameterized constructor with one integer argument.
 * Constructor should - check input integer, whether it is "prime" or "not prime" and display result.
 * Define FunctionalInterface, refer to this constructor and invoke it to check whether number is prime or not.
 */

package methodReference;

interface interf3{
	void isPrime(int n);
}
public class Problem3 {

	Problem3(int n){
		if(n==0 || n==1) {
			System.out.println("Not Prime");
		}
		else {
			boolean isPrime = true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					System.out.println("Not Prime");
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime");
			}
		}
	}
	
	public static void main(String[] args) {
		
		interf3 funct = Problem3::new;
		
		funct.isPrime(2);
		funct.isPrime(3);
		funct.isPrime(4);
		funct.isPrime(7);
		funct.isPrime(36);
		funct.isPrime(99);
		funct.isPrime(97);
	}

}
