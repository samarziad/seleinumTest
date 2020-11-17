package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_Windows_Size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        				
        //open website (baseUrl)
        driver.get("https://www.google.com/");	
        
        // full page size 
        //driver.manage().window().fullscreen();
        
		// maximize  page size 
        driver.manage().window().maximize();
        
        // return window handle 
        System.out.print(driver.getWindowHandle());
		
        // close the current window that opened by selenium   
        driver.close();
        
        
        // close the all  window that had opened by selenium   
        // driver.quit();

	}

}
