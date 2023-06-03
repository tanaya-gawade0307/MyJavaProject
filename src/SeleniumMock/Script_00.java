package SeleniumMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Script_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		WebElement un = driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("password"));
		
		if(un.isDisplayed() && pwd.isDisplayed()) {
			System.out.println("Username and Password fields are displayed!");
		}
		else {
			System.out.println("Username and Password fields are not displayed!");
		}
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		String login_color = login.getCssValue("background-color");
		System.out.println("Color of login button : "+login_color);
		String login_color1 = Color.fromString(login_color).asHex();
		System.out.println("Converted Color code of login Button is : "+login_color1);
		Thread.sleep(3000);
		
		login.click();
		Thread.sleep(3000);
		
		WebElement msg = driver.findElement(By.xpath("//span[text()='Required']"));
		Thread.sleep(3000);
		String err_msg = msg.getText();
		Thread.sleep(3000);
		System.out.println("Error msg is : "+err_msg);
	}

}
