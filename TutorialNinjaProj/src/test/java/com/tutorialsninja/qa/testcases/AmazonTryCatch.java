package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTryCatch {

	public static void main(String[] args) {
		
		
	
		        WebDriver driver= new ChromeDriver();
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait
		        
		        try {
		            driver.get("https://www.amazon.in");
		            
		            // Step 1: Locate the "Fresh" button in the header
		            WebElement freshButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Fresh']")));
		            
		            // Step 2: Use Actions class to hover over the Fresh button
		            Actions action = new Actions(driver);
		            action.moveToElement(freshButton).perform(); // This will hover over the Fresh button

		            // Step 3: Wait for the drop-down menu to be visible and then locate and click the "Shop all groceries on Amazon" link
		            WebElement shopAllGroceriesLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Shop all groceries on Amazon']")));
		            shopAllGroceriesLink.click();
		            
		        } finally {
		            driver.quit(); // Close the browser
		        }
		    }
		

	

}
