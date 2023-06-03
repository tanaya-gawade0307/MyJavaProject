package IframesHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.yatra.com");
		//No. of frames in yatra app
		List<WebElement> ref = driver.findElements(By.xpath(".//iframe"));
		int count=ref.size();
		System.out.println("Number of Iframes in yatra app are "+count);
		//print each frame src attribute value
		System.out.println("Each frame src attribute values are :");
		for(int a=0; a<ref.size(); a++)
		{
			String src=ref.get(a).getAttribute("src");
			System.out.println(src);
		}
		//switch from mainpage to allow to subscribe option
		driver.switchTo().frame("webpush-onsite");
		driver.findElement(By.id("allow")).click();
	}

}
