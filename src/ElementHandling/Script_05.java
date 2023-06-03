package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new FirefoxDriver();
		d.get("http://www.flipkart.com");
		Thread.sleep(5000);
		d.findElement(By.name("q")).sendKeys("iphone14 mobile");
		Thread.sleep(5000);
	    d.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(5000);
		WebElement price=d.findElement(By.xpath(".//div[text()='APPLE iPhone 14 (Purple, 128 GB)']/../..//div[text()='₹71,999']"));
		String p1=price.getText();
		System.out.println("I phone 14 mobile price is "+p1);
		Thread.sleep(5000);
		WebElement ratings=d.findElement(By.xpath(".//div[text()='APPLE iPhone 14 (Purple, 128 GB)']/..//span[text()='18,135 Ratings ']"));
		String p2=ratings.getText();
		System.out.println("I phone 14 mobile ratring is "+p2);

}
}
