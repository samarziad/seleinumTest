package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class clicck_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	            	System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.bbc.com/");
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					
					
					//driver.findElement(By.xpath("//*[(text(),'News ')]")).click();
					  driver.findElement(By.xpath("//*[contains(text(),'Sign ')]")).click();
					
					
					
	}

}
