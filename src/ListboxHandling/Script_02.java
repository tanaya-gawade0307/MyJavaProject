package ListboxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver =new FirefoxDriver();
      driver.get("file:///C:/Users/LENOVO/Documents/listbox.html");
      List<WebElement> ref1=driver.findElements(By.xpath(".//option"));
      int count = ref1.size();
      System.out.println("No. of options in listbox are "+count);
      System.out.println("*******************************************");
      Thread.sleep(3000);
      WebElement ref= driver.findElement(By.id("course"));
      Select s=new Select(ref);
      for(int a=0; a<ref1.size(); a=a+2)
      {
     	 s.selectByIndex(a);
      }
      Thread.sleep(3000);
      List<WebElement> ref2=s.getAllSelectedOptions();
      int count1=ref2.size();
      System.out.println("Selected options are "+count1);
      System.out.println("****************************************");
      System.out.println("selected options Texts are  ");
      for(int a=0; a<ref2.size(); a++)
      {
    	  String str=ref2.get(a).getText();
    	  
    	  System.out.println(str);
      }
      s.deselectByValue("sub_09");
      Thread.sleep(3000);
      s.deselectAll();

      
	}

}
