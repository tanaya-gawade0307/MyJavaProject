package PracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyntraScript_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.myntra.com");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.findElement(By.xpath("(.//a[@class='desktop-main'])[1]")).click();
        
	}

}
