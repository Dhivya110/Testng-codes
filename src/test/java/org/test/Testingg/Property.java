package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Property {

	
		static WebDriver driver;
		
		@Test
		
		public void rent() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.addsbazar.com/ta");
			
			driver.manage().window().maximize();
			
			
		
			// 2. PROPERTIES:
			 
			 
		// 2  Properties  - for sale house and Apartments;	
				    Thread.sleep(3000);
				    driver.findElement(By.xpath("//a[text()='Properties']")).click();

				    Thread.sleep(1000);
				    driver.findElement(By.xpath("(//a[text()='For Sale: Houses & Apartments'])[1]")).click(); 
				 
				 
				       //Select state
					 Thread.sleep(1000);
					 WebElement dropDown11 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 dropDown11.click();
					 dropDown11.sendKeys("Bihar"); 
					 dropDown11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement dropDown12 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 dropDown12.click();
					 dropDown12.sendKeys("Arwal"); 
					 dropDown12.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement area5 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
					area5. sendKeys("Bus stop");
								 
				 
				       //  Type  
					 Thread.sleep(1000);		  
					 WebElement dropDown13 =  driver.findElement(By.xpath("(//input[@name='Type'])[1]"));
					 dropDown13.click();
					 
					 //dropDown13.sendKeys("Farm Houses"); 
					 dropDown13.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					 
					 
					//  Bedrooms  
					 Thread.sleep(1000);		  
					 WebElement dropDown14=  driver.findElement(By.xpath("(//input[@name='Bedrooms'])[1]"));

                     //dropDown14.sendKeys("1"); 
					 dropDown14.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
				    // Bathrooms
					 Thread.sleep(1000);		  
					 WebElement dropDown15 =  driver.findElement(By.xpath("(//input[@name='Bathrooms'])[1]"));
					 dropDown15.click();
					// dropDown15.sendKeys("1"); 
						 dropDown15.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
						
				 
				       // Furnishing
					 
					 Thread.sleep(1000);		  
					 WebElement dropDown16 =  driver.findElement(By.xpath("(//input[@name='Furnishing'])[1]"));
					 //dropDown16.sendKeys("Unfurnished"); 
					 dropDown16.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
				  // Listed By
					 Thread.sleep(5000);		  
					 WebElement dropDown17 =  driver.findElement(By.xpath("//div[@id='mui-component-select-Listed by']"));
					 
					 dropDown17.sendKeys("Owner"); 
					 dropDown17.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					//Min Price
					 
					 Thread.sleep(1000);		  
					 WebElement minPrice5 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
					 minPrice5. sendKeys("200");
					 
					 //Max Price
					 Thread.sleep(1000);		  
					 WebElement maxPrice5 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
					 maxPrice5. sendKeys("300");
					 
					 
				     // Apply
					 
					 Thread.sleep(1000);		  
					 WebElement apply5 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
					 apply5.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement home5 =  driver.findElement(By.xpath("//div[@class='home']"));
					 home5.click();
		 
		 
		 
					 
					 
			 		
									 
									                           
			// 2.1  Properties  - for Rent house and Apartments;	
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//a[text()='Properties']")).click();

			    Thread.sleep(1000);
			    driver.findElement(By.xpath("(//a[text()='For Rent: Houses & Apartments'])[1]")).click(); 
			 
			 
			       //Select state
				 Thread.sleep(1000);
				 WebElement dropDown18 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 dropDown18.click();
				 dropDown18.sendKeys("Bihar"); 
				 dropDown18.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement dropDown19 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 dropDown19.click();
				 dropDown19.sendKeys("Arwal"); 
				 dropDown19.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement area6 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				area6. sendKeys("Bus stop");
							 
			 
			       //  Type  
				 Thread.sleep(1000);		  
				 WebElement dropDown20 =  driver.findElement(By.xpath("(//input[@name='Type'])[1]"));
				 dropDown20.click();
				 //dropDown13.sendKeys("Farm Houses"); 
				 dropDown20.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				 
				 
				//  Bedrooms  
				 Thread.sleep(1000);		  
				 WebElement dropDown21 =  driver.findElement(By.xpath("(//input[@name='Bedrooms'])[1]"));
				 //dropDown14.sendKeys("1"); 
				 dropDown21.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			    // Bathrooms
				 
				 Thread.sleep(1000);		  
				 WebElement dropDown22 =  driver.findElement(By.xpath("(//input[@name='Bathrooms'])[1]"));
				 dropDown22.click();
				// dropDown15.sendKeys("1"); 
					 dropDown22.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
			 
			       // Furnishing
				 
				 Thread.sleep(1000);		  
				 WebElement dropDown23 =  driver.findElement(By.xpath("(//input[@name='Furnishing'])[1]"));
				 //dropDown16.sendKeys("Unfurnished"); 
				 dropDown23.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
			  // Listed By
				 Thread.sleep(5000);		  
				 WebElement dropDown24 =  driver.findElement(By.xpath("//div[@id='mui-component-select-Listed by']"));
				 
				 dropDown24.sendKeys("Owner"); 
				 dropDown24.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPrice6 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPrice6. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPrice6 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPrice6. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement apply6 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 apply6.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement home6 =  driver.findElement(By.xpath("//div[@class='home']"));
				 home6.click();

															 
					// 2.1  Properties  - for Plots&Lands:	
						Thread.sleep(3000);
						 driver.findElement(By.xpath("//a[text()='Properties']")).click();
						
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("(//a[text()='Plots & Lands'])[1]")).click(); 
						 
						 
			   //Select state
				 Thread.sleep(1000);
				 WebElement dropDown25 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 dropDown25.click();
				 dropDown25.sendKeys("Bihar"); 
				 dropDown25.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

				 // select City
				 Thread.sleep(1000);		  
				 WebElement dropDown26 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 dropDown26.click();
				 dropDown26.sendKeys("Arwal"); 
				 dropDown26.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
					// Area
					Thread.sleep(1000);		  
					WebElement area7 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
					area7. sendKeys("Bus stop");
							 
			 
								//Min Price
					 
					 Thread.sleep(1000);		  
					 WebElement minPrice7 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
					 minPrice7. sendKeys("200");
					 
					 //Max Price
					 Thread.sleep(1000);		  
					 WebElement maxPrice7 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
					 maxPrice7. sendKeys("300");
					 
								 
							     // Apply
					 
					 Thread.sleep(1000);		  
					 WebElement apply7 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
					 apply7.click(); 
					 
				    // home
					 
					 Thread.sleep(1000);		  
					 WebElement home7 =  driver.findElement(By.xpath("//div[@class='home']"));
					 home7.click();

			 		 
					 
					 
				// 2.2.  commercial buildings:	
					
									
									
									
									
					     Thread.sleep(3000);
						 driver.findElement(By.xpath("//a[text()='Properties']")).click();
								
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("(//a[text()='Commercial Buildings'])[1]")).click(); 
								 
								 
					   //Select state
						 Thread.sleep(1000);
						 WebElement dropDown281 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
						 dropDown281.click();
						 dropDown281.sendKeys("Bihar"); 
						 dropDown281.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

						 // select City
						 Thread.sleep(1000);		  
						 WebElement dropDown29 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
						 dropDown29.click();
						 dropDown29.sendKeys("Arwal"); 
						 dropDown29.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
						
						 
							// Area
							Thread.sleep(1000);		  
							WebElement area9 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
							area9. sendKeys("Bus stop");
									 
						 
							//Min Price
						 
						 Thread.sleep(1000);		  
						 WebElement minPrice9 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
						 minPrice9. sendKeys("200");
						 
						 //Max Price
						 Thread.sleep(1000);		  
						 WebElement maxPrice9 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
						 maxPrice9. sendKeys("300");
						 
						 
					     // Apply
						 
						 Thread.sleep(1000);		  
						 WebElement apply9 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
						 apply9.click(); 
						 
					    // home
						 
						 Thread.sleep(1000);		  
						 WebElement home9 =  driver.findElement(By.xpath("//div[@class='home']"));
						 home9.click();
						
								
						
					// 2.4.  others:
						
									
				/*			
					     Thread.sleep(1000);
						 driver.findElement(By.xpath("//a[text()='Properties']")).click();
						
						 					
						 Thread.sleep(1000);
						 driver.findElement(By.xpath("(//a[text()='Others'])[1]")).click(); 
								 
								 
					   //Select state
						 Thread.sleep(1000);
						 WebElement dropDown301 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
						 dropDown301.click();
						 dropDown301.sendKeys("Bihar"); 
						 dropDown301.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

						 // select City
						 Thread.sleep(1000);		  
						 WebElement dropDown31 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
						 dropDown31.click();
						 dropDown31.sendKeys("Arwal"); 
						 dropDown31.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
						
						 
							// Area
							Thread.sleep(1000);		  
							WebElement area10 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
							area10. sendKeys("Bus stop");
									 
						 
						//Min Price
						 
						 Thread.sleep(1000);		  
						 WebElement minPrice10 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
						 minPrice10. sendKeys("200");
						 
						 //Max Price
						 Thread.sleep(1000);		  
						 WebElement maxPrice10 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
						 maxPrice10. sendKeys("300");
						 
						 
					     // Apply
						 
						 Thread.sleep(1000);		  
						 WebElement apply10 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
						 apply10.click(); 
						 
					    // home
						 
						 Thread.sleep(1000);		  
						 WebElement home10 =  driver.findElement(By.xpath("//div[@class='home']"));
						 home10.click();
								
						 
						 
			*/
									
			}	
																										
						}
		
		

	
	
	
