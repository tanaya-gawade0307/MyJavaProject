package PracticeScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	private static int b;
	private static char[] txt1;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver=new FirefoxDriver();
	     driver.get("http://www.flipkart.com");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.name("q")).sendKeys("i phone 14");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath(".//button[@class='L0Z3Pu']")).click();
	     Thread.sleep(3000);
	     List<WebElement> ref= driver.findElements(By.xpath(".//div[starts-with(text(),'APPLE iPhone 14 (')]"));
	     Thread.sleep(3000);
	     int count=ref.size();
	     System.out.println("Total number of i phone 14 phones are "+count
	  		   );
	     List<WebElement> price=driver.findElements(By.xpath(".//div[starts-with(text(),'APPLE iPhone 14 (')]/../..//div[@class='_30jeq3 _1_WHN1']"));
	     int count1=price.size();
	     System.out.println("Total number of i phone 14 prices are "+count1);
	     System.out.println("********************************************************");
	     
		
	     for(int a=0; a<ref.size(); a++)
	     {
	    	 WebElement rv=ref.get(a);
	    	 String txt=rv.getText();
	    	 System.out.println(txt);
	    	 for(int b=0; b<price.size(); b++);
	    	 {
	    		 WebElement vr=price.get(b);
	    		 String txt1=vr.getText();
	    		 System.out.println(txt1);
		    	 
	        	 
	    	 }
	 
	    	 
	     }
	  	}
   
   

}
