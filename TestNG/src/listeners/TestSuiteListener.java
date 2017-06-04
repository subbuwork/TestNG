package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
 /**
 * @author subbu
 *
 */
public class TestSuiteListener implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		System.out.println("onStart suite::"+suite.getName());
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("onFinish suite:::"+suite.getName());
		
	}

}
