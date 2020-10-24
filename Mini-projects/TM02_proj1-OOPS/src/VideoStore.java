import java.util.Scanner;

public class VideoStore extends Video{
	String[] Video = new String[10];
	Scanner sc = new Scanner(System.in);
	
	String addVideo(String name){
		return getName(name);
	}
	
	String doCheckout(String name) {
		
		for(int index=0;index<videoName.length;index++) {
			if(name.equals(videoName[index])) {
				return doCheckout(index);
				//break;
			}	
		}
		return "Video does not exist";
	}
		
	String doReturn(String name) {
		for(int index=0;index<videoName.length;index++) {
			if(name.equals(videoName[index])) {
				return doReturn(index);
			}	
		}
		return "Video does not exist";
	}
		
	String receiveRating(String name) {
		for(int index=0;index<videoName.length;index++) {
			if(name.equals(videoName[index])) {
				System.out.print("Enter the rating for this video: ");
				int rating = sc.nextInt();
				return receiveRating(index,rating);
			}
		}	
		return "Video does not exist";
	}
	
	void listInventory() {
		
		boolean bol;
		int rating;
		int len = videoName.length;
		for(int index=0;index<len;index++) {
			bol = getCheckout(index);
			rating = getRating(index);
			if(videoName[index] == null) {
				break;
			}
			else {
				System.out.println(videoName[index]+"\t\t"+"|"+"\t"+bol+"\t\t"+"|"+"\t"+rating);
			}
		}	
	}	
}