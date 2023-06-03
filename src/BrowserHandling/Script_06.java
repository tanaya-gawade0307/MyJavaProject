package BrowserHandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver rv=new FirefoxDriver();
		Thread.sleep(4000);
		rv. get("http://www.google.com");
		Thread.sleep(4000);
		rv. get("http://www.youtube.com");
		String actualTitle=rv.getTitle();
		Thread.sleep(4000);
		rv.get("http://www.amazon.com");
		Thread.sleep(4000);
		rv.get("http://www.facebook.com");
		Thread.sleep(4000);
		rv.get("http://www.myntra.com");
		Thread.sleep(4000);
		for(int i=0; i<3; i++) {
			Thread.sleep(4000);
			String title=rv.getTitle();
			if(title.equals(actualTitle)) {
				
			}else {
				rv.navigate().back();
			}
		}
			
	}

}
