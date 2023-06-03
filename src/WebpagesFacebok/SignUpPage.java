package WebpagesFacebok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage
{
	    @FindBy (xpath = ".//input[@name='firstname']") 
	    private WebElement firstname;

		@FindBy (xpath = ".//input. [@name='lastname']") 
		private WebElement lastname;

		@FindBy (xpath=".//input[@name='reg_email___'}")
		private WebElement email;

		@FindBy (xpath=".//input[@name='reg_email_confirmation 21 private WebElement reenteremail']")
        private WebElement reenteremail;
		
		@FindBy (xpath = ".//input[@name='reg_passwd_']")
        private WebElement password;
		
		@FindBy(id="day")
		private WebElement day;

		@FindBy (id="month")
		private WebElement month;

		@FindBy (id="year")
		private WebElement year;

		@FindBy (xpath ="(.//input [@name='sex']) [1]")
		private WebElement femaleoption;

		@FindBy (id="u_7_5_6v")
		private WebElement maleoption;
		
		@FindBy (id="u_7_6_Qg")
		private WebElement customoption;

		@FindBy(xpath=".//button[@name='websubmit']") 
		private WebElement signupbutton;

		
		public void signupPage (WebDriver driver)
		{
			PageFactory.initElements (driver, this);
		}
			public void setdetails (String fn, String ln, String mail,String remail, String pwd)
			{
			firstname.sendKeys (fn);
			lastname.sendKeys (ln);
			email.sendKeys (mail);
			reenteremail.sendKeys (remail);
			password.sendKeys (pwd);
			}
			
			public void selectDateOfBirthDay()
			{
			Select s new Select (day);
			s.selectByValue("03");
		
			Select s1-new Select (month) ;
			s1.selectByVisibleText("March");

			Select s2-new Select (year);
			s2.selectByValue("1999");
			}
			public void selectFemaleOption()
			{
			femaleoption.click();
			}
			public void selectMaleOption()
			{
			maleoption.click();
			}
			public void selectCustomOption()
			{
			customoption.click();
			}
			public void clickonSignUpButton()
			{
				signupbutton.click();
		}
		
}
