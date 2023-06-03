package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.abhibus.com");
		Thread.sleep(3000);
		WebElement tgt=driver.findElement(By.xpath(".//iframe[@title='sign in with Google Dialogue']"));
		Thread.sleep(3000);
		driver.switchTo().frame(tgt);
		Thread.sleep(3000);
		driver.findElement(By.id("close")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("AccLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("mobileNo")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.id("getotp")).click();
		
	    	
	    }
	    
	}


