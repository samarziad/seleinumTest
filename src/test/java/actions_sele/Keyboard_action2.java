package actions_sele;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action2 {
	public static void main(String[] args) { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skyscanner.net/");
		driver.manage().window().maximize();
		WebElement text1 = driver.findElement(By.id("fsc-origin-search"));
		Actions action = new Actions(driver);
	
		text1.clear();
		text1.sendKeys("Amsterdam");
		text1.sendKeys(Keys.TAB);
		
	
		action.sendKeys("Amman").build().perform();
		
		for (int i=0 ; i<4 ; i++) {
			action.sendKeys(Keys.TAB);
		}
		
		action.sendKeys(Keys.ENTER).build().perform();
		
	}

}
