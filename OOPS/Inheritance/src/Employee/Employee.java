package Employee;

public class Employee extends Person{

	
	double  annual_salary; 
	String year_joined;
	String insurance_number;
	
	///getter
	public double getannual_salary() {
		return this.annual_salary;
	}
	
	public String getyear_joined() {
		return this.year_joined;
	}
	
	public String getinsurance_number() {
		return this.insurance_number;
	}
	
	///setter
	public void setannual_salary(double annualsal) {
		this.annual_salary = annualsal;
	}
	
	public void setyear_joined(String year) {
		this.year_joined = year;
	}
	
	public void setinsurance_number(String num) {
		this.insurance_number = num;
	}
	
}
