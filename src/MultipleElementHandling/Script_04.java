package MultipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.trivago.in/en");
     Thread.sleep(5000);
     driver.findElement(By.id("input-auto-complete")).sendKeys("mumbai");
     Thread.sleep(5000);
     driver.findElement(By.xpath(".//span[text()='Search']")).click();
    
     Thread.sleep(60000);
     driver.findElement(By.xpath(".//span[text()='Search']")).click();
     //list of hotel names
     List<WebElement> ref1=driver.findElements(By.xpath(".//button[@class='text-left w-full truncate font-bold']"));
	 int count=ref1.size();
	 System.out.println("Total hotels in mumbai are "+count);
	 //hotel price
	 List<WebElement> ref2=driver.findElements(By.xpath(".//p[@class='font-bold text-green-900 text-xl']"));
	 int count1=ref2.size();
	 //hotel name with price
	 for(int a=0; a<ref1.size(); a++)
	 {
		 String hotelname=ref1.get(a).getText();
		 String price=ref2.get(a).getText();
		 System.out.println(hotelname+" -"+price);
	}
}
}


