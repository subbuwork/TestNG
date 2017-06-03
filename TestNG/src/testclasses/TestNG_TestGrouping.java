package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_TestGrouping {
	
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		System.out.println("TestNG_TestGrouping-> before  class...");
	}

	@AfterClass(alwaysRun = true)
	public void cleanUp() {
		System.out.println("TestNG_TestGrouping->  after  class...");
	}
	@Test(groups={"car","suv"})
	public void BMW123() {
		System.out.println("BMW X6...");
	}

	@Test(groups = {"car","sedan"})
	public void AudiA6() {
		System.out.println("Audi A6..");
	}
	@Test(groups = {"bike"})
	public void HondaUni() {
		System.out.println("Honda Unicorm..");
	}

	@Test(groups = {"bike"})
	public void Ninja() {
		System.out.println("Kawasaki Ninja..");
	}

}
