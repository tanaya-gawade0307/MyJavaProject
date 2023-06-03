package MultipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.google.com");
     Thread.sleep(5000);
     driver.findElement(By.name("q")).sendKeys("selemium");
     Thread.sleep(5000);
     List<WebElement> ref =driver.findElements(By.xpath(".//div[@class='pcTkSc']"));
     Thread.sleep(5000);
     int count=ref.size();
     System.out.println(count);
     Thread.sleep(5000);
     for(int a=0; a<ref.size(); a++)
     {
    	 WebElement rv=ref.get(a);
    	 String s1=rv.getText();
    	 System.out.println(s1);
     }
     WebElement txt=driver.findElement(By.xpath(".//b[text()=' webdriver']/.."));
     String text=txt.getText();
     System.out.println("Selected text is - "+text);
	
     //select anyone option
	
	 String expoption="webdriver";
	 for (int a=0; a<ref.size(); a++)
	 {
		 String tt=ref.get(a).getText();
		 if(tt.contains(expoption))
		 {
			 ref.get(a).click();
			 break;
		 }
	 }
	}	
		
	
}


