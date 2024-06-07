package org.test.Testingg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;



public class Browsing {
	
	static WebDriver driver;
       	
	@BeforeClass
	
		public  void sales()
		
		{	
		}
	
		@Test
	
		public  void vehicle() throws InterruptedException
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Testingg\\Simple folder\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.addsbazar.com/ta");
			
			driver.manage().window().maximize();
					
				 
						
			
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//img[@src='/_next/static/media/ADB.3548b92d.svg'])[1]")).click();
			
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='ALL']")).click();
							 	
			
			
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Vehicle']")).click();
						 
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Two Wheeler']")).click(); 
		
		
		// VECHICLE - TWO WHEELER - SELECT STATE
		 Thread.sleep(1000);		  
		 WebElement dropDown = driver.findElement(By.xpath("//input[@placeholder='Select state']"));
		 dropDown.click();
		 dropDown.sendKeys("kerala"); 
		 dropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
			 
		 // Select City
		 Thread.sleep(1000);		  
		 WebElement dropDown1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 dropDown1.click();
		 dropDown1.sendKeys("Aluva"); 
		 dropDown1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		 // Area
		 Thread.sleep(1000);		  
		 WebElement area =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		 area. sendKeys("Bus stop");
		 
				 
  //BRAND:
		 
		 //Thread.sleep(3000);		  
		 //WebElement dropDown3 =  driver.findElement(By.xpath("//div[@id='mui-component-select-Brand']"));
		 //dropDown2.click();
		 
		 //dropDown2.sendKeys("Hero"); 
		 //dropDown2.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		 //Select s = new Select(driver.findElement(By.xpath("//li[@aria-selected='true']")));
		 //s.selectByVisibleText("Hero");
		
		
		 
		 
         //Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPrice =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPrice. sendKeys("100");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPrice =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPrice. sendKeys("200");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement apply =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 apply.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement home =  driver.findElement(By.xpath("//div[@class='home']"));
		 home.click();

		
//Four wheeler:		 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Vehicle']")).click();
			
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Four Wheeler']")).click(); 
		 
		 // Select state
		 Thread.sleep(1000);
		 WebElement dropDown3 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 dropDown3.click();
		 dropDown3.sendKeys("Karnataka"); 
		 dropDown3.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement dropDown4 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 dropDown4.click();
		 dropDown4.sendKeys("Belur"); 
		 dropDown4.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		// Area
		Thread.sleep(1000);		  
		WebElement area1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		area1. sendKeys("Bus stop");
				 

        //Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPrice1 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPrice1. sendKeys("100");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPrice1 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPrice1. sendKeys("200");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement apply1 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 apply1.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement home1 =  driver.findElement(By.xpath("//div[@class='home']"));
		 home1.click();

//Commericial Vehicle: 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Vehicle']")).click();
			
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Commercial Vehicle']")).click(); 
		 
		 // Select state
		 Thread.sleep(1000);
		 WebElement dropDown5 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 dropDown5.click();
		 dropDown5.sendKeys("Andhra Pradesh"); 
		 dropDown5.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement dropDown6 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 dropDown6.click();
		 dropDown6.sendKeys("Adoni"); 
		 dropDown6.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		// Area
		Thread.sleep(1000);		  
		WebElement area2 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		area2. sendKeys("Bus stop");
				 

        //Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPrice2 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPrice2. sendKeys("200");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPrice2 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPrice2. sendKeys("300");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement apply2 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 apply2.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement home2 =  driver.findElement(By.xpath("//div[@class='home']"));
		 home2.click();

		 
//bicycles:		 
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Vehicle']")).click();
			
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Bicycles']")).click(); 
		 
		 // Select state
		 Thread.sleep(1000);
		 WebElement dropDown7 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 dropDown7.click();
		 dropDown7.sendKeys("Telangana"); 
		 dropDown7.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement dropDown8 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 dropDown8.click();
		 dropDown8.sendKeys("Andol"); 
		 dropDown8.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement area3 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		area3. sendKeys("Bus stop");
				 

        //Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPrice3 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPrice3. sendKeys("300");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPrice3 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPrice3. sendKeys("400");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement apply3 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 apply1.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement home3 =  driver.findElement(By.xpath("//div[@class='home']"));
		 home1.click();
		 
		 
		 
		 
