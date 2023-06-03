package MultipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_07 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver();
      driver.get("http://www.flipkart.com");
      Thread.sleep(5000);
      driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
      Thread.sleep(5000);
      List<WebElement> ref= driver.findElements(By.xpath(".//img"));
      System.out.println("Total images count is "+ref.size());
      int enabled_images=0;
      int disabled_images=0;
      for(int a=0; a<ref.size(); a++)
      {
    	  WebElement img=ref.get(a);
    	  if(img.isEnabled())
    	  {
    		  enabled_images++;
    	  }
    	  else
    	  {
    		  disabled_images++;
    	  }
      }
      System.out.println("Enabled images are  "+enabled_images);
      System.out.println("Disabled images are  "+disabled_images);
      for(int a=0; a<ref.size(); a++)
      {
    	  String str=ref.get(a).getAttribute("alt");
    	  System.out.println(str);
      }
      
	}

}
