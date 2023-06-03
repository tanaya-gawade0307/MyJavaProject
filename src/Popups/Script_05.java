package Popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freepdfconvert.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//a[@class='btn-wrapper upload-btn']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("../Selenium/Autoit/Autoit_testScript_1.au3");
		
	}

}
