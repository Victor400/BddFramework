package PageObject.PageObject;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class SignUpFormTest extends BaseTest{
	
	@Test
	public void runTest() {
		
	  driver.get("https://www.kimschiller.com/page-object-pattern-tutorial/index.html");
	  
	  SignUpPage signUpPage = new SignUpPage (driver);
	  signUpPage.enterName("Bobby", "Smith");
	  signUpPage.enterAddress("30th Street", "11212");
	  
	  ThankYouPage thankyoupage = signUpPage.submit();
	  assertEquals("Thank you!", thankyoupage.ConfirmationHeader());
      assertEquals("You are now subscribed to our service.", thankyoupage.ConfirmationBody());
	}  
	 
	   
	  	
 }

	
		
	


