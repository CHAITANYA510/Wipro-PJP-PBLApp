/**
 * Write a JS function which accepts a number and return true if number is prime or else false,
 * Save the code as Sample.js, invoke the function from java program and display the result.
 */

function func(num){
	
	if(num==0 || num==1){
		return false;
	}
	for(var i=2;i<=num/2;i++){
		if(num%i==0){
			return false;
		}
	}
	return true;
}

