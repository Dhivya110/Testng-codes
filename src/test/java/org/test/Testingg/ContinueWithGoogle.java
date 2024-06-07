package org.test.Testingg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContinueWithGoogle 
{
	
	
	
static WebDriver driver;
	
	@Test
	
	public void sellervehicle () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Testingg\\Simple folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.addsbazar.com/ta");
		
		driver.manage().window().maximize();
		

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
	 driver.findElement(By.xpath("(//div[@class='login para'])[1]")).click(); 
	
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//img[@alt='google']")).click(); 
	 
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div[@data-email='divyaaddsbazar@gmail.com']")).click(); 
	 
	 
	}	
}
