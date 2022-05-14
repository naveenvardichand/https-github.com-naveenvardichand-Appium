package com.Pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import com.Pages.ProductsPage;

public class ProductDetailsPage extends BaseTest {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]")
	private MobileElement SLBTitle;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[2]"
			+ "")
	private MobileElement SLBTxt;

	@AndroidFindBy(accessibility = "test-CONTINUE SHOPPING")
	private MobileElement backToProductsBtn;
	
	
	//@AndroidFindBy(accessibility = "test-BACK TO PRODUCTS")
	//private MobileElement continueShoppingBtn;

	@AndroidFindBy(accessibility = "test-CHECKOUT")
		private MobileElement checkoutBtn;
	
	@AndroidFindBy(accessibility = "test-REMOVE")
	private MobileElement removeproduct;
	
	
	public String getSLBTitle() {
		String title = getText(SLBTitle);
		return title;
	}

	public String getSLBTxt() {
		String txt = getText(SLBTxt);
		return txt;
	}

	/*
	 * public String getSLBPrice() { String price = getText(SLBPrice);
	 * utils.log("price is - " + price); return price; }
	 */

	public String scrollToSLBPriceAndGetSLBPrice() {
		return getText(scrollToElement("test-CHECKOUT"));
	}
	
	public ProductsPage removeBtn() {
		// scrollToElementByPixel("xpath", "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");
		scrollToElement("test-REMOVE");
		click(removeproduct);
		// click(backToProductsBtn);
		return pressBackToProductsBtn();
		
	}
	

	public ProductsPage pressBackToProductsBtn() {
		
		scrollToElement("test-CONTINUE SHOPPING");
		click(backToProductsBtn);
		return new ProductsPage();
	}

	//public void continueShoppingBtn() {
		//click(continueShoppingBtn);
		
//	}
	
	//public void scrollDown() {
		
	//}
	

	public void checkoutBtn() {
		// scrollToElementByPixel("xpath", "//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]");
		scrollToElement("test-CHECKOUT");
		click(checkoutBtn);

	}
}
