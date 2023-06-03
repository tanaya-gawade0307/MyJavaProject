package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		Thread.sleep(5000);
	//scroll bottom of the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	//scroll top of the page
		js.executeScript("window.scrollBy(0,-document.body.scollHeight)");
		/*
		 js.executeScript("window.scrollTo(0,-document.body.scrollWidth)");
		 js.executeScript("window.scrollBy(0,0)");
		 */
		Thread.sleep(3000);
	//slide right of the page
		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		Thread.sleep(3000);
	//slide left of the page
		js.executeScript("window.scrollBy(-document.body.scrollWidth, 0)");
		/*
		 js.executeScript("window.scrollBy(0,0)");
		 js.executeScript("window.scrollTo(document.body.scrollLeft,0)");
		 */
		}

}
