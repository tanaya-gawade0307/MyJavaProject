package WebpagesFacebok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Url 
{
	@FindBy (linkText = "Create new account") 
	private WebElement creataccountbutton;
	
	public Url (WebDriver driver)
	{
	PageFactory.initElements (driver, this);
	}
	public void clickOnCreateAccountButton() {

	creataccountbutton.click();
	}


}
