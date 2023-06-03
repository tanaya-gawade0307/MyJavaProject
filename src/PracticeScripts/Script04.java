package PracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script04 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("I phone 14 mobile phones");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
		
		
		
	}

}
