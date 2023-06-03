package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    d.get("http://www.youtube.com");
    d.findElement(By.name("search_query")).sendKeys("videos");
    Thread.sleep(3000);
    d.findElement(By.id("search-icon-legacy")).click();
    
	}

}
