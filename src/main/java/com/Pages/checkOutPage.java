package com.Pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class checkOutPage extends BaseTest {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy(accessibility = "test-First Name")
	private MobileElement chkFirstName;
	
	@AndroidFindBy(accessibility = "test-Last Name")
	private MobileElement chkLastName;
	
	@AndroidFindBy(accessibility = "test-Zip/Postal Code")
	private MobileElement chkZip;

	@AndroidFindBy(accessibility = "test-CANCEL")
	private MobileElement chkCancel;
	
	@AndroidFindBy(accessibility = "test-CONTINUE") 
	private MobileElement chkContinue;
	
	public void clickContinue() throws InterruptedException
	{
		chkFirstName.sendKeys("abc");
		
		chkLastName.sendKeys("def");
		
		chkZip.sendKeys("400087");
		
		click(chkContinue);
		
	}
	
	
}


