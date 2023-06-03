package OrangeHrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateVacancy {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(.//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[.='Vacancies']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(.//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("QA");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@class='oxd-select-text oxd-select-text--active']"));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).click();
		driver.findElement(By.xpath(".//*[text()='Account Assistant']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(".//input[@Placeholder='Type for hints...']")).sendKeys("a");
		Robot r=new Robot();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(5000);
	}
}

