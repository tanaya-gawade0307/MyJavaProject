package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("https://automatenow.io");
     Thread.sleep(7000);
     driver.findElement(By.xpath("(.//span[@class='nav-menu-item-inside'])[3]")).click();
     Thread.sleep(7000);
     driver.findElement(By.id("cookie_action_close_header")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath("(.//a[@class='wp-block-button__link wp-element-button'])[6]")).click();
     Thread.sleep(7000);
     driver.findElement(By.id("g1103-name")).sendKeys("Tanaya Gawade");
     Thread.sleep(7000);
     driver.findElement(By.xpath("(.//*[@name='g1103-whatisyourfavoritedrink[]'])[3]")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//*[@value='Red']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//*[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s']")).click();
     
     Thread.sleep(7000);
     driver.findElement(By.id("email")).sendKeys("tanayag3399@gmail.com");
     Thread.sleep(7000);
     driver.findElement(By.xpath("(.//*[@class='textarea  grunion-field'])[1]")).sendKeys("All the information that i selected is true");
     Thread.sleep(7000);
     driver.findElement(By.xpath("(.//*[@type='submit'])[1]")).click();
     
	}

}
