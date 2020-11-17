package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Url {

	public static void main(String[] args) {
		  // baseUrl website i want to open 
	    String baseUrl = "http://demo.guru99.com/test/tooltip.html";	
	   
	    //chrome driver location to execute 
        System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        				
        //open website (baseUrl)
        driver.get(baseUrl);	
        
        //compare between the actual Url and the real Url  
       String actualUrl = driver.getCurrentUrl(); 
       if (actualUrl.contentEquals("http://demo.guru99.com/test/tooltip.html")) {
    	   System.out.println("Url pass");	
	}
       else {
    	   System.out.println("Url fail"); 
       }//end of the Url compare scope 
       
       
     //compare between the actual title and the real title   
      String Actual_title = driver.getTitle();
      if (Actual_title.contentEquals("Tooltip Demo")) {
   	   System.out.println("Title pass");	
	}
      else {
   	   System.out.println("Title fail"); 
      }//end of the title compare scope 
        
      
      //bring website source code 
        System.out.println(driver.getPageSource());

	}

}
