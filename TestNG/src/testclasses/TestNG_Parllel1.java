/**
 * 
 */
package testclasses;

import org.testng.annotations.Test;

/**
 * @author subbu
 *
 */
public class TestNG_Parllel1 {
	
	@Test
	public void method1() throws InterruptedException{
		System.out.println("Runs TestNG_Parllel1 ->method1 step..");
		Thread.sleep(6000);
		System.out.println("Runs TestNG_Parllel1 ->method1 more steps..");
	}
	
	@Test
	public void method2() throws InterruptedException{
		System.out.println("Runs TestNG_Parllel1 ->method2 step..");
		Thread.sleep(6000);
		System.out.println("Runs TestNG_Parllel1 ->method2 more steps..");
	}

}
