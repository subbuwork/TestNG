package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.java.testng.SomeClassTest;

public class TestNG_DependentTest {
	SomeClassTest obj;
	@BeforeClass
	public void setUp() {
		obj = new SomeClassTest();
		System.out.println("TestNG_DependentTest -> before  class...");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_DependentTest ->  after  class...");
	}


	@Test(dependsOnMethods={"method2"},alwaysRun = true)
	public void method1() {
		System.out.println("TestNG_DependentTest-> Method1..");
	}

	@Test
	public void method2() {
		System.out.println("TestNG_DependentTest-> Method2...");
		int result = obj.sum(1, 2);
		Assert.assertEquals(result, 3);
	}
	@Test(dependsOnMethods={"method1"},alwaysRun = true)
	public void method3() {
		System.out.println("TestNG_DependentTest -> Method2...");
	}
	@Test
	public void method4() {
		System.out.println("TestNG_DependentTest-> Method2...");
	}

}
