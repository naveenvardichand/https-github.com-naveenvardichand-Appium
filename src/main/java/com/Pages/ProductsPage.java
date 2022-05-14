package com.Pages;

import java.awt.Dimension;
import java.util.NoSuchElementException;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ProductsPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView") 
	private MobileElement productTitleTxt;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]") 
	private MobileElement SLBTitle;
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]") 
	private MobileElement SLBPrice;
	
	@AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]")
	private MobileElement item1AddToCart;
	
	@AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]")
	private MobileElement item2AddToCart;
	
	@AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[3]")
	private MobileElement item3AddToCart;
	
	@AndroidFindBy (xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[3]")
	private MobileElement addToCartButton;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")
	private MobileElement cartDetailsbtn;
	

	public String getTitle() {
	String title = getText(productTitleTxt);
	return title;
}

public String getSLBTitle() {
	String title = getText(SLBTitle);
	return title;
}

public String getSLBPrice() {
	String price = getText(SLBPrice);
	return price;
}

public ProductDetailsPage pressSLBTitle() {
	click(SLBTitle);
	return new ProductDetailsPage();
}

public void addProduct1ToCart() throws InterruptedException {
	
	click(item1AddToCart);
	
	//wait(5000);
	//scrollToElementByPixel("xpath", "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]");
	//click(item2AddToCart);
	
	//wait(5000);
	
}
public void addProduct2ToCart() throws InterruptedException {
	
	//click(item1AddToCart);
	
	//wait(5000);
	scrollToElementByPixel("xpath", "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[2]");
	click(item2AddToCart);
	
	//wait(5000);
	
}
public void cartDetailsButtonClick() {
	click(cartDetailsbtn);
}


}
