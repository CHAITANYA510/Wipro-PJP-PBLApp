package programs;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value={Demo1Test.class,Demo2Test.class,EmployeeTest.class})
public class AllTests {
	
}
