package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_09 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com");
		Thread.sleep(3000);
		d.get( "http://www.flipkart.com");
		Thread.sleep(3000);
		d.findElement(By.xpath(".//input[@type='text']")).sendKeys("one plus nord ce2");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		Thread.sleep(3000);
		
		

	}

}
