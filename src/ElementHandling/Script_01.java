package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver d= new FirefoxDriver();
       d.get("http://demo.actitime.com/login.do");
       Thread.sleep(3000);
       //enter username
       WebElement un = d.findElement(By.id("username"));
       un.sendKeys("admin");
       Thread.sleep(3000);
       un.sendKeys(Keys.CONTROL+"a");
       un.sendKeys(Keys.CONTROL+"c");
       Thread.sleep(3000);
      // un.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
       un.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));
       
       
       
       
	}

}
