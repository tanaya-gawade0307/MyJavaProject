package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScript_05
{
   @Test
   public void m1()
   {
	   SoftAssert s=new SoftAssert();
	   Reporter.log("Method_01 execution started",true);
	   int a=10;
	   int b=20;
	   Reporter.log("verification_01 started",true);
	   s.assertEquals(a,b);
	   Reporter.log("verification_01 completed",true);
	   int c=10;
	   Reporter.log("verification_02 started",true);
	   s.assertEquals(a,c);
	   Reporter.log("Verification_02 completed",true);
	   Reporter.log("method_01 execution completed",true);
	   s.assertAll();
   }
}
