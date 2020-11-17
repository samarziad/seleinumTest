package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://facebook.com/");   
        
        //for id we can use input#email  or   "#email"
       // driver.findElement(By.cssSelector("input#email")).sendKeys("samar");
        
        // for class name we can use  ("input.email")   or  (".email")
        //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("samar ");
 
        WebElement login_button =  driver.findElement(By.cssSelector("input[id*='u_0_']")) ;
        login_button.sendKeys("samar ");
        
    
       // driver.findElement(By.cssSelector("a.StaticLoggedOutHomePage-input ")).click();
	}

}
