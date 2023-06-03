package PracticeScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Script_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       WebDriver driver=new FirefoxDriver();
       driver.get("http://www.facebook.com");
       //take screenshot
       TakesScreenshot s=(TakesScreenshot) driver;
       File src=s.getScreenshotAs(OutputType.FILE);
       //define location with filename+extension
       String path="../Selenium/SeleniumImages/Images_01.png";
       File dest=new File(path);
       //save file in that location
       Files.copy(src,dest);
       
	}

}
