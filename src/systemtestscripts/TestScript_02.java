package systemtestscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_02
{
  @Test
  public void m1()
  {
	  Reporter.log("System Testing TestScript_02 valid testing ",true);
  }
  @Test
  public void m2()
  {
	  Reporter.log("System Testing TestScript_02 invalid testing ",true);
  }
  @Test
  public void m3()
  {
	  Reporter.log("System Testing TestScript_02 adhoc testing",true);
  }
}
