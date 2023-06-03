package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_04 
{
  @Test(invocationCount=10)
  public void sendSMS()
  {
	  Reporter.log("SMS sent",true);
  }
}
