package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateUser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//a[@class='oxd-main-menu-item'])[2]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(".//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("Tanaya");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@class='oxd-input oxd-input--active orangehrm-middlename']")).sendKeys("Tanaji");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//input[@class='oxd-input oxd-input--active orangehrm-lastname']")).sendKeys("Gawade");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("tanaya");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//input[@type='password'])[1]")).sendKeys("Gawade@77");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//input[@class='password'])[2]")).sendKeys("Gawade@77");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
	}

}
