package BddFramework1.BddFramework1;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin {
	WebDriver driver;
	

@Given("^I navigate to login page$")
public void i_navigate_to_login_page() throws Throwable {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Victor\\Desktop\\Selenium Jar\\chromedriver.exe");
   driver  = new ChromeDriver();
   driver.get("https://www.gmail.com");
   
}

@When("^I enter my correct user name$")
public void i_enter_my_correct_user_name() throws Throwable {
   driver.findElement(By.id("identifierId")).sendKeys("automationclass50@gmail.com");
   Thread.sleep(3000);
   driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
   
}

@When("^I enter my correct password$")
public void i_enter_my_correct_password() throws Throwable {
	Thread.sleep(3000);
    driver.findElement(By.name("password")).sendKeys("Strawberry1##2");
    driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content")).click();
    Thread.sleep(3000);	 
}

@Then("^I should be allowed to sign in successfully$")
public void i_should_be_allowed_to_sign_in_successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
     
	assertEquals("Inbox", driver.findElement(By.xpath("//*[@id=\":3m\"]/div/div[2]/span/a")).getText());
}


	
}


	

