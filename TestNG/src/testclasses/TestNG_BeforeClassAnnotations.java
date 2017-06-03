package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestNG_BeforeClassAnnotations {
 
  @BeforeClass
  public void setUp()
  {
	  System.out.println("\n runs before  class...");
  }
  
  @AfterClass
  public void cleanUp()
  {
	  System.out.println("\n runs after  class...");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("\n runs after  method...");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\n runs before  method...");
  }
  
  @Test
  public void method1(){
	  System.out.println("Method1..");
  }
  
  @Test
  public void method2(){
	  System.out.println("Method2...");
  }
  
  

}
