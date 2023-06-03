package integrationtestscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_01
{
  @Test(groups="valid")
  public void m1()
  {
	  Reporter.log("Integration Testing TestScript_01 valid testing ",true);
  }
  @Test(groups="invalid")
  public void m2()
  {
	  Reporter.log("Integration Testing TestScript_01 invalid testing ",true);
  }
  @Test(groups="valid")
  public void m3()
  {
	  Reporter.log("Integration Testing TestScript_01 adhoc testing",true);
  }
}