/*
 * Given an ArrayList containing 10 words,
 * WAP to filter the words which are Pallindrome, using Predicate.
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Problem3 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		
		words.add("abba");
		words.add("abc");
		words.add("m");
		words.add("nor");
		words.add("mom");
		
		System.out.println("Given array is: "+words);
		
		Predicate<String> func = s -> {
			
			if(s.length()==0 || s.length()==1) {
				return false;
			}
			
			for(int i=0;i<=s.length()/2;i++) {
				if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
					return false;
				}
			}
			
			return true;
		};
		
		words.forEach(s -> {
			if(func.test(s)) {
				System.out.println(s);
			}
		});
		
	}
}
