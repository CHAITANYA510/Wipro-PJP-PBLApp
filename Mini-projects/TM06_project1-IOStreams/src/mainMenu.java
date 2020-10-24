import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mainMenu {
	
	static void display() {
		System.out.println("Main Menu");
		System.out.println("1.Add an Employee");
		System.out.println("2.Display All");
		System.out.println("3.Exit");
		System.out.print("Select an option: ");
	}
	
	static void storeEmployeeDetails(PrintWriter write,int ID,String Name,int Age,float Salary) throws IOException{
		write.println(ID);
		write.println(Name);
		write.println(Age);
		write.println(Salary);
		write.flush();
	}
	
	static void showEmployeeDetails(BufferedReader read) throws IOException{
		int next = read.read();
		while(next>0) {
			for(int i=0;i<4;i++) {
				System.out.print(read.readLine()+"\t");
			}
			System.out.println();
			next = read.read();
		}
	}
	
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);
			PrintWriter write;
			write = new PrintWriter("details.txt");
			BufferedReader read;
			read = new BufferedReader(new FileReader("details.txt"));
			
			while(true) {
				System.out.println();
				display();
				int choice = sc.nextInt();
				System.out.println();
				switch(choice) {
				
					case 1:
						System.out.print("Enter Employee ID: ");
						int ID = sc.nextInt();
						System.out.print("Enter Employee Name: ");
						String Name = sc.next();
						System.out.print("Enter Employee Age: ");
						int Age = sc.nextInt();
						System.out.print("Enter Employee Salary: ");
						float Salary = sc.nextFloat();
						storeEmployeeDetails(write,ID,Name,Age,Salary);
						break;
						
					case 2:
						System.out.println("------------Report-------------");
						System.out.println("Emp ID\tName\tAge\tSalary");
						showEmployeeDetails(read);
						System.out.println("---------End of Report---------");
						break;
						
					case 3:
						sc.close();
						write.close();
						read.close();
						System.out.println("Exiting the system...");
						System.exit(0);
						break;
					
					default:
						System.out.println("Enter valid Choice");
						System.exit(0);
						break;
				}
			}
		}

		catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}

		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
