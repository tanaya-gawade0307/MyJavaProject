package JavascriptExecutor;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Script_01 {

			public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver=new FirefoxDriver();
				driver.get("http://www.flipkart.com");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(3000);
				driver.findElement(By.name("q")).sendKeys("i phone 14");
				Thread.sleep(3000);
				driver.findElement(By.xpath(".//button[@type='submit']")).click();
				Thread.sleep(5000);
		        //tyype cast
				JavascriptExecutor js=(JavascriptExecutor) driver;
				//scroll down
				for(int a=1; a<=5; a++);
				{
					js.executeScript("window.scrollBy(0,500)");
					Thread.sleep(2000);
				}
				Thread.sleep(2000);
				//scroll up
				for(int a=1; a<=5; a++)
				{
					js.executeScript("window.scrollBy(0,-500)");
					Thread.sleep(2000);
				}
			}

		

	}


