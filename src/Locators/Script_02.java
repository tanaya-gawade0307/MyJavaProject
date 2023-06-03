package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    d.get("file:///C:/Users/LENOVO/Documents/webpage.html");
    Thread.sleep(3000);
    d.findElement(By.tagName("input")).sendKeys("admin");
    Thread.sleep(3000);
    WebElement pwd=d.findElement(By.id("pass"));
    pwd.sendKeys("manager");
    
    
	}

}
