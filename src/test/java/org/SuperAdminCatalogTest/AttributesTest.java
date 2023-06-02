
package org.SuperAdminCatalogTest;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import org.SuperAdminCatalogPage.AttributesPage;
import org.SuperAdminCatalogPage.Categories_Page;
import org.SuperAdminCatalogPage.ProductReviewPage;
import org.SuperAdminCatalogPage.Product_Page;
import org.openshopee.ui.page.AbstractPage;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttributesTest extends AbstractPage {

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
				.clickSubmit();
			//.adminwebui();.clickloginpage()
	}
	@Test(priority = 2)
		public void ProductAttributeSearch() throws InterruptedException {

			new AttributesPage(driver)
			.ClickCatalog()
			.ClickAttributesTab()
			.ClickProductAttTab()
			.verifyProdAttDetails()
			.verifyAddNewBtn();
	

		}
	@Test(priority = 3)
	public void EditProdAttPreValues() throws InterruptedException {
		new AttributesPage(driver)
		.EPADPredValuesAddNew()
		.verifyAddNewAttValues()
		.verifyUsedByProducts()
		.verifyUseByProdValues()
		.verifyViewBtnValues();

		
	}
	@Test(priority =4)
	public void SpecificationAttributesSearch() throws InterruptedException {
		new AttributesPage(driver)
		.ClickCatalog()
		.ClickAttributesTab()
		.ClickSepciAttTab()
		.verifySpecifAttDetails();
		
	}
	@Test(priority =5)
	public void SpeciAttAddNewDetails() throws InterruptedException {
		
		new AttributesPage(driver)
		.verifyAddAttribute()
		.verifySpecinAttCol()
		.specifAttColDetails()
		.verifyEditSpeciAttDetails()
		.VerifyESADoptions()
		.verifyESAPUsedByProducts();
		
		
		
	}
	
	
	@Test(priority = 6)
		public void CheckoutAttributesSearch() throws InterruptedException {
			new AttributesPage(driver)
			.ClickCatalog()
			.ClickAttributesTab()
			.ClickChkOutAttTab()
			.verifyChkOutAttDetails();
			
		}
	@Test(priority =7)
		public void CheckOutAttAddNewDetails() throws InterruptedException {
			
			new AttributesPage(driver)
			.verifyAddNewChkAttribute()
			.chkOutAddNewAttValue()
			.verifyChkOutAttValuesCol();
	}
	
	
	
	
	
	
	
	
	
	
}