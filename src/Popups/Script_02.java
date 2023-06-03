package Popups;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	     Thread.sleep(3000);
	     
	  //SIMPLE ALERT
	     /*
	     driver.findElement(By.xpath(".//button[text()='Click for JS Alert']")).click();
	     Thread.sleep(3000);
	     Alert a=driver.switchTo().alert();
	     String str=a.getText();
	     System.out.println(str);
	     a.accept();
	     */
	  //PROMPT ALERT
	     driver.findElement(By.xpath(".//button[text()='Click for JS Prompt']"));
	     Thread.sleep(3000);
	     Alert pa=driver.switchTo().alert();
	     pa.sendKeys("Selenium");
	     pa. accept();
	    }
	}


