package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerElectronic {

	
	
static WebDriver driver;
	
	@Test
	
	public void sellerElectronics () throws InterruptedException
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
		
			 
			 
			 
			 
			 

				// 1.Electronics and Appliances : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	    //  home appliance : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home Appliance'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titlee11 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  titlee11.sendKeys("Home appliance"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale fridge"); 
			 
		 		
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

			 
			 
	 

				// 1.Electronics and Appliances : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	    // lapotp appliance : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Laptop & Accessories'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titleel1 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  titleel1.sendKeys("laptop appliance"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale laptop"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement rge1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 rge1.click();
			 rge1.sendKeys("Goa"); 
			 rge1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement j=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 j.click();
			 j.sendKeys("Baga"); 
			 j.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement gfc =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			gfc. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement cd =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 cd. sendKeys("2000");
		
			 
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
			 WebElement fd =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 fd.click();

			 
	

				// 3.Electronics and Appliances : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	      //kitchen  appliance : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Kitchen Appliances'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement lop = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  lop.sendKeys("kitchen appliance"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale knife"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement n = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 n.click();
			 n.sendKeys("Goa"); 
			 n.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement rt=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 rt.click();
			 rt.sendKeys("Baga"); 
			 rt.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement hg =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			hg. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement ds =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 ds. sendKeys("2000");
		
			 
			 /*
			 hg
			 
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
			 WebElement gf =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 gf.click();

			 
			 
			 
			 
			 

				// 4.Audio, Video & Gaming : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	    //  Audio, Video & Gaming
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Audio, Video & Gaming'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement ko = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  ko.sendKeys("video game appliance"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale video game "); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement y = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 y.click();
			 y.sendKeys("Goa"); 
			 y.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement yu=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 yu.click();
			 yu.sendKeys("Baga"); 
			 yu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement ui =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			ui. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement uio =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 uio. sendKeys("2000");
		
			 
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
			 WebElement gt =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 gt.click();

			 
			 
			 

				// 6.Camera Accessories: 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	    // Camera Accessories: 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Camera Accessories'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement gfd = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  gfd.sendKeys("Camera Accessories"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale camera"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement dfg = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 dfg.click();
			 dfg.sendKeys("Goa"); 
			 dfg.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement dr=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 dr.click();
			 dr.sendKeys("Baga"); 
			 dr.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement fds =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			fds. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement xa =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 xa. sendKeys("2000");
		
			 
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
			 WebElement dse =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 dse.click();

			 

				// 1.Other Device : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Electronic & Appliances'])[1]")).click(); 
			 
	    //  Other Device : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Other Device'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement rty = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	     	  rty.sendKeys("Other Device"); 
			 
	     	  
	     	       	  
	     	  
	     	  
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
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement ret = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 ret.click();
			 ret.sendKeys("Goa"); 
			 ret.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement fghj=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 fghj.click();
			 fghj.sendKeys("Baga"); 
			 fghj.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement swr =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			swr. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement swe =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 swe. sendKeys("2000");
		
			 
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
			 WebElement swer =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 swer.click();

			 
			 
	
	
	
	
	
	
	
			 
	}
}
