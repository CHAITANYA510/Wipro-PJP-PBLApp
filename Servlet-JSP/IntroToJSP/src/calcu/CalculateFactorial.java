package calcu;

public class CalculateFactorial {
	public int calc(int n1) {
		
		if(n1<0) {
			return 0;
		}
		
		if(n1==0 || n1==1) {
			return 1;
		}
		
		int fact = 1;
		int current = n1;
		
		while(current > 1) {
			fact = fact * current;
			current--;
		}
		
		return fact;
	}
}
