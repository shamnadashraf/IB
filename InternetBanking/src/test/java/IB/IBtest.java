package IB;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

//import org.testng.annotations.*;
public class IBtest {

	public class NavigationTest {

	     public String baseUrl = "https:\\192.168.32.9:9005";

	       String driverPath = "\"E:\\Automation IB\\geckodriver-v0.33.0-win64\\geckodriver.exe\"";

	       public WebDriver driver;

	 

	        public String expected = null;

	        public String actual = null;

	            @BeforeTest

	          public void launchBrowser() {

	              System.out.println("launching firefox browser");

	            //  System.setProperty("webdriver.gecko.driver", driverPath);

	              System.setProperty("webdriver.geckoe.driver","driversPath");

	              driver= new FirefoxDriver();

	              driver.get(baseUrl);

	          }

	          

	          @BeforeMethod

	          public void verifyHomepageTitle() {

	              String expectedTitle = "Welcome: Mercury Tours";

	              String actualTitle = driver.getTitle();

	              Assert.assertEquals(actualTitle, expectedTitle);

	          }

	              @Test(priority = 0)

	          public void register(){

	              driver.findElement(By.linkText("REGISTER")).click() ;

	              expected = "Register: Mercury Tours";

	              actual = driver.getTitle();

	              Assert.assertEquals(actual, expected);

	          }

	              @Test(priority = 1)

	          public void support() {

	                driver.findElement(By.linkText("SUPPORT")).click() ;

	                expected = "Under Construction: Mercury Tours";

	                actual = driver.getTitle();

	                Assert.assertEquals(actual, expected);

	          }

	          @AfterMethod

	          public void goBackToHomepage ( ) {

	                driver.findElement(By.linkText("Home")).click() ;

	          }

	           

	          @AfterTest

	          public void terminateBrowser(){

	              driver.close();

	          }

	}
	}