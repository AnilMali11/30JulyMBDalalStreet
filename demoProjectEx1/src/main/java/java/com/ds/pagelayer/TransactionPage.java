package com.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.ds.testBase.TestBase;

public class TransactionPage extends TestBase  {
	
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------obj repositary-------------
	private By data1 = By.xpath("//table/tbody/tr[1]/td[2]");
	
	
	//------------transationdetails-----------
	
	public void getTransactionDetails()
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=9;j++)
			{
				String data =driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data + "  ");
			}
			    System.out.println();
		}
	}
	
}
