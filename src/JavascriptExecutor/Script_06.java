package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

	public static void main(String[] args) throws InterruptedException {
		
//HANDLING DISABLED ELEMNETS USING JAVASCRIPT
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/LENOVO/Documents/Webpagedisable.html");
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('user').value=''");
	}

}
