package PageObject.PageObject;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThankYouPage extends PageObject{
	
	@FindBy(tagName="h1")
	private WebElement header;
	
	@FindBy(tagName="p")
	private WebElement body;
	
	public ThankYouPage(WebDriver driver) {
	 super(driver);
	}
    
	public String ConfirmationHeader() {
		return header.getText();
	}
		
	public String ConfirmationBody() {
		return body.getText();
	}	
		
	
		
}		
		
		
