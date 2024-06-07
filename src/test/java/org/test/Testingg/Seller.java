package org.test.Testingg;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Seller {

	
static WebDriver driver;
	
	@Test
	
	public void sellervehicle () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Testingg\\Simple folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		
			 
				    	 
				
		     //Thread.sleep(1000);
			 //driver.findElement(By.xpath("//div[@class='buy']")).click();
			 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//img[@alt='user-icon'])[1]")).click();	
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//span[@class='hovered']")).click();	

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
			 
			 
			 
			 
			 
		 	 
				// 1. vehicle	
		 		 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Vehicle'])[1]")).click(); 
					 
		        // Two wheeler 
					 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Two Wheeler'])[1]")).click(); 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Scooty for sale"); 
					 
					 
					 
		            // types
					 Thread.sleep(1000);
					 WebElement dropDown  = driver.findElement(By.xpath("//div[@id='mui-component-select-Types']")); 
					 dropDown.click();
					 dropDown.sendKeys("Scooty"); 
					 dropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					 	 
					 
					/* public List getDropDownList(String Xpath) {
						    WebElement dropdowns = driver.findElement(By.xpath(Xpath));
						    Select select = new Select(dropdowns);
						    List<String> dropdown = new ArrayList<String>();
						    List<WebElement> allOptions = select.getAllSelectedOptions();
						    Iterator<WebElement> itr = allOptions.iterator();
						    while (itr.hasNext()) {
						        String st = itr.next().getText();
						        dropdown.add(st);  */
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
					
					
					
					
					 
		        //  Enter  year : 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Year']")).sendKeys("2024"); 
					 
					 
				// fuel  option ;	 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//label[text()='Petrol']")).click(); 
					 
					 
				
					 
					// km driven ;	 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter KM Driven']")).sendKeys("70km"); 
					 
					 
				 
		        //  description :
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale car"); 
					 
				 		
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
								 

					// Price
					 
					 Thread.sleep(1000);		  
					 WebElement minPriceserho =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
					 minPriceserho. sendKeys("2000");
				
					 
					 		 	 
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
					 WebElement homeserho =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					 homeserho.click();

					 
					 
					 
			 
			 
			 
			 
			 	 
		// 1. vehicle	
 		 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Vehicle'])[1]")).click(); 
			 
        // Four wheeler 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//p[text()='Four Wheeler'])[1]")).click(); 
			 
            // title
			 Thread.sleep(1000);
			 WebElement title1 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
			 title1.click();
			 title1.sendKeys("Car"); 
			 title1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
			
			
			
			
			 
        //  Enter  year : 
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter Year']")).sendKeys("2024"); 
			 
			 
		// fuel  option ;	 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[text()='Petrol']")).click(); 
			 
			 
			 
		// Transmission ;	 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='Transmission-Manual']")).click(); 
			 
		// km driven ;	 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//input[@placeholder='Enter KM driven']")).sendKeys("70km"); 
			 
			 
	   // no of owners : 
			 
			 

			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//label[@for='No of Owners-2nd']")).click(); 
			 
				 
				 
		 
        //  description :
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale car"); 
			 
		 		
		       //Select state
			 Thread.sleep(1000);
			 WebElement se = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
			 se.click();
			 se.sendKeys("Goa"); 
			 se.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 // select City
			 Thread.sleep(1000);		  
			 WebElement mok1 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
			 mok1.click();
			 mok1.sendKeys("Baga"); 
			 mok1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			
			 
			// Area
			Thread.sleep(1000);		  
			WebElement areaserho1 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
			areaserho1. sendKeys("Bus stop");
						 

			// Price
			 
			 Thread.sleep(1000);		  
			 WebElement minPriceserho1 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
			 minPriceserho1. sendKeys("2000");
		
			 
			 		 	 
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
			 WebElement homeserho1 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
			 homeserho1.click();

			 
			 
			 
		 	 
				// 1. vehicle	
		 		 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Vehicle'])[1]")).click(); 
					 
		        // commercial vehicle:
					 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("(//p[text()='Commercial Vehicle'])[1]")).click(); 
					 
		            // title
					 Thread.sleep(1000);
					 WebElement title11 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
					 title11.click();
					 title11.sendKeys("mini van"); 
					 title11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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
					
					
					
					
					 
		        //  Enter  year : 
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter Year']")).sendKeys("2024"); 
					 
						
					 
					// km driven ;	 

					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//input[@placeholder='Enter KM Driven']")).sendKeys("70km"); 
					 
					 
				 
		        //  description :
					 
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Mini van"); 
					 
				 		
				       //Select state
					 Thread.sleep(1000);
					 WebElement po = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
					 po.click();
					 po.sendKeys("Goa"); 
					 po.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 // select City
					 Thread.sleep(1000);		  
					 WebElement ju =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
					 ju.click();
					 ju.sendKeys("Baga"); 
					 ju.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
					
					 
					// Area
					Thread.sleep(1000);		  
					WebElement deg =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
					deg. sendKeys("Bus stop");
								 

					// Price
					 
					 Thread.sleep(1000);		  
					 WebElement minPriceserho13 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
					 minPriceserho13. sendKeys("2000");
				
					 
					 		 	 
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
					 WebElement win =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
					 win.click();

					 
					 
					 
					 
			 

			// 1. vehicle:	
	 		 
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Vehicle'])[1]")).click(); 
				 
	        // bicycle: 
				 

				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//p[text()='Bicycles'])[1]")).click(); 
				 
	            // title
				 Thread.sleep(1000);
				 WebElement title111 = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
				 title111.click();
				 title111.sendKeys("cycle"); 
                title111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
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





