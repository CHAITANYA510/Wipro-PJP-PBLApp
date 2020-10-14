/*
 * 
 */

package parallelSorting;

import java.util.Arrays;
import java.util.function.Consumer;

public class Problem3 {

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
		
		Arrays.parallelSort(arr,0,5);
		System.out.println("\n1st 5 elements sorted using paralletSort() method: ");
		cnsm.accept(arr);
	}

}
