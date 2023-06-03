package SeleniumMock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver d=new FirefoxDriver();
       d.get("http://www.spicejet.com");
       Thread.sleep(3000);
       d.findElement(By.className("css-76zvg2 css-bfa6kz r-homxoj r-ubezar")).click();
       Thread.sleep(3000);
       WebElement today_d=d.findElement(By.xpath(".//div[contains(text), 'sat,11 march']"));
       Thread.sleep(3000);
       WebElement return_d=d.findElement(By.xpath(".//div[contains(text),'sat, 10 oct']"));
       Thread.sleep(3000);
       System.out.println("todays date is  "+today_d);
       System.out.println("return date is  "+return_d);
       
       
	}

}
