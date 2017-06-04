package testclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.CustomListener2;

@Listeners(CustomListener2.class)
public class TestNG_Listener2 {
	
	@BeforeClass
	public void setUp() {
		System.out.println("TestNG_Listener1 ->Code executing in Before Class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestNG_Listener1 ->Code executing in After Class");
	}

	@Test
	public void method1() {
		System.out.println("TestNG_Listener1 ->Code executing in -> Method1...");
		Assert.assertEquals(true,true);
	}

	@Test
	public void method2() {
		System.out.println("TestNG_Listener1 ->Code executing in -> Method2...");
		Assert.assertEquals(true,false);
	}

}
