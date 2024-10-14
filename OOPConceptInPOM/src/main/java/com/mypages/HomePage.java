package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Sub Class of BasePage Class
public class HomePage extends BasePage {
	
	private By header=By.className("private-page__title");
	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	public WebElement getHeader() {
		return getElement(header);
	}
	
	//page actions:
	public String getHomePagetitle() {
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	
	

}
