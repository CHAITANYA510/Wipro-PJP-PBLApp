import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CardMap {
	
	public static void main(String[] args) {
		
		char symbol;
		int number;

		TreeMap<Character,ArrayList<Integer>> tree = new TreeMap<Character,ArrayList<Integer>>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Cards");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			
			System.out.println("Enter card "+(i+1));
			System.out.print("Enter a symbol: ");
			symbol = sc.next().charAt(0);
			System.out.print("Enter a number: ");
			number = sc.nextInt();
			
			if(tree.containsKey(symbol)) {
				//System.out.println("duplicate key found");
				ArrayList<Integer> arr = tree.get(symbol);
				arr.add(number);
				//System.out.println(tree);
			}
			else {
				ArrayList<Integer> arr = new ArrayList<Integer>();
				arr.add(number);
				tree.put(symbol,arr);
				//System.out.println(tree);
			}
		}
		
		sc.close();
		
		//Display output
		//System.out.println(tree);
		//Dsiplay distinct keys
		//System.out.println("Distinct symbols are:\n"+tree.keySet());
		Set s1 = tree.keySet();
		Iterator itr1 = s1.iterator();
		System.out.println("Distinct symbols are:");
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		
		//Display cards details
		Set s = tree.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Cards in "+entry.getKey()+" symbol are:");
			int count=0,sum=0;
			ArrayList<Integer> a = (ArrayList<Integer>) entry.getValue();
			Iterator<Integer> inner = a.iterator();
			while(inner.hasNext()) {
				count++;
				int next = (int) inner.next();
				System.out.println(entry.getKey()+" "+next);
				sum = sum + next;
			}
			System.out.println("Number of cards: "+count);
			System.out.println("Sum of Numbers: "+sum);
		}
	}

}
