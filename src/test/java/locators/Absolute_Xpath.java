package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //open website (baseUrl)
        driver.get("http://demo.guru99.com/V1/");	
        driver.findElement(By.xpath("//body/form/table/tbody/tr/td/input")).sendKeys("mngr181339");
        driver.findElement(By.xpath("//body/form/table/tbody/tr[2]/td/input")).sendKeys("deqybYv");
        driver.findElement(By.xpath("//body/form/table/tbody/tr[3]/td/input")).click();
	}

}
