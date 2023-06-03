package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    Thread.sleep(4000);
    d.get("http://www.facebook.com");
    Thread.sleep(4000);
   d.findElement(By.id("email")).sendKeys("tanayag3399@gmail.com");
   Thread.sleep(4000);
   d.findElement(By.id("pass")).sendKeys("tushar2411");
   Thread.sleep(4000);
   d.findElement(By.name("login")).click();
   
  
    
    
	}

}
