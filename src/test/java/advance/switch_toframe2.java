package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class switch_toframe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// using frame web element 
		//WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//driver.switchTo().frame(frame);
		
        driver.switchTo().frame(0);
		
		WebElement drop1 = driver.findElement(By.id("draggable"));
		WebElement drop2 = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
	    action.clickAndHold(drop1).moveToElement(drop2).build().perform();
		
		

	}

}
