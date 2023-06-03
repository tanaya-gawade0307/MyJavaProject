package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

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
		driver.findElement(By.xpath("(.//div[@class='img'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@class='changeStatus button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@class='selectorContainer']/div[@class='taskStatusButton editable']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//div[@class='workflowStatus statusType_open statusColor_darkGreen statusTypeIcon_darkGreen']//div[text()='In Progress'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//div[@class='withIcon submitBtn greyButton'])[2]")).click();
	}

}
