package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Checkbox_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\samar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	       
        // open chrome driver 
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        // check box for unique xpath, id ,name ....etc element 
        //driver.get("https://www.spicejet.com/");	
        //WebElement family_check= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
        //family_check.click();
        //System.out.println(family_check.isSelected());
        
        // if we have many check boxes elements with same id,name,xpath, ...etc 
        // use 1 list or 2 not 
        driver.get("http://www.echoecho.com/htmlforms09.htm");
        List <WebElement> checkboxes =  driver.findElements(By.xpath("//input[@type='checkbox']"));
        //checkboxes.get(2).click();
        //checkboxes.get(1).click();
        
        // without list 
        //driver.findElements(By.xpath("//input[@type='checkbox']")).get(0).click();
        
        // retuen the number of element that have same element path in the list 
      // System.out.print(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        
       
       // use for loop to click on all list elements
       
       int list_size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
       int i;
       
       for(i=0;i<list_size;i++) {
    	   
    	   driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
       }
       

	}

}
