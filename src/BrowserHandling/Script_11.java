package BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver d=new FirefoxDriver();
     d.get("http://www.google.com");
     Thread.sleep(3000);
     int a=d.manage().window().getSize().getHeight();
     Thread.sleep(3000);
     int b=d.manage().window().getSize().getWidth();
     Thread.sleep(3000);
     System.out.println("Heigth is "+ a);
     System.out.println("Width is "+b);
     int x_loc=d.manage().window().getPosition().getX();
     Thread.sleep(3000);
     int y_loc=d.manage().window().getPosition().getY();
     Thread.sleep(3000);

     System.out.println("X_loc is "+x_loc);
     System.out.println("Y_loc is "+y_loc);
     
     String url=d.getCurrentUrl();
     System.out.println(url);
     Thread.sleep(3000);
     d.get("http://www.facebook.com");
     Thread.sleep(3000);
     d.get("http://www.flipkart.com");
     Thread.sleep(3000);
     d.get("http://www.myntra.com");
     Thread.sleep(3000);
     d.navigate().refresh();
     Thread.sleep(3000);
     String exppage="youtube";
     while(true)
     {
    	 String displayedpage=d.getTitle();
    	 if(displayedpage.contains(exppage))
    	 {
    		 break;
    	 }
    	 else
    	 {
    		 d.navigate().back();
    	 }
     }
     
     
	}

}
