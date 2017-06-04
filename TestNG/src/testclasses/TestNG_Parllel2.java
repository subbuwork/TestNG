/**
 * 
 */
package testclasses;

import org.testng.annotations.Test;

/**
 * @author subbu
 *
 */
public class TestNG_Parllel2 {
	
	@Test
	public void method1() throws InterruptedException{
		System.out.println("Runs TestNG_Parllel2 -> method1 step..");
		Thread.sleep(2000);
		System.out.println("Runs TestNG_Parllel2 ->method1  more steps..");
	}
	
	@Test
	public void method2() throws InterruptedException{
		System.out.println("Runs TestNG_Parllel2 ->method2 step..");
		Thread.sleep(2000);
		System.out.println("Runs TestNG_Parllel2 -> method2 more steps..");
	}

}
