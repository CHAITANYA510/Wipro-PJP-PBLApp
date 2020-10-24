import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class myComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		BoxSet b1 = (BoxSet) o1;
		BoxSet b2 = (BoxSet) o2;
		Float f1 = (float) b1.volume;
		Float f2 = (float) b2.volume;
		return f1.compareTo(f2);
	}
	
}

public class BoxSet {

	double length;
	double width;
	double height;
	double volume;
	
	public static void main(String[] args) {
		
		TreeSet<BoxSet> tree = new TreeSet<BoxSet>(new myComparator());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of box");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			
			BoxSet box = new BoxSet();
			System.out.println("Enter box "+(i+1)+" details");
			System.out.println("Enter Length");
			box.length = sc.nextFloat();
			//box.length = Math.round(box.length);
			System.out.println("Enter Width");
			box.width = sc.nextFloat();
			//box.width = Math.round(box.width);
			System.out.println("Enter Height");
			box.height = sc.nextFloat();
			//box.height = Math.round(box.height);
			box.volume = box.length*box.width*box.height;
			//box.volume = Math.round(box.volume);
			tree.add(box);
			
		}
		
		sc.close();
		System.out.println(tree);
		System.out.println(tree.size());
		
		System.out.println("Unique Boxes in Set are: ");
		Iterator<BoxSet> itr = tree.iterator();
		
		while(itr.hasNext()) {
			BoxSet display = itr.next();
			System.out.format("Length = %.2f  ",display.length);
			System.out.format("Width = %.2f  ",display.width);
			System.out.format("Height = %.2f  ",display.height);
			System.out.format("Volume = %.3f  ",display.volume);
			System.out.println();
		}
		
	}
}
