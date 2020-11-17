package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        				
        //open website (baseUrl)
        driver.get("https://www.google.com/");	
       //to open another website after google        
	driver.navigate().to("https://www.youtube.com/");
	
	driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
	}

}
