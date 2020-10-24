import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			String search;
			boolean bol;
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the item to be inserted:");
				list.add(sc.next());
				System.out.println("Inserted successfully");
				break;
				
			case 2:
				System.out.println("Enter the item to search:");
				search = sc.next();
				bol = list.contains(search);
				if(bol) {
					System.out.println("Item found in the list");
				}
				else {
					System.out.println("Item not found in the list");
				}
				break;
			
			case 3:
				System.out.println("Enter the item to delete:");
				search = sc.next();
				bol = list.contains(search);
				if(bol) {
					list.remove(search);
					System.out.println("Deleted successfully");
				}
				else {
					System.out.println("Item does not exist");
				}
				break;
			
			case 4:
				System.out.println("Item in the list are:");
				Iterator<String> itr = list.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				break;
				
			case 5:
				sc.close();
				System.exit(0);
				break;
			}
		}
	}

}
