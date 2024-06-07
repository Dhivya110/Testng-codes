package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Service {

	
static WebDriver driver;
	
	@Test
	
	public void service() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
// 1. home & service:
			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Home & other Services'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobserho = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobserho.click();
			 mobserho.sendKeys("Goa"); 
			 mobserho.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobserho1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobserho1.click();
			 mobserho1.sendKeys("Baga"); 
			 mobserho1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaserho =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaserho. sendKeys("Bus stop");
						 

			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceserho =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPriceserho. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPriceserho =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPriceserho. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyserho =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyserho.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeserho =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeserho.click();

			 
		//	 3.1 financial service:

			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Financial Services'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobaccf = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobaccf.click();
			 mobaccf.sendKeys("Goa"); 
			 mobaccf.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobaccf1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobaccf1.click();
			 mobaccf1.sendKeys("Baga"); 
			 mobaccf1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaaccf =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaaccf. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricemof =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricemof. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricemof =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricemof. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applymof=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applymof.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homemof =  driver.findElement(By.xpath("//div[@class='home']"));
			 homemof.click();
 
 
			 
	// 3.2  Event service: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Event Services'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobtabe = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobtabe.click();
			 mobtabe.sendKeys("Goa"); 
			 mobtabe.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobtabe1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobtabe1.click();
			 mobtabe1.sendKeys("Baga"); 
			 mobtabe1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areatabe =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areatabe. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricetabe =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricetabe. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricetabe =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricetabe. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applytabe=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applytabe.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement hometabe =  driver.findElement(By.xpath("//div[@class='home']"));
			 hometabe.click();
 
			 
			 
			 
		// 3.3  commercial: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Services']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Commercial Services'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobwearc = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobwearc.click();
				 mobwearc.sendKeys("Gujarat"); 
				 mobwearc.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobwearc1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobwearc1.click();
				 mobwearc1.sendKeys("Agol"); 
				 mobwearc1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areawearc =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areawearc. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricewearc =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricewearc. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricewearc =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricewearc. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applywearc=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applywearc.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homewearc =  driver.findElement(By.xpath("//div[@class='home']"));
				 homewearc.click();
	 
						 
			 
				 
				// 3.4 travel: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Services']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Travel Services'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobwearcc = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobwearcc.click();
				 mobwearcc.sendKeys("Gujarat"); 
				 mobwearcc.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobwearcc1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobwearcc1.click();
				 mobwearcc1.sendKeys("Agol"); 
				 mobwearcc1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areawearcc =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areawearcc. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricewearcc =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricewearcc. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricewearcc =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricewearcc. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applywearcc=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applywearcc.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homewearcc =  driver.findElement(By.xpath("//div[@class='home']"));
				 homewearcc.click();
	 
			
						 
				 
				// 3.5 healthcare service: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Services']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Healthcare Services'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobwearh = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobwearh.click();
				 mobwearh.sendKeys("Gujarat"); 
				 mobwearh.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobwearh1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobwearh1.click();
				 mobwearh1.sendKeys("Agol"); 
				 mobwearh1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areawearh =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areawearh. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricewearh =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricewearh. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricewearh =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricewearh. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applywearh=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applywearh.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homewearh =  driver.findElement(By.xpath("//div[@class='home']"));
				 homewearh.click();
	 
						 
				 
		 
		 
			// 3.6 security: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Security, Legal & Agent Services'])[1]")).click(); 
					 
			 
		      //Select state
			 Thread.sleep(1000);
			 WebElement mobwearse = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobwearse.click();
			 mobwearse.sendKeys("Gujarat"); 
			 mobwearse.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobwearse1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobwearse1.click();
			 mobwearse1.sendKeys("Agol"); 
			 mobwearse1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areawearse =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areawearse. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricewearse =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricewearse. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricewearse =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricewearse. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applywearse=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applywearse.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homewearse =  driver.findElement(By.xpath("//div[@class='home']"));
			 homewearse.click();
 
					 
					 
				 
			 

			// 3.7 training: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Skill Training & Hobbies'])[1]")).click(); 
					 
			 
		      //Select state
			 Thread.sleep(1000);
			 WebElement mobweart = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobweart.click();
			 mobweart.sendKeys("Gujarat"); 
			 mobweart.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobweart1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobweart1.click();
			 mobweart1.sendKeys("Agol"); 
			 mobweart1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaweart =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaweart. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceweart =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPriceweart. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPriceweart =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPriceweart. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyweart=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyweart.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeweart =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeweart.click();
 
					 
			 

				// 3.8 rental services: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Services']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Rental Services'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobrent = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobrent.click();
				 mobrent.sendKeys("Gujarat"); 
				 mobrent.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobrent1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobrent1.click();
				 mobrent1.sendKeys("Agol"); 
				 mobrent1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement arearent =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				arearent. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricerent =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricerent. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricerent =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricerent. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applyrent=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applyrent.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement horent =  driver.findElement(By.xpath("//div[@class='home']"));
				 horent.click();
	 
									 
							 

			// 3.9 education class: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Education Classes'])[1]")).click(); 
					 
			 
		      //Select state
			 Thread.sleep(1000);
			 WebElement mobweared = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobweared.click();
			 mobweared.sendKeys("Gujarat"); 
			 mobweared.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobwearred11 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobwearred11.click();
			 mobwearred11.sendKeys("Agol"); 
			 mobwearred11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaweared =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaweared. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceweared =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPriceweared. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPriceweared =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPriceweared. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyweared=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyweared.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeweared =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeweared.click();
 
					 

		// 3.10 drivers and taxi: 		 
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Services']")).click();
		
		 					
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='Drivers & Taxi'])[1]")).click(); 
				 
		 
	      //Select state
		 Thread.sleep(1000);
		 WebElement mobweardri = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 mobweardri.click();
		 mobweardri.sendKeys("Gujarat"); 
		 mobweardri.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement mobweardri1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 mobweardri1.click();
		 mobweardri1.sendKeys("Agol"); 
		 mobweardri1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement areaweardri =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		areaweardri. sendKeys("Bus stop");
					 
		 
		 			 
		//Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPriceweardri =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPriceweardri. sendKeys("200");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPriceweardri =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPriceweardri. sendKeys("300");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement applyweardri=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 applyweardri.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement homeweardri =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeweardri.click();
 
					 						 
				 

			// 3.11 beauty: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Beauty'])[1]")).click(); 
					 
			 
		      //Select state
			 Thread.sleep(1000);
			 WebElement mobwearbe = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobwearbe.click();
			 mobwearbe.sendKeys("Gujarat"); 
			 mobwearbe.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobwearbe11 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobwearbe11.click();
			 mobwearbe11.sendKeys("Agol"); 
			 mobwearbe11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areawearbe1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areawearbe1. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricewear1 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricewear1. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricewear1 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricewear1. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applybe=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applybe.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homebe =  driver.findElement(By.xpath("//div[@class='home']"));
			 homebe.click();
	 
						 						 
		
			 

				// 3.11 music instrument: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Services']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Musical Instruments'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobins = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobins.click();
				 mobins.sendKeys("Gujarat"); 
				 mobins.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobins1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobins1.click();
				 mobins1.sendKeys("Agol"); 
				 mobins1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areains =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areains. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPriceins =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPriceins. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPriceins =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPriceins. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applywearins=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applywearins.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homewearins =  driver.findElement(By.xpath("//div[@class='home']"));
				 homewearins.click();
		 
							 					 
			 
			 

			// 3.13  foods: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Services']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Food'])[1]")).click(); 
					 
			 
		      //Select state
			 Thread.sleep(1000);
			 WebElement mobfo = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobfo.click();
			 mobfo.sendKeys("Gujarat"); 
			 mobfo.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobfo1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobfo1 .click();
			 mobfo1 .sendKeys("Agol"); 
			 mobfo1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areawearfo1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areawearfo1. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricefo =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricefo. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricefo =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricefo. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyfo=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyfo.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homefo =  driver.findElement(By.xpath("//div[@class='home']"));
			 homefo.click();
	 
								 				
			 
				 
	}
}
	
	
	
	

