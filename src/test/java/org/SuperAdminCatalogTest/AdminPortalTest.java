package org.SuperAdminCatalogTest;

import java.io.IOException;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.SuperAdminCatalogPage.AdminPortalPage;
import org.SuperAdminCatalogPage.Product_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openshopee.ui.page.AbstractPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.utilities;

public class AdminPortalTest extends AbstractPage {



	ExtentReports extent;
	ExtentTest test;
	private static final String EMAILID = "superadmintest@openshopee.com";
	private static final String PASSWORD = "admin@123";
 //  @Test(priority = 1, dataProvider = "Logindetails")
//	public void loginTest(String email, String password) {
	//@Test(priority =1)
	   public void loginTest() throws InterruptedException {
		
		//new AdminPortalPage(driver)
	AdminPortalPage ap=new AdminPortalPage(driver);	

	ap.clickLogin();
	new AdminPortalPage(driver)
	//AdminPortalPage ap= 	new AdminPortalPage();

		
		
		.enterUserName("karthikeyan@openshopee.com").enterPassword("admin@123")
		.clickSubmit();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//@DataProvider(indices = { 0, 0 }, name = "Logindetails")
	public String[][] loginData() throws IOException {
		String[][] data = utilities.getTestDataFromExcel();
		return data;
	}

	@Test(priority =1)
	public void login() throws InterruptedException {

		
		// AdminPortalPage a=new AdminPortalPage();
//		a.clickloginpage();
		new Product_Page(driver)
		.enterUserName(EMAILID)
		.enterPassword(PASSWORD)
			.clickSubmit();//.ClickCatalog().verifyProductTab();//.adminwebui();.clickloginpage()
	}
	
	
	@Test(priority = 2)
	public void verifyDashboardOrders() throws InterruptedException {
		//lauchApp();
		new AdminPortalPage(driver)
		
		.clickDashboardOrder();
		//.verifyDashboardDetails();
		
//		.clickStartDateCal()
//		.clickEndDateCal()
//		
//		  .verifyDBprodcut("Butter Scotch Milkshake ") 
//		  .ProductSearchBtn()
//		  .verifyProductSearchTable("NBORD");
	}

//	 @Test(priority =3)
	public void prodcutNameSearch() throws InterruptedException {

		new AdminPortalPage(driver).ClickCatalog()
				.verifyProductTab()
				.verifyProductPageDetails()
			//	.clickCategoryTab();
				.VerifyProductsDetails("HP Spectre XT Pro UltraBook").ClickCategoryOption("Computers >> Notebooks").ClickPublsihedOption("Published only")
				.SearchSubCategories()
				.ProductSearchBtn();

	}
	
	

	//@Test(priority = 3)
	public void verifyCategoriesPage() {
		new AdminPortalPage(driver).clickCategoryTab().CategoriesSearchBox("Grocery").ProductSearchBtn();

	}

	//@Test(priority = 4)
	public void verifyProductReviewsPage() throws InterruptedException {
		new AdminPortalPage(driver).ClickCatalog().clickproductReviewSearchbtn().clickCreatedFromCalender()
				.clickCreatedToCalender().ProductSearchBtn().ProductReviewTable();

	}

	// @Test(priority =5)
	public void verifyProductTagPage() throws InterruptedException {
		new AdminPortalPage(driver)
				// .ClickCatalog()
				.ProductTagsTab("coco");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
