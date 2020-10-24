import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testVideoStore{
	
	VideoStore vs1 = new VideoStore();
	
	@Test
	public void testgetName() {
		String name = "Tips";
		String out = "Video "+(char)34+name+(char)34+" added successfully";
		assertEquals(out,vs1.addVideo(name));
		out = "Video already exist";
		assertEquals(out,vs1.addVideo(name));
		name = "Zeee";
		out = "Video "+(char)34+name+(char)34+" added successfully";
		assertEquals(out,vs1.addVideo(name));
	}
	
	@Test 
	public void testCheckout() {
		testgetName();
		String name = "Tips";
		String out = "Video "+(char)34+name+(char)34+" checked out successfully.";
		assertEquals(out,vs1.doCheckout(name));
		name = "Zee";
		out = "Video does not exist";
		assertEquals(out,vs1.doCheckout(name));
	}
	
	@Test
	public void testReturn() {
		testgetName();
		String name = "Zeee";
		String out = "Video "+(char)34+name+(char)34+" returned successfully.";
		assertEquals(out,vs1.doReturn(name));
		
		name = "Jio";
		out = "Video does not exist";
		assertEquals(out,vs1.doReturn(name));
	}
	
	@Test
	public void testRate() {
		testgetName();
		String name = "Zeee";
		String out = "Video "+(char)34+name+(char)34+" returned successfully.";
		assertEquals(out,vs1.doReturn(name));
		
		name = "Zeee";
		int rat = 5;
		out = "Rating "+(char)34+rat+(char)34+" has been mapped to the video "+(char)34+name+(char)34;
		assertEquals(out,vs1.receiveRating(name));
		
		name = "ee";
		out = "Video does not exist";
		assertEquals(out,vs1.receiveRating(name));
	}
	
	

}
