/**
 * 
 */
package testclasses;

import org.testng.annotations.Test;

/**
 * @author subbu
 *
 */
public class TestNG_DataProvider {
	
	/*@DataProvider(name="inputs") Moving out to separate class
	public Object[][] dataprovider(){
		return new Object[][]{
			{"audi","a6"},
			{"honda","accord"},
			{"benz","c300"}
		};
	}*/
	
	@Test(dataProvider="inputs",dataProviderClass=base.TestData.class)
	public void method1(String input1, String input2){
		System.out.println("Input1::"+input1);
		System.out.println("Input2::"+input2);
	}

}
