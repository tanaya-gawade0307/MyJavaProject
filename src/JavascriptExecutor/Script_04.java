package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {

//IDENTIFYING ELEMNET USING JAVASCRIPT
      WebDriver driver =new FirefoxDriver();
      driver.get("http://demo.actitime.com/login.do");
      Thread.sleep(3000);
  //enter username
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("document.getElementById('username').value='admin'");
      Thread.sleep(3000);
  //enter password
      js.executeScript("document.getElementsByName('pwd')[0].value='manager'");
      Thread.sleep(3000);
  //select checkbox
      js.executeScript("document.getElementById('keepLoggedInCheckBox').click()");
      Thread.sleep(3000);
  //deselect checkbox
      js.executeScript("document.getElementById('keepLoggedInCheckBox').checkedfalse");
      Thread.sleep(3000);
  //click on login button
      WebElement loginbutton=driver.findElement(By.xpath(".//div[text()='Login ']"));
      js.executeScript("argumrnt[0].click()", loginbutton);
	}

}
