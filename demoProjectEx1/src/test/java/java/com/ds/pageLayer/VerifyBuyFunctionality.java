package com.ds.pageLayer;

import org.testng.annotations.Test;

import com.ds.pagelayer.DashboardPage;
import com.ds.pagelayer.ExchangePage;
import com.ds.pagelayer.LoginPage;
import com.ds.testBase.TestBase;

public class VerifyBuyFunctionality extends TestBase{
	
	@Test
	public void VerifyBuyFunctionality() throws InterruptedException
	{
	LoginPage login = new LoginPage();
	DashboardPage dash = new DashboardPage();
	ExchangePage exchange = new ExchangePage();
	
	//----------log in--------------
	login.enterEmailId("amarwaghmare573@gmail.com");
	login.enterPass("Test@1234");
	login.clickOnLoginButton();
	Thread.sleep(4000);
	
	//-----------
	dash.enterCompanyName("wipro");
	dash.clickOnCompanyOption();
	Thread.sleep(4000);
	
	//-------------
	exchange.clickOnBuyButton1();
	exchange.enterQuantityOfShare("2");
	exchange.clickOnBuyButton2();
	Thread.sleep(4000);
	
	System.out.println(exchange.getStatus());
	String actual_url = login.getCURL();
	

	}

}
