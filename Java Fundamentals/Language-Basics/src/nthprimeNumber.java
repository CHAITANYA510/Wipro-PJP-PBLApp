
public class nthprimeNumber {

	public static void main(String[] args) {

		int find = 25;
		int countPrime=0;
		int testforPrime=2;
		boolean isPrime=false;

		if(find==1) {
			System.out.println("1 prime number is 2");
		}
		else{
			while(countPrime<find-1) {
				for(int i=2;i<testforPrime;i++) {
					if(testforPrime%i==0) {
						isPrime = false;
						break;
					}
					else {
						isPrime = true;
					}
				}
				if(isPrime) {
					countPrime++;
				}
				testforPrime++;
			}
			System.out.println(find+" prime number is "+--testforPrime);
		}
	}
}
