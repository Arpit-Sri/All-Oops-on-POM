package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Arpit
 */

//sub class of BasePage Class
public class LoginPage extends BasePage  {
	//I have to define a page Locator with the help of By loactor without using @findBy)
	//page locators:
	//I will use a private keyword just to achive a encapsulation
	private By emailID=By.id("input-email");
	private By password=By.id("input-password");
	private By loginButton=By.xpath("//input[@class='btn btn-primary']");
	private By header=By.partialLinkText("I am a returning customer");
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
		//as we can not access these locatros outside the class we are using getters(encapsulation).
		//how to access the private variable of the class with the help of "public variables"
		//Getters:
		//step-1 : create a getters 

		//public getters:
	/**
	 * @return the emailID
	 */
	public WebElement getEmailID() {
		return getElement(emailID);
	}

	/**
	 * @return the password
	 */
	public  WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	//positive test
	public  HomePage doLogin(String username, String pwd) {
			
		getEmailID().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		
		return getInstance(HomePage.class);
	}
	
	//negative test
	//same method name 2 parameter
	//same method name  parameter
	///overloading  here
	/**
	 * 
	 * @return
	 */
	public void doLogin() {
		
		getEmailID().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
		
	}
	
	//usernmae: naven@gmail.com
	public void doLogin(String userCred) {
		if(userCred.contains("username")) {
			getEmailID().sendKeys(userCred.split(":")[1].trim());
		}
		else if(userCred.contains("password")) {
			getEmailID().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
		
		
		
		
		
	}
	
	

	
	
	
	

}
