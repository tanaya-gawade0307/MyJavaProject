package ActitimeAssignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		Scanner sc=new Scanner(System.in);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(9000);
		driver.findElement(By.xpath(".//div[text()='Login ']")).click();
		Thread.sleep(8000);
		driver.findElement(By.id("addTaskButtonId")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[5]")).click();
		String choice=sc.nextLine();
		Thread.sleep(8000);
    	driver.findElement(By.xpath(".//div[text()='Our company']")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath("(.//div[@class='dropdownButton'])[6]")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath(".//div[contains(text(),'Accounting')]")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[1]")).sendKeys("Qsp");
    	Thread.sleep(8000);
    	driver.findElement(By.id("ext-gen34")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath("(.//a[@class='x-date-date'])[7]")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath("(.//input[@class='inputFieldWithPlaceholder'])[3]")).sendKeys("SQL");
    	Thread.sleep(8000);
    	driver.findElement(By.id("ext-gen44")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath("(.//td[@class='x-date-activex-date-weekend x-date-weekend'])[15]")).click();
    	Thread.sleep(8000);
    	driver.findElement(By.xpath(".//div[@class='components_button withPlusIcon']")).click();
	}

}
