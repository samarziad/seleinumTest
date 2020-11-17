package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        				
        //open website (baseUrl)
        driver.get("http://demo.guru99.com/V1/");	
        
        driver.findElement(By.name("uid")).sendKeys("mngr181339");
        driver.findElement(By.name("password")).sendKeys("deqybYv");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        
        //for click on link text such as forget pass
        driver.findElement(By.linkText("here")).click();
	}

}
