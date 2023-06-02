package org.SuperAdminCatalogPage;





import java.time.Duration;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openshopee.ui.page.AbstractPage;
import org.slf4j.LoggerFactory;
import org.testng.Assert; 
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.Status;

import config.SLF4J;
import utility.ExtentTestManager;
import utils.utilities;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AdminPortalPage extends AbstractPage{


	private static final By EnterEmailId = By.id("Email");
	private static final By EnterPassword = By.xpath("//input[@id='Password']");
	private static final By wishList = By.xpath("//span[text()='Wishlist']");
	private static final By LoginBtn=By.xpath("//a[contains(text(),'Log in')]");
	private static final By submitBtn= By.xpath("//button[text()='Log in']");
	private static final By CatalogTab=By.xpath("//span[text()='Catalog']");
	private static final By clickProductTab=By.xpath("//span[text()='Products']");
	private static final By EnterProductName= By.xpath("(//label[text()='Product name']/following::input)[1]");
	private static final By ClickCategoryDD=By.xpath("//select[@data-val-required='The Category field is required.']");
	private static final By TopSearchOption=By.xpath("//h1[@class='pull-left']");
	private static final By ClickPublishedTab =By.xpath("//select[@data-val-required='The Published field is required.']");
	private static final By ClickSearchSubcategories=By.xpath("//input[@data-val-required='The Search subcategories field is required.']");
	private static final By OutletOptionDD=By.xpath("//select[@data-val-required='The Outlet field is required.']");
	private static final By ClickProductSearchBtn=By.xpath("//button[@class='btn btn-primary btn-search']");
	private static final By CategorySearchBox= By.xpath("//input[contains(@class,'form-control text-box')]");
	private static final By ClickCategoryPage= By.xpath("//span[text()='Categories']");
	//private static final By CategorypageSearchBtn= By.xpath("//button[@class='btn btn-primary btn-search']");
	private static final By VerifyCategoryTable= By.xpath("//td[contains(text(),'Grocery')]");
	private static final By clickCreatedFromcal=By.xpath("//span[@aria-controls='CreatedOnFrom_dateview']"); 
	private static final By clickStartDate= By.xpath("//span[@aria-controls='StartDate_dateview']");
	private static final By clickYearTab = By.xpath("//a[@class='k-link k-nav-prev']/following-sibling::a[1]");
	private static final By click2022year=By.xpath("//a[contains(text(),'2022')]");
	private static final By clickMonthTab = By.xpath("(//td[@role='gridcell']//a)[3]");
	private static final By clickDateTab= By.xpath("//a[@title='Friday, March 25, 2022']");
	private static final By productReviewbtn=By.xpath("//span[text()='Product reviews']");
	private static final By clickCreatedTocal=By.xpath("//span[@aria-controls='CreatedOnTo_dateview']"); 
	private static final By clickEndDate=By.xpath("//span[@aria-controls='EndDate_dateview']");
	private static final By clickDateToTab=By.xpath("//a[@data-value='2023/1x/1']");
	private static final By ProductTagName= By.xpath("( //td[@class=' button-column']/button)[1]");
	private static final By clickproductTag= By.xpath("//span[.='Product tags']");
	private static final By TagNameEditSearch= By.xpath("//input[@id='Name']");
	private static final By TagNameSaveBtn=By.xpath("//button[@class='btn bg-aqua']");
	private static final By TagTableName=By.xpath("(//table[@id='product-tags-grid']/tbody/tr/td)[1]");
	private static final By DashboardOrderPageLink= By.xpath("(//span[text()='Dashboard'])[2]");
	private static final By DbOrderPageProductSearch=By.xpath("//input[@id='search-product-name']");
	private static final By selectProductName=By.xpath("(//li[@class='ui-menu-item']/a)[1]");
	private static final By SearchProductTable=By.xpath("(//tr[@role='row']//td)[2]");
	private static final By ostCommerceNewTxt= By.xpath("//div[text()=' OstCommerce News']");
	private static final By  CommonstatisticsTxt= By.xpath("//div[text()=' Common statistics']");
	private static final By dashOrdersTxt= By.xpath("//h3[text()='Orders']");
	private static final By dashNewCusTxt= By.xpath("//h3[text()='New customers']");
	private static final By dashOrderTotalsTxt= By.xpath("//h3[text()='Order totals']");
	private static final By dashIncompleteOrderTxt= By.xpath("//h3[text()='Incomplete orders']");
	private static final By dashLatOrderTxt= By.xpath("//h3[text()=' Latest Orders ']");
	private static final By dashPopularSearchTxt= By.xpath("//h3[text()=' Popular search keywords']");
	private static final By dashBestsellerByQuanxt= By.xpath("//h3[text()=' Bestsellers by quantity']");
	private static final By dashBestSellersAmtTxt= By.xpath("//h3[text()=' Bestsellers by amount']");
	private static final By dashBestsellerByQuanDD= By.xpath("(//i[@class='fas fa-plus'])[8]");
	private static final By ProdSearchBtnTxt= By.xpath("//div[text()='Search']");
	private static final By ProductNewBtn = By.id("product-list-addNew");
	private static final By ProductDownloadBtn = By.id("product-list-download");
	private static final By ProductListExpand = By.id("product-list-expand");
	private static final By ProductListExport = By.id("product-list-export");
	private static final By ProductListImport = By.id("product-list-import");
	private static final By ProductListDelete = By.id("product-list-delete-selected");
	private static final By ProductListExportDD = By.className("btn btn-export-dropdown dropdown-toggle");
	
	/*void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-user\\eclipse-workspace\\sampleprojecy\\drivers\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get(null);
	 */
	//WebDriver driver = null;
//	public AdminPortalPage(WebDriver driver) {
//		this.driver =driver;
//
//	}
	public AdminPortalPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
	
	
	public AdminPortalPage enterUserName(String username) throws InterruptedException {
		// driver.manage().window().maximize();
		Thread.sleep(2000);
		send_keys(EnterEmailId, username);

		ExtentTestManager.getTest().log(Status.INFO, "Entered username successfully");
		return this;
	}

	public AdminPortalPage enterPassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		send_keys(EnterPassword, password);
		ExtentTestManager.getTest().log(Status.INFO, "Entered password successfully");
		return this;
	}
	public AdminPortalPage clickLogin() throws InterruptedException {
		
		Thread.sleep(3000);
	//	driver.manage().window().maximize();
		//Thread.sleep(10000);
		//click_btn(wishList);
		click_btn(LoginBtn);
		return this;		
		
	}
	public void clickloginpage() {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		//click_btn(LoginBtn);
	}
	
	/**
	 * @description this function used to login function
	 * @param username
	 * @param password
	 * @return 
	 * @throws InterruptedException 
	 */
	public AdminPortalPage login(String username,String password) throws InterruptedException {
		enterUserName(username);
		enterPassword(password);
		clickLogin();
		return this;

	}
	
	public AdminPortalPage clickDashboardOrder() throws InterruptedException {
	//	adminwebUi();
		ExtentTestManager.getTest().log(Status.INFO, "Clicked Dashboard link successfully");
		click_btn(DashboardOrderPageLink);
		Thread.sleep(2000);
		
		return this;
	}
	public AdminPortalPage verifyDashboardDetails() throws InterruptedException {
		Thread.sleep(3000);
		String ostCommerce= driver.findElement(ostCommerceNewTxt).getText();
		Assert.assertEquals(ostCommerce, "OstCommerce News");
		String commonTxt= driver.findElement(CommonstatisticsTxt).getText();
		Assert.assertEquals(commonTxt, "Common statistics");
		String order=driver.findElement(dashOrdersTxt).getText();
		Assert.assertEquals(order, "Orders");
	
		String newCust=driver.findElement(dashNewCusTxt).getText();
		Assert.assertEquals(newCust, "New customers");
		String orderTotal=driver.findElement(dashOrderTotalsTxt).getText();
		Assert.assertEquals(orderTotal, "Order totals");
		String incompleteOrder=driver.findElement(dashIncompleteOrderTxt).getText();
		Assert.assertEquals(incompleteOrder, "Incomplete orders");
		
		String lastOrder=driver.findElement(dashLatOrderTxt).getText();
		Assert.assertEquals(lastOrder, "Latest Orders View All Orders");
		Thread.sleep(3000);
		String searchTxt=driver.findElement(dashPopularSearchTxt).getText();
		Assert.assertEquals(searchTxt, "Popular search keywords");
		String sellerByQuantity=driver.findElement(dashBestsellerByQuanxt).getText();
		Assert.assertEquals(sellerByQuantity, "Bestsellers by quantity");
		
		//click_btn(dashBestsellerByQuanDD);
		//click_btn(dashBestsellerByQuanDD);
		Thread.sleep(2000);
		String sellerAmt=driver.findElement(dashBestSellersAmtTxt).getText();
		Assert.assertEquals(sellerAmt,"Bestsellers by amount");
		ExtentTestManager.getTest().log(Status.INFO, "Dashboard available details Text verified successfully");
		return this;
	}
	public AdminPortalPage ClickCatalog() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click_btn(CatalogTab);

		return this;

	}
	public AdminPortalPage verifyProductTab() throws InterruptedException {
		Thread.sleep(3000);
		click_btn(clickProductTab);
		//ExtentTestManager.getTest().log(Status.INFO, "Enter product name successfully");
		
		return this;
	}
	public AdminPortalPage verifyProductPageDetails() throws InterruptedException {
		Thread.sleep(3000);
		String prodSearch=driver.findElement(ProdSearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");
		String addNewBtn=driver.findElement(ProductNewBtn).getText();
		System.out.println("The add new button"+addNewBtn);
		//Assert.assertEquals(addNewBtn, " Add new ");
		String prodDownloadBtn=driver.findElement(ProductDownloadBtn).getText();
		System.out.println("The prod Delete button"+prodDownloadBtn);
		//Assert.assertEquals(prodDownloadBtn, false);
		click_btn(ProductListExpand);
		String ExportText=driver.findElement(ProductListExport).getText();
		System.out.println("the export text "+ExportText);
		String importBtn=driver.findElement(ProductListImport).getText();
		System.out.println("The import text"+importBtn);
		String prodDelete=driver.findElement(ProductListDelete).getText();
		System.out.println("the product delte button"+prodDelete);
		
		return this;
	}

	public AdminPortalPage VerifyProductsDetails(String productname) throws InterruptedException {
		
		Thread.sleep(3000);
		send_keys(EnterProductName, productname);
		ExtentTestManager.getTest().log(Status.INFO, "Enter product name successfully");
		return this;

	}
	public AdminPortalPage ClickCategoryOption(String categoryoption) throws InterruptedException {
		Thread.sleep(2000);
		click_btn(ClickCategoryDD);
		driver.findElement(By.xpath("//option[text()='"+categoryoption+"']")).click();
		ExtentTestManager.getTest().log(Status.INFO, "Enter Category name successfully");
		//click_btn(TopSearchOption);		
		return this;
	}
	public AdminPortalPage ClickPublsihedOption(String publishoption) throws InterruptedException {
		Thread.sleep(2000);
		click_btn(ClickPublishedTab);
		driver.findElement(By.xpath("//option[text()='"+publishoption+"']")).click();
		ExtentTestManager.getTest().log(Status.INFO, "Selected published type successfully");
		//click_btn(TopSearchOption);
		return this;	
	}
	
	public AdminPortalPage SearchSubCategories() {
		
		
		click_btn(ClickSearchSubcategories);
		ExtentTestManager.getTest().log(Status.INFO,"checked search sub categories successfully");
		return this;
	}
	public AdminPortalPage ClickOutletOption(String OutletOption) {
		
		click_btn(OutletOptionDD);
		driver.findElement(By.xpath("//option[contains(text(),'"+OutletOption+"')]")).click();
		return this;
	}
	public AdminPortalPage ProductSearchBtn() {
		click_btn(ClickProductSearchBtn);
		ScrollPage_Down();
		ExtentTestManager.getTest().log(Status.INFO, "product searched successfully");
		return this;
	}
	public AdminPortalPage verifyProductSearchTable(String name) {
		String tabName=driver.findElement(SearchProductTable).getText();
		
		if(tabName.contains(name)) {
		Assert.assertEquals(tabName, tabName.contains(name));
		System.out.println(tabName);
		System.out.println(name);
	}
		return this;
	}
	public AdminPortalPage ScrollPage_Down() {
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
	System.out.println("Scroll down perfomed");
	return this;
}
	public AdminPortalPage CategoriesSearchBox(String CategoryName) {
		send_keys(CategorySearchBox, CategoryName);
		return this;
		
	}
	public AdminPortalPage clickCategoryTab() {
		click_btn(ClickCategoryPage);
		
		return this;
	}

	public AdminPortalPage verifyCategorySearch() {
	//	List<WebElement> catTable=driver.findElements(VerifyCategoryTable).getext();
		return this;
		
	}
	public AdminPortalPage ProductEditButton(String prodId) throws InterruptedException {
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//a[@href='"+prodId+"']")).click();
		return this;	
	}
	public AdminPortalPage verifyProductName(String productname) {
		String prodName = driver.findElement(By.xpath("//input[@value='"+productname+"']")).getAttribute("value");
		System.out.println("the prodName is "+prodName);
		System.out.println(productname);
		if (productname.contains(prodName)) {
			Assert.assertEquals(prodName, productname);
			String searchTxt = driver.findElement(TopSearchOption).getAttribute("value");
			System.out.println("The search text is "+searchTxt);
			String searchTxtone = driver.findElement(TopSearchOption).getText();
			System.out.println("The search tesxt one is"+searchTxtone);
			
		}
		return this;
	}
	public AdminPortalPage productWebTable(String name) {
		
			String text = driver.findElement(By.xpath("//td[text()='BROWN SUGAR']")).getText();
			System.out.println(text);
			Assert.assertEquals(text,name);
		return this;
	}
	
	public AdminPortalPage productWebTable() {
		//WebElement table = driver.findElement(By.xpath("//table[@id='products-grid']"));
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']"));
		List<WebElement> headers = table.findElements(By.tagName("thead"));
		for(WebElement header : headers) {
			String text = header.getText();
			System.out.println("The header are"+text);
			
		}
		List<WebElement> allrows = table.findElements(By.xpath("//table[@class='table table-bordered table-hover table-striped dataTable no-footer']/tbody/tr"));
		int size = allrows.size();
		System.out.println(allrows);
//		for(WebElement row: allrows) {
//			 List<WebElement> columns = row.findElements(By.tagName("td"));
//			 WebElement firstColumn = columns.get(0);
//			 System.out.println(firstColumn.getText());
//		}
		for(int i=0;i<size;i++) {
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			System.out.println("The rows are"+rows);
			WebElement Thirdcolumn = rows.get(2);
			String text = Thirdcolumn.getText();
			System.out.println("The product text is"+text);
			if(text.contains("BROWN SUGAR")) {
				 WebElement input = rows.get(7).findElement(By.tagName("a"));
				 input.click();
				 break;
			}
		}
		
		return this;
	}
	public AdminPortalPage clickproductReviewSearchbtn() {
		
		click_btn(productReviewbtn);
		return this;
	}
	public AdminPortalPage clickCreatedFromCalender() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilities.IMPLICIT_WAIT_TIME));
				click_btn(clickCreatedFromcal);
				System.out.println("Calender icon clicked");
				click_btn(clickYearTab);
				System.out.println("Calender year clicked");
				click_btn(clickYearTab);
				Thread.sleep(2000);
				System.out.println("Calender year clicked");
				click_btn(click2022year);
				Thread.sleep(2000);
				click_btn(clickMonthTab);
				Thread.sleep(2000);
				click_btn(clickDateTab);
				Thread.sleep(2000);
		return this;
		
	}
	
	public AdminPortalPage clickStartDateCal() throws InterruptedException {
		 
		Thread.sleep(2000);
		 
		click_btn(clickStartDate);
		Thread.sleep(2000);
		System.out.println("start date");
		click_btn(clickYearTab);
		System.out.println("Calender year clicked");
		Thread.sleep(2000);
		click_btn(clickYearTab);
		Thread.sleep(2000);
		System.out.println("Calender year clicked");
		click_btn(click2022year);
		Thread.sleep(2000);
		click_btn(clickMonthTab);
		Thread.sleep(2000);
		click_btn(clickDateTab);
		Thread.sleep(2000);
		return this;
	}
	public AdminPortalPage verifyDBprodcut(String name) {
		send_keys(DbOrderPageProductSearch, name);
		System.out.println("product name");
		click_btn(selectProductName);
		return this;
	}
	public AdminPortalPage clickEndDateCal() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilities.IMPLICIT_WAIT_TIME));
				click_btn(clickEndDate);
	
				Thread.sleep(3000);
				click_btn(clickDateToTab);
				Thread.sleep(2000);
		return this;
		
	}
	public AdminPortalPage clickCreatedToCalender() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(utilities.IMPLICIT_WAIT_TIME));
				click_btn(clickCreatedTocal);
	
				Thread.sleep(3000);
				click_btn(clickDateToTab);
				Thread.sleep(2000);
		return this;
		
	}
	
	public AdminPortalPage ProductReviewTable() {
		  List<WebElement> prodTable = driver.findElements(By.xpath("//table[@id='productreviews-grid']"));
		  int size = prodTable.size();
		  WebElement index = prodTable.get(1);
		  
		System.out.println("size : "+size);
		System.out.println("index : "+index);
		
		return this;
	}
	public AdminPortalPage ProductTagsTab(String name) throws InterruptedException {
		click_btn(clickproductTag);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click_btn(ProductTagName);
		
	    Set<String> s1 = driver.getWindowHandles();
	    System.out.println("Child window handle is" + s1);
	    List<String> list = new ArrayList<String>(s1);
	    driver.switchTo().window(list.get(1));
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(2000);
	    driver.findElement(TagNameEditSearch).clear();
	    send_keys(TagNameEditSearch, name);
	    Thread.sleep(2000);
	    click_btn(TagNameSaveBtn);
	    driver.switchTo().window(list.get(0));
	    Thread.sleep(2000);
		String text = driver.findElement(TagTableName).getText();
		System.out.println(driver.getCurrentUrl());
		System.out.println("The first tage name is "+text);
		Assert.assertEquals(text,name);
		return this;
	}
	public AdminPortalPage clickSubmit() {
		// TODO Auto-generated method stub
		ScrollPage_Down();
		click_btn(submitBtn);	
		ExtentTestManager.getTest().log(Status.PASS, "Login Successfully");
		
		return this;
	}
//	public AdminPortalPage adminwebUi() {
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://choithram.nighbro.com/adminwebui");
//		return this;
//		
//	}
}
