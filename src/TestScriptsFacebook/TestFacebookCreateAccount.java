package TestScriptsFacebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import WebpagesFacebok.SignUpPage;
import WebpagesFacebok.Url;

public class TestFacebookCreateAccount {

	public static void main(String[] args) 
	{
		
			WebDriver driver-new FirefoxDriver();

				driver.manage().timeouts ().implicitlyWait (Duration. ofSeconds (20));

				driver.get("https://www.facebook.com/");

				Url rvl-new Url (driver);

				rvl.clickOnCreateAccountButton();

				SignUpPage rv2-new SignUpPage ();

				rv2.setdetails ("tanaya", "gawade", "admin@gmail.com", "admin@gmail.com", "tanu@123");

				rv2.selectDateOfBirthDay();

				rv2.selectFemaleOption();

				rv2.clickonSignUpButton();

	}
}

