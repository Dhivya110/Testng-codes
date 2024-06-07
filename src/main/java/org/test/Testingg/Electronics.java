package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Electronics {

	
static WebDriver driver;
	
	@Test
	
	public void electronics () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Testingg\\Simple folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
// 3. Electronic appliances :
			 
		// Home appliances:
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Home Appliance'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobhome = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobhome.click();
			 mobhome.sendKeys("Goa"); 
			 mobhome.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobhome1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobhome1.click();
			 mobhome1.sendKeys("Baga"); 
			 mobhome1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areahome =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areahome. sendKeys("Bus stop");
						 

			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricehome =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricehome. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricehome =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricehome. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applyhome =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applyhome.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homeho =  driver.findElement(By.xpath("//div[@class='home']"));
			 homeho.click();

			 
		//	 3.1 laptop:

			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Laptop & Accessories'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement moblap = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 moblap.click();
			 moblap.sendKeys("Goa"); 
			 moblap.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement moblap1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 moblap1.click();
			 moblap1.sendKeys("Baga"); 
			 moblap1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement arealap =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			arealap. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricelap =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricelap. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricelap =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricelap. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applylap=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applylap.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homelap =  driver.findElement(By.xpath("//div[@class='home']"));
			 homelap.click();
 
 
			 
	// 3.2  Kitchen : 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Kitchen Appliances'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobkitch = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobkitch.click();
			 mobkitch.sendKeys("Goa"); 
			 mobkitch.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobkitch1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobkitch1.click();
			 mobkitch1.sendKeys("Baga"); 
			 mobkitch1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areakitch =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areakitch. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricekitch =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricekitch. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricekitch =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricekitch. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applykitch=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applykitch.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homekitch =  driver.findElement(By.xpath("//div[@class='home']"));
			 homekitch.click();
 
			 
			 
			 
		// 3.3  gaming: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Audio, Video & Gaming'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobgame = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobgame.click();
				 mobgame.sendKeys("Gujarat"); 
				 mobgame.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobgame1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobgame1.click();
				 mobgame1.sendKeys("Agol"); 
				 mobgame1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areagame =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areagame. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricegame =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricegame. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricegame =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricegame. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applygame=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applygame.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homegame =  driver.findElement(By.xpath("//div[@class='home']"));
				 homegame.click();
	 						 
			 
				 
				 
	 
		// 3.4  camera: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Audio, Video & Gaming'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobcam = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobcam.click();
				 mobcam.sendKeys("Gujarat"); 
				 mobcam.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobcam1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobcam1.click();
				 mobcam1.sendKeys("Agol"); 
				 mobcam1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areacam =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areacam. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricecam =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricecam. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricecam =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricecam. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applycam=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applycam.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homecam =  driver.findElement(By.xpath("//div[@class='home']"));
				 homecam.click();
	 						 
	/* 
				 
				 
	// 3.3   others: 		 
		
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();
	
	 					
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("(//a[text()='Other Device'])[1]")).click(); 
			 
	 
	  //Select state
	 Thread.sleep(1000);
	 WebElement moboth = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
	 moboth.click();
	 moboth.sendKeys("Gujarat"); 
	 moboth.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 // select City
	 Thread.sleep(1000);		  
	 WebElement moboth1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
	 moboth1.click();
	 moboth1.sendKeys("Agol"); 
	 moboth1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	
	 
	// Area
	Thread.sleep(1000);		  
	WebElement areaoth =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
	areaoth. sendKeys("Bus stop");
				 
	 
	 			 
	//Min Price
	 
	 Thread.sleep(1000);		  
	 WebElement minPriceoth =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
	 minPriceoth. sendKeys("200");
	 
	 //Max Price
	 Thread.sleep(1000);		  
	 WebElement maxPriceoth =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
	 maxPriceoth. sendKeys("300");
	 
	 
	 // Apply
	 
	 Thread.sleep(1000);		  
	 WebElement applyoth=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
	 applyoth.click(); 
	 
	// home
	 
	 Thread.sleep(1000);		  
	 WebElement homeoth =  driver.findElement(By.xpath("//div[@class='home']"));
		homeoth.click();
			 						 
	 
	 
	 */
	 
	 
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

