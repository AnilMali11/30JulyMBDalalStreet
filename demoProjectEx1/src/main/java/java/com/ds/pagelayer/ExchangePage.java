package com.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class ExchangePage extends TestBase{
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
//---------------||---------------
	
	@FindBy(xpath="//a[@class='active nav-link']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement Qty_txt;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement sts_msg;
	
	//--------------||action matho||-----------------
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	public void enterQuantityOfShare(String count)
	{
		Qty_txt.click();
		Qty_txt.sendKeys(count);
	}
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	public String getStatus()
	{
		String text = sts_msg.getText();
		return text;
	}
	
	
	
	
}
