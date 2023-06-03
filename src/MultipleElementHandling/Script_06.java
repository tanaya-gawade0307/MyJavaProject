package MultipleElementHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_06 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.espncricinfo.com");
     Thread.sleep(3000);
     //select anyone of the match
     driver.findElement(By.xpath("(.//div[@class='ds-w-[288px] card scorecard'])[1]")).click();
     Thread.sleep(5000);
     //identify each player name
     List<WebElement> ref= driver.findElements(By.xpath(".//div[@class='ds-mt-3']/div/div[2]//table[1]/tbody/tr/td[1]/a"));
     Thread.sleep(5000);
     //identify each player runs
     List<WebElement> ref1=driver.findElements(By.xpath(".//div[@class='ds-mt-3']/div/div[2]//table[1]/tbody/tr/td[@class='ds-w-0 ds-whitespace-nowrap ds-min-w-max ds-text-right']/strong"));
     Thread.sleep(5000);
     //print each player name with runs
     for(int a=0; a<ref.size(); a++)
     {
    	 String playername=ref.get(a).getText();
    	 String runs=ref1.get(a).getText();
    	 System.out.println(playername+" -"+runs);
    	 
     }
     //identify extra runs
     String str=driver.findElement(By.xpath(".//div[@class='ds-mt-3']/div/div[2]//table[1]/tbody/tr[@class='ds-text-tight-s']/td[3]/strong")).getText();
     int extraruns=Integer.parseInt(str);
     int sum=0;
     for(int a=0; a<ref1.size(); a++)
     {
    	 String str1=ref1.get(a).getText();
    	 int runs1=Integer.parseInt(str1);
    	 sum=sum+runs1;
     }
     int total_runs=sum+extraruns;
     //identify total runs
     String txt=driver.findElement(By.xpath(".//div[@class='ds-mt-3']/div/div[2]//table[1]/tbody/tr/td[contains(@class,'ds-font-bold')][3]")).getText();
     //String str2=txt.substring(0, 3);
     int displayedtotal=Integer.parseInt(txt);
     //verify total runs is equals to sum of the runs or not
     if(displayedtotal==total_runs)
     {
    	 System.out.println("Total count is correct");
     }
     else
     {
    	 System.out.println("total count is incorrect");
     }
     
	}

}
