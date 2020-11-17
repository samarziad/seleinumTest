package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class javascript_executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement submit = driver.findElement(By.id("philadelphia-field-submit"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
        
		//js.executeScript("arguments[0].scrollIntoView();",submit);
        //js.executeScript("arguments[0].click();",submit);

		String pagetext = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(pagetext);

	}

}
