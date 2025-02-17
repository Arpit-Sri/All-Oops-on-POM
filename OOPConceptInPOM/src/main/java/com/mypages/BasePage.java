package com.mypages;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

//child class of Page class
public class BasePage extends Page{
	
	//constructor
	public BasePage(WebDriver driver) 
	{
		super(driver);
		
	}

	@Override
	//m-1 
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	@Override
	//m-2
	public String getPageHeader(By locator) {
		
		return getElement(locator).getText();
		
	}

	@Override
	//me-3
	//wrapper function
	public WebElement getElement(By locator) {
	
		WebElement element = null;
		try{
			waitForElementPresent(locator);
			element=driver.findElement(locator);
			return element;
		}catch(Exception e) {
			//writing a own custom message explicitly just to know what happened
			System.out.println("some error occured while creating element"+locator.toString());
			e.printStackTrace();
		}
		
		return element;
	}
	
	@Override
	//m-4
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		}catch(Exception e) {
			System.out.println("some exception/error occured while creating element"+locator.toString());
		}
	
	}
	
	@Override
	//m-5
	public void waitForPageTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e) {
			System.out.println("some error occured while waiting for the element"+title.toString());
		}
		
		
	}

	
	
	
		
	

	

	
	
	
}
