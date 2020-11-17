package web_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

        public static WebDriver driver= null;

        public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
            WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        // open chrome driver 
        //WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        //open website (baseUrl)
        driver.get("http://facebook.com");	
        
        WebElement day = driver.findElement(By.id("day"));
        Select day_value = new  Select(day);
        day_value.selectByIndex(2);
        
        
        WebElement  month  =driver.findElement(By.id("month"));
        Select monthvalue = new Select(month);
        monthvalue.selectByIndex(2);
        monthvalue.selectByVisibleText("Oct");
        monthvalue.selectByValue("12");
        
        
        WebElement year = driver.findElement(By.id("year"));
        Select year_value = new Select(year);
        year_value.selectByVisibleText("1995");

	}

}
