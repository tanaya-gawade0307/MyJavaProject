package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript_04
{
  @Parameters("email")
  @Test
  public void TestSCript_01(String email)
  {
	  Reporter.log(email,true);
  }
}
