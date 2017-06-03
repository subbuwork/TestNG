/**
 * 
 */
package testclasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.java.testng.SomeClassTest;

/**
 * @author subbu
 *
 */
public class TestNG_SoftAssert {
	
	@Test
	public void sumNumbers(){
		SoftAssert softAssert = new SoftAssert();
		SomeClassTest test = new SomeClassTest();
		int results = test.sum(1,2);
		softAssert.assertEquals(results,2);
		System.out.println("\n line after assert 1..");
		softAssert.assertEquals(results,3);
		System.out.println("\n line after assert 2...");
		softAssert.assertEquals(results,3);
		System.out.println("\n line after assert 3..");
		softAssert.assertAll();
		
		
	}
	

}
