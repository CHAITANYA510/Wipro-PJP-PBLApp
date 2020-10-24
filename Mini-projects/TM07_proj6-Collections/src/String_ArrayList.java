import java.util.ArrayList;
import java.util.Scanner;


public class String_ArrayList {


	//Method 1.Character in each alternate index of S1 should be replaced with S2
	ArrayList<String> method1(String s1, String s2, ArrayList<String> list) {

		StringBuffer m1 = new StringBuffer(s1);
		/// replacing
		for(int i=0;i<m1.length();i++) {
			m1.replace(i,i+1, s2);
			//System.out.println(m1);
			i = i + s2.length();
		}
		list.add(m1.toString());
		return list;
	}

	//Method 2.If S2 appears more than once in S1, 
	//replace the last occurrence of S2 in S1 with the reverse of S2, else return S1+S2 
	ArrayList<String> method2(String s1, String s2, ArrayList<String> list) {

		StringBuffer m1 = new StringBuffer(s1);
		StringBuffer m2 = new StringBuffer(s2);

		int indexFirst = m1.indexOf(s2);
		int indexLast = m1.lastIndexOf(s2);

		if(indexFirst == indexLast) {
			list.add(s1+s2);
		}

		else {
			m1.replace(indexLast, indexLast+s2.length(), m2.reverse().toString());
			list.add(m1.toString());
		}

		return list;
	}

	//Method 3.If S2 appears more than once in S1, delete the first occurrence of S2 in S1, else return S1
	ArrayList<String> method3(String s1, String s2, ArrayList<String> list) {

		StringBuffer m1 = new StringBuffer(s1);
		//StringBuffer m2 = new StringBuffer(s2);

		int indexFirst = m1.indexOf(s2);
		int indexLast = m1.lastIndexOf(s2);

		if(indexFirst == indexLast) {
			list.add(m1.toString());
		}
		else {
			m1.delete(indexFirst, indexFirst+s2.length());
			list.add(m1.toString());
		}

		return list;
	}

	//Method 4.Divide S2 into two halves and add the first half to the beginning of the S1 and second half to the end of S1.
	//If there are odd number of letters in S2,then add (n/2)+1 letters to the beginning and the remaining letters to the end.
	//(n is the number of letters in S2)
	ArrayList<String> method4(String s1, String s2, ArrayList<String> list) {

		String m1,first,last;
		int length = s2.length();

		if(length%2==1) {
			first = s2.substring(0, (length/2) + 1);
			last = s2.substring((length/2) + 1);
		}
		else {
			first = s2.substring(0, length/2);
			last = s2.substring(length/2);
		}

		m1 = first.concat(s1).concat(last);
		list.add(m1);
		return list;
	}

	//Method 5.If S1 contains characters that is in S2 change all such characters to *
	ArrayList<String> method5(String s1, String s2, ArrayList<String> list){

		//StringBuffer m1 = new StringBuffer(s1);
		//StringBuffer m2 = new StringBuffer(s2);
		String m1 = s1;
		char[] arr = s2.toCharArray();

		for(int j=0;j<arr.length;j++) {
			String replace = Character.toString(arr[j]);
			m1 = m1.replaceAll(replace, "*");
			//System.out.println(m1);
		}

		list.add(m1);
		return list;
	}


	public static void main(String[] args) {

		String_ArrayList obj = new String_ArrayList();
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Input String 1: ");
		String s1 = sc.next();		//"JAVAJAVA";
		System.out.print("Input String 2: ");
		String s2 = sc.next();		//"VA";
		sc.close();

		obj.method1(s1,s2,list);
		obj.method2(s1,s2,list);
		obj.method3(s1,s2,list);
		obj.method4(s1,s2,list);
		obj.method5(s1,s2,list);
		
		System.out.println("Output: "+list);

	}

}
