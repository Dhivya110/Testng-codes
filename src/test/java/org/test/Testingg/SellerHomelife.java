package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerHomelife {

	
	
static WebDriver driver;
	
	@Test
	
	public void sellerHomelife () throws InterruptedException
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
		
			 
			 
			 
			 
			 

				// 1.Home life styles : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & Lifestyles'])[1]")).click(); 
			 
	    //  furniture and decors : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Furniture & Decors'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titlee11 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  titlee11.sendKeys("Furniture & Decors"); 
			 
	     	  
	     	       	  
	     	  
	     	  
			/*
			  
			 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 ttle1.sendKeys();
				 ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			 */	 
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Furniture & Decors"); 
			 
		 		
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

			 
			 
	

			 

				// 2. Sports, Books & hobbies : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & Lifestyles'])[1]")).click(); 
			 
	    //  Sports, Books & hobbies : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Sports, Books & hobbies'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement kio = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  kio.sendKeys("Furniture & Decors"); 
			 
	     	  
	     	       	  
	     	  
	     	  
			/*
			  
			 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 ttle1.sendKeys();
				 ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			 */	 
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale books"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement hui = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 hui.click();
			 hui.sendKeys("Goa"); 
			 hui.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement kio1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 kio1.click();
			 kio1.sendKeys("Baga"); 
			 kio1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement lop =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			lop. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement mko =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 mko. sendKeys("2000");
		
			 
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
			 WebElement hiui =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 hiui.click();


			 

				// 3.Fashion : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & Lifestyles'])[1]")).click(); 
			 
	    //  Fashion : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Fashion'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement fs = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  fs.sendKeys("Fashion"); 
			 
	     	  
	     	       	  
	     	  
	     	  
			/*
			  
			 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 ttle1.sendKeys();
				 ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			 */	 
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale dress"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement kiop1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 kiop1.click();
			 kiop1.sendKeys("Goa"); 
			 kiop1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement kiopu=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 kiopu.click();
			 kiopu.sendKeys("Baga"); 
			 kiopu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement gyt =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			gyt. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement jui =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 jui. sendKeys("2000");
		
			 
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
			 WebElement iopl =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 iopl.click();


			 
			 

				// 4.Kids Toys: 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & Lifestyles'])[1]")).click(); 
			 
	    //  Kids Toys;
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Kids Toys'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement KidToys1 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  KidToys1.sendKeys("Kids Toys"); 
			 
	     	  
	     	       	  
	     	  
	     	  
			/*
			  
			 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 ttle1.sendKeys();
				 ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			 */	 
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Kids Toys"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement oip = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 oip.click();
			 oip.sendKeys("Goa"); 
			 oip.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement lopi=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 lopi.click();
			 lopi.sendKeys("Baga"); 
			 lopi.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement ftre =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			ftre. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement bhu =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 bhu. sendKeys("2000");
		
			 
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
			 WebElement drew =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 drew.click();


			 

				// 5.Others : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & Lifestyles'])[1]")).click(); 
			 
	    //  Others : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Others'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement kiyt = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  kiyt.sendKeys("Others"); 
			 
	     	  
	     	       	  
	     	  
	     	  
			/*
			  
			 //Select type: 
			             
				 Thread.sleep(1000);
				 WebElement ttle1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Type']")); 
				 ttle1.click();
				 ttle1.sendKeys();
				 ttle1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);  
				
			 */	 
			
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale others"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement nhu = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 nhu.click();
			 nhu.sendKeys("Goa"); 
			 nhu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement tre=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 tre.click();
			 tre.sendKeys("Baga"); 
			 tre.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement yuio =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			yuio. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement dew =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 dew. sendKeys("2000");
		
			 
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
			 WebElement cdr =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 cdr.click();

			 
	
}
}