/**
 * 
 */
package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * @author subbu
 *
 */
public class CustomListener1 implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation::"+testResult.getTestClass().getName()+"=>"+testResult.getName());

	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

		System.out.println("afterInvocation::"+testResult.getTestClass().getName()+"=>"+testResult.getName());
		System.out.println("<===================================================>");
	}

}
