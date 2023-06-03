package JavascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver =new FirefoxDriver();
       JavascriptExecutor js=(JavascriptExecutor) driver;
    // open app
       js.executeScript("document.location='http://www.faebook.com'");
       Thread.sleep(3000);
    //to get title of the webpage
       String title=js.executeScript("return document.title;").toString();
       System.out.println(title);
       Thread.sleep(3000);
    //to get url of the webpage
       String url=js.executeScript("return document.URL;").toString();
       System.out.println(url);
       Thread.sleep(3000);
    //to get domain of the webpage
       String domain = js.executeScript("return document.domain;").toString();
       System.out.println(domain);
       Thread.sleep(3000);
    //open gogle
       driver.get("http://www.google.com");
       Thread.sleep(3000);
    //navigate previous page
       js.executeScript("history.go(-1)");
       Thread.sleep(3000);
    //navigate to next page
       js.executeScript("history.go(1)");
       Thread.sleep(3000);
     //refresh page
       js.executeScript("history.go(0)");
       Thread.sleep(3000);;
     //print altert popup
       js.executeScript("alert()");
	}
}