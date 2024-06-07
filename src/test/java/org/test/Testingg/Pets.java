package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pets {

	
static WebDriver driver;
	
	@Test
	
	public void jobs () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
// 1.pets
		

	         Thread.sleep(1000);
	         driver.findElement(By.xpath("//a[text()='ALL']")).click();
	
		
		
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//h2[text()='ALL Categories']")).click();
		
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Pets & Pets care']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Dogs'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobem1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobem1.click();
			 mobem1.sendKeys("Goa"); 
			 mobem1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobem =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobem.click();
			 mobem.sendKeys("Baga"); 
			 mobem.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaem =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaem. sendKeys("Bus stop");
			
			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceem =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPriceem. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPriceem =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPriceem. sendKeys("300");
			 
			 
				 
		

		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeem =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeem.click();

			 
	
	}	
}
