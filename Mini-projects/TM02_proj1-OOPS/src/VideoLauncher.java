import java.util.Scanner;

public class VideoLauncher {
	
	static void display() {
		System.out.println("MAIN MENU");
		System.out.println("==========");
		System.out.println("1.Add Videos:"+"\n2.Check Out Video:"+"\n3.Return Video:"
							+"\n4.Receive Rating:"+"\n5.List Inventory:"+"\n6.Exit:");
		System.out.print("Enter your choice (1. .6) : ");		
	}
	
	public static void main(String[] args) {
		int choice;
		VideoStore vs1 = new VideoStore();
		Scanner scan = new  Scanner(System.in);
		
		while(true) {	
			display();
			choice = scan.nextInt();
			
			switch(choice) {
				
				case 1:
					System.out.print("Enter the name of the video you want to add: ");
					String s1 = scan.next();
					System.out.println(vs1.addVideo(s1));
					break;
				
				case 2:
					System.out.print("Enter the name of the video you want to check out: ");
					String s2 = scan.next();
					System.out.println(vs1.doCheckout(s2));
					break;
				
				case 3:
					System.out.print("Enter the name of the video you want to return: ");
					String s3 = scan.next();
					System.out.println(vs1.doReturn(s3));
					break;
				
				case 4:
					System.out.print("Enter the name of the video you want to rate: ");
					String s4 = scan.next();
					System.out.println(vs1.receiveRating(s4));
					break;
				
				case 5:
					System.out.println("------------------------------------------------------");
					System.out.println("Video name\t"+"|"+"\tCheckout Status\t"+"|"+"\tRating");
					vs1.listInventory();
					System.out.println("------------------------------------------------------");
					break;
				
				case 6:
					System.exit(0);
					
				default:
					break;
			}
			System.out.println("\n");
		}
		
	}
}