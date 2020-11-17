package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class switch_toframe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println(count);
		
		//for (int i =0 ; i<count ; i++ ) {
			//driver.switchTo().frame(i);
			//int yes = driver.findElements(By.xpath("//img[@src='Jmeter720.png']")).size();
			//System.out.println(yes);
			//driver.switchTo().defaultContent();
		//}
		
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	}

}
