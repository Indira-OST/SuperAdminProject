package org.SuperAdminCatalogTest;


import java.util.Arrays;

import java.util.List;

import org.SuperAdminCatalogPage.Categories_Page;
import org.SuperAdminCatalogPage.ManufacturersPage;
import org.SuperAdminCatalogPage.Product_Page;
import org.openqa.selenium.support.ui.Select;
import org.openshopee.ui.page.AbstractPage;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility.ExtentTestManager;

//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ManufacturersPageTest extends AbstractPage {

	ExtentReports extent;
	ExtentTest test;
	private static final String EMAILID = "superadmintest@openshopee.com";
	private static final String PASSWORD = "admin@123";
	private static final String PRODUCT_DETAILS = "HP Spectre XT Pro UltraBook";
	private static final String CATEGORY_OPTION = "Computers >> Notebooks";
	private static final String PUBLISHED = "Published only";
	private static final String APPLE="Apple";
	
	private static final List<String> ProductColumnNames = Arrays.asList("Picture", "Product name", "SKU", "Price", "Stock quantity","Published", "Edit");
    private static final List<String> ProductColDetails = Arrays.asList("HP Spectre XT Pro UltraBook", "HP_SPX_UB", "1350", "2","Edit");

	@Test(priority =1)
	public void login() throws InterruptedException {

		// AdminPortalPage a=new AdminPortalPage();
//		a.clickloginpage();
		new Product_Page(driver).enterUserName(EMAILID).enterPassword(PASSWORD)
				.clickSubmit();//.ClickCatalog().verifyProductTab();//.adminwebui();.clickloginpage()
	}
	 @Test(priority = 2)
		public void prodcutNameSearch() throws InterruptedException {

			new ManufacturersPage(driver)
			.ClickCatalog()
			.ClickManufacturerTab()
			.verifyManufPageDetails()
			.verifySearchProd()
			.verifyPublished()
			.verifyManuColTable();
			
}
	 @Test(priority = 3)
	 public void verifyAddNewManufInfo() throws InterruptedException {
		
		
		 new ManufacturersPage(driver)
		 .verifyAddNewPageDetails()
			.verifyManufInfo()
			 
			
			.verifyManufDisplaySection()
			.verifyPriceRangeFilter()
			.verifyManufMappingsSection();
			
		 
			
		 
	 }
	 @Test(priority =4)
	 public void verifySEOPage() throws InterruptedException {
		 new ManufacturersPage(driver)
		.verifySEOSection()
		.verifyProductsSection()
		.verifyProductTable();
	 }
	 
	
}
