package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver d=new FirefoxDriver();
    d.get("http://www.abhibus.com");
    Thread.sleep(3000);
    d.findElement(By.id("AccLogin")).click();
    Thread.sleep(3000);
    d.findElement(By.id("mobileNo")).sendKeys("0987654321");
    Thread.sleep(3000);
    d.findElement(By.id("chk_refer_code"));
    Thread.sleep(3000);
    d.findElement(By.id("getotp")).click();
	}

}
