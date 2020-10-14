/*Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient. Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results. */


class Patient {

	String name;
	double height;
	double weight;
	
	static double computeBMI(double height,double weight) { 
		
		double BMI = weight/(height*height);
		return(BMI);
	}
	
	static void print(String s,double height,double weight,double BMI) {
		
		System.out.println("Name of patient is: "+s);
		System.out.println("Height in meters: "+height+"\tWeight in kg: "+weight);
		System.out.println("BMI is: "+BMI);
	}
	
	
	
	public static void main(String[] args) {
		
		Patient p1 = new Patient();
		p1.name = "Raju"; 
		p1.height = 2.8;
		p1.weight = 53.3;
		
		double BMI = computeBMI(p1.height,p1.weight);
		print(p1.name,p1.height,p1.weight,BMI);
	}

}
