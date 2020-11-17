package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Alerts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.echoecho.com/javascript4.htm");
        driver.manage().window().maximize();
        //alert box 
        //driver.findElement(By.xpath("//input[@value='alert box']")).click();
        //driver.switchTo().alert().accept();
        
        
       // driver.findElement(By.xpath("//input[@value='confirm box']")).click();
        //driver.switchTo().alert().accept();
       // driver.switchTo().alert().dismiss();
        
        
        driver.findElement(By.xpath("//input[@value='prompt box']")).click();
        driver.switchTo().alert().sendKeys("hbjghjhj");
	

	}

}
