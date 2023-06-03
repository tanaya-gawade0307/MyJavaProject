package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_05
{
   @Test
   public void signup()
   {
	   Reporter.log("Signup method executed", true);
   }
   @Test(dependsOnMethods="signup")
   public void login()
   {
	   Reporter.log("Login method executed", true);
   }
}
