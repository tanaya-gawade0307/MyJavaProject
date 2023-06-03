package functionaltestscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_03
{
  @Test(groups="valid")
  public void m1()
  {
	  Reporter.log("Functional Testing TestScript_03 valid testing ",true);
  }
  @Test(groups="invalid")
  public void m2()
  {
	  Reporter.log("Functional Testing TestScript_03 invalid testing ",true);
  }
  @Test(groups="valid")
  public void m3()
  {
	  Reporter.log("Functional Testing TestScript_03 adhoc testing",true);
  }
}