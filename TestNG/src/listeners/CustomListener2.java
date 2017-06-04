package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

/**
 * @author subbu
 *
 */
public class CustomListener2 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart:::Test name::"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess"+"::Test Name::"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure"+"::Test Name::"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped"+"::Test Name::"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		ITestNGMethod methods[] = context.getAllTestMethods();
		for(ITestNGMethod method:methods){
			System.out.println("onStart=>Method Names=>"+method.getMethodName());
		}
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish"+"::Test Name::"+context.getName());
		
	}

}
