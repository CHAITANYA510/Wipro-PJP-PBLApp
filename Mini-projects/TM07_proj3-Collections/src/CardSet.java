import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class myComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		CardSet d1 = (CardSet) o1;
		CardSet d2 = (CardSet) o2;
		
		String s1 = d1.symbol+"";
		String s2 = d2.symbol+"";
		return s1.compareTo(s2);
	}
}

public class CardSet{
	
	char symbol;
	int number;
	
	public static void main(String[] args) {
		
		TreeSet<CardSet> tree = new TreeSet<CardSet>(new myComparator());
		Scanner sc = new Scanner(System.in);
		int count=0;
		
		while(tree.size()<4) {
			CardSet card = new CardSet();
			count++;
			System.out.println("Enter a card:");
			System.out.print("Enter a symbol: ");
			card.symbol = sc.next().charAt(0);
			System.out.print("Enter a number: ");
			card.number = sc.nextInt();
			
			//check for duplicate
			if(tree.contains(card)) {
				continue;
			}
			else {
				tree.add(card);
			}
			
		}
		
		//print output
		sc.close();
		System.out.println("Four symbols gathered in "+count+" cards.");
		System.out.println("Cards in Set are: ");
		
		Iterator<CardSet> itr = tree.iterator();
		while(itr.hasNext()) {
			CardSet d1 = itr.next();
			System.out.println(d1.symbol+" "+d1.number);
		}
		
	}
}