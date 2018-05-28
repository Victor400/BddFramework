package PageObject.PageObject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Victor\\Desktop\\Selenium Jar\\chromedriver.exe");
	   driver = new ChromeDriver();
	   
   	   }  
	   @After
	     public void cleanup() {
	      driver.manage().deleteAllCookies();
	   }
	   @AfterClass
	     public static void close() {
	      driver.close();
	   }
	
 }

