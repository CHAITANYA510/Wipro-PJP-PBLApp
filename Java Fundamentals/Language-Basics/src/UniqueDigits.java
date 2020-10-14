class UniqueDigits{
	
	
	public static void main(String[] args) {
		
		int input=1921;
		int temp = input;
		int uniqueCount=0;
		int rem=0;
		int zeroCount=0;
		int[] arr=new int[10];
		int exist=0,current=0;
		
		while(input>0) {
			rem=input%10;
			input=input/10;
			System.out.println("rem is "+rem);
			System.out.println("number is "+input);
			if(rem==0) {
				zeroCount++;
				if(zeroCount==1) {
					uniqueCount++;
				}
			}
			else {
				for(int i=0;i<arr.length;i++) {
					if(arr[i] == rem) {
						exist=1;
						System.out.println("exist");
						break;
					}
					else {
						exist=0;
					}
				}
				
				if(exist==1) {
					System.out.println("in exist loop");
				}
				else{
					arr[current]=rem;
					System.out.println("in non exist loop");
					current++;
					uniqueCount++;
				}
			}
			System.out.println("unique count is "+uniqueCount);
			System.out.println();
		}
		if(rem==0&&zeroCount==0) {
			uniqueCount++;
		}
		
		System.out.println("number is "+temp+" final unique count is "+uniqueCount);
	}
}