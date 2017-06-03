/**
 * 
 */
package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.testng.SomeClassTest;

/**
 * @author subbu
 *
 */
public class TestNG_Asserts {
	
	@Test
	public void sumTest(){
		SomeClassTest test = new SomeClassTest();
		int result = test.sum(1,2);
		Assert.assertEquals(result, 3);
		
	}
	
	@Test
	public void concatString(){
		SomeClassTest test = new SomeClassTest();
		String result = test.concatString("Hello","World!");
		Assert.assertEquals(result, "Hello World!");
	}
	
	@Test
	public void arrayTest(){
		SomeClassTest test = new SomeClassTest();
		int[] result = test.intArray();
		int[] expected = {1,2,3,4};
		Assert.assertEquals(result, expected);
		
	}

}
