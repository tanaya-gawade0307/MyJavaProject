package Popups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
	    driver.get("http://www.google.com");
	    Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("http://www.facebook.com");
	    Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("http://www.amazon.com");
	    Thread.sleep(3000);
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("http://www.myntra.com");
	    Thread.sleep(3000);
	    //print total window displayed count
	    Set<String> ref1=driver.getWindowHandles();
	    int count=ref1.size();
	    System.out.println("total window displayed  "+count);
	    Thread.sleep(3000);
	    //print title of each window
	    /*Iterator itr=ref1.iterator();
	    while(itr.hasNext());
	    {
	    	String refid=(String) itr.next();
	    	driver.switchTo().window(refid);
	    	String title=driver.getTitle();
	    	System.out.println(title);
	    	
	    }
	    */
	    //close all windows using close
	    String parent_refid=driver.getWindowHandle();
	    for(String refid:ref1)
	    {
	    	if(parent_refid.equals(parent_refid));
	    }
	}

}
