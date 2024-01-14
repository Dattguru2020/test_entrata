package com.qa.TestLayer;

import org.junit.Assert;
import org.junit.Test;
import com.qa.BasePage.BasePage;

public class ToVerifyEntrataHomePage extends BasePage {
	@Test
	//Validate Entrata HomePage functionality
	public void shouldValidateEntrataHomePageFunctionality_whenHomePageLaunched() throws InterruptedException {
		String title = driver.getTitle();
		hm.verifyHomePage();
		Thread.sleep(2000);
		System.out.println(title);
		if(title.equals("Property Management Software | Entrata" )) {
			Assert.assertTrue("Failed to verify Entrata Homepage",true);
		}
		else
		{
			Assert.assertTrue("Failed to load Entrata Homepage",false);
		}
	}
	@Test
	//Validate WatchDemo Functionality
	public void shouldValidateWatchDemoFunctionality_whenWatchDemoButtonIsClicked() throws InterruptedException {
		wd.verifyWatchDemoPage();
		Thread.sleep(2000);
		}
	@Test
	//Validate Sign In Functionality
	public void shouldValidateSignInFunctionality_whenSignInButtonIsClicked() throws InterruptedException {
		si.verifySignInPage();
		Thread.sleep(2000);
	}
	@Test
	//Validate Facility Management Functionality
	public void shouldValidateFacilityManagementPage_whenNavigateToProductsTab() throws InterruptedException {
		prod.verifyFacilityManagementPageUnderProductsTab();
		Thread.sleep(2000);
	}
}