package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerMobiles {

	
static WebDriver driver;
	
	@Test
	
	public void sellerProperties () throws InterruptedException
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
		
			 
			 
			 
			 
			 

				// 1. mobiles and tablets:	
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Mobiles & Tablets'])[1]")).click(); 
			 
	    //  Mobiles : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Mobile Phones'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titlee11 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
			  titlee11.sendKeys("mobiles"); 
			 
			 /*
			  
			 //insurance : 
			             
				 Thread.sleep(1000);
				 WebElement title1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Insurance']")); 
				 title1.click();
				 title1.sendKeys("Comprehensive Insurance");
				 title.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	 
			 
	        // select Types				 
				 
			 Thread.sleep(1000);
			
			 WebElement dropDown = driver.findElement(By.xpath("//div[@id='mui-component-select-Types']"));
		     dropDown.click(); 
			// dropDown.sendKeys();
			 //dropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			// WebElement  dropDown1 = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			 Select dropDown1 =  new Select(driver.findElement(By.xpath("//ul[@aria-labelledby='outlined-adornment-select']")));
			 dropDown1.selectByIndex(2); 
			 title1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			       
			  // Select Brand			 

			 Thread.sleep(1000);
			 WebElement brand = driver.findElement(By.xpath("//div[@id='mui-component-select-Brand']"));
		
			 //brand.sendKeys("Bajaj");
			 //dropDown1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			Select s1 = new Select(brand); 
			s1.selectByIndex(2);
			
			 
			 //brand.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
		/*
			
			   //Brands : 
			             
				 Thread.sleep(1000);
				 WebElement titler1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Brands']")); 
				 titler1.click();
				 titler1.sendKeys("Samsung");
				 titler1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	*/
			
			 
	    //  Enter Ram : 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter RAM']")).sendKeys("6Gb"); 
			 
			 
			 
		   //  Enter storage : 
					 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Storage']")).sendKeys("2000"); 
					 		
			 
					 
			  //  Enter physical conditions : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Physical condition']")).sendKeys("good"); 
			 		 
			 
			 //  Enter year of purchase : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Year of purchase']")).sendKeys("2024"); 
			 		 
			
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Mobile phones"); 
			 
		 		
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
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricert =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 minPricert. sendKeys("2000");
		
			 
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

			 
	 
			 

				// 1. mobiles and tablets:	
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Mobiles & Tablets'])[1]")).click(); 
			 
	    //  Accessories : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Accessories'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Accessories");
			 
			 			    
		/*
			
			   //Brands : 
			             
				 Thread.sleep(1000);
				 WebElement titler1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Brands']")); 
				 titler1.click();
				 titler1.sendKeys("Samsung");
				 titler1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	*/
		
			 
			 
			 
			 
			  //  Enter Accessories types : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Accessory type']")).sendKeys("mobilecase"); 
			 		 
			 
			 

			  //  Enter brand name : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Brand Name']")).sendKeys("Samsung");
			 		 
			 		 
			 
			 				 
			 //  Enter physical conditions : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Condition']")).sendKeys("Good"); 
			 		 
			
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale tablet"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement ty = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 ty.click();
			 ty.sendKeys("Goa"); 
			 ty.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement rek=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 rek.click();
			 rek.sendKeys("Baga"); 
			 rek.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement a1r =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			a1r. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement minrt1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 minrt1. sendKeys("2000");
		
			 
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
			 WebElement hu =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 hu.click();

			 
			 
			 
			 
			 
	 
	

				// 1. mobiles and tablets:	
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Mobiles & Tablets'])[1]")).click(); 
			 
	    //  Tablets : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Tablets'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement ji = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
			ji.click();
			 ji.sendKeys("Tablets"); 
			 ji.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 			    
		/*
			
			   //Brands : 
			             
				 Thread.sleep(1000);
				 WebElement titler1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Brands']")); 
				 titler1.click();
				 titler1.sendKeys("Samsung");
				 titler1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	*/
		
					 
			  //  Enter physical conditions : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Condition']")).sendKeys("Good"); 
			 		 
			
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale tablet"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement tyr = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 tyr.click();
			 tyr.sendKeys("Goa"); 
			 tyr.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement rek1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 rek1.click();
			 rek1.sendKeys("Baga"); 
			 rek1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement yr3 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			yr3. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement mirt11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 mirt11. sendKeys("2000");
		
			 
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
			 WebElement hu3 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 hu3.click();

			 
	
	


				// 1. mobiles and tablets:	
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Mobiles & Tablets'])[1]")).click(); 
			 
	    //  wearables : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Wearables'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("wearable"); 
				 
		
			
			/*
			 
			 //insurance : 
			             
				 Thread.sleep(1000);
				 WebElement title1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Insurance']")); 
				 title1.click();
				 title1.sendKeys("Comprehensive Insurance");
				 title.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	 
			 
	        // select Types				 
				 
			 Thread.sleep(1000);
			
			 WebElement dropDown = driver.findElement(By.xpath("//div[@id='mui-component-select-Types']"));
		     dropDown.click(); 
			// dropDown.sendKeys();
			 //dropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			// WebElement  dropDown1 = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
			 Select dropDown1 =  new Select(driver.findElement(By.xpath("//ul[@aria-labelledby='outlined-adornment-select']")));
			 dropDown1.selectByIndex(2); 
			 title1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			       
			  // Select Brand			 

			 Thread.sleep(1000);
			 WebElement brand = driver.findElement(By.xpath("//div[@id='mui-component-select-Brand']"));
		
			 //brand.sendKeys("Bajaj");
			 //dropDown1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			Select s1 = new Select(brand); 
			s1.selectByIndex(2);
			
			 
			 //brand.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
		/*
			
			   //Brands : 
			             
				 Thread.sleep(1000);
				 WebElement titler1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Brands']")); 
				 titler1.click();
				 titler1.sendKeys("Samsung");
				 titler1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			 	*/
			
			 
	    //  Enter werable type : 
			 
			// Thread.sleep(1000);
			 // driver.findElement(By.xpath("//div[@id='mui-component-select-Wearable Type']")).click();
			 
			 
		   //  Enter brandname : 
					 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Brand Name']")).sendKeys("Samsung"); 
					 		
				
			
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale smart watch"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement ty1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 ty1.click();
			 ty1.sendKeys("Goa"); 
			 ty1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement rrek1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 rrek1.click();
			 rrek1.sendKeys("Baga"); 
			 rrek1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement a1r1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			a1r1. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement minrt11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 minrt11. sendKeys("2000");
		
			 
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
			 WebElement hu1 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 hu1.click();

			 
			 
			 
	}
}
