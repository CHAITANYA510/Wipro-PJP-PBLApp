/*
 Create a school application with a class called Person. Create name and dateOfBirth as member variables.
Create a class called Teacher that inherits from the Person class. 
The teacher will have additional properties like salary, and the subject that the teacher teaches.
Create a class called Student that inherits from Person class. This class will have a member variable called studentId. 
Create a class called College Student that inherits from Student class.
 This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
Create objects of each of this classes, invoke and test the methods that are available in these classes.
*/

package school;

public class TestSchool {

	public static void main(String[] args) {
		
		teacher t1 = new teacher();
		college_student cs1 =  new college_student();
		
		t1.setPersonName("Seema");
		t1.setDateOfBirth("15/04/1968");
		t1.setSalary(600000);
		t1.setSubject_taught("Hsitory");
		
		cs1.setPersonName("Raj");
		cs1.setDateOfBirth("28/05/1999");
		cs1.setCollegeName("Shah and Anchor Engg college");
		cs1.setStudyingYear("Fourth");
		cs1.setStudentID(13076);
		
		System.out.println("Teacher name is "+t1.getPersonName());
		System.out.println("Teacher's DOB is "+t1.getdateOfBirth());
		System.out.println("Teacher's salary is "+t1.getSalary());
		System.out.println("Subject taught is "+t1.getSubject_taught());

		System.out.println("\nName of student is "+cs1.getPersonName());
		System.out.println("DOB of "+cs1.getPersonName()+" is "+cs1.getdateOfBirth());
		System.out.println(cs1.getPersonName()+" studies in "+cs1.getCollegeName());
		System.out.println(cs1.getPersonName()+" studies in "+cs1.getStudyingYear()+" year");
		System.out.println("Student ID is "+cs1.getStudentID());
		
	}

}
