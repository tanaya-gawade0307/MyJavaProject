package SeleniumMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);

		WebElement d1 = driver.findElement(By.xpath("//div[@class='sc-hGPBjI bYQHSX fswFld ']//span[@class='sc-iwjdpV jUsACy fswDownArrow']"));
		d1.click();
		Thread.sleep(3000);
		
		WebElement d2 = driver.findElement(By.xpath("//div[@aria-label='Sat Mar 11 2023']"));
		
		if(d2.isEnabled()) {
			d2.click();
			Thread.sleep(3000);
			System.out.println("Element is selected!");
		}
		else {
			System.out.println("Element is disabled!");
		}
	}

}
