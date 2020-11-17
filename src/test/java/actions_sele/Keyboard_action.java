package actions_sele;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Keyboard_action {
	
	
	public static void main(String[] args) { 
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/?ef_id=Cj0KCQjwpsLkBRDpARIsAKoYI8ygHly1LRLEEIS-BL5KUmQXH-fbBAGc9fSTH54lq1ssVMYkiACbc7YaAhNgEALw_wcB:G:s");
	
	Actions action = new Actions(driver);
	WebElement search = driver.findElement(By.id("gh-ac")) ;
	action.moveToElement(search)
	.keyDown(Keys.SHIFT).click()
	.sendKeys("samar")
	.build().perform();
	
	

}
}