package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    d.get("file:///C:/Users/LENOVO/Documents/webpage.html\r\n");
    Thread.sleep(3000);
    WebElement un=d.findElement(By.tagName("input"));
    un.sendKeys("admin");
    Thread.sleep(3000);
    un.clear();
    Thread.sleep(3000);
    un.sendKeys("dinga");
    un.clear();
    d.close();
	}

}
