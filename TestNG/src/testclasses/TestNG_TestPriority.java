package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_TestPriority {
	
	@BeforeClass
	public void setUp() {
		System.out.println("Runs TestNG_TestClass1 -> before  class...");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("Runs TestNG_TestClass1 ->  after  class...");
	}

	@Test(priority=2)
	public void method1() {
		System.out.println(" TestNG_TestClass1 -> Method1..");
	}

	@Test(priority=3)
	public void method2() {
		System.out.println(" TestNG_TestClass1 -> Method2...");
	}
	@Test(priority=0)
	public void method3() {
		System.out.println(" TestNG_TestClass1 -> Method3...");
	}
	@Test(priority=1)
	public void method4() {
		System.out.println(" TestNG_TestClass1 -> Method4...");
	}

}
