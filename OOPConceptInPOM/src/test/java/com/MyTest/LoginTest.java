/**
 * 
 */
package com.MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

/**
 * 
 */
public class LoginTest extends BaseTest{
	@Test(priority =1)
	public void verifyLoginPageTitle() {
		String title=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test(priority =2)
	public void verifyLoginPageHeaderTitle() {
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header , "I am a returning customer");
		
		
	}
	
	@Test(priority =3 )
	public void doLoginTest() {
		HomePage homepage=page.getInstance(LoginPage.class).doLogin("theundefined04@gmail.com", "12345");
		String headerHome = homepage.getHomePageHeader();
		System.out.println(headerHome);
		Assert.assertEquals(headerHome, "My Account");
	}

}
