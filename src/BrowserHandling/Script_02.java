package BrowserHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       FirefoxDriver rv=new FirefoxDriver();
       Thread.sleep(3000);
       rv.get("http://www.facebook.com");
       Thread.sleep(3000);
       rv.findElement(By.linkText("Forgotten password?")).click();
       Thread.sleep(3000);
       String displayed_page=rv.getTitle();
       String exp_page="Forgotten Password";
       if(displayed_page.contains(exp_page))
       {
    	   System.out.println("Forgotten password page displayed");
    	   
       }
       else {
    	   System.out.println("Forgotten password page not displayed");
       }
       
	}

}
