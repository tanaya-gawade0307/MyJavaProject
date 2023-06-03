package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteUser {

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
			driver.findElement(By.xpath("(.//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("(.//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[1]//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(.//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[1]//i[@class='oxd-icon bi-trash']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(".//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
			Thread.sleep(4000);
		

	
	}

}
