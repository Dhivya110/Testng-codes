package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mobiles {

	
	
static WebDriver driver;
	
	@Test
	
	public void mobileandtablet () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
// 3. Mobile & tablets:
			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Mobile Phones'][1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobmob = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobmob.click();
			 mobmob.sendKeys("Goa"); 
			 mobmob.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobmob1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobmob1.click();
			 mobmob1.sendKeys("Baga"); 
			 mobmob1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areamob =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areamob. sendKeys("Bus stop");
						 

			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricemob =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricemob. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricemob =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricemob. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applymob =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applymob.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homemob =  driver.findElement(By.xpath("//div[@class='home']"));
			 homemob.click();

			 
		//	 3.1 Accessories:

			 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("(//li[@id=\"nav-Mobiles & Tablets\"])[1]")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//a[text()='Accessories'])[1]")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobacc = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobacc.click();
			 mobacc.sendKeys("Goa"); 
			 mobacc.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobacc1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobacc1.click();
			 mobacc1.sendKeys("Baga"); 
			 mobacc1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaacc =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areaacc. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricemo =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricemo. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricemo =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricemo. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applymo=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applymo.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement homemo =  driver.findElement(By.xpath("//div[@class='home']"));
			 homemo.click();
 
 
			 
	// 3.2  Tablets: 		 
				
		     Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();
			
			 					
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[text()='Tablets']")).click(); 
					 
			 
		       //Select state
			 Thread.sleep(1000);
			 WebElement mobtab = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 mobtab.click();
			 mobtab.sendKeys("Goa"); 
			 mobtab.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mobtab1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mobtab1.click();
			 mobtab1.sendKeys("Baga"); 
			 mobtab1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areatab =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
			areatab. sendKeys("Bus stop");
						 
			 
			 			 
			//Min Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPricetab =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
			 minPricetab. sendKeys("200");
			 
			 //Max Price
			 Thread.sleep(1000);		  
			 WebElement maxPricetab =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
			 maxPricetab. sendKeys("300");
			 
			 
		     // Apply
			 
			 Thread.sleep(1000);		  
			 WebElement applytab=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
			 applytab.click(); 
			 
		    // home
			 
			 Thread.sleep(1000);		  
			 WebElement hometab =  driver.findElement(By.xpath("//div[@class='home']"));
			 hometab.click();
 
			 
			 
			 
		// 3.3  wearable: 		 
					
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();
				
				 					
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[text()='Wearables'])[1]")).click(); 
						 
				 
			      //Select state
				 Thread.sleep(1000);
				 WebElement mobwear = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
				 mobwear.click();
				 mobwear.sendKeys("Gujarat"); 
				 mobwear.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 // select City
				 Thread.sleep(1000);		  
				 WebElement mobwear1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
				 mobwear1.click();
				 mobwear1.sendKeys("Agol"); 
				 mobwear1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
				
				 
				// Area
				Thread.sleep(1000);		  
				WebElement areawear =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
				areawear. sendKeys("Bus stop");
							 
				 
				 			 
				//Min Price
				 
				 Thread.sleep(1000);		  
				 WebElement minPricewear =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
				 minPricewear. sendKeys("200");
				 
				 //Max Price
				 Thread.sleep(1000);		  
				 WebElement maxPricewear =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
				 maxPricewear. sendKeys("300");
				 
				 
			     // Apply
				 
				 Thread.sleep(1000);		  
				 WebElement applywear=  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
				 applywear.click(); 
				 
			    // home
				 
				 Thread.sleep(1000);		  
				 WebElement homewear =  driver.findElement(By.xpath("//div[@class='home']"));
				 homewear.click();
	 
						 
			 
		 
	}
}
	
	
	
	
	
	
	
	
	
	

