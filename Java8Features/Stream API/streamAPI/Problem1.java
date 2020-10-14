/*
 * WAP to
 * 1. filter the negative even numbers from an ArrayList,
 * 2. store them into new ArrayList,
 * 3. print the ArrayList elements.
 */

package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-2);
		arr.add(-5);
		arr.add(0);
		arr.add(3);
		arr.add(-4);
		arr.add(6);
		
		List<Integer> newArr = arr.stream().filter(x -> x<0 && (-1*x)%2==0).collect(Collectors.toList());

		System.out.println(newArr);
	}

}
