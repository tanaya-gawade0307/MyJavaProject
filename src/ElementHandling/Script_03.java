package ElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriver d=new FirefoxDriver();
     d.get("http://demo.actitime.com/login.do");
     Thread.sleep(3000);
     WebElement checkbox=d.findElement(By.id("KeepLoggedInCheckbox"));
     //verify checkbox selected or not
     boolean status=checkbox.isSelected();
     if(status)
     {
       System.out.println("Checkbox Selected");
     }
     else
     {
    	 System.out.println("Checkbox not selected");
    	 checkbox.click();
     }
	}

}
