package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script_03 {

	public static void main(String[] args) throws InterruptedException {
		
//DRAG AND DROP ACTIONS
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement tgt_drag=driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		WebElement tgt_drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		//Approach-01------>used to drop an elemnt
		/*a.moveToElement(tgt_drag).perform();
		a.clickAndHold().perform();
		a.moveToElement(tgt_drop).perform();
		Thread.sleep(3000);
		a.release().perform();
		*/
		//Approach_02------>to drop at location
		/*
		a.moveToElement(tgt_drag).perform();
		a.clickAndHold().perform();
		a.moveByOffset(400, 300).perform();
		*/
		//Approach-03
		//a.dragAndDrop(tgt_drag, tgt_drop).perform();
		a.dragAndDropBy(tgt_drag, 400,300).perform();
	}

}
