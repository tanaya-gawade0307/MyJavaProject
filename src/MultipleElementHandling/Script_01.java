package MultipleElementHandling;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Script_01 {

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
     //identify iphone 14 model names
     List<WebElement> ref= driver.findElements(By.xpath("(.//div[@class='_4rR01T'])[position()<13]"));
     Thread.sleep(3000);
     int count=ref.size();
     System.out.println("Total number of i phone 14 mobiles are  "+count);
     System.out.println("*****************************************");
     //print iphone14 model prices
     List<WebElement> price=driver.findElements(By.xpath("(.//div[@class='_30jeq3 _1_WHN1'])[position()<13]"));
     int count1=price.size();
     System.out.println("price= "+count1);
     System.out.println("****************************************");
     //print each model name with price
     for(int a=0; a<ref.size(); a++)
     {
    	 String modelname=ref.get(a).getText();
    	 String prize=price.get(a).getText();
    	 System.out.println(modelname+" "+prize);
     }
     //print highest and lowest price of iphone 14
     TreeSet<Integer> ref3=new TreeSet<>();
     for(int a=0; a<price.size(); a++)
     {
    	 String str=price.get(a).getText().substring(1).replaceAll(", " , " ");
    	 int price1=Integer.parseInt(str);
    	 ref3.add(price1);
     }
     System.out.println("Lowest Iphone 14 price is "+ref3.first());
     System.out.println("Highest Iphone 14 price is "+ref3.last());

	}
}

