package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {

	
		@Test
		void fresh() throws InterruptedException {
			
			//WebDriver driver = new ChromeDriver();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
			
			driver.get("https://www.amazon.in/");
			// Step 1: Locate the "Fresh" button in the header
			 WebElement freshButton = driver.findElement(By.xpath("//a[@id='nav-link-groceries']"));
			 
			 String pagTitle = driver.getTitle();
			 System.out.println("hello");
			 System.out.println(pagTitle);
			 System.out.println("hello2");
			 Thread.sleep(2000);

			// Step 2: Use Actions class to hover over the Fresh button
			Actions action = new Actions(driver);
			action.moveToElement(freshButton).perform(); // This will hover over the Fresh button
			
			Thread.sleep(3000);
			
			// Step 3: Once the drop-down is visible, locate and click the "Shop all groceries on Amazon" link
			//WebElement shopAllGroceriesLink = driver.findElement(By.xpath("//a[text()='Shop all groceries on Amazon']"));
			//shopAllGroceriesLink.click();
		
	}
		@Test(priority = 1)
		void prime() throws InterruptedException {
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.amazon.in/");
			
			WebElement primeButton = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
			
			Actions action = new Actions(driver);
			action.moveToElement(primeButton).perform();
			
			Thread.sleep(3000);
			
			// Step 3: Once the drop-down is visible, locate and click the "Shop all groceries on Amazon" link
			WebElement imgLink = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
			imgLink.click();
			
			
		}
		
		
		

		

	

}
