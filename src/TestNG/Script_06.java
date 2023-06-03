package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script_06
{
  @Test(groups="s1")
  public void m1()
  {
	  Reporter.log("M1 method executed",true);
  }

  @Test(groups="s1")
  public void m2()
  {
	  Reporter.log("M2 method executed",true);
  }

  @Test(groups="s1")
  public void m3()
  {
	  Reporter.log("M3 method executed",true);
  }

  @Test(groups="s1")
  public void m4()
  {
	  Reporter.log("M4 method executed",true);
  }

  @Test(dependsOnGroups="s1")
  public void m5()
  {
	  Reporter.log("M5 method executed",true);
  }
}
