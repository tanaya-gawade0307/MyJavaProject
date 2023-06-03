package BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new FirefoxDriver();
		d.get("http://www.flipkart.com");
		Thread.sleep(3000);
		String title=d.getCurrentUrl();
		Thread.sleep(3000);
		
		System.out.println(title);
        WebDriver a=new ChromeDriver();
		a.get("http://www.flipkart.com");
		Thread.sleep(3000);
		String ctitle=a.getCurrentUrl();
		System.out.println(ctitle);
		Thread.sleep(3000);
		if(title==ctitle)
		{
			System.out.println("Both titles are same");
		}
		else
		{
			System.out.println("Titles are not same");
			
		}
		
	}

}

