package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //open website (baseUrl)
        driver.get("https://www.spicejet.com/");	
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='PNQ']")).click();
        driver.findElement(By.xpath("(//a[@value='CJB'])[2]")).click();
	}

}
