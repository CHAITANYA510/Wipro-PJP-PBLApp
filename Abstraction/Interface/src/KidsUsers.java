
class KidsUsers implements LibraryUser{
	
	int age;
	String bookType; 
	
	public void registerAccount() {
		//this.age = age;
		if(age<=12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else if(age>12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	
	public void requestBook() {
		
		if(bookType.equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
