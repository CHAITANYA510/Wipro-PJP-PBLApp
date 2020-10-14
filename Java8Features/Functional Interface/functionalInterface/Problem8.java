/*
 * WAP using Supplier, which generates and return an ArrayList containing first 10 prime numbers.
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Problem8 {

	public static void main(String[] args) {
		
		Supplier<ArrayList<Integer>> supp = () ->
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			
			int count=0;
			boolean isPrime = true;
			int toTest=2;
			
			while(count<10) {
				//System.out.println("Testing "+toTest);
				isPrime = true;
				
				for(int i=2;i<=toTest/2;i++) {
					if(toTest%i==0) {
						isPrime = false;
						break;
					}
				}
				
				if(isPrime) {
					arr.add(toTest);
					count++;
				}
				toTest++;
			}
			
			return arr;
		};
		
		System.out.println("1st 10 prime numbers are: \n"+supp.get());

	}

}
