package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mode {

static WebDriver driver;
	
	@Test
	
	public void homelife () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mtn11.netlify.app/cruises");
		
		driver.manage().window().maximize();
		
			 
	
	
	
	// 5. Home & LifeStyles:
	
			// home appliances:
					
					Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Nithya");
					
					 					
					 //Thread.sleep(1000);
					// driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("nithya@gmail.com"); 
							 
					 
				     				 
					 //Select state
					
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9876543210"); 
							 
					/* 
					 // select City
					 Thread.sleep(1000);		  
					 WebElement mobelife1 =  driver.findElement(By.xpath("//input[@placeholder='Date of Travel']"));
					 mobelife1.click();
					 mobelife1.sendKeys("march 24, 2"); 
					 mobelife1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					*/
					 
					// Area
					Thread.sleep(1000);		  
					WebElement areaelife =  driver.findElement(By.xpath("//input[@placeholder='Number of Days']"));
					areaelife. sendKeys("5");
								 

					//Min Price 
					 
					 Thread.sleep(1000);		  
					 WebElement minPricelife =  driver.findElement(By.xpath("//input[@placeholder='Number of Adults']"));
					 minPricelife. sendKeys("2");
					 
					 //Max Price
					 Thread.sleep(1000);		  
					 WebElement maxPricelife =  driver.findElement(By.xpath("//input[@placeholder='Number of Childrens']"));
					 maxPricelife. sendKeys("3");
					 
					 
				     // Apply
					 
					 Thread.sleep(1000);		  
					 WebElement applylife =  driver.findElement(By.xpath("//span[@class='custom-checkbox']"));
					 applylife.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement homelife =  driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
					 homelife.click();

					 
	
	}	
	
}
