package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerMatrimony {

	
static WebDriver driver;
	
	@Test
	
	public void sellerJobs () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='buy']")).click();
			 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[@href='/register']")).click();			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter your Name']")).sendKeys("Divya T"); 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8760150565"); 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyaaddsbazar@gmail.com"); 
			 
			
				
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Divya@990@1"); 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='checkbox']")).click(); 
					 
			 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@type='submit']")).click(); 
			 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[@href='/login']")).click(); 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("divyaaddsbazar@gmail.com"); 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Divya@990@1"); 
			 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();   
			 	 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@class='buy']")).click(); 
		
			 
			 
	 
			 
			 

				// 1.matrimony brides : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Matrimonial'])[1]")).click(); 
			 
	    //  brides
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Brides'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Brides"); 
			 
			 
			 // name :
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("nithya"); 
			 
			 
			 // age
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("27");
			 
			 
			 // height :
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Height']")).sendKeys("5.3"); 
			 
			 
			 	 
			 // religion
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Religion']")).sendKeys("Hindu"); 
			 
			 
			 
			 //  mother tongue
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Mother Tongue']")).sendKeys("Tamil"); 
			 
			 
			 
			 // education
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Education']")).sendKeys("Bsc");
			 
			 
			 
			 // Enter Current Occupation"
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Current Occupation']")).sendKeys("teacher"); 
			 
			 	 
			 
			//  sun sign : 
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//input[@placeholder='Enter Sun Sign']")).sendKeys("Aries"); 
		 
		 
			 // Enter Nakshatra
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Nakshatra']")).sendKeys("rohini");
				 
				 
				 
				 // location :
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("chennai"); 
				 
						 	 
			 
			 
			 
		
			  
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to register matrimony"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement re = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 re.click();
			 re.sendKeys("Goa"); 
			 re.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement re1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 re1.click();
			 re1.sendKeys("Baga"); 
			 re1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaserho1121 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			areaserho1121. sendKeys("Bus stop");
						 

			
		
			 
			 /*
			 
			 
		     // upload photos
			 
			 Thread.sleep(1000);		  
			 WebElement applyserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
			 applyserho.click();
			 
			 WebElement upload =driver.findElement(By.linkText("Upload a Document:( .png, .txt, .doc, .docx, .odt, .pdf, .rtf, .jpg )"));
			 upload.sendKeys("C:\\Users\\Admin\\Pictures");
			 
			 
			 
		    // upload videos
			 
			 Thread.sleep(1000);		  
			 WebElement homeserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
			 homeserho.click();

		  
		  
		  */
		 	 // post now:
			 
			 
			 Thread.sleep(1000);		  
			 WebElement homeserho1121 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 homeserho1121.click();
	
	 
	
			 
			 
			 

		// 2. grooms : 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Matrimonial'])[1]")).click(); 
			 
	    //  brides
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Grooms'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("grroms"); 
			 
			 
			 // name :
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("nithin"); 
			 
			 
			 // age
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("27");
			 
			 
			 // height :
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Height']")).sendKeys("5.3"); 
			 
			 
			 	 
			 // religion
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Religion']")).sendKeys("Hindu"); 
			 
			 
			 
			 //  mother tongue
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Mother Tongue']")).sendKeys("Tamil"); 
			 
			 
			 
			 // education
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Education']")).sendKeys("Bsc");
			 
			 
			 
			 // Enter Current Occupation"
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Current Occupation']")).sendKeys("teacher"); 
			 
			 	 
			 
			//  sun sign : 
		        Thread.sleep(1000);
		        driver.findElement(By.xpath("//input[@placeholder='Enter Sun Sign']")).sendKeys("Aries"); 
		 
		 
			 // Enter Nakshatra
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Nakshatra']")).sendKeys("rohini");
				 
				 
				 
				 // location :
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("chennai"); 
				 
						 	 
			 
			 
			 
		
			  
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to register matrimony"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement dtt = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 dtt.click();
			 dtt.sendKeys("Goa"); 
			 dtt.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement sdr=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 sdr.click();
			 sdr.sendKeys("Baga"); 
			 sdr.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement lout =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			lout. sendKeys("Bus stop");
						 

			
		
			 
			 /*
			 
			 
		     // upload photos
			 
			 Thread.sleep(1000);		  
			 WebElement applyserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
			 applyserho.click();
			 
			 WebElement upload =driver.findElement(By.linkText("Upload a Document:( .png, .txt, .doc, .docx, .odt, .pdf, .rtf, .jpg )"));
			 upload.sendKeys("C:\\Users\\Admin\\Pictures");
			 
			 
			 
		    // upload videos
			 
			 Thread.sleep(1000);		  
			 WebElement homeserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
			 homeserho.click();

		  
		  
		  */
		 	 // post now:
			 
			 
			 Thread.sleep(1000);		  
			 WebElement olpiu =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 olpiu.click();
	
	 
	
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	
	
	}	
}
