/*Write a program to count the occurrences of each word in an input file
and write the word along with its corresponding count in an output file.
[Note: The words should be sorted alphabetically in the output file]
(Hint : Consider using Set Collection)
For Example, let's assume the following are the contents of inputFile.txt
Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro
D:\>Java FileWordCount inputFile.txt outputFile.txt
After Execution of the program the contents of outputFile.txt should be as below
Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class FileWordCount {


	int getCount(String next, TreeMap<String,Integer> map) {
		if(map.containsKey(next)) {
			return (map.get(next)  + 1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) throws IOException {

		FileWordCount d2 = new FileWordCount();
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();

		///take input
		Scanner sc,scin;
		System.out.println("Enter input file name or location: ");
		scin = new Scanner(System.in);
		String inputFile = scin.next();
		//File f1 = new File("D:\\ecllipse c\\IOoperators\\inputFile.txt");
		File f1 = new File(inputFile);
		System.out.println("Input file location is: "+f1);
		sc  = new Scanner(f1);
		int count=0;

		while(sc.hasNext()) {
			String next = sc.next();
			int next_count = d2.getCount(next,map);
			map.put(next, next_count);
			count++;
		}

		sc.close();
		///display
		System.out.println("Number of words found in find are: "+count);
		//System.out.println(map);

		//storing output in file
		System.out.println("Enter output file name or location: ");
		String outputFile = scin.next();
		//File f2 = new File("D:\\ecllipse c\\IOoperators\\outputFile.txt");
		File f2 = new File(outputFile);
		System.out.println("Output file location is: "+f2);
		
		PrintWriter pw2 = new PrintWriter(f2);
		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> itr = set.iterator();
		String insert;

		while(itr.hasNext()) {
			Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>)itr.next();
			insert = m1.getKey()+" : "+m1.getValue();
			pw2.print(insert);
			pw2.println();
		}

		scin.close();
		pw2.close();
		System.out.println("Operation completed successfully!!");
	}

}
