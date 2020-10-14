
public class Language_Basics_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==2) {
			int a,b;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			int sum = a+b;
			System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+sum);
		}
	}
}
