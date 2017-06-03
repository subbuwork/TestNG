/**
 * 
 */
package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author subbu
 *
 */
public class TestNG_Enable_TimeOut {
	
	@BeforeClass
	public void setUp(){
		System.out.println("Run TestNG_Enable_TimeOut-> before class..");
	}
	
	@AfterClass
	public void cleanUp(){
		System.out.println("Run TestNG_Enable_TimeOut-> After class..");
	}
	
	@Test(enabled = true) //method enable or disable attribute
	public void method1(){
		System.out.println("Method1....");
	}
	
	@Test(timeOut = 101) //set  execution time frame for method, if executed in time success, time exceeds method fails..
	public void method2() throws InterruptedException{
		System.out.println("Method2....");
		Thread.sleep(100);
	}

}
