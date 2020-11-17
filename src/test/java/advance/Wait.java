package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://library-app.firebaseapp.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.linkText("Libraries")).click();
	    
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
	
        
		
		//try {
			//Thread.sleep(8000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
	//	}
		
		   driver.findElement(By.id("ember21")).click();
		
	}
	
}
