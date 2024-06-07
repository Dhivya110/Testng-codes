package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerProperty {

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
		
			 
			 
			 
			 
			 

				// 1. properties:	
		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Properties'])[1]")).click(); 
			 
	    // sale 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='For Sale: Houses & Apartments'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titlee11 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
			 titlee11.click();
			 titlee11.sendKeys("house"); 
			 titlee11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
			
		*/
			
			
			
			
			 
	    //  Enter type : 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Type-Residential']")).click(); 
			 
			 
			 
		   //  Enter bedrooms : 
					 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Bedrooms-2']")).click(); 
					 		
			 
					 
			  //  Enter bathrooms : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Bathrooms-2']")).click(); 
			 		 
			 
			 //  Enter furnishing : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Furnishing-Semi-Furnished']")).click(); 
			 		 
			 //  Enter construction : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Construction Status-Ready to Move']")).click(); 
			
			 /*
			 
			 //  Enter listedby : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='mui-component-select-Listed by']")).click(); 
			 
			 
			 */
			 		 
			 
			 //  Enter builtup area : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Builtup area (ft²)']")).sendKeys("1700sqft"); 
			 		 
			 

			 //  Enter carpet area : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Carpet Area (ft²)']")).sendKeys("1100sqft"); 
			 		 
			 

			 //  Enter  maintenance : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Maintenance (Month)']")).sendKeys("2000"); 
			 		 
			 

			 //  Enter total floor : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Total Floors']")).sendKeys("3"); 
			 		 
			 	 
			 

			 //  Enter no of floor : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Floor No']")).sendKeys("2"); 
			 		 
			 

			 //  Enter  car parkinge : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Car Parking-1']")).click(); 
			 		 
			 
			 
			 

			 //  Enter  project name : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("properties"); 
			 		 
			 
			 	 
		
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale mobile"); 
			 
		 		
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

			 
	 
	 
	 
		 
		 
			 
			// 1. properties:	
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Properties'])[1]")).click(); 
			 
	    // rent: 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='For Rent: Houses & Apartments'])[1]")).click(); 
			 
	        // title
			 Thread.sleep(1000);
			 WebElement titlee111 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
			 titlee111.click();
			 titlee111.sendKeys("house"); 
			 titlee111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
			
		*/
			
			
			
			
			 
	    //  Enter type : 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Type-Apartments']")).click(); 
			 
			 
			 
		   //  Enter bedrooms : 
					 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Bedrooms-2']")).click(); 
					 		
			 
					 
			  //  Enter bathrooms : 
								 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Bathrooms-2']")).click(); 
			 		 
			 
			 //  Enter furnishing : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Furnishing-Semi-Furnished']")).click(); 
			 		 
			 //  Enter construction : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Construction Status-Ready to Move']")).click(); 
			
			 /*
			 
			 //  Enter listedby : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//div[@id='mui-component-select-Listed by']")).click(); 
			 
			 
			 */
			 		 
			 
			 //  Enter builtup area : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Builtup area (ft²)']")).sendKeys("1700sqft"); 
			 		 
			 

			 //  Enter carpet area : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Carpet Area (ft²)']")).sendKeys("1100sqft"); 
			 		 
			 

			 //  Enter  maintenance : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Maintenance(Monthly)']")).sendKeys("2000"); 
			 		 
			 

			 //  Enter total floor : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Total Floors']")).sendKeys("3"); 
			 		 
			 	 
			 

			 //  Enter no of floor : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Floor No']")).sendKeys("2"); 
			 		 
			 

			 //  Enter  car parking : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Car Parking-1']")).click(); 
			 		 
			 
			 
			 

			 //  Enter  project name : 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("properties"); 
			 		 
			 
			 	 
		
									 
	    //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale car"); 
			 
		 		
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
			WebElement areaserho11211 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			areaserho11211. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricert1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 minPricert1. sendKeys("2000");
		
			 
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
			 WebElement homeserho11211 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 homeserho11211.click();

			 
	 
		 
			 
			 
				// 1. properties:	
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Properties'])[1]")).click(); 
				 
		    //plots and lands: 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Plots & Lands'])[1]")).click(); 
				 
		        // title
				 Thread.sleep(1000);
				 WebElement tit1111 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
				 tit1111.click();
				 tit1111.sendKeys("lands"); 
				 tit1111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
				
			*/
				
				
				
				
				 
		    //  Enter type : 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for='Type-1st Sale']")).click(); 
				 
				 
				 
			   // listed by: 
						 

				// Thread.sleep(1000);
				// driver.findElement(By.xpath("//label[@for='Listed by-Owner']")).click(); 
						 		
				 
					
				 		 
				 
				 //  Enter plot area : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Plot Area ']")).sendKeys("1700sqft"); 
				 		 
				 

				 //  Enter length : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Length']")).sendKeys("1100cm"); 
				 		 
				 

				 //  Enter  breadth : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Breadth']")).sendKeys("2000cm"); 
				 		 
				
				 

				 //  Enter  project name : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("properties"); 
				 		 
				 
				
										 
		    //  description :
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale land"); 
				 
			 		
			       //Select state
				 Thread.sleep(1000);
				 WebElement l = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 l.click();
				 l.sendKeys("Goa"); 
				 l.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement re1111=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 re1111.click();
				 re1111.sendKeys("Baga"); 
				 re1111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areaseho112111 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				areaseho112111. sendKeys("Bus stop");
							 

				// Price
				 
				 Thread.sleep(1000);		  
				 WebElement minricert11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 minricert11. sendKeys("2000");
			
				 
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
				 WebElement jj =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
				 jj.click();

			 
			 
				 
				 
				 
				// 1. properties:	
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Properties'])[1]")).click(); 
				 
		    // commercial building:
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Commercial Buildings'])[1]")).click(); 
				 
		        // title
				 Thread.sleep(1000);
				 WebElement oi = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
				 oi.click();
				 oi.sendKeys("Building"); 
				 oi.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
				
			*/
				
				
				
				
				 
		    //  Enter type : 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for='Type-Sale']")).click(); 
				 
				 
				 
		   // listed by: 
							 

			// Thread.sleep(1000);
			// driver.findElement(By.xpath("//label[@for='Listed by-Owner']")).click(); 
					 			 
				
				 		 
				 
				 //  Enter builtup area : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Builtup area (ft²)']")).sendKeys("1700sqft"); 
				 		 
				 

				 //  Enter carpet area : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter  Carpet Area (ft²)']")).sendKeys("1100sqft"); 
				 		 
				 

				 //  Enter  maintenance : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Maintenance(Monthly)']")).sendKeys("2000"); 
				 		 
				

				 //  Enter  car parkinge : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for=' Car Parking-1']")).click(); 
				 		 
				
				 // washroom :
				 


				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for='Washrooms-2']")).click(); 
				 		 
				 
				 
				 

				 //  Enter  project name : 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("properties"); 
				 		 
				 
				 	 
			
										 
		    //  description :
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale car"); 
				 
			 		
			       //Select state
				 Thread.sleep(1000);
				 WebElement re1o = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 re1o.click();
				 re1o.sendKeys("Goa"); 
				 re1o.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement pu=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 pu.click();
				 pu.sendKeys("Baga"); 
				 pu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement po9 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				po9. sendKeys("Bus stop");
							 

				// Price
				 
				 Thread.sleep(1000);		  
				 WebElement lo =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 lo. sendKeys("2000");
			
				 
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
				 WebElement h =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
				 h.click();

				 
		 
		 
			 
		 
				 
				 
					// 1. properties:	
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Properties'])[1]")).click(); 
					 
			    // others:
					 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Others'])[1]")).click(); 
					 
			        // title
					 Thread.sleep(1000);
					 WebElement oi1 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
					 oi1.click();
					 oi1.sendKeys("hostel"); 
					 oi1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
					
				*/
					
					
					
					
					 
			    //  Enter type : 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//label[@for='Type-Sale']")).click(); 
					 
					 
					 
				   //  Enter furnished : 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//label[@for='Furnishing-Semi-Furnished']")).click(); 
					 
					 
					 
					 
			   // listed by: 
								 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//label[@for='Listed by-Owner']")).click(); 
						 			 
					
									 
					 

					 //  Enter  project name : 
					 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Project Name']")).sendKeys("properties"); 
					 		 
					 
					 	 
				
											 
			    //  description :
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale car"); 
					 
				 		
				       //Select state
					 Thread.sleep(1000);
					 WebElement re1o1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 re1o1.click();
					 re1o1.sendKeys("Goa"); 
					 re1o1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement pu1=  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 pu1.click();
					 pu1.sendKeys("Baga"); 
					 pu1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement po91 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					po91. sendKeys("Bus stop");
								 

					// Price
					 
					 Thread.sleep(1000);		  
					 WebElement lo1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
					 lo1. sendKeys("2000");
				
					 
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
					 WebElement h1 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					 h1.click();

					 
				 
				 
		 
		}

}