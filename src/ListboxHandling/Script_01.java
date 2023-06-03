package ListboxHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("file:///C:/Users/LENOVO/Documents/listbox.html");
     Thread.sleep(3000);
     WebElement ref= driver.findElement(By.id("course"));
     Select s=new Select(ref);
     boolean r=s.isMultiple();
     System.out.println(r);
     System.out.println("******************************");
     List<WebElement> ref1=driver.findElements(By.xpath(".//option"));
     int count = ref1.size();
     System.out.println("No. options in listbox are "+count);
     System.out.println("******************************");
     for(int a=0;a<ref1.size(); a++)
     {
    	 String text=ref1.get(a).getText();
    	 System.out.println(text);
     }
     System.out.println("*******************************");
     for(int a=0; a<ref1.size(); a++)
     {
    	 //s.selectByIndex(a);
    	 //string str=ref1.get(a).getAttribute("value");
    	 //s.selectByValue(str);
    	 
    	 s.getOptions().get(a).click();
     }
     Thread.sleep(3000);
     for(int a=0; a<ref1.size(); a=a+2)
     {
    	 s.selectByIndex(a);
     }
     Thread.sleep(3000);
     for(int a=0; a<ref1.size(); a++)
     {
    	 String list=ref1.get(a).getText();
    	 if(list.contains("Testing"))
    	 {
    		 s.selectByIndex(a);
    	 }
     }
	}	 
	
}
