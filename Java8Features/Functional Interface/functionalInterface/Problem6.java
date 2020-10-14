/*
 * Given an ArrayList with 10 words, WAP to reverse each word,
 * update the same ArrayList, with help of Consumer (I).
 */

package functionalInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Problem6 {

	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		words.add("abba");
		words.add("abc");
		words.add("mo");
		words.add("nor");
		words.add("momo");
		System.out.println("Given Array is: "+words);

		Consumer<List<String>> cnsm = word -> 
		{
			int index = 0;
			Iterator<String> itr = words.iterator();
			
			while(itr.hasNext()) {
				words.set(index, new StringBuilder(itr.next()).reverse().toString());
				index++;
			}
		};
		
		cnsm.accept(words);
		
		System.out.println("Updated Array: "+words);
	}

}
