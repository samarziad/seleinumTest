package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
			       
		        // open chrome driver 
		        WebDriver driver = new ChromeDriver();
		        
		        driver.manage().window().maximize();
		        
		        //open website (baseUrl)
		       driver.get("http://demo.guru99.com/V1/");	
		       // driver.get("http://facebook.com");	
		        
		        /* xpath -- relative xpath
		         * 1) (//tagname[@attribute ='vale']
		           2) we can use * star instead of tagname 
		           3) we can use xpath for as a  solution class name that contain space (//*[class='value'] )
		           4) we can use any attribute tube   class,name,....etc 
		           5) we can search xpath by using console in the website  and this formula $x("xpath")
		           6)we can use different formula //tag name[contains(@attribute'value')]
		           driver.findElement(By.xpath("//*[contains(@id,'u_0_')]")).click();
        
		           7)if we use copy xpath it will copy the absou and that isnt professional
		           8)if we have many element have same relative xpath we use a number  ("(//*[att='vale'])[2]")  
		            driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("mngr181339");
		      
		        */
		      //  driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("mngr181339");
		        
		        
		      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mngr181339");
		      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("deqybYv");
		       
		      driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}
