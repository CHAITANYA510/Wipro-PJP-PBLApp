/*
 * WAP to:
 * 1. Take any string as a input from user and convert this into character array (use toCharArray() method,
 * 2. Sort this character array using parallelSort() method,
 * 3. After sorting convert this to character array into String and display the result.
 * 
 * example: i/p= valan, o/p= aalnv.
 */

package parallelSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a string: ");
		String input = reader.readLine();
		System.out.println("Input string: "+input);
		
		char[] toChar = input.toCharArray();
		Arrays.parallelSort(toChar);
		
		System.out.println("Updated streing is: ");
		for(char ch: toChar) {
			System.out.print(ch);
		}
		
	}

}
