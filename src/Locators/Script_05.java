package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    Thread.sleep(3000);
    d.get("http://www.facebook.com");
    Thread.sleep(3000);
    d.findElement(By.linkText("Create new account")).click();
    Thread.sleep(3000);
    d.findElement(By.name("firstname")).sendKeys("Tanaya");
    Thread.sleep(3000);
    d.findElement(By.name("lastname")).sendKeys("Gawade");
    Thread.sleep(3000)
    ;
    
    
	}

}
