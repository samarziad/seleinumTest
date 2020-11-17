package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class limiting_webdriver {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
        
		WebElement  footer = driver.findElement(By.className("orb-footer-primary-links"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		
		
}
}
