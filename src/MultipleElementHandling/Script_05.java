package MultipleElementHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("file:///C:/Users/LENOVO/Documents/Webtable.html");
     
     //total number of rows
     List<WebElement> ref= driver.findElements(By.tagName("tr"));
     System.out.println("Total number of rows "+ref.size());
     System.out.println("***************************************");
     //identify all subjects price
     List<WebElement> ref1=driver.findElements(By.xpath(".//td[3]"));
     for(int a=0; a<ref1.size(); a++)
     {
    	 String str=ref1.get(a).getText();
    	 System.out.println(str);
     }
     System.out.println("*****************************************");
     //print second row data as output
     List<WebElement> ref3=driver.findElements(By.xpath(".//tr[2]"));
     for(int a=0; a<ref3.size(); a++)
     {
    	 String str1=ref3.get(a).getText();
    	 System.out.println(str1);
    	 System.out.println("*****************************************");
     }
     //print all the subject cost in ascending order
     TreeSet<Integer> ref4=new TreeSet<>();
     for(int a=0; a<ref1.size(); a++)
     {
    	 String str2=ref1.get(a).getText();
    	 int price=Integer.parseInt(str2);
    	 ref4.add(price);
     }
     System.out.println(ref4);
     System.out.println("*****************************************");
     //verify sum of all subjects cost equal to total cost displayed in webtable or not
     int sum=0;
     for(int a=0; a<ref1.size(); a++)
     {
    	 String str3=ref1.get(a).getText();
    	 int price1=Integer.parseInt(str3);
    	 sum=sum+price1;
     } 
     String str4=driver.findElement(By.xpath("//tr[6]/th[3]")).getText();
     int total=Integer.parseInt(str4);
     if(sum==total)
     {
    	 System.out.println("All subject cost is equal to the total");
     }
     else
     {
    	 System.out.println("All subject cost is not equal to the total");
     }
     
     
	}

}
