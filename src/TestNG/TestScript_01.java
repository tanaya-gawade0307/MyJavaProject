package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript_01 
{
  @DataProvider
  public Object[][] testData() {
	  Object[][] rv=new Object[3][2];
	  rv[0][0]="admin1";
	  rv[0][1]="manager1";
	  rv[1][0]="admin2";
	  rv[1][1]="manager";
	  rv[2][0]="admin3";
	  rv[2][1]="manager3";
	  return rv;
  }
   @Test(dataProvider="testData")     //----->test method
   public void testlogin(String un,String pwd)
   {
	   Reporter.log(un,true);
	   Reporter.log(pwd,true);
   }
  }

