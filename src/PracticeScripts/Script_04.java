package PracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("http://demo.actitime.com/login.do");
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//div[@id='container_tasks']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//div[@class='title ellipsis']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//div[@class='item createNewCustomer']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//*[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("tanaya");
     
	}

}
