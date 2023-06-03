package HandlingCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("https://www.cleartrip.com/");
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//*[@class=' c-pointer c-neutral-900']")).click();
     Thread.sleep(7000);
     driver.findElement(By.xpath(".//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
     //select current date
     String tgt_month="July 2023";
     while(true)
     {
     String displayed_month=driver.findElement(By.xpath(".//div[@class='DayPicker w-100p']//div[@class='DayPicker-Month'][1]/div[1]")).getText();
     if(displayed_month.equals(tgt_month))
     {
    	 break;
     }
     else
     {
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath(".//div[@class='DayPicker w-100p']//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']//*[@data-testid=\"rightArrow\"]")).click();
     }
     
	}
//target date
     String date="21";
     
	}
}
