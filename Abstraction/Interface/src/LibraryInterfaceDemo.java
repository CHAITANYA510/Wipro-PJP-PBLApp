
public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidsUsers kid1 = new KidsUsers();
		AdultUser adult1 = new AdultUser();
		
		kid1.age = 10;
		kid1.registerAccount();
		kid1.bookType = "Kids";
		kid1.requestBook();
		
		adult1.age = 13;
		adult1.registerAccount();
		adult1.bookType = "Fiction";
		adult1.requestBook();
		
	}
}
