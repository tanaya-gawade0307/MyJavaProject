package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver d=new FirefoxDriver();
     d.get("http://www.amazon.com");
     Thread.sleep(3000);
     d.findElement(By.id("nav-link-accountList")).click();
     Thread.sleep(3000);
     d.findElement(By.id("createAccountSubmit")).click();
     Thread.sleep(3000);
     d.findElement(By.id("ap_customer_name")).sendKeys("Tanaya Gawade");
     Thread.sleep(3000);
     d.findElement(By.id("ap_email")).sendKeys("9404847157");
     Thread.sleep(3000);
     d.findElement(By.id("ap_password")).sendKeys("tushar123");
     Thread.sleep(3000);
     d.findElement(By.id("ap_password_check")).sendKeys("tushar123");
     Thread.sleep(3000);
     d.findElement(By.id("continue")).click();
	}

}