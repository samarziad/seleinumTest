package web_element;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.expedia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("tab-label")).click();
        System.out.println(driver.findElement(By.id("package-returning-hp-package")).isDisplayed());
        driver.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
        System.out.println(driver.findElement(By.id("package-returning-hp-package")).isDisplayed());
        
	}

}
