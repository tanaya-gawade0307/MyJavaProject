package PracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class Program{
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver d=new FirefoxDriver();
	      d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      Thread.sleep(3000);
	      WebElement un=d.findElement(By.name("username"));
	      Thread.sleep(3000);
	      WebElement pwd=d.findElement(By.name("password"));
	      boolean output=un.isDisplayed();
	      if(output)
	      {
	    	  System.out.println("username field is displayed");
	      }
	      else
	      {
	    	  System.out.println("username field is not  displayed");
	      }
	      boolean output1=pwd.isDisplayed();
	      if(output1)
	      {
	    	  System.out.println("password field is displayed");
	      }
	      else
	      {
	    	  System.out.println("password field is not  displayed");
	      }
	      WebElement tgt=d.findElement(By.xpath(".//button[@type='submit]"));
	      String tgt_colorcode=tgt.getCssValue("background-color");
	      System.out.println(tgt_colorcode);
	      String tgt_colorcode_hex=Color.fromString(tgt_colorcode).asHex();
	      System.out.println(tgt_colorcode_hex);
	      
	      WebElement msg=d.findElement(By.xpath("//span[text()='Required']"));
	      Thread.sleep(3000);
	}
}