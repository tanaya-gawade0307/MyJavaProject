package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		
 //ELEMENT MOVING     
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		Thread.sleep(4000);
		WebElement tgt_ele=driver.findElement(By.xpath(".//span[text()='+ More']"));
		Actions a=new Actions(driver);
		a.moveToElement(tgt_ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[text()='Gift Voucher']")).click();
	}

}
