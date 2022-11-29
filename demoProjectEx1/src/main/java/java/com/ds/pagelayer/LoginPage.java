package com.ds.pagelayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ds.testBase.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//---------------obj repositsry--------------
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txt;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txt;
	
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement login_btn;
	
	
	//-----------action mathod---------
	public void enterEmailId(String email)
	{
		email_txt.sendKeys(email);
	}
	
	public void enterPass(String pass)
	{
		password_txt.sendKeys(pass);
	}
	
    public void clickOnLoginButton()
    {
    	login_btn.click(); 
    }
    
    public String getCURL()
    {
    	String url = driver.getCurrentUrl();
    	return url;
    }
	
}