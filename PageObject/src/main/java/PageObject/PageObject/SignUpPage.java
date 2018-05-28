package PageObject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {
	
	@FindBy(id= "firstname")
	private WebElement FirstName;
	
	@FindBy(id= "lastname")
	private WebElement LastName;
	
	@FindBy(id= "address")
	private WebElement Address;
	
	@FindBy(id= "zipcode")
	private WebElement zipcode;
	
	@FindBy(id= "signup")
	private WebElement submitButton;
	
	public SignUpPage (WebDriver driver) {
		super (driver);
	}
	
	public void enterName(String FirstName, String LastName) {
	 this.FirstName.sendKeys(FirstName);
	 this.LastName.sendKeys(LastName);
	 
	}
	 public void enterAddress(String Address, String zipcode ) {
	    this.Address.sendKeys(Address);
	    this.zipcode.sendKeys(zipcode);
	  
   }
     public ThankYouPage submit() {
    	 submitButton.click();
		return new ThankYouPage(driver);
		

}

}