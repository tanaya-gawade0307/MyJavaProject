package HandlingCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.redbus.com");
       Thread.sleep(3000);
       //current date
       driver.findElement(By.id("onward_cal")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath(".//td[@class='current day']")).click();
       
	}

}
