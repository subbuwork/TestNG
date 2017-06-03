package base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Runs BaseTestSuite -> before  suite class...");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Runs BaseTestSuite -> after  suite class...");
  }

  @BeforeTest
  public void beforeTest(){
	  System.out.println("Runs BaseTestSuite -> before test...");
  }
  @AfterTest
  public void afterTest(){
	  System.out.println("Runs BaseTestSuite -> after test...");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Runs BaseTestSuite -> before  suite...");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Runs BaseTestSuite -> after  suite...");
  }

}
