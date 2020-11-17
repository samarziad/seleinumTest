package test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public  class  test2 {

	public static void main(String[] args) throws InterruptedException {
		 
	        // baseUrl website i want to open 
		    String baseUrl = "http://demo.guru99.com/test/tooltip.html";	
		   
		    //chrome driver location to execute 
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	        WebDriverManager.chromedriver().setup();
	        // open chrome driver 
	        WebDriver driver = new ChromeDriver();
	        				
	        //open website (baseUrl)
	        driver.get(baseUrl);	
	        
	        // maximize the chrome 
	        driver.manage().window().maximize();
	        
	      
            // find element in website by its xpath and store it in download from type web element   
	        WebElement download = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[5]/a"));
	        
	        //create  action object 
	        Actions builder = new Actions (driver);	
	        
	        //move mouse to the element and click on it // perform = execute all step togather 
	        builder.moveToElement(download).click().perform();
	      

	      //  builder.clickAndHold().moveToElement(download);					
	      //  builder.moveToElement(download).build().perform(); 	
	        
	      //  WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));							
	        //String actualTooltip = toolTipElement.getText();			
	        
	      //  System.out.println("Actual Title of Tool Tip  "+actualTooltip);							
	      //  if(actualTooltip.equals(expectedTooltip)) {							
	            //System.out.println("Test Case Passed");					
	      //  }		
	        
	        
	     //  driver.close();			
	   }		
	}		