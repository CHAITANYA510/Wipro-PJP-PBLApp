package jspbean;

public class Problem1 {
	
	private String name;
	private int empID;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public double getSalary() {
		return salary*salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
