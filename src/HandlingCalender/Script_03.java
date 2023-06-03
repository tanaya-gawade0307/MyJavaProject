package HandlingCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.redbus.in/");
       driver.findElement(By.id("onward_cal")).click();
       Thread.sleep(4000);
       //identify second sunday in target month
       while(true)
       {
    	String target_month="Jan 2024";
		WebElement tgt=driver.findElement(By.xpath(".//table[@class='rb-monthTable first last']/tbody/tr[1]/td[2]"));
		String displayed_month=tgt.getText();
		if(displayed_month.equals(target_month))
		{
			break;
		}
		else
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[1]/td[3]")).click();
		}
	}
       Thread.sleep(30000);
       driver.findElement(By.xpath(".//table[@class='rb-monthTable first last']/tbody/tr[2]/th[7]/ancestor::tbody/tr[4]/td[7]")).click();
	}

}
