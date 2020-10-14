package school;

class teacher extends person {

	double salary;
	String subject;
	
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double sal) {
		this.salary = sal;
	}
	
	public String getSubject_taught() {
		return this.subject;
	}
	public void setSubject_taught(String sub) {
		this.subject = sub;
	}
	
}