//Enter  year : 

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Enter Year']")).sendKeys("2024"); 


 
//description :

Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Cycle"); 


//Select state
Thread.sleep(1000);
WebElement mobserho11 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
mobserho11.click();
mobserho11.sendKeys("Goa"); 
mobserho11.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

// select City
Thread.sleep(1000);		  
WebElement mobserho111 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
mobserho111.click();
mobserho111.sendKeys("Baga"); 
mobserho111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);


//Area
Thread.sleep(1000);		  
WebElement areaserho11 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
areaserho11. sendKeys("Bus stop");
 

//Price

Thread.sleep(1000);		  
WebElement minPriceserho11 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
minPriceserho11. sendKeys("2000");


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
WebElement homeserho11 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
 homeserho11.click();

 
 
 

//1. vehicle:	
	 
 Thread.sleep(1000);
 driver.findElement(By.xpath("(//p[text()='Vehicle'])[1]")).click(); 
 
// others : 
 

 Thread.sleep(1000);
 driver.findElement(By.xpath("(//p[text()='Bicycles'])[1]")).click(); 
 
// title
 Thread.sleep(1000);
 WebElement titlio = driver.findElement(By.xpath("//input[@placeholder='Enter title']")); 
 titlio.click();
 titlio.sendKeys("cycle"); 
titlio.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
/*

//insurance : 

Thread.sleep(1000);
WebElement title1 = driver.findElement(By.xpath("//div[@id='mui-component-select-Insurance']")); 
title1.click();
title1.sendKeys("Comprehensive Insurance");
title.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);



//select Types				 

Thread.sleep(1000);

WebElement dropDown = driver.findElement(By.xpath("//div[@id='mui-component-select-Types']"));
dropDown.click(); 
//dropDown.sendKeys();
//dropDown.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//WebElement  dropDown1 = driver.findElement(By.xpath("(//li[@role='option'])[1]"));
Select dropDown1 =  new Select(driver.findElement(By.xpath("//ul[@aria-labelledby='outlined-adornment-select']")));
dropDown1.selectByIndex(2); 
title1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);


//Select Brand			 

Thread.sleep(1000);
WebElement brand = driver.findElement(By.xpath("//div[@id='mui-component-select-Brand']"));

//brand.sendKeys("Bajaj");
//dropDown1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
Select s1 = new Select(brand); 
s1.selectByIndex(2);


//brand.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

*/





//Enter  year : 

Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Enter Year']")).sendKeys("2024"); 



//description :

Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@placeholder='Add description']")).sendKeys("i want to sale Cycle"); 


//Select state
Thread.sleep(1000);
WebElement mobserho1112 = driver.findElement(By.xpath("//input[@placeholder='Select state']")); 
mobserho1112.click();
mobserho1112.sendKeys("Goa"); 
mobserho1112.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);

//select City
Thread.sleep(1000);		  
WebElement mobserho1111 =  driver.findElement(By.xpath("//input[@placeholder='Select City']"));
mobserho1111.click();
mobserho1111.sendKeys("Baga"); 
mobserho1111.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);


//Area
Thread.sleep(1000);		  
WebElement areaserho111 =  driver.findElement(By.xpath("//input[@placeholder='Enter Area']"));
areaserho111. sendKeys("Bus stop");


//Price

Thread.sleep(1000);		  
WebElement minPriceserho111 =  driver.findElement(By.xpath("//input[@placeholder='₹ Place a price range']"));
minPriceserho111. sendKeys("2000");


/*


//upload photos

Thread.sleep(1000);		  
WebElement applyserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
applyserho.click();

WebElement upload =driver.findElement(By.linkText("Upload a Document:( .png, .txt, .doc, .docx, .odt, .pdf, .rtf, .jpg )"));
upload.sendKeys("C:\\Users\\Admin\\Pictures");



//upload videos

Thread.sleep(1000);		  
WebElement homeserho =  driver.findElement(By.xpath("(//img[@alt='Upload'])[1]"));
homeserho.click();



*/




//post now:


Thread.sleep(1000);		  
WebElement homeserho111 =  driver.findElement(By.xpath("(//button[@type='button'])[1]"));
homeserho111.click();



 
 
			 
		 
	}
	
	}

