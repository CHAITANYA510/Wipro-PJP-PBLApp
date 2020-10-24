import org.junit.jupiter.api.Test;

public class testVideo {

	Video v1 = new Video();
	
	@Test
	public void testInventory() {
		
		String name = "Tips";
		v1.getName(name);
		name = "Zee";
		v1.getName(name);
	}

}
