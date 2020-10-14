///Create ArrayList, add 10 words, write code to print all words whose length is odd, using Lamda Expression.

package lamdaExpression;

import java.util.ArrayList;

public class Problem3 {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		///Add words
		arrList.add("abcRG");
		arrList.add("defert");
		arrList.add("ghiwe");
		arrList.add("jklfrewf");
		arrList.add("mnoqwed");
		arrList.add("pqrfwef");
		arrList.add("stuwer");
		arrList.add("vwxre");
		arrList.add("yzAwq");
		arrList.add("BCDfeee");
		
		System.out.println(arrList); ///print actual list
		
		///Lamda expression for printing words with odd length
		arrList.forEach((s) -> {if(s.length()%2==1) {System.out.println(s);}});
	}

}
