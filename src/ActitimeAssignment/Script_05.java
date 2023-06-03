package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//a[@class='content tasks']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//div[@class='img'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[text()='Delete']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//div[@class='operationConfirmDialog hasTimeTrack hasApprovedWeeks']//div[@class='buttonIcon']")).click();
	}

}
