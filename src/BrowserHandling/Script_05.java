package BrowserHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(5000);
		int a=driver.manage().window().getSize().getHeight();
		System.out.println("Browser height is "+a); 
		Thread.sleep(5000);
		int b=driver.manage().window().getSize().getWidth();
		System.out.println("Browser width is "+b);
		Thread.sleep(5000);
		Dimension d=new Dimension(a/2 , b/2);
		Thread.sleep(5000);
		System.out.println("Browser new height and width is "+d);
		
	  
	}
}
 