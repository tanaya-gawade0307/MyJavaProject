package IframesHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) {
		 
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/LENOVO/Documents/MainPage.html");
//enter username
		driver.findElement(By.id("user")).sendKeys("admin");
//switch from main page to iframe
		driver.switchTo().frame(0);
//enter password
		driver.findElement(By.id("pass")).sendKeys("manager123");
//enter email
		driver.findElement(By.id("emailid")).sendKeys("admin@gmail.com");
//switc from iframe to mainpage
		driver.switchTo().parentFrame();
//enter contact
		driver.findElement(By.id("number")).sendKeys("9404847157");
	}

}
