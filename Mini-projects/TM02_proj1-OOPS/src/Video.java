
public class Video {
	
	String[] videoName = new String[10];
	boolean[] checkout = new boolean[10];
	int[] rating = new int[10];
	int nameIndex=0;
	
	String getName(String name){
		int count=0;
		for(int index=0;index<videoName.length;index++){
			if(name.equals(videoName[index])){
				count++;
			}
		}
		if(count==0){
			videoName[nameIndex] = name;
			nameIndex++;
			return "Video "+(char)34+name+(char)34+" added successfully";
		}
		else{
			return "Video already exist";
		}
	}
	
	String doCheckout(int index) {
		checkout[index] = true;
		return "Video "+(char)34+videoName[index]+(char)34+" checked out successfully.";
	}
	
	String doReturn(int index) {
		if(checkout[index]=true) {
			checkout[index]=false;
			return "Video "+(char)34+videoName[index]+(char)34+" returned successfully.";
			
		}
		else {
			return "Video has not been checkout.";
		}
	}
	
	String receiveRating(int index,int rat) {
		rating[index] = rat;
		return "Rating "+(char)34+rat+(char)34+" has been mapped to the video "+(char)34+videoName[index]+(char)34;
	}
	
	int getRating(int index) {
		return rating[index];
	}
	
	boolean getCheckout(int index) {
		return checkout[index]; 
	}
}
