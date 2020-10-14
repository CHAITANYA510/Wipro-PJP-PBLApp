/*
 * Given 2 StringJoiner s1 and s2 which contains n city names separated by "-",
 * Display the output for the given cases:
 * 1. s1 merged to s2,
 * 2. s2 merged to s1.
 */

package stringJoiner;

import java.util.StringJoiner;

public class Problem2 {

	public static void main(String[] args) {
		
		StringJoiner s1 = new StringJoiner("-");
		StringJoiner s2 = new StringJoiner("-");
		
		s1.add("Mumbai"); 
		s1.add("Pune");
		s1.add("Nagpur");
		
		s2.add("Surat");
		s2.add("Rajkot");
		s2.add("Ahemdabad");
		
		System.out.println("Original s1: "+s1);
		System.out.println("Original s2: "+s2);
		
		System.out.println("s1 merged to s2: "+s1.merge(s2));
		System.out.println("s2 merged to s1: "+s2.merge(s1));
		
	}

}
