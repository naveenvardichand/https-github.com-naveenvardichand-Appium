package com.qa.tests;
import com.Pages.CheckoutComplete;
import com.Pages.LoginPage;
import com.Pages.ProductDetailsPage;
import com.Pages.ProductsPage;
import com.Pages.checkOutPage;
import com.Pages.checkoutOverview;
import com.qa.BaseTest;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import org.json.JSONObject;
import org.json.JSONTokener;


public class Scenario2 extends BaseTest{

		LoginPage loginPage;
		ProductsPage productsPage;
		ProductDetailsPage productDetailsPage;
		InputStream details;
		JSONObject loginUsers;

		@BeforeClass
		public void beforeClass() throws Exception {
			

		    String path = new File("src/test/resources/Data/data.json").getAbsolutePath();
			details = new FileInputStream(path);
			JSONTokener jsonToken = new JSONTokener(details);
			loginUsers = new JSONObject(jsonToken);
			closeApp();
			launchApp();
		}
		public void beforeMethod(Method m) {
			System.out.println("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		}

		@Test
		public void successfulLogin() throws InterruptedException {
			loginPage = new LoginPage();
			loginPage.enterUserName(loginUsers.getJSONObject("validUser").getString("username"));
			loginPage.enterPassword(loginUsers.getJSONObject("validUser").getString("password"));
			productsPage = loginPage.pressLoginBtn();

			String actualProductTitle = productsPage.getTitle();
			String expectedProductTitle = "PRODUCTS";
			ProductDetailsPage productDetailsPage=new ProductDetailsPage() ;
			
			// ProductsPage productsPage=new ProductsPage();
			Assert.assertEquals(actualProductTitle, expectedProductTitle);
			productsPage.addProduct1ToCart();
			productsPage.addProduct2ToCart();
			productsPage.cartDetailsButtonClick();
			productDetailsPage.removeBtn();
			//productDetailsPage.pressBackToProductsBtn();
			productsPage.addProduct2ToCart();
			productsPage.cartDetailsButtonClick();
		    productDetailsPage.checkoutBtn();
		    checkOutPage chkPage= new checkOutPage();
		    chkPage.clickContinue();
		    // wait(2000);
		    checkoutOverview chkOverview= new checkoutOverview();
		    CheckoutComplete chkComplete= new CheckoutComplete();
		    chkOverview.clickFinish();
		    //Assert.assertTrue(chkComplete.successMsg());
		    
						
		}
		
		
			
	}
