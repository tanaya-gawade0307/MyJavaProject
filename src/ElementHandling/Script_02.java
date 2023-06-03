package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    d.get("http://demo.actitime.com/login.do");
    Thread.sleep(3000);
    //enter username
    WebElement un=d.findElement(By.id("username"));
    String str="TANAYA GAWADE";
    un.sendKeys(str);
    for(int a=1; a<=str.length(); a++)
    {
    	un.sendKeys(Keys.BACK_SPACE);
    	Thread.sleep(3000);
    }
    
	}

}
