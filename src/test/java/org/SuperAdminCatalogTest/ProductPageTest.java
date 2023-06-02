package org.SuperAdminCatalogTest;

import java.util.Arrays;

import java.util.List;

import org.SuperAdminCatalogPage.Product_Page;
import org.openshopee.ui.page.AbstractPage;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProductPageTest extends AbstractPage {

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

		new Product_Page(driver)
		.ClickCatalog().verifyProductTab()
		.verifyPagination("Science & Faith", "NK_ZSJ_MM")
		
		.verifyShowItems()
		.verifyProductPageDetails()
		.VerifyProductsDetails(PRODUCT_DETAILS)
		.ClickCategoryOption(CATEGORY_OPTION)
		.verifyManufacturer("All")
		.ClickPublsihedOption(PUBLISHED)
		.SearchSubCategories()
		.ProductSearchBtn();
		Thread.sleep(3000);

	}
	

    @Test(priority = 3)
	 public void verifyProductColumn() {
		 new Product_Page(driver)
		 .verifyProductPageColumn(ProductColumnNames)
		 .verifyProductColDetails(ProductColDetails)
		 .ClickEditBtn();
	 }
	 @Test(priority = 4)
	 public void verifyEditProdDetailsProdInfo() throws InterruptedException {
		 new Product_Page(driver)
		
		 .verifyAddNewBtnDetails()
		 .VerifyProductInfo()
		 .verifyDescriptionAndSKUBox()
		
		 .verifyCategoryField("Computers >> Notebooks","Electronics >> Camera & photo","Electronics >> Cell phones")
		 .verifyManufacturersDD("Apple","HP")
		 // .verifyPublishProdTags()
		 .verifyGtinTxtbox()
		 .verifyManPartNumShowPage()
		 .verifyProductTypeDD()
		 .verifyProdTempVisInd()
		 .verifyCusRolesLimStores("Delivery agent","Guest User","Megamart - Store 2")
		 .verifyVendorDropdown()
		 .verifyReqOtherProd()
		 .verifyAvailStartEndDate()
		// .verifyMarkasNew()
		 .verifyAdminComment();
		 Thread.sleep(3000);

	 }
	 @Test(priority =5)
	 public void verifyEditProdDetailsPrice() throws InterruptedException {
		 new Product_Page(driver)
		 .verifyPriceDetail()
		 .verifyProdEditPricesChkBoxes()
		 .verifyCustomersEnterPrice()
		 
		 
		 .verifyBasePriceEnabled()
		 .verifyDiscountsPrice();
		 
	 }
	 @Test(priority =6)
		 public void verifyEditProdDetailsShipping() throws InterruptedException {
			 new Product_Page(driver)
			.verifyEPDShippingPage()
			.veriyPEDShipSubSection();

		 }
	 @Test(priority =7)
		 public void verifyEditProdDetailInventory() throws InterruptedException {
			 new Product_Page(driver)
			.verifyEPDInventory();

		 }
	 @Test(priority =8)
	 public void verifyEditProdProductAttriubtes() throws InterruptedException {
		 new Product_Page(driver)
		 .verifyEditPordAttributes()
		 .veriyProdAttributesAddNew()
		 .verifyAddNewAttInfo()
		 .verifyEPAAddNewValue()
		 .verifyAddNewAttValues()
		 .verifyEditPordAttributesTable();
		 
		
	 }
	 @Test(priority =9)
	 public void verifyEPDSpecifationAtt() throws InterruptedException {
		 new Product_Page(driver)
		 .verifyEPDSpecittributes()
		 .veriySpeicAttributesAddNew()
		 .verifySpecifAttributesTable();
	
	 }
	 @Test(priority =10)
	 public void verifyEPDProdPage() throws InterruptedException {
		 new Product_Page(driver)
		.verifyRecurringProdPage()
		.verifyRecurringProdSubSection();
	
	 }
	 @Test(priority =11)
	 public void verifySEOPage() throws InterruptedException {
		 new Product_Page(driver)
		.verifySEOSection();
	 }

	 @Test(priority =12)
	 public void verifyRelatedProd() throws InterruptedException {
		 new Product_Page(driver)
		.verifyRelatedProd()
		.verifyRelatedProdTable()
		.verifyRelProdEditButton();
		 
	 }
	 @Test(priority = 13)
	 public void verifyCrossSells() throws InterruptedException {
		 new Product_Page(driver)
			.verifyCrossSellsSection()
			.verifyCrossSellTable()
			.verifyCrossSellProdLink();
		 
	 }
	 @Test(priority = 14)
	 public void verifyPurchasedWithOrders() throws InterruptedException {
		 new Product_Page(driver)
			.verifyPurchasedWithOrders();
		 
	 }
	 
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

