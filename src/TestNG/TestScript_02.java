package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestScript_02
{
  @Parameters({"un","pwd"})
  @Test
  public void test_01(String un,String pwd)
  {
	  Reporter.log(un,true);
	  Reporter.log(pwd,true);
  }
  @Parameters("email")
  @Test
  public void test_02(String email)
  {
	  Reporter.log(email,true);
  }
}
