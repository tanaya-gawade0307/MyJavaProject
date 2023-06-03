
package SeleniumWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_01
{
	@Test
    public void testactitimelogin()
    {
    	WebDriver driver=new FirefoxDriver();
    	driver.get("http://demo.actitime.com/login.do");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("loginButton")).click();
    	String title=driver.getTitle();
    	Assert.assertEquals(title,"actiTIME - Login");
    	driver.close();
    }
}
