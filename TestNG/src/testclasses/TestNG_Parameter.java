/**
 * 
 */
package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author subbu
 *
 */
public class TestNG_Parameter {
	
	@BeforeClass
	@Parameters({"browsers"})
	public void setUp(String browsers){
		System.out.println("Parameter values from testng xml file....");
		String[] strArray = browsers.split(",");
		System.out.println("Browser values:::"+strArray[0]+":::"+strArray[1]+":::"+strArray[2]);
	}
	
	@Test
	@Parameters({"response"})
	public void method1(String response){
		System.out.println("Response:::"+response);
	}

}
