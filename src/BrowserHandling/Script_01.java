package BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	WebDriver cd=new FirefoxDriver();
	Thread.sleep(3000);
	cd.get("http://www.google.com");
	Thread.sleep(3000);
	cd.navigate().to("http://www.facebook.com");
	Thread.sleep(3000);
	cd.navigate().back();
	Thread.sleep(3000);
	cd.navigate().forward();
	Thread.sleep(3000);
	cd.navigate().refresh();
	Thread.sleep(3000);
	cd.close();
	}
}
