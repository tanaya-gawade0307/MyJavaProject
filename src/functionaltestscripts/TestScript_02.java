package functionaltestscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_02
{
  @Test(groups="valid")
  public void m1()
  {
	  Reporter.log("Functional Testing TestScript_02 valid testing ",true);
  }
  @Test(groups="invalid")
  public void m2()
  {
	  Reporter.log("Functional Testing TestScript_02 invalid testing ",true);
  }
  @Test(groups="valid")
  public void m3()
  {
	  Reporter.log("Functional Testing TestScript_02 adhoc testing",true);
  }
}
