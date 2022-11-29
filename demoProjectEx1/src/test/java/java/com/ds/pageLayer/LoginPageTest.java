package com.ds.pageLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pagelayer.LoginPage;
import com.ds.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	String expected_url = "https://www.apps.dalalstreet.ai/login";
	
	@Test
	public void verifyLoginTest() throws InterruptedException 
	{
		LoginPage login = new LoginPage();
		login.enterEmailId("amarwaghmare573@gmail.com");
		login.enterPass("Test@1234");
		login.clickOnLoginButton();
		Thread.sleep(3000);
		String actual_url = login.getCURL();
		
		Assert.assertEquals(actual_url, expected_url);
	}

}
