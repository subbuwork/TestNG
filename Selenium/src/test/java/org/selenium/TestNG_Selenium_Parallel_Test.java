package org.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class TestNG_Selenium_Parallel_Test {
  WebDriver webdriver;
  String baseUrl;
  @BeforeClass
  @Parameters({"browser"})
  public void setUp(String browser) {
	  baseUrl = "https://www.facebook.com";
	  if(browser.contentEquals("ie")){
		  System.setProperty("webdriver.ie.driver","E:\\Softwares\\Selenium\\IEDriverServer.exe");
		  webdriver = new InternetExplorerDriver();
		  webdriver.manage().window().maximize();
		  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  webdriver.get(baseUrl);
	  }else if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver","E:\\Softwares\\Selenium\\chromedriver.exe");
		  webdriver = new ChromeDriver();
		  webdriver.manage().window().maximize();
		  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  webdriver.get(baseUrl);
		  
	  }else if(browser.equalsIgnoreCase("ff")){
		  System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Selenium\\geckodriver.exe");
		  webdriver = new FirefoxDriver();
		  webdriver.manage().window().maximize();
		  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  webdriver.get(baseUrl); 
	  }else{
		  System.setProperty("webdriver.gecko.driver","E:\\Softwares\\Selenium\\MicrosoftWebDriver");
		  webdriver = new EdgeDriver();
		  webdriver.manage().window().maximize();
		  webdriver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  webdriver.get(baseUrl); 
	  }
  }
  
  @Test
  public void loginTest(){
	  webdriver.findElement(By.id("email")).sendKeys("subbu.varsith@gmail.com");
	  webdriver.findElement(By.id("pass")).sendKeys("test123");
	  webdriver.findElement(By.xpath("//input[@id='u_0_u']")).click();
  }

  @AfterClass
  public void afterClass()throws InterruptedException {
	 Thread.sleep(30);
	 webdriver.quit();
  }

}
