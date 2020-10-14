/*
 * Given an ArrayList containing 10 numbers,
 * WAP to calculate sum of all elements using Function.
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Problem2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(1);
		System.out.println("Given array is: "+numbers);
		
		Function<List<Integer>,Integer> add = list -> 
			{	
				int sum = 0;
				for(int i:list) {
					sum+=i;
				}
				return sum;
			};
		
		System.out.println("Sum of all elemets is: "+add.apply(numbers));
	}

}
