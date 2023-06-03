package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_03
{
  @Test(priority=2)
  void createAccount() 
  {
	  Reporter.log("Create Account Method Executed ",true );
  }
  @Test(priority=3)
  void editAccount() 
  {
	  Reporter.log("Edit Account Method Executed ",true );
  }
  @Test(priority=4)
  void deleteAccount() 
  {
	  Reporter.log("Delete Account Method Executed ",true );
  }
  @Test(priority=1)
  void checkAccount() 
  {
	  Reporter.log("Check Account Method Executed ",true );
  }
}
