package com.Pages;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckoutComplete extends BaseTest{

	@AndroidFindBy (xpath = "//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]")
	private MobileElement successMsg;
	
	public void checkForConfirmation() {
		
	}
	
}
