
public class Language_basics_1 {

	public static void main(String[] args) {
		
		if(args.length==2){
			
			if("Wipro".equals(args[0])){
				if("Banglore".equals(args[1])){
					System.out.println("Wipro Technologies Bangalore.");
				}
				else{
					System.exit(0);
				}
			}
			
			else if("ABC".equals(args[0])){
				if("Mumbai".equals(args[1])){
					System.out.println("ABC Technologies Mumbai.");
				}
				else{
					System.exit(0);			
				}
			}
		}
	}
}
