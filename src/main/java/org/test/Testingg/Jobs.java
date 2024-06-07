package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Jobs {

	
	
static WebDriver driver;
	
	@Test
	
	public void jobs () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
// 3.jobs:
			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Jobs']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Job Seekers'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobjob = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobjob.click();
			 mobjob.sendKeys("Goa"); 
			 mobjob.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobjob1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobjob1.click();
			 mobjob1.sendKeys("Baga"); 
			 mobjob1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areajob =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areajob. sendKeys("Bus stop");
			
			
			// select title
			 Thread.sleep(1000);		  
			 WebElement mobemp11 =  driver.findElement(By.xpath("//input[@placeholder='Select title']"));
			 mobemp11.click();
			 mobemp11.sendKeys("Fresher"); 
			 mobemp11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			
			//job type
			 
			 Thread.sleep(1000);		  
			 WebElement dropDown155 =  driver.findElement(By.xpath("(// input[@type='radio'])[1]"));
			 dropDown155.click();
			// dropDown15.sendKeys("1"); 
				 dropDown155.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
	//  Monthly  Salary
				 Thread.sleep(1000);		  
				 WebElement dropDown1551 =  driver.findElement(By.xpath("//input[@placeholder='Select Salary (Monthly)']"));
				 dropDown1551.click();
				 dropDown1551.sendKeys("15000"); 
					 dropDown1551.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
				  
				 
		 
		 /*       select experience
		 //Thread.sleep(1000);		  
		 //WebElement mobex =  driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl form-control-select css-1v4ccyo']"));
		// mobex.click();
		 
		 //WebElement  dropdown =  driver.findElement(By.xpath("")); 
		 //Select  s =  new  Select(dropdown);
		 //s.selectByIndex(2);
		 //mobex.sendKeys(); 
		 //mobex.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);             */
				 
		 						 

		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homejob =  driver.findElement(By.xpath("//div[@class='home']"));
			 homejob.click();

			 
		//	 3.1  employers:

			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Jobs']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Employers'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobemp = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobemp.click();
			 mobemp.sendKeys("Goa"); 
			 mobemp.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobemp1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobemp1.click();
			 mobemp1.sendKeys("Baga"); 
			 mobemp1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areamob11 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areamob11. sendKeys("Bus stop");
						 
			 
			
			
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeemp =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeemp.click();
 
	}
		
	
	
}
