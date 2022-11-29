package com.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- Obj repo ---------------------
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement searchbox_txt;
	
	@FindBy(xpath="(//a[text()='WIPRO'])[2]")
	private WebElement wipro_option;
	
	//------------- Action methods ----------------
	public void enterCompanyName(String company_name)
	{
		searchbox_txt.sendKeys(company_name);
	}
	
	public void clickOnCompanyOption()
	{
		wipro_option.click();
	}
	
	
}
