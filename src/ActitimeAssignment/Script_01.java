package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

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
      Thread.sleep(9000);
      driver.findElement(By.xpath(".//span[text()='New']")).click();
      Thread.sleep(7000);
      driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[5]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath(".//div[text()='Our company']")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[6]")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath(".//div[contains(text(),'Accounting')]")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("Designing");
  	Thread.sleep(8000);
  	driver.findElement(By.id("ext-gen34")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath("(.//a[@class='x-date-date'])[7]")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[3]")).sendKeys("Coding");
  	Thread.sleep(8000);
  	driver.findElement(By.id("ext-gen44")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath("(.//td[@class='x-date-activex-date-weekend x-date-weekend'])[15]")).click();
  	Thread.sleep(8000);
  	driver.findElement(By.xpath(".//div[@class='components_button withPlusIcon']")).click();
	}

}
