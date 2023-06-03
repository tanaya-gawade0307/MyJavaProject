package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript_03 
{
  @Parameters({"un","pwd"})
  @Test
  public void TestScript_01(String un,String pwd)
  {
	  Reporter.log(un,true);
	  Reporter.log(pwd,true);
  }
  
}
