package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SellerJobs {

	
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
		
			 
			 
	 
			 
			 

				// 1.Job seekers : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Jobs'])[1]")).click(); 
			 
	    //  job seekers: 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Job Seekers'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("jobs"); 
			 
			 
			 // Job  title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Job Title']")).sendKeys("job in developer"); 
			 
			 
			 // Job  type
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Job Type-Full-time']")).click();
			 
			 
			 // salary
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Salary (Monthly)']")).sendKeys("28000"); 
			 
			 
			 
			 // name
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Nithya"); 
			 
			 
			 
			 //  mail
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Mail Id']")).sendKeys("nithya@gmail.com"); 
			 
			 
			 
			 // mobile
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8760150560"); 
			 
			 
			 
			 // address
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys("4/288, sreedevi nagar, chennai"); 
			 
			 	 
			 
			 
			 
			 
			 
			 
	     /*	        	  
	     	 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 
				Select dropDown = new Select(driver.findElement(By.xpath("//li[@data-value='Care Taker ']")));
				dropDown.selectByIndex(2);
				
				// ttle1.sendKeys();
				 //ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			  
			  */
			  
			  
			  
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale home services"); 
			 
		 		
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
	
	 
	 
			 
			 
			 

				// 1.Employeers : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Jobs'])[1]")).click(); 
			 
	    //  job seekers: 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Employers'])[1]")).click(); 
			 
	        //  company name 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter company name']")).sendKeys("Zoho"); 
			 
			 
			 // Job  title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Job Title']")).sendKeys("job in developer"); 
			 
			 
			 // job type:
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for='Job Type-Full-time']")).click();
				 
	 
			 
			 // Job  role
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Role']")).sendKeys("Java Developer");
			 
			 
			 // salary
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Salary (monthly)']")).sendKeys("28000"); 
			 
			 
			 
			 // experience
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Experience']")).sendKeys("1"); 
			 
			 
			 
			 //locality
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Localities']")).sendKeys("chennai"); 
			 
			 
			 
			 //job description
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Job Description']")).sendKeys("we are hiring java developer"); 
			 
			 
			 
			 // recruiter details
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Recruiter details']")).sendKeys("4/288, sreedevi nagar, chennai"); 
			 

			 //email id:
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Email Id']")).sendKeys("nithya@gmail.com"); 
			 

			 //contact
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Contact']")).sendKeys("8760150560"); 
			 

			 // addition skills:
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Addition skills']")).sendKeys("python"); 
			 
			 	 
			 
			 
			 
			 
			 
			 
	     /*	        	  
	     	 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 
				Select dropDown = new Select(driver.findElement(By.xpath("//li[@data-value='Care Taker ']")));
				dropDown.selectByIndex(2);
				
				// ttle1.sendKeys();
				 //ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			  
			  */
			  
			  
			  
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale home services"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement re11 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 re11.click();
			 re11.sendKeys("Goa"); 
			 re11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement re111=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 re111.click();
			 re111.sendKeys("Baga"); 
			 re111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement olpiuy =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			olpiuy. sendKeys("Bus stop");
						 

			
		
			 
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
			 WebElement lopiu =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 lopiu.click();
	
	 
			 
	 
	
	
	
	
}
}