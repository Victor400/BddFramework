package PageObject.PageObject;



import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	WebDriver driver;
	
    @Test
	public void SignUp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Victor\\Desktop\\Selenium Jar\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("https://www.kimschiller.com/page-object-pattern-tutorial/index.html");
		   
		   driver.findElement(By.id("firstname")).sendKeys("Victor");
		   
		   driver.findElement(By.id("lastname")).sendKeys("Smith");
		   
		   driver.findElement(By.id("address")).sendKeys("32 High Street");
		   
		   driver.findElement(By.id("zipcode")).sendKeys("11212");
		   
		   driver.findElement(By.id("signup")).click();
		   
		   driver.findElement(By.tagName("h1")).getText();
		   
		   driver.findElement(By.tagName("p")).getText();
		   
		   assertEquals("Thank you!",  driver.findElement(By.tagName("h1")).getText());
		   
		   assertEquals("You are now subscribed to our service.", driver.findElement(By.tagName("p")).getText());
		   
		   driver.close();
		   
		   driver.quit();
		   
		   
    }
	
	
}