/**
 * Write a JS function which accepts a number and return true if number is prime or else false,
 * Save the code as Sample.js, invoke the function from java program and display the result.
 */

package nashormEngine;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");
		engine.eval(new FileReader("D:/ecllipse c/Java 8 Features/src/nashormEngine/Demo.js"));
		Invocable invocable = (Invocable)engine;

		int[] toTestArray = {10,9,7,0,1,2,3,17,66,88,4,5};
		
		for(int i=0;i<toTestArray.length;i++) {
			
			if((boolean)(invocable.invokeFunction("func", toTestArray[i]))) {
				System.out.println(toTestArray[i]+" Is prime");
			}
			else {
				System.out.println(toTestArray[i]+" Is not prime");
			}
		}
	}
}
