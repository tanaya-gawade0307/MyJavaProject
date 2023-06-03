package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      driver.get("http://www.facebook.com");
      Thread.sleep(7000);
      driver.findElement(By.linkText("Create new account")).click();
      Thread.sleep(7000);
      WebElement fn=driver.findElement(By.name("firstname"));
      Thread.sleep(7000);
      WebElement ln=driver.findElement(By.name("lastname"));
      Thread.sleep(7000);
      int fn_xloc=fn.getLocation().getX();
      int ln_xloc=ln.getLocation().getX();
      Thread.sleep(7000);
      if(fn_xloc<ln_xloc)
      {
    	  System.out.println("Firstname field is left side of the lastname field");
      }
      else
      {
    	  System.out.println("Firstname field is not left side of the lastname field");
      }
	}

}
