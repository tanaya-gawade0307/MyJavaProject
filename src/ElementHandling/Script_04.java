package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Script_04 {
	
   public static void main(String[] args) throws InterruptedException {
	  
	   WebDriver d=new FirefoxDriver();
	   d.get("http://www.facebook.com");
	   Thread.sleep(3000);
	   d.findElement(By.linkText("Create new account")).click();
	   Thread.sleep(3000);
	   WebElement female_opt=d.findElement(By.xpath(".//input[@id='u_3_4_jO']"));
	   female_opt.click();
	   Thread.sleep(7000);
	   boolean output1=female_opt.isSelected();
	   if(output1)
	   {
		   System.out.println("Female option radio button selected");
	   }
	   else
	   {
		   System.out.println("Female option radio button not selected");
	   }
	   WebElement male_option=d.findElement(By.xpath(".//input[@value='2']"));
	   male_option.click();
	   Thread.sleep(3000);
	   boolean output2=male_option.isSelected();
	   if(output2) {
		   System.out.println("Female option radio button not deselected");
	   }
	   else
	   {
		   System.out.println("Female option radio button deselected");
	   }
}
}
