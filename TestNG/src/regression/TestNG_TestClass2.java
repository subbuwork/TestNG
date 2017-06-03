/**
 * 
 */
package regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTestSuite;

/**
 * @author subbu
 *
 */
public class TestNG_TestClass2 extends BaseTestSuite{
	@BeforeClass
	public void setUp() {
		System.out.println("\n runs TestNG_TestClass2 -> before  class...");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("\n runs TestNG_TestClass2 ->  after  class...");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\n runs TestNG_TestClass2 ->  method...");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\n runs TestNG_TestClass2 -> before  method...");
	}

	@Test
	public void method1() {
		System.out.println(" TestNG_TestClass2 -> Method1..");
	}

	@Test
	public void method2() {
		System.out.println(" TestNG_TestClass2 -> Method2...");
	}

}
