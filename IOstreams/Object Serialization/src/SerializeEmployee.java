import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;

public class SerializeEmployee{

	public static void main(String[] args) {
		////using SimpleDateFormat to pass Date in constructor
		try {
			Employee e1 = new Employee("Raj", new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"),"IT","Engg");
			System.out.println("Employee 1; "+e1);
			////print parameters of Employee 1 before serialization
			//e1.setDOB();
			System.out.println("Name is "+e1.getName());
			System.out.println("Date of birth is "+e1.getDOB());
			System.out.println("Department is "+e1.getDepartment());
			System.out.println("Designation is "+e1.getDesignation());
			///Serialization
			FileOutputStream fos = new FileOutputStream("data");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.flush();
			oos.close();
			fos.close();
			System.out.println("Serialized data is saved in data");
		}
		
		catch(Exception e) {
			System.out.println("Exception during serialization "+e);
			System.exit(0);
		}
	}
}
