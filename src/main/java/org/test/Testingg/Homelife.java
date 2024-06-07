package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homelife {

	
static WebDriver driver;
	
	@Test
	
	public void homelife () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
	
	
	
	// 5. Home & LifeStyles:
	
			// home appliances:
					
					Thread.sleep(1000);
					 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
					
					 					
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//a[text()='Furniture & Decors'])[1]")).click(); 
							 
					 
				       //Select state
					 Thread.sleep(1000);
					 WebElement mobelife = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 mobelife.click();
					 mobelife.sendKeys("Tripura"); 
					 mobelife.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement mobelife1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 mobelife1.click();
					 mobelife1.sendKeys("Udaipur"); 
					 mobelife1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement areaelife =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
					areaelife. sendKeys("Bus stop");
								 

					//Min Price
					 
					 Thread.sleep(1000);		  
					 WebElement minPricelife =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
					 minPricelife. sendKeys("200");
					 
					 //Max Price
					 Thread.sleep(1000);		  
					 WebElement maxPricelife =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
					 maxPricelife. sendKeys("300");
					 
					 
				     // Apply
					 
					 Thread.sleep(1000);		  
					 WebElement applylife =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
					 applylife.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement homelife =  driver.findElement(By.xpath("//div[@class='home']"));
					 homelife.click();

					 
		
			//5.1  sports, bikes, hobbies:
				
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Sports, Books & hobbies'])[1]")).click(); 
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement mobsport = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobsport.click();
				 mobsport.sendKeys("Tripura"); 
				 mobsport.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobsport1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobsport1.click();
				 mobsport1.sendKeys("Udaipur"); 
				 mobsport1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areasport =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areasport. sendKeys("Bus stop");
							 

				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricesport =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricesport. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricesport =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricesport. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applysport =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applysport.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homesport =  driver.findElement(By.xpath("//div[@class='home']"));
				 homesport.click();

				 
			
		
				 

			//5.1  fashion:
				
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Fashion'])[1]")).click(); 
						 
				 
			       //Select state
				 Thread.sleep(1000);
				 WebElement mobfash = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobfash.click();
				 mobfash.sendKeys("Tripura"); 
				 mobfash.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobfash1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobfash1.click();
				 mobfash1.sendKeys("Udaipur"); 
				 mobfash1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areafash =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areafash. sendKeys("Bus stop");
							 

				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricefash =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricefash. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricefash =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricefash. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applyfash =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applyfash.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homefash =  driver.findElement(By.xpath("//div[@class='home']"));
				 homefash.click();
				 
				 
				 
				 

		//5.2  kids, toys:
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Kids Toys'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobkids = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobkids.click();
			 mobkids.sendKeys("Tripura"); 
			 mobkids.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobkids1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobkids1.click();
			 mobkids1.sendKeys("Udaipur"); 
			 mobkids1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areakids =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areakids. sendKeys("Bus stop");
						 

			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricekids =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricekids. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricekids =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricekids. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applykids =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applykids.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homekids =  driver.findElement(By.xpath("//div[@class='home']"));
			 homekids.click();
	 
	 	 
	 
			//5.3  others:
				
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Home & Lifestyles'])[1]")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Others'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobothe = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobothe.click();
			 mobothe.sendKeys("Tripura"); 
			 mobothe.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobothe1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobothe1.click();
			 mobothe1.sendKeys("Udaipur"); 
			 mobothe1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaothe =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaothe. sendKeys("Bus stop");
						 

			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceothe =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPriceothe. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPriceothe =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPriceothe. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyothe =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyothe.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeothe =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeothe.click();
	 
	 	 
				 
		}	
		
		}	
		

	
	
	

