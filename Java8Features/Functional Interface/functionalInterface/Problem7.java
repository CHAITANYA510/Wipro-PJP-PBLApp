/*
 * Given an ArrayList with 10 numbers, 
 * WAP to display each number and whether it is odd or even, with help of Consumer (I).
 * example: i/p=2, o/p="2 even",
 * i/p=5, o/p="5 odd".
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Problem7 {

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
		
		Consumer<Integer> cnsm = n -> 
		{
			if(n%2==0) {
				System.out.println(n+" even");
			}
			else {
				System.out.println(n+" odd");
			}
		};
		
		numbers.forEach(n -> cnsm.accept(n));
	}

}
