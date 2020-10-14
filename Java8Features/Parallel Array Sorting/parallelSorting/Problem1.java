/*
 * WAP to:
 * 1. Initialize an Integer Array with 10 elements,
 * 2. Sort this array using parallelSort() method,
 * 2. Display the sum of min and max value of this array as result.
 * 
 */

package parallelSorting;

import java.util.Arrays;
import java.util.function.Consumer;

public class Problem1 {

	public static void main(String[] args) {
		
		Consumer<int[]> cnsm = array ->
		{
			for(int i:array) {
				System.out.print(i+" ");
			}
		};
		
		int[] arr = {20,10,3,4,5,-6,5,73,6,0};
		System.out.println("Original Array: ");
		cnsm.accept(arr);
		
		Arrays.parallelSort(arr);
		System.out.println("\nParallel Sorted Array: ");
		cnsm.accept(arr);
		
		System.out.println("\nSum of min and max value of array is: "+(arr[0]+arr[arr.length-1]));
	}

}
