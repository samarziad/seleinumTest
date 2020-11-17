package advance;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Switch_to_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
     
        
     	
		
		Set <String> Ids = driver.getWindowHandles();
		
		Iterator <String> it = Ids.iterator();
	    String parentId = it.next();
	    
		driver.findElement(By.linkText("here")).click();
		
	    while(it.hasNext())
	   {
	     
	    	String childId = it.next();
	    
	    //System.out.println(driver.switchTo().window(childId).getTitle());
	     
	    	 driver.switchTo().window(childId);

	    }
	   
	    driver.findElement(By.name("emailid")).sendKeys("samar");
	}
}
