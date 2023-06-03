package MultipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_00 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new FirefoxDriver();
    driver.get("http://www.google.com");
    Thread.sleep(3000);
    //identify all links
    List<WebElement> ref=driver.findElements(By.xpath(".//a"));
    //total links count
    int count=ref.size();
    System.out.println("Total number of links are "+count);
    System.out.println("*******************************************");
    Thread.sleep(3000);
    //print each line text
    for(int a=0; a<ref.size();a++)
    {
    	WebElement rv=ref.get(a);
    	String txt=rv.getText();
    	System.out.println(txt);
    }
    System.out.println("********************************************");
    int visible_links=0;
    int invisible_links=0;
    for(int a=0; a<ref.size(); a++)
    {
    	WebElement link =ref.get(a);
    	if(link.isDisplayed())
    	{
    		visible_links++;
    	}
    	else
    	{
    		invisible_links++;
    	}
    
    }
    System.out.println(visible_links);
	System.out.println(invisible_links);
	System.out.println("***************************************************");
	System.out.println("Href attribute values are : ");
	for(WebElement e: ref)
	{
		String hrefvalue=e.getAttribute("href");
		System.out.println(hrefvalue);
		
	}
	}

}