//Others:
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Vehicle']")).click();
			
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='Others'])[1]")).click();
					 
		 
		 // Select state
		 Thread.sleep(1000);
		 WebElement dropDown9 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
		 dropDown9.click();
		 dropDown9.sendKeys("Telangana"); 
		 dropDown9.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 // select City
		 Thread.sleep(1000);		  
		 WebElement dropDown10 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
		 dropDown10.click();
		 dropDown10.sendKeys("Andol"); 
		 dropDown10.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		 
		// Area
		Thread.sleep(1000);		  
		WebElement area4 =  driver.findElement(By.xpath("//input[@placeholder='Enter Neighbourhood']"));
		area4. sendKeys("Bus stop");
				 

        //Min Price
		 
		 Thread.sleep(1000);		  
		 WebElement minPrice4 =  driver.findElement(By.xpath("//input[@placeholder='₹ min price']"));
		 minPrice4. sendKeys("300");
		 
		 //Max Price
		 Thread.sleep(1000);		  
		 WebElement maxPrice4 =  driver.findElement(By.xpath("//input[@placeholder='₹ max price']"));
		 maxPrice4. sendKeys("400");
		 
		 
	     // Apply
		 
		 Thread.sleep(1000);		  
		 WebElement apply4 =  driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium btn para css-1ujsas3'])[1]"));
		 apply4.click(); 
		 
	    // home
		 
		 Thread.sleep(1000);		  
		 WebElement home4 =  driver.findElement(By.xpath("//div[@class='home']"));
		 home4.click();
		 

		 

									
}	
																							
													
		
	//
	//@Test
	//public static void sale3() throws InterruptedException
	//{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\simplepro\\driver\\chromedriver-win32\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
				
		//driver.get("https://www.addsbazar.com/ta");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//a[text()='Properties']")).click();	
	
	//driver.findElement(By.xpath("//a[text()='For Sale: Houses & Apartments']")).click();	
			
	//}
		
		
		
		
		
		
	@Test

	public void properties() throws InterruptedException
	{
	  	
		
		
		
		
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Properties']")).click();
		
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//a[text()='For Sale: Houses & Apartments'])[1]")).click(); 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  
		 
		 
		
	}
		
	
	@Test 
	
	public void mobile() throws InterruptedException
	{ 
		
	
		
		
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();
		 		  
		
		 Thread.sleep(3000);		 
		 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();	
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
		 
		 		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Services']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='buy']")).click();
		 
		// Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary css-1v4ccyo']']")).sendKeys("divyaaddsbazar@gmail.com");
		 
       // Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='form-group'][1]")).sendKeys("Divya@990@1");
		 
		 
		 //Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='submit-btn']")).click();
		 
		 
		 		 
		
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='language hovered para']")).click();
		 
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='home']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='chat']")).click();
		 		 		 		 
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//img[@alt='notify-icon']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='login-avatar para ']")).click();
		 
		
		 driver.quit();
		
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Mobiles & Tablets']")).click();
		 		  
		
		 Thread.sleep(3000);		 
		 driver.findElement(By.xpath("//a[text()='Electronic & Appliances']")).click();	
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Home & Lifestyles']")).click();
		 
		 		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Services']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Jobs']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='buy']")).click();
		 
		// Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary css-1v4ccyo']']")).sendKeys("divyaaddsbazar@gmail.com");
		 
       // Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='form-group'][1]")).sendKeys("Divya@990@1");
		 
		 
		 //Thread.sleep(3000);
		 //driver.findElement(By.xpath("//div[@class='submit-btn']")).click();
		 
		 
		 		 
		
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='language hovered para']")).click();
		 
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='home']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='chat']")).click();
		 		 		 		 
		// Thread.sleep(3000);
		// driver.findElement(By.xpath("//img[@alt='notify-icon']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='login-avatar para ']")).click();
		 
		
		 driver.quit();
		
		
		
		
	}
	
	
	
		
	@AfterClass
		
		public void sales2()
		{
		
		
	
		
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
