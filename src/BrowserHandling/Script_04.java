package BrowserHandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      FirefoxDriver rv=new FirefoxDriver();
      Thread.sleep(3000);
      rv.navigate().to("http://www.google.com");
      Thread.sleep(3000);
      int a=rv.manage().window().getSize().getHeight();
      System.out.println("Browser height is "+a);
      int b=rv.manage().window().getSize().getWidth();
      System.out.println("Browser width is "+b);
      System.out.println("_________________");
      int x_loc=rv.manage().window().getPosition().getX();
      System.out.println("Browser xloc is "+x_loc);
      int y_loc=rv.manage().window().getPosition().getY();
      System.out.println("Browser yloc is "+y_loc);
      String title=rv.getTitle();
      System.out.println("Title is "+title);
      String url=rv.getCurrentUrl();
      System.out.println("Url is "+url);
	}

}
