package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.zeromq.ZStar.Set;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver=new FirefoxDriver();
	      driver.get("http://demo.actitime.com/login.do");
	      Thread.sleep(7000);
	      driver.findElement(By.id("username")).sendKeys("admin");
	      Thread.sleep(7000);
	      driver.findElement(By.name("pwd")).sendKeys("manager"); 
	      Thread.sleep(7000);
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(9000);
	      driver.findElement(By.xpath(".//div[@id='container_reports']")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath(".//div[text()='Time Balance & Overtime']")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath(".//*[@class='headerFooterCell clickableCell print cellWithBorder']")).click();
	      Thread.sleep(7000);
	      Robot r=new Robot();
	      r.keyPress(KeyEvent.VK_ENTER);
	}

}
