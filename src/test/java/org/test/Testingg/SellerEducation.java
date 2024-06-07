package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerEducation {

	
static WebDriver driver;
	
	@Test
	
	public void sellerEducations () throws InterruptedException
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
		
			 
			 
	 
			 
			 
      //   1. Education :
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Education'])[1]")).click(); 
			 
	    // Institute : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Institute'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("course"); 
			 
			 
			 // location
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("chennai"); 
			 
			 
			 // standard
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Standard']")).sendKeys("college 3rd yr");
			 
			 
			 // address :
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("4/266, sredevi nagar, chennai"); 
			 
			 
			 	 
			 // website
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Website']")).sendKeys("https://www.greenstechnologys.com/index.html"); 
			 
			 
			 //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to study Development course"); 
			 
		 		
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
	
	 
	
	
			 
			 
		      //   2. Study abroad ;
					
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Education'])[1]")).click(); 
					 
			 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Study abroad '])[1]")).click(); 
					 
			        // title
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("course"); 
					 
					 
					 // location
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("canada"); 
					 
					 
					 // standard
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Standard']")).sendKeys("college 3rd yr");
					 
					 
					 // address :
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("4/266, sreedevi, chennai"); 
					 
					 
					 	 
					 // website
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Website']")).sendKeys("https://www.greenstechnologys.com/index.html"); 
					 
					 
					 //  description :
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to study abroad"); 
					 
				 		
				       //Select state
					 Thread.sleep(1000);
					 WebElement dewa = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 dewa.click();
					 dewa.sendKeys("Goa"); 
					 dewa.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement fgty=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 fgty.click();
					 fgty.sendKeys("Baga"); 
					 fgty.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement sfd =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					sfd. sendKeys("Bus stop");
								 

					
				
					 
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
					 WebElement uiopnj =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					 uiopnj.click();
			
			 
	
					 
			 
		      //   3. Schools & School Tuitions :
					
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Education'])[1]")).click(); 
					 
			

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Schools & School Tuitions'])[1]")).click(); 
					 
			        // title
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("course"); 
					 
					 
					 // location
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("chennai"); 
					 
					 
					 // standard
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Standard']")).sendKeys("college 3rd yr");
					 
					 
					 // address :
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("4/266, sredevi nagar, chennai"); 
					 
					 
					 	 
					 // website
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Website']")).sendKeys("https://www.greenstechnologys.com/index.html"); 
					 
					 
					 //  description :
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to study Development course"); 
					 
				 		
				       //Select state
					 Thread.sleep(1000);
					 WebElement njio = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 njio.click();
					 njio.sendKeys("Goa"); 
					 njio.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement cdfh=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 cdfh.click();
					 cdfh.sendKeys("Baga"); 
					 cdfh.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement dfrr =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					dfrr. sendKeys("Bus stop");
								 

					
				
					 
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
					 WebElement loput =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					 loput.click();
			
			 
			
	
	
	
	
	
	}	
}
