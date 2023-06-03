package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_02 {

	private static int keyEvent;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
//HANDLING COTEXT MENU
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement tgt_ele=driver.findElement(By.xpath("(.//img[@class='conta iner'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(tgt_ele).perform();
		a.contextClick().perform();
		//a.contextClick(tgt_ele).perform();
        Thread.sleep(3000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_V);
	}

}
