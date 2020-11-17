package advance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotels.com/hotel-deals/?pos=HCOM_ASIA&locale=en_MY&tmid=hcom-us.dps.cj.package-.package&PSRC=AFF10&rffrid=aff.hcom.us.002.003.7195550.cjaff.kwrd%3D0baa536257d411e98365017f0a180512&wapa6=1beon8bhdqvknx58hvc14260y&sub_publisher=4067797&sub_site=7195550&sub_ad=10772148");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement check_in= driver.findElement(By.name("q-localised-check-in"));

        JavascriptExecutor js = ((JavascriptExecutor)driver);
        js.executeScript("arguments[0].setAttribute('value' ,'"+ "17-11-2019 "+"' );",check_in);
		
        
		WebElement date2 = driver.findElement(By.name("q-localised-check-out"));
		js.executeScript("arguments[0].setAttribute('value' ,'"+ "17-12-2019 "+"' );",date2);

		
        
	}

}
