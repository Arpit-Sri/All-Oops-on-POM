package com.mypages;

import java.time.Duration;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
//super class or Parent Class
public abstract class Page {

		WebDriver driver;
		WebDriverWait wait;
		
		//making a parameterized constructor of a class 
		public Page(WebDriver driver)
		{
			this.driver=driver;
			this.wait= new WebDriverWait(this.driver, Duration.ofSeconds(15)); //explicitly Wait
			
		}
		
		//abstract methods:
		//We will create some rule here,that every sub-page classes should have these abstract methods.
		
		public abstract String getPageTitle(); 
		
		public abstract String getPageHeader(By locator);
		
		public abstract WebElement getElement(By locator);
		
		public abstract void waitForElementPresent(By locator);
		
		public abstract void waitForPageTitle(String title);
		
		
		//using Java Generic concept, so we generally create a method
		public<TPage extends BasePage>TPage getInstance(Class<TPage> pageClass){
			try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		
}
