package BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_08 {
    static WebDriver driver;
	public static void main(String browsername)
     
      {
    	  if(browsername.equals("Firefox"))
    		 {
    		  driver=new FirefoxDriver();
    		 }
    	  else if(browsername.equals("Chrome"))
    	  {
    		  driver=new ChromeDriver();
    	  }
    	  else{
    		  driver=new EdgeDriver();
 
    	  }
      }
	}


