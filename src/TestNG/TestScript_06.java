package TestNG;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestScript_06
{
     @Test
     public void m1()
     {
    	 Reporter.log("method_01 executed",true);
     }
     @Test
     public void m2()
     {
    	 Reporter.log("method_02 executed",true);
     }
     @AfterMethod
     public void testmethodsexecutionstatus(ITestResult result)
     {
    	 String testmethod_name=result.getName();
    	 int status=result.getStatus();
    	 if(status==1)
    	 {
    		 Reporter.log(testmethod_name+"method is pass",true);
    	 }
    	 else if(status==2)
    	 {
    		 Reporter.log(testmethod_name+"method is fail",true);
    	 }
    	 else
    	 {
    		 Reporter.log(testmethod_name+"method is skip",true);
    	 }


    	 
     }
}
