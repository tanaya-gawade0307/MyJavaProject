package BrowserHandling;

public class OpenBrowser extends Script_08 {


		// TODO Auto-generated method stub
      public static void testscript()
      {
    	  
		driver.get("http://www.facebook.com");
    	  String title=driver.getTitle();
    	  System.out.println(title);
      }
     
      public static void main(String [] args) throws InterruptedException
      {
    	  selectBrowser("Firefox");
    	  testscript();
      }

	private static void selectBrowser(String string) {
		// TODO Auto-generated method stub
		
	}
	}


