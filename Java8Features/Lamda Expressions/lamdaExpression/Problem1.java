///Create ArrayList, add 25 random numbers, write code to print all the prime in it, using Lamda Expression.

package lamdaExpression;

import java.util.ArrayList;
import java.util.Random;

	//functional interface
	interface Inter1 
    { 
        boolean isPrime(int a); 
    }
	
	//main class
	public class Problem1 {
			
		//main method
		public static void main(String[] args) {
			
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			Random rand = new Random();  /////Generate random numbers
			for(int i=0;i<25;i++) {
				arrList.add(rand.nextInt(100));
			}
			System.out.println(arrList); ///print actual list
			
			///1st lamda expression for prime number 
			Inter1 i1 = (n) -> {
				if(n==0 || n==1) {
					return false;
				}
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						return false;
					}
				}
				return true;
			};
			
			///2nd lamda expression to display the numbers
			arrList.forEach(
					m -> {
						if(i1.isPrime(m)) {
							System.out.println(m);
						};
					}
			);
		}
	}