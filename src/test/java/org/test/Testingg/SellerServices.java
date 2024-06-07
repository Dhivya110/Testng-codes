package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SellerServices {

	
	
static WebDriver driver;
	
	@Test
	
	public void sellerServices() throws InterruptedException
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
		
			 
			 
	 
			 
			 

				// 1.services : 
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
			 
	    //   
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Home & other Services'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Home Services"); 
			 
	     	  
	     	       	  
	     	  
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
	
	 
	 
	 
	
	 
	 
	 
	 
	
		// 2.Financial Services : 
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Financial Services : 
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Financial Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Financial Services");  
	 
	 
	// type
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//label[@for='type-Loan']")).click();
		 
		 
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale finance"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement err = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 err.click();
	 err.sendKeys("Goa"); 
	 err.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement errr=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 errr.click();
	 errr.sendKeys("Baga"); 
	 errr.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement dfg =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	dfg. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement wed =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 wed. sendKeys("2000");
	
	 
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
	 WebElement wert =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 wert.click();
	
	 
	 
	 
	 
	 
	
		//3.Event Services
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	// Event Services: 
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Event Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Event Services"); 
	  
	  
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Event Services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement gy = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 gy.click();
	 gy.sendKeys("Goa"); 
	 gy.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement frt=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 frt.click();
	 frt.sendKeys("Baga"); 
	 frt.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement dert =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	dert. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement xd =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 xd. sendKeys("2000");
	
	 
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
	 WebElement nj =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 nj.click();
	
	 
	 
	 
	 
	 
	
		// 4.Commercial Services
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Commercial Services
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Commercial Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	 WebElement comm = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	  comm.sendKeys("Commercial Services"); 
	 
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale industry Services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement fr = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 fr.click();
	 fr.sendKeys("Goa"); 
	 fr.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement ftyd=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 ftyd.click();
	 ftyd.sendKeys("Baga"); 
	 ftyd.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement hyu =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	hyu. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement poiu =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 poiu. sendKeys("2000");
	
	 
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
	 WebElement frty =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 frty.click();
	
	
	 
	 
	
		// 5.Travel Services : 
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Travel Services
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Travel Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Enter title']")). sendKeys("Travel Services"); 
	  
	 
	 
		// type 
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Type-Tours & Travels']")). click();
		  
	
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Travel Services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement kiop = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 kiop.click();
	 kiop.sendKeys("Goa"); 
	 kiop.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement gty=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 gty.click();
	 gty.sendKeys("Baga"); 
	 gty.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement mrtu =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	mrtu. sendKeys("Bus stop");
	 
	
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
	 WebElement mki =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 mki.click();
	
	 
	
	 
	 
	 
	
		// 1.Healthcare Services : 
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Healthcare Services
		 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Healthcare Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Healthcare Services"); 
	 
	   
	 
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Healthcare Services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement lopiu = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 lopiu.click();
	 lopiu.sendKeys("Goa"); 
	 lopiu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement bhym=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 bhym.click();
	 bhym.sendKeys("Baga"); 
	 bhym.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement rythn =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	rythn. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement mythre =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 mythre. sendKeys("2000");
	
	 
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
	 WebElement kiouy =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 kiouy.click();
	
	
	 
	 
	
		// 7. Security, Legal & Agent Services
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Security, Legal & Agent Services
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Security, Legal & Agent Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	 WebElement vg = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
	  vg.sendKeys("Security, Legal & Agent Services"); 
	 
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Security services");
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement opib = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 opib.click();
	 opib.sendKeys("Goa"); 
	 opib.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement ci=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 ci.click();
	 ci.sendKeys("Baga"); 
	 ci.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement si =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	si. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement bi =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 bi. sendKeys("2000");
	
	 
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
	 WebElement cdf =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 cdf.click();
	
	
	 
	 
	 
	 
	
		//  8. Skill Training & Hobbies: 
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Skill Training & Hobbies
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Skill Training & Hobbies'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Skill Training"); 
	  
	  
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Skill Training"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement huipf = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 huipf.click();
	 huipf.sendKeys("Goa"); 
	 huipf.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement jji=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 jji.click();
	 jji.sendKeys("Baga"); 
	 jji.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement vbn =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	vbn. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement mnb =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 mnb. sendKeys("2000");
	
	 
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
	 WebElement frtu =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 frtu.click();
	

	 
	
	 
		// 9. Rental Services
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Rental Services
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Rental Services'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Rental Services");  
	
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Rental Services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement des = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 des.click();
	 des.sendKeys("Goa"); 
	 des.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement drre=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 drre.click();
	 drre.sendKeys("Baga"); 
	 drre.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement keh =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	keh. sendKeys("Bus stop");
	 
	
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
	 WebElement ser =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 ser.click();
	
	
	 
		// 11 .Education Classes
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click();

	 
	//  Education Classes:
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Education Classes'])[1]")).click(); 
	 
	// title : 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Education Classes"); 
	 
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Education Classes"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement edy = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 edy.click();
	 edy.sendKeys("Goa"); 
	 edy.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement liu=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 liu.click();
	 liu.sendKeys("Baga"); 
	 liu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement nhui =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	nhui. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement where =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 where. sendKeys("2000");
	
	 
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
	 WebElement eruyt =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 eruyt.click();
	
	 
	 
	 
	 
	
		// 1.Drivers & Taxi 
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Drivers & Taxi:
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Drivers & Taxi'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Drivers & Taxi");  
	  
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale taxi services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement kl = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 kl.click();
	 kl.sendKeys("Goa"); 
	 kl.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement kfc=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 kfc.click();
	 kfc.sendKeys("Baga"); 
	 kfc.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement derti =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	derti. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement playu =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 playu. sendKeys("2000");
	
	 
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
	 WebElement njik =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 njik.click();
																																			 
	
																																		 

		// 1.Beauty
	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
	 
	//  Beauty
	 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//p[text()='Beauty'])[1]")).click(); 
	 
	// title
	 Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Beauty");  
	  
	  
	       	  
	  
	  
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
	 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Beauty services"); 
	 
		
	   //Select state
	 Thread.sleep(1000);
	 WebElement mk = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 mk.click();
	 mk.sendKeys("Goa"); 
	 mk.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement kfc1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 kfc1.click();
	 kfc1.sendKeys("Baga"); 
	 kfc1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement derti1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
	derti1. sendKeys("Bus stop");
	 
	
	// Price
	 
	 Thread.sleep(1000);		  
	 WebElement playu1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
	 playu1. sendKeys("2000");
	
	 
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
	 WebElement njik1 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	 njik1.click();
																																										 
		
		
		
	 
	// 10. Musical Instruments
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
		 
		//  music instruments:
		 
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Musical Instruments'])[1]")).click(); 
		 
		// title
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Guitar");  
		  
		  
		       	  
		  
		  
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
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Musical Instruments"); 
		 
			
		   //Select state
		 Thread.sleep(1000);
		 WebElement nji = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 nji.click();
		 nji.sendKeys("Goa"); 
		 nji.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement kfc11=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 kfc11.click();
		 kfc11.sendKeys("Baga"); 
		 kfc11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement derti11 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		derti11. sendKeys("Bus stop");
		 
		
		// Price
		 
		 Thread.sleep(1000);		  
		 WebElement playu11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 playu11. sendKeys("2000");
		
		 
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
		 WebElement njik11 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		 njik11.click();
																																											 
			
		 
		 
		// 1.Beauty
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
		 
		//  Beauty
		 
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Food'])[1]")).click(); 
		 
		// title
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Food");  
		  
		  
		       	  
		  
		  
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
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale catering services"); 
		 
			
		   //Select state
		 Thread.sleep(1000);
		 WebElement mk1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 mk1.click();
		 mk1.sendKeys("Goa"); 
		 mk1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement mkuuy=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 mkuuy.click();
		 mkuuy.sendKeys("Baga"); 
		 mkuuy.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement eric =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		eric. sendKeys("Bus stop");
		 
		
		// Price
		 
		 Thread.sleep(1000);		  
		 WebElement lopin =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 lopin. sendKeys("2000");
		
		 
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
		 WebElement derick =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		 derick.click();
																																											 
			
		 
		// 1 NRI Services;
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
		 
		//  Beauty
		 
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='NRI Services'])[1]")).click(); 
		 
		// title
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("NRI Services");  
		  
		  
		  
		// location
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("Canada");  
  
  
		// types of services
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter Types Of Services']")).sendKeys("job");  
				  
				  
		// Enter Language Known
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter Language Known']")).sendKeys("english");  
					  
		  
		  
		  
		  
		  
		  
		  
		  
		       	  
		  
		  
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
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale NRI  services"); 
		 
			
		   //Select state
		 Thread.sleep(1000);
		 WebElement jui = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 jui.click();
		 jui.sendKeys("Goa"); 
		 jui.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement koiphg=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 koiphg.click();
		 koiphg.sendKeys("Baga"); 
		 koiphg.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement gopi =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		gopi. sendKeys("Bus stop");
		 
		
		// Price
		 
		 Thread.sleep(1000);		  
		 WebElement turm =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 turm. sendKeys("2000");
		
		 
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
		 WebElement want =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		 want.click();
																																											 
			
		 
		 
		 
		 
		 
		// 1. Abroad Services
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Services'])[1]")).click(); 
		 
		//  Abroad Services;
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Abroad Services'])[1]")).click(); 
		 
		// title
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter title']")).sendKeys("Abroad Services");  
		  
		  
		  		  
			// location
	          Thread.sleep(1000);
	          driver.findElement(By.xpath("//input[@placeholder='Enter Location']")).sendKeys("Canada");  
	  
	  
			// types of services
			 Thread.sleep(1000);
			  driver.findElement(By.xpath("//input[@placeholder='Enter Types of services']")).sendKeys("job");  
					  
					  
			// Enter Language Known
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Language Known']")).sendKeys("english");  
						  
		  
		  
		  
		  
		  
		  
		  
		  
		       	  
		  
		  
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
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Abroad Services"); 
		 
			
		   //Select state
		 Thread.sleep(1000);
		 WebElement servuu = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 servuu.click();
		 servuu.sendKeys("Goa"); 
		 servuu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement why=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 why.click();
		 why.sendKeys("Baga"); 
		 why.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement derti1ki =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		derti1ki. sendKeys("Bus stop");
		 
		
		// Price
		 
		 Thread.sleep(1000);		  
		 WebElement ptiya =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 ptiya. sendKeys("2000");
		
		 
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
		 WebElement nhuyj =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		 nhuyj.click();
																																											 
			
	 
	 
	}
}