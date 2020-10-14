import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationEmployee {

	public static void main(String[] args) {

		////Deserialization
		try {
			Employee e2;
			FileInputStream fis = new FileInputStream("data");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e2 = (Employee) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Employee 2; "+e2);
			////print parameters of Employee 2 after de-serialization
			System.out.println("Deserialized data");
			System.out.println("Name is "+e2.getName());
			System.out.println("Date of birth is "+e2.getDOB());
			System.out.println("Department is "+e2.getDepartment());
			System.out.println("Designation is "+e2.getDesignation());			
			
		}
		catch(Exception e) {
			System.out.println("Exception during deserialization "+e);
			System.exit(0);
		}
	}

}
