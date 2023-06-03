package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

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
	      driver.findElement(By.id("container_users")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//div[text()='New User']")).click();
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//input[@id='createUserPanel_firstNameField']")).sendKeys("Tanaya");
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//input[@id='createUserPanel_lastNameField']")).sendKeys("Gawade");
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//input[@id='createUserPanel_emailField']")).sendKeys("tanaya0307@gmail.com");
	      Thread.sleep(7000);
	      driver.findElement(By.xpath(".//div[text()='Save & Send Invitation']")).click();
	}

}
