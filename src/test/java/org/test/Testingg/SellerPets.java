package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellerPets {

	
static WebDriver driver;
	
	@Test
	
	public void SellerPets () throws InterruptedException
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
	
		 
		 
		 
//1. dogs:
		  
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
		
		 
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Dogs'])[1]")).click();
		
		 	
		 // select title 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
		 
		  // description : 
		 
		 	  	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale dogs"); 
		  
				 
		 
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
		WebElement areaserho =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		areaserho. sendKeys("Bus stop");
			
		
		
		//  price range : 

		 Thread.sleep(1000);		  
		 WebElement maxPriceserho =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 maxPriceserho. sendKeys("3000");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement applyserho =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 applyserho.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement homeserho =  driver.findElement(By.xpath("//div[@class='home']"));
		 homeserho.click();

		 
		 
		 
		 
		 
//2. cats:
		  
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
		
		 
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Cats'])[1]")).click();
		
		 	
		 // select title 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
		 
		  // description : 
		 
		 	  	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale cats"); 
		  
				 
		 
	       //Select state
		 Thread.sleep(1000);
		 WebElement kiop = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 kiop.click();
		 kiop.sendKeys("Goa"); 
		 kiop.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement gty =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 gty.click();
		 gty.sendKeys("Baga"); 
		 gty.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement cdr =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		cdr. sendKeys("Bus stop");
			
		
		
		//  price range : 

		 Thread.sleep(1000);		  
		 WebElement casi =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 casi. sendKeys("3000");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement cdry =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 cdry.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement cdert =  driver.findElement(By.xpath("//div[@class='home']"));
		 cdert.click();

		 
		 
		 
		 
//3. Small Pets:
		  
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
		
		 
			
	     Thread.sleep(1000);
		 driver.findElement(By.xpath("(//p[text()='Small Pets'])[1]")).click();
		
		 	
		 // select title 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
		 
		  // description : 
		 
		 	  	 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale small pets"); 
		  
				 
		 
	       //Select state
		 Thread.sleep(1000);
		 WebElement lopjiu = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 lopjiu.click();
		 lopjiu.sendKeys("Goa"); 
		 lopjiu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement gty1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 gty1.click();
		 gty1.sendKeys("Baga"); 
		 gty1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement cdr1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
		cdr1. sendKeys("Bus stop");
			
		
		
		//  price range : 

		 Thread.sleep(1000);		  
		 WebElement casi1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
		 casi1. sendKeys("3000");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement cdry1 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 cdry1.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement cdert1 =  driver.findElement(By.xpath("//div[@class='home']"));
		 cdert1.click();


		 	 
		 
		//3.  horse:
				  
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
				
				 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Horse'])[1]")).click();
				
				 	
				 // select title 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
				 
				  // description : 
				 
				 	  	 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale horse"); 
				  
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement lopjiu1 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 lopjiu1.click();
				 lopjiu1.sendKeys("Goa"); 
				 lopjiu1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement gty11 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 gty11.click();
				 gty11.sendKeys("Baga"); 
				 gty11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement cdr11 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				cdr11. sendKeys("Bus stop");
					
				
				
				//  price range : 

				 Thread.sleep(1000);		  
				 WebElement casi11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 casi11. sendKeys("3000");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement cdry11 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 cdry11.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement cdert11 =  driver.findElement(By.xpath("//div[@class='home']"));
				 cdert11.click();


				 
			 	 
		 
			//4.  Ornamental Fish :
					  
						
				     Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
					
					 
						
				     Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Ornamental Fish'])[1]")).click();
					
					 	
					 // select title 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
					 
					  // description : 
					 
					 	  	 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Ornamental Fish"); 
					  
							 
					 
				       //Select state
					 Thread.sleep(1000);
					 WebElement lopjiu11 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 lopjiu11.click();
					 lopjiu11.sendKeys("Goa"); 
					 lopjiu11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement gty111 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 gty111.click();
					 gty111.sendKeys("Baga"); 
					 gty111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement cdr111 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					cdr111. sendKeys("Bus stop");
						
					
					
					//  price range : 

					 Thread.sleep(1000);		  
					 WebElement casi111 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
					 casi111. sendKeys("3000");
					 
					 
				     // Apply
					 
					 Thread.sleep(1000);		  
					 WebElement cdry111 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
					 cdry111.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement cdert111 =  driver.findElement(By.xpath("//div[@class='home']"));
					 cdert111.click();

	 
	 	 
 

			  //4. Pets Food & Accessories :
				  
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
				
				 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets Food & Accessories")).click();
				
				 	
				 // select title 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
				 
				  // description : 
				 
				 	  	 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Pets Food & Accessories"); 
				  
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement l90 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 l90.click();
				 l90.sendKeys("Goa"); 
				 l90.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement ji8 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 ji8.click();
				 ji8.sendKeys("Baga"); 
				 ji8.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement hy7 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				hy7. sendKeys("Bus stop");
					
				
				
				//  price range : 

				 Thread.sleep(1000);		  
				 WebElement gt6 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 gt6. sendKeys("3000");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement hu7 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 hu7.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement jio9 =  driver.findElement(By.xpath("//div[@class='home']"));
				 jio9.click();

 
 
			 

			  //4.  Pets Food & Accessories
				  
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
				
				 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets Food & Accessories'])[1]")).click();
				
				 	
				 // select title 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
				 
				  // description : 
				 
				 	  	 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to salePets Food & Accessories"); 
				  
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement l901 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 l901.click();
				 l901.sendKeys("Goa"); 
				 l901.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement ji81 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 ji81.click();
				 ji81.sendKeys("Baga"); 
				 ji81.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement hy71 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				hy71. sendKeys("Bus stop");
					
				
				
				//  price range : 

				 Thread.sleep(1000);		  
				 WebElement gt61 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 gt61. sendKeys("3000");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement hu71 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 hu71.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement jio91 =  driver.findElement(By.xpath("//div[@class='home']"));
				 jio91.click();

 
			 

			  //4. Farm Animals & Birds:
				  
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
				
				 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Farm Animals & Birds'])[1]")).click();
				
				 	
				 // select title 
				 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
				 
				  // description : 
				 
				 	  	 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale in Pets Farm Animals & Birds"); 
				  
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement kiop8 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 kiop8.click();
				 kiop8.sendKeys("Goa"); 
				 kiop8.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement ji811 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 ji811.click();
				 ji811.sendKeys("Baga"); 
				 ji811.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement hy711 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
				hy711. sendKeys("Bus stop");
					
				
				
				//  price range : 

				 Thread.sleep(1000);		  
				 WebElement gt611 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
				 gt611. sendKeys("3000");
				 
				 
			     // Apply 
				 
				 Thread.sleep(1000);		  
				 WebElement hu711 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 hu711.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement jio911 =  driver.findElement(By.xpath("//div[@class='home']"));
				 jio911.click();

  
			 
	
				 


				  //4. Farm Animals & Birds:
					  
						
				     Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Pets & Pets care'])[1]")).click();
					
					 
						
				     Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Other Pets'])[1]")).click();
					
					 	
					 // select title 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter title']")).click(); 
					 
					  // description : 
					 
					 	  	 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale in  Other Pets"); 
					  
							 
					 
				       //Select state
					 Thread.sleep(1000);
					 WebElement iopu = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 iopu.click();
					 iopu.sendKeys("Goa"); 
					 iopu.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement opilk =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 opilk.click();
					 opilk.sendKeys("Baga"); 
					 opilk.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement lopyu =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					lopyu. sendKeys("Bus stop");
						
					
					
					//  price range : 

					 Thread.sleep(1000);		  
					 WebElement lopyu1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
					 lopyu1. sendKeys("3000");
					 
					 
				     // Apply 
					 
					 Thread.sleep(1000);		  
					 WebElement iouy =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
					 iouy.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement jiuo =  driver.findElement(By.xpath("//div[@class='home']"));
					 jiuo.click();

	  
				 
				 
				 
				 
				 
				 
				 
}
}