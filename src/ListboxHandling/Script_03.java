package ListboxHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      driver.get("http://demo.actitime.com/login.do");
      Thread.sleep(3000);
      driver.findElement(By.id("username")).sendKeys("admin");
      Thread.sleep(3000);
      driver.findElement(By.name("pwd")).sendKeys("manager");
      Thread.sleep(3000);
      driver.findElement(By.xpath(".//div[text()='Login ']")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath(".//div[@class='addTaskButton enabled']")).click();
	}

}
