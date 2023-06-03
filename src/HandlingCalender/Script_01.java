package HandlingCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(4000);
//target month
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
//target date
		Thread.sleep(3000);
		String tgt_date="14";
		String exp=".//table[@class='rb-monthTable first last']/tbody//td[contains(@class,'day') and text()='"+tgt_date+"']";
		driver.findElement(By.xpath(exp)).click();
		
	}

	

}
