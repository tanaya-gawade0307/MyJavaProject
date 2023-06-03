package BrowserHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
    FirefoxDriver rv=new FirefoxDriver();
    Thread.sleep(2000);
    rv.get("http://www.facebook.com");
    Thread.sleep(2000);
    String title =rv.getTitle();
    System.out.println(title);
    Thread.sleep(2000);
    rv.manage().window().maximize();
    Thread.sleep(2000);
    rv.get("http://www.google.com");
    Thread.sleep(2000);
    Dimension d=new Dimension(400,600);
    rv.manage().window().setSize(d);
    Thread.sleep(2000);
    int a=rv.manage().window().getSize().getHeight();
    System.out.println(a);
    Thread.sleep(2000);
    int b=rv.manage().window().getSize().getWidth();
    System.out.println(b);
    Thread.sleep(2000);
    Dimension r=new Dimension(a*2,b*2);
    rv.manage().window().setSize(r);
    Thread.sleep(2000);
    rv.navigate().back();
    String expPage="Facebook";
    Thread.sleep(2000);
    String displayedPage=rv.getTitle();
    if(displayedPage.contains(expPage))
    {
      System.out.println("Facebook page is displayed");
    }
    else {
    	System.out.println("Facebook page is not displayed");
    }
    String url=rv.getCurrentUrl();
    System.out.println("Url is "+url);
    Thread.sleep(2000);
    int x_loc=rv.manage().window().getPosition().getX();
    System.out.println("Browser xloc is "+x_loc);
    int y_loc=rv.manage().window().getPosition().getY();
    System.out.println("Browser yloc is "+y_loc);
    Thread.sleep(2000);
    Point p=new Point(500,500);
    Thread.sleep(2000);
    rv.navigate().forward();
    Thread.sleep(2000);
    rv.manage().window().minimize();
    rv.close();
    
    }
    
    
    
	}


