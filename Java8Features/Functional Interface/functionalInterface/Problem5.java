/*
 * Given an ArrayList containing 10 numbers,
 * WAP to filter the perfect square numbers using Predicate
 * example: 0,1,4,9,16,25,36,49,64....
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Problem5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(0);
		numbers.add(3);
		numbers.add(4);
		numbers.add(16);
		numbers.add(19);
		numbers.add(36);
		numbers.add(49);
		numbers.add(100);
		numbers.add(199);
		numbers.add(1600);
		System.out.println("Given array is: "+numbers);

		Predicate<Integer> pred = num -> 
		{
			double sqrt = Math.sqrt(num);
			return Math.ceil(sqrt)-sqrt == 0;
		};	
		
		numbers.forEach(n ->
		{
			if(pred.test(n)) {
				System.out.println(n);
			}
		});
	}

}
