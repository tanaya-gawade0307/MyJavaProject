package BrowserHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      FirefoxDriver rv=new FirefoxDriver();
      Thread.sleep(3000);
      rv.navigate().to("http://www.google.com");
      Thread.sleep(3000);
      Dimension d=new Dimension(300,500);
      rv.manage().window().setSize(d);
      Thread.sleep(3000);
      Point p=new Point(150,300);
      Thread.sleep(3000);
      rv.manage().window().maximize();
      Thread.sleep(3000);
      rv.manage().window().fullscreen();
      Thread.sleep(3000);
      rv.manage().window().minimize();
      
	}

}
