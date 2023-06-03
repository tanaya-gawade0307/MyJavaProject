package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
	      driver.get("http://demo.actitime.com/login.do");
	      Thread.sleep(7000);
	      driver.findElement(By.id("username")).sendKeys("admin");
	      Thread.sleep(7000);
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      Thread.sleep(7000);
	      driver.findElement(By.id("loginButton")).click();
	      Thread.sleep(12000);
	      driver.findElement(By.xpath(".//*[@id='container_tasks']")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//div[text()='Coding']")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath("(.//div[text()='ACTIONS'])[3]")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath("(.//div[text()='Delete'])[4]")).click();
	}

}
