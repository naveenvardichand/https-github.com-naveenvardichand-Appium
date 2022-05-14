package com.Pages;

import org.testng.Assert;

import com.qa.BaseTest;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class checkoutOverview extends BaseTest{
	@AndroidFindBy(accessibility = "test-FINISH")
	private MobileElement finish;

	public void clickFinish() {
		scrollToElement("test-FINISH");
		finish.click();
	}

}
