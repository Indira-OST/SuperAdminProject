
package org.SuperAdminCatalogTest;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import org.SuperAdminCatalogPage.Categories_Page;
import org.SuperAdminCatalogPage.ProductReviewPage;
import org.SuperAdminCatalogPage.ProductTagsPage;
import org.SuperAdminCatalogPage.Product_Page;
import org.openshopee.ui.page.AbstractPage;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ProductTagsTest extends AbstractPage {

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
		public void ProductReviewSearch() throws InterruptedException {

			new ProductTagsPage(driver)
			.ClickCatalog()
			
			.ClickProductTagsTab()
			.verifyProdTagDetails()
			.verifyPagination("Apples", "game")
			.verifyShowItems()
			.prodTagsSearchDetails()
			.verifyProdRevColTable()
			.VerifyEditProductTagDetails();
			//.verifyDeleteBtn();
	
	}
	
}