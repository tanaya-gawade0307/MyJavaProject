package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddCandidate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//a[.='Candidates']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//input[@class='oxd-input oxd-input--active orangehrm-firstname']")).sendKeys("Tanaya");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//input[@name='lastName']")).sendKeys("Gawade");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//div[@class='oxd-select-text oxd-select-text--active']"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//div[@class='oxd-select-text-input']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(.//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("tanayagawade@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(4000);
	
		
	}

}
