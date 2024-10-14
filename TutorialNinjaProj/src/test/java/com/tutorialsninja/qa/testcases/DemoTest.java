package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*“Can you write an automated test script that will open facebook.com and attempt to login with invalid credentials (Refer test data) and verify whether facebook.com allows or not to login with an invalid credentials?
		 Expected result from the test:
			 The test should pass because Facebook will not allow the user to log in with invalid credentials and validate the error message.
			 Test Data:
			 Username: invalid_user
			 Password: invalid_pass”  */
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("invalid_user");
		driver.findElement(By.id("pass")).sendKeys("invalid_user");
		driver.findElement(By.name("login")).click();
		
		String expectedResult="Find your account and log in.";
		String actualResult = driver.findElement(By.linkText("Find your account and log in.")).getText();
		
		System.out.println("Actual result: "+actualResult);
		
		

		Thread.sleep(2000);
		
		if(expectedResult.equals(actualResult)) {
			
			System.out.println("The Test has pass sucessfully");
		}
		
		else {System.out.println("The Test has not pass sucessfully");}
		driver.quit();
		
		 

	}
	
		int x=10;
		
		
		
		

}
