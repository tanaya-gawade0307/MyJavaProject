package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("i phone 14");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//identify elemnet
		WebElement tgt=driver.findElement(By.xpath(".//div[text()='APPLE iPhone 14 ((PRODUCT)RED, 256 GB)']"));
	//identify element loc
		int x_loc=tgt.getLocation().getX();
		int y_loc=tgt.getLocation().getY();
		js.executeScript("window.scrollBy("+x_loc+", "+y_loc+")");
	}

}
