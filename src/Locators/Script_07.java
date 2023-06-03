package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.amazon.com");
		Thread.sleep(3000);
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		Thread.sleep(3000);
		d.findElement(By.id("nav-search-submit-button")).click();
		
	}
}
