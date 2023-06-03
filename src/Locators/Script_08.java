package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_08 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver d=new FirefoxDriver();
     Thread.sleep(3000);
     d.get("file:///C:/Users/LENOVO/Documents/webpage1.html");
     Thread.sleep(3000);
     d.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
     Thread.sleep(3000);
     d.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
     Thread.sleep(3000);
     d.findElement(By.cssSelector("input[value='login']")).click();
     
     
	}

}
