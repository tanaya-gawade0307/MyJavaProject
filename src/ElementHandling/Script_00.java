package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver d=new FirefoxDriver();
     d.get("http://demo.actitime.com/login.do");
     Thread.sleep(3000);
     //enter username;
     WebElement un=d.findElement(By.id("username"));
     un.sendKeys("admin");
     Thread.sleep(3000);
     un.sendKeys(Keys.CONTROL+"a");
     un.sendKeys(Keys.CONTROL,"c");
     Thread.sleep(3000);
     //paste text in password field;
     d.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
     Thread.sleep(3000);
     //select checkbox;
     d.findElement(By.id("KeepmeLoggedInCheckbox")).sendKeys(Keys.SPACE);
     Thread.sleep(3000);
     //click on login button;
     d.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	}

}
