
public class Employee_info {
	
	public static void main(String[] args) {
		
		int[] Emp_ID = {1001,1002,1003,1004,1005,1006,1007};
		String[] Emp_name = {"Ashish","Shushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
		String[] Join_date = {"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","01/01/2000","12/06/2006",};
		char[] code = {'e','c','k','r','m','e','c'};
		String[] dept = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
		int[] Basic = {20000,30000,10000,12000,50000,23000,29000};
		int[] HRA = {8000,12000,8000,6000,20000,9000,12000};
		int[] IT = {3000,9000,1000,2000,20000,4400,10000};
		
		String[] Designation = {"Engineer","Consultant","Clerk","Receptionist","Manager"};
		int[] DA = {20000,32000,12000,15000,40000};
		
		String desig=null;
		int dear=0;
		
		/*
		for(int i=0;i<=6;i++){
			
				switch(code[i]) {
				case 'e' : 	desig = Designation[0];
							dear = DA[0];
							break;
							
				case 'c' : 	desig = Designation[1];
							dear = DA[1];
							break;
				
				case 'k' : 	desig = Designation[2];
							dear = DA[2];
							break;
				
				case 'r' : 	desig = Designation[3];
							dear = DA[3];
							break;
				
				case 'm' : 	desig = Designation[4];
							dear = DA[4];
							break;
				}
		}
		*/
		int i,in=0;
		
		if(args.length==0) {
			System.out.println("Please enter empid");
		}
		
		else {
			
			int empid = (int)(Integer.parseInt(args[0]));
			int count = 0;
			for(i=0;i<Emp_ID.length;i++) {
					
				if(empid==Emp_ID[i]) {
					in=i;
					count ++;
				}	
			}	
				
			if(count==1) {
					
				switch(code[in]) {
					case 'e' : 	desig = Designation[0];
								dear = DA[0];
								break;
								
					case 'c' : 	desig = Designation[1];
								dear = DA[1];
								break;
					
					case 'k' : 	desig = Designation[2];
								dear = DA[2];
								break;
					
					case 'r' : 	desig = Designation[3];
								dear = DA[3];
								break;
					
					case 'm' : 	desig = Designation[4];
								dear = DA[4];
								break;
					}				
					
			int salary = Basic[in]+HRA[in]+dear-IT[in];			

			System.out.println("Emp No.\t"+"Emp Name\t"+"Depatment\t"+"Designation\t"+"Salary");
			System.out.println(Emp_ID[in]+"\t"+Emp_name[in]+"\t\t"+dept[in]+"\t\t"+desig+"\t\t"+salary);
			
			}
			else {
					System.out.println("There is no employee with empid "+args[0]);
				}
			}
		}
		
		
		
	

}

