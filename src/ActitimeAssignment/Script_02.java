package ActitimeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//a[@class='content tasks']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//div[text()='Android calibration']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='actionButton'])[9]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='moveButton'])[3]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[7]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//div[@class='itemRow cpItemRow '])[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[8]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[@class='itemRow cpItemRow '])[13]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("(.//div[text()='Move'])[5]")).click();
		
	}

}
