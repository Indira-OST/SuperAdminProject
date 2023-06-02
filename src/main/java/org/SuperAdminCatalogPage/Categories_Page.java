
package org.SuperAdminCatalogPage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.ElementImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openshopee.ui.page.AbstractPage;
import org.testng.Assert;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import utility.ExtentTestManager;

public class Categories_Page extends AbstractPage {

	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	
	private static final By categorySearchBtnTxt = By.xpath("//div[text()='Search']");

	private static final By clickCategoriesTab=By.xpath("//span[text()='Categories']");
	private static final By CategoryNewBtn = By.id("category-list-addNew");
	
	private static final By CategoryListExpand = By.id("category-list-expand");
	private static final By CategoryListExport = By.xpath("//button[@id='category-list-export']");
	private static final By CategoryListImport = By.id("category-list-import");
	private static final By CategoryListDelete = By.xpath("//button[text()=' Delete (selected) ']");
	private static final By CategoryNameTxt = By.xpath("//label[@for='SearchCategoryName']");
	private static final By CategoryNameTxtBox=By.xpath("//input[@id='SearchCategoryName']");
	private static final By CategoryPublishedText=By.xpath("//label[@for='SearchPublishedId']");
	private static final By CategoryPublishedSel=By.id("SearchPublishedId");
	private static final By CategorySearchBtn=By.id("search-categories");
	private static final By ClickProductSearchBtn = By.xpath("//button[@class='btn btn-primary btn-search']");
	private static final By CategoryAddNewCatInfoTxt=By.xpath("//div[text()='Category info']");
	private static final By CategoryAddNewDisTxt=By.xpath("//div[text()='Display']");
	private static final By CategoryAddNewMapTxt=By.xpath("//div[text()='Mappings']");
	private static final By CategoryAddNewSEOTxt=By.xpath("//div[text()='SEO']");
	private static final By CategoryAddNewProductsTxt=By.xpath("//div[text()='Products']");
	private static final By AddCatInfoTxt=By.xpath("//div[text()='Category info']");
	private static final By AddCatInfoName=By.xpath("//label[@for='Name']");
	private static final By AddCatInfoNameTxtBoxReq = By.xpath("//div[@class='input-group-btn']");
	private static final By AddCatInfoNameTxtBox = By.xpath("//div[@class='input-group input-group-required']/input");
	private static final By AddCatSaveAndEdit = By.xpath("//button[@name='save-continue']");
	private static final By AddCatNameError = By.xpath("//span[@id='Name-error']");
	private static final By GobackButton = By.xpath("//button[contains(text(),' Go back ')]");
	private static final By CatSearchName=By.xpath("(//tr[@class='odd']//td)[2]");
	private static final By catEditButton=By.xpath("(//tr[@class='odd']//td)[5]");

	private static final By CatParcatTxt=By.xpath("//label[@for='ParentCategoryId']");
	private static final By saveBtn = By.xpath("//button[@name='save']");
	private static final By ECDDisplayTxt=By.xpath("//div[text()='Display']");
	private static final By ECDPublishedTxt=By.xpath("//label[@for='Published']");
	private static final By ECDPublishedChkBx=By.xpath("//input[@id='Published']");
	private static final By ECDShowOnHomeTxt=By.xpath("//label[@for='ShowOnHomepage']");
	private static final By ECDShowOnHomeChkBx=By.xpath("//input[@id='ShowOnHomepage']");
	private static final By ECDIncludeonTopTxt=By.xpath("//label[@for='IncludeInTopMenu']");
	private static final By ECDIncludeonTopChkBx=By.xpath("//input[@id='IncludeInTopMenu']");
	private static final By ECDAllowCusTxt=By.xpath("//label[@for='AllowCustomersToSelectPageSize']");
	private static final By ECDAllowCusChkBox=By.xpath("//input[@id='AllowCustomersToSelectPageSize']");
	private static final By ECDPageSizeTxt=By.xpath("//label[@for='PageSizeOptions']");
	private static final By ECDPageSizeTxtBox=By.xpath("//input[@id='PageSizeOptions']");
	private static final By ECDPriceRangeTxt =By.xpath("//label[@for='PriceRangeFiltering']");
	private static final By ECDPriceRangeChkBx=By.id("PriceRangeFiltering");
	private static final By ECDEnterPriceRangeTxt =By.xpath("//label[@for='ManuallyPriceRange']");
	private static final By ECDEnterPriceRangeChkBx=By.id("ManuallyPriceRange");
	private static final By ECDPriceFromTxt =By.xpath("//label[@for='PriceFrom']");
	private static final By ECDPriceToTxt =By.xpath("//label[@for='PriceTo']");
	private static final By ECDPDisOrderTxt =By.xpath("//label[@for='DisplayOrder']");
	private static final By ECDMappingDiscounts=By.xpath("//label[@for='SelectedDiscountIds']");
	private static final By ECDMappingTxt=By.xpath("//div[text()='Mappings']");
	private static final By ECDLimitedCusRolesOpt=By.xpath("(//div[@role='listbox'])[2]");
	private static final By ECDMappingLimToCus=By.xpath("//label[@for='SelectedCustomerRoleIds']");		
	private static final By ECDLimToCusAdminOpt=By.xpath("(//ul[@id='SelectedCustomerRoleIds_taglist']/li/span)[1]");
	private static final By ECDLimToCusUserOpt=By.xpath("(//ul[@id='SelectedCustomerRoleIds_taglist']/li/span)[3]");
	
	private static final By ECDLimitedtoStoressOpt=By.xpath("(//div[@role='listbox'])[3]");
	private static final By ECDMappingLimToStores=By.xpath("//label[@for='SelectedStoreIds_label']");		
	private static final By ECDMappingMegaMart1=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[1]");
	private static final By ECDMappingMegaMart2=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[3]");
	private static final By ECDSEOSectionTxt = By.xpath("//div[text()='SEO']");
	private static final By ECDSearchEngineTxt = By.xpath("//label[@for='SeName']");
	private static final By ECDSearchEngineTxtbox = By.xpath("//input[@name='SeName']");
	private static final By ECDSearchEngineWarning = By.xpath("//span[@class='field-validation-custom warning']");
	private static final By ECDMetaTitle = By.xpath("//label[@for='MetaTitle']");
	private static final By ECDMetaTitleTxtbox = By.xpath("//input[@name='MetaTitle']");
	private static final By ECDMetaKey = By.xpath("//label[@for='MetaKeywords']");
	private static final By ECDMetaKeyTxtbox = By.xpath("//input[@name='MetaKeywords']");
	private static final By ECDMetaDesc = By.xpath("//label[@for='MetaDescription']");
	private static final By ECDMetaDescTxtbox = By.xpath("//textarea[@name='MetaDescription']");
	private static final By ECdProductsTxt= By.xpath("//div[text()='Products']");			
	private static final By ECdAddNewProdTxt= By.xpath("//button[text()=' Add a new product ']");
	private static final By EnterProductName = By.xpath("(//label[text()='Product name']/following::input)[1]");
	private static final By prodEditChooseProd = By.xpath("(//input[@name='SelectedProductIds'])[1]");
	private static final By paginationLeftArrow = By.xpath("//i[@class='k-icon k-i-arrow-e']");
	private static final By paginationRightArrow = By.xpath("//i[@class='k-icon k-i-arrow-w']");
	private static final By pnSelectedNum = By.xpath("//li[@class='paginate_button page-item active']/a");
	private static final By pnUnselectedNum = By.xpath("//li[@class='paginate_button page-item ']/a");
	private static final By showItemsDD = By.xpath("//select[@name='categories-grid_length']");
	private static final By ShowItemsRecord = By.xpath("//div[@id='categories-grid_info']");
	private static final By Refreshbutton = By.xpath("//button[@class='btn btn-secondary']");
	
	
	
	
	
	
	
	

	
	
	
	
	public Categories_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
	public Categories_Page ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}
	
	
	
	public Categories_Page verifyCategoriesTab() throws InterruptedException {
		Thread.sleep(3000);
		click_btn(clickCategoriesTab);

		// ExtentTestManager.getTest().log(Status.INFO, "Enter product name
		// successfully");

		return this;
		
	}
	public Categories_Page verifyCategoryPageDetails() throws InterruptedException {

		Thread.sleep(3000);

		String prodSearch = driver.findElement(categorySearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");
		String addNewBtn = driver.findElement(CategoryNewBtn).getText();

		Assert.assertEquals(addNewBtn, "Add new");
		
		click_btn(CategoryListExpand);
		Thread.sleep(3000);
		String ExportText = driver.findElement(CategoryListExport).getText();
		System.out.println("the export is" + ExportText);
		// Assert.assertEquals(ExportText, "Export");
		String importBtn = driver.findElement(CategoryListImport).getText();

		Assert.assertEquals(importBtn, "Import");
		String prodDelete = driver.findElement(CategoryListDelete).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Category available details passed successfully");
		return this;
	}
	public Categories_Page verifyCategorySearchDetails() throws InterruptedException {

		Thread.sleep(3000);
		if (driver.findElement(CategoryNameTxt).isDisplayed()) {
			getElementText(CategoryNameTxt, "Category name");
			
		} else {
			click_btn(categorySearchBtnTxt);
		}
		send_keys(CategoryNameTxtBox, "Computers");
		
		ExtentTestManager.getTest().log(Status.PASS, "Category search details passed successfully");
		return this;
	}
	public Categories_Page verifyCategoryColTable() throws InterruptedException {

		Thread.sleep(3000);
//		WebElement l = driver
//				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[25]"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		List<WebElement> columns = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));
		int columnCount = columns.size();
		System.out.println("No of columns in a table : " + columnCount);
		List<WebElement> rows = driver
				.findElements(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)"));
		int rowCount = rows.size();
		System.out.println("No of rows in a table : " + rowCount);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable1 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[2]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Name");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Published");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[4]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Display order");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[5]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Edit");
	
		ExtentTestManager.getTest().log(Status.PASS, "Category search table Column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Computers");
		WebElement cellNo2 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[4]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "1");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[5]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "Edit");

		
		ExtentTestManager.getTest().log(Status.PASS, "Category table  details passed successfully");
		return this;
	}
	public Categories_Page verifyCategoryPublished() throws InterruptedException {

		Thread.sleep(3000);
		getElementText(CategoryPublishedText, "Published");
		Select pub= new Select(driver.findElement(CategoryPublishedSel));
		pub.selectByIndex(1);
		click_btn(CategorySearchBtn);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Published details passed successfully");
		return this;
	}
	public Categories_Page clickSearchBtn() {
		
		click_btn(CategorySearchBtn);
		return this;
	}
	public Categories_Page verifyAddNewPageDetails() {
		click_btn(CategoryNewBtn);
		getElementText(CategoryAddNewCatInfoTxt, "Category info");
		getElementText(CategoryAddNewDisTxt, "Display");
		getElementText(CategoryAddNewMapTxt, "Mappings");
		getElementText(CategoryAddNewSEOTxt, "SEO");
		getElementText(CategoryAddNewProductsTxt, "Products");
		ExtentTestManager.getTest().log(Status.PASS, "Add new category sections text passed successfully");
		return this;
	}
	 
	public Categories_Page verifyCategoryInfo() throws InterruptedException {

		if (driver.findElement(AddCatInfoName).isDisplayed()) {
			getElementText(AddCatInfoName, "Name");
		}else {
			click_btn(AddCatInfoTxt);
			getElementText(AddCatInfoTxt, "Category info");
		}
		element_isDisplayed(AddCatInfoNameTxtBoxReq);
		Thread.sleep(2000);
		send_keys(AddCatInfoNameTxtBox, "test");
		driver.findElement(AddCatInfoNameTxtBox).clear();
		click_btn(AddCatSaveAndEdit);
		getElementText(AddCatNameError, "Please provide a name.");

		send_keys(AddCatInfoNameTxtBox,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk");
		click_btn(AddCatSaveAndEdit);
		getElementText(AddCatNameError, "'Name' must be between 0 and 400 characters.");
		driver.findElement(AddCatInfoNameTxtBox).clear();
		send_keys(AddCatInfoNameTxtBox, "test @123");
		click_btn(AddCatSaveAndEdit);

		click_btn(GobackButton);
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Edit Product available details passed successfully");
			
		
		return this;
	}
		public Categories_Page verifyCatParentCat() throws InterruptedException {
			send_keys(CategoryNameTxtBox, "test");
			clickSearchBtn();
			Thread.sleep(2000);
			getElementText(CatSearchName, "test @123");
			click_btn(catEditButton);
			if (driver.findElement(AddCatInfoName).isDisplayed()) {
				getElementText(AddCatInfoName, "Name");
			}else {
				click_btn(AddCatInfoTxt);
				getElementText(AddCatInfoTxt, "Category info");
			}
//			getElementText(catCatInfoDesc, "Description");
//			send_keys(catCatInfoDescTxt, "The description is entered");
			getElementText(CatParcatTxt, "Parent category");
			Select cat=new Select(driver.findElement(By.id("ParentCategoryId")));
			cat.selectByValue("6");
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Parent category details passed successfully");
			return this;
			
			
		}
	
		public Categories_Page verifyCatDisplaySection() throws InterruptedException {
			
			
			click_btn(ECDPublishedChkBx);
			click_btn(ECDPublishedChkBx);
			getElementText(ECDShowOnHomeTxt, "Show on home page");
			click_btn(ECDShowOnHomeChkBx);
			getElementText(ECDIncludeonTopTxt, "Include in top menu");
			click_btn(ECDIncludeonTopChkBx);
			click_btn(ECDIncludeonTopChkBx);
			getElementText(ECDAllowCusTxt, "Allow customers to select page size");
			click_btn(ECDAllowCusChkBox);
			click_btn(ECDAllowCusChkBox);
			Thread.sleep(3000);
			getElementText(ECDPageSizeTxt, "Page size options");
			driver.findElement(ECDPageSizeTxtBox).clear();
			send_keys(ECDPageSizeTxtBox, "1,3,5");
			click_btn(AddCatSaveAndEdit);
			String pageSize=driver.findElement(ECDPageSizeTxtBox).getAttribute("value");
			Assert.assertEquals(pageSize, "1,3,5");
			ExtentTestManager.getTest().log(Status.PASS, "Display section and price range details passed successfully");
			Thread.sleep(4000);
			
			return this;
		}
		public Categories_Page clickDollarUPBtn(int index) {
			driver.findElement(By.xpath("(//span[@title='Increase value']//span)[" + index + "]")).click();
			return this;

		}

		public Categories_Page clickDollarDownBtn(int index) {
			driver.findElement(By.xpath("(//span[@title='Decrease value']//span)[" + index + "]")).click();
			return this;

		}

		public Categories_Page ClickDollarTxtBox(int index, String dollar) {

			String price = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[" + index + "]"))
					.getAttribute("title");
			Assert.assertEquals(price, dollar);
			return this;
		}
	
		public Categories_Page verifyPriceRangeFilter() throws InterruptedException {
			

			getElementText(ECDPriceRangeTxt, "Price range filtering");
			click_btn(ECDPriceRangeChkBx);
			click_btn(ECDPriceRangeChkBx);
			Thread.sleep(3000);
			getElementText(ECDEnterPriceRangeTxt, "Enter price range manually");
			click_btn(ECDEnterPriceRangeChkBx);
			click_btn(ECDEnterPriceRangeChkBx);
			getElementText(ECDPriceFromTxt, "Price 'from'");
			ClickDollarTxtBox(2, "0.0000 QAR");
			clickDollarUPBtn(2);
			clickDollarUPBtn(2);
			clickDollarDownBtn(2);
			ClickDollarTxtBox(2, "1.0000 QAR");
			getElementText(ECDPriceToTxt, "Price 'to'");
			ClickDollarTxtBox(3, "10000.0000 QAR");
			clickDollarUPBtn(3);
			clickDollarUPBtn(3);
			clickDollarDownBtn(3);
			ClickDollarTxtBox(3, "10001.0000 QAR");
			WebElement l = driver.findElement((ECDPDisOrderTxt));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
			getElementText(ECDPDisOrderTxt, "Display order");
			ClickDollarTxtBox(4, "0 ");
			clickDollarUPBtn(4);
			clickDollarUPBtn(4);
			clickDollarUPBtn(4);
			clickDollarDownBtn(4);
			ClickDollarTxtBox(4, "2 ");
			ExtentTestManager.getTest().log(Status.PASS, "Price range filter details details passed successfully");
			return this;
			
			
			
		}
		public Categories_Page selectOptions(String options) {
			driver.findElement(By.xpath("//li[normalize-space()='"+options+"']")).click();
			return this;
		}
		public Categories_Page verifyECDMappingsSection() throws InterruptedException {
			
			Thread.sleep(3000);
			if (driver.findElement(ECDMappingDiscounts).isDisplayed()) {
				System.out.println("It is displayed");
			}else {
				click_btn(ECDMappingTxt);
				
			}
			
			getElementText(ECDMappingTxt, "Mappings");
			getElementText(ECDMappingLimToCus, "Limited to customer roles");
			click_btn(ECDLimitedCusRolesOpt);
			WebElement l = driver.findElement((ECDMappingLimToCus));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
			selectOptions("Picker");
			Thread.sleep(2000);
			//click_btn(ECDLimitedCusRolesOpt);
			selectOptions("Registered User");
			click_btn(ECDMappingDiscounts);
			Thread.sleep(5000);
			getElementText(ECDLimToCusAdminOpt, "Picker");
			
			getElementText(ECDLimToCusUserOpt, "Registered User");
			
			getElementText(ECDMappingLimToCus, "Limited to customer roles");
			click_btn(ECDLimitedtoStoressOpt);
			selectOptions("Megamart - Store 1");
			selectOptions("Megamart - Store 2");
			click_btn(ECDMappingDiscounts);
			Thread.sleep(2000);
			getElementText(ECDMappingMegaMart1, "Megamart - Store 1");
			getElementText(ECDMappingMegaMart2, "Megamart - Store 2");
			
			return this;
			
			
		}
		public Categories_Page verifySEOSection() throws InterruptedException {
			Thread.sleep(3000);
//			send_keys(CategoryNameTxtBox, "test");
//			clickSearchBtn();
//			Thread.sleep(2000);
//			getElementText(CatSearchName, "test @123");
//			click_btn(catEditButton);
			
			WebElement l = driver.findElement(ECDSEOSectionTxt);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

			if (driver.findElement(ECDSearchEngineTxt).isDisplayed()) {
				getElementText(ECDSearchEngineTxt, "Search engine friendly page name");

			} else {
				click_btn(ECDSEOSectionTxt);

			}
			driver.findElement(ECDSearchEngineTxtbox).clear();
			send_keys(ECDSearchEngineTxtbox, "test");
			click_btn(ECDMetaTitle);
			
		//	getElementText(ECDSearchEngineWarning,
			//		"The entered text will be replaced by 'test-5', since it is already used as a SEO-friendly name for another page or contains invalid characters");
			driver.findElement(ECDSearchEngineTxtbox).clear();
			send_keys(ECDSearchEngineTxtbox, "test-5");
			getElementText(ECDMetaTitle, "Meta title");
			send_keys(ECDMetaTitleTxtbox, "Meta title is entered");
			getElementText(ECDMetaKey, "Meta keywords");
			send_keys(ECDMetaKeyTxtbox, "Meta keywords are entered");
			getElementText(ECDMetaDesc, "Meta description");
			send_keys(ECDMetaDescTxtbox, "Meta description are entered");
			ExtentTestManager.getTest().log(Status.PASS, "SEO section details passed successfully");
			return this;
		}
		public Categories_Page ProductSearchBtn() {
			click_btn(ClickProductSearchBtn);
		//	ScrollPage_Down();
			ExtentTestManager.getTest().log(Status.INFO, "product searched successfully");
			return this;
		}
		public Categories_Page verifyProductsSection() throws InterruptedException {
	
			
			if (driver.findElement(ECdAddNewProdTxt).isDisplayed()) {
				getElementText(ECdAddNewProdTxt, "Add a new product");
				
			} else {
				click_btn(ECdProductsTxt);
				getElementText(ECdProductsTxt, "Products");
			}
			click_btn(ECdAddNewProdTxt);
			String addReqWindow = driver.getWindowHandle();		
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			while (itr.hasNext()) {
				String window = itr.next();
				driver.switchTo().window(window);
				if (driver.getTitle().equals("Add a new product / Ost administration")) {
					send_keys(EnterProductName, "Windows 8 Pro");
					ProductSearchBtn();
					Thread.sleep(3000);
					click_btn(prodEditChooseProd);
					click_btn(saveBtn);

					// driver.close();
				}

			}

			driver.switchTo().window(addReqWindow);
			Thread.sleep(3000);

			ExtentTestManager.getTest().log(Status.PASS, "Edit category details Add a new product passed successfully");
			
			
			
			
			return this;
		}
		

		public Categories_Page verifyProductTable() throws InterruptedException {

			WebElement l = driver.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

			List<WebElement> columns = driver
					.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));
			int columnCount = columns.size();
			System.out.println("No of columns in a table : " + columnCount);
			List<WebElement> rows = driver
					.findElements(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)"));
			int rowCount = rows.size();
			System.out.println("No of rows in a table : " + rowCount);
			WebElement baseTable = driver.findElement(By.tagName("table"));
			WebElement Rowtable1 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[1]"));
			String rowtext1 = Rowtable1.getText();
			System.out.println("The row text of the web table : " + rowtext1);
			Assert.assertEquals(rowtext1, "Product");
			WebElement Rowtable2 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[2]"));
			String rowtext2 = Rowtable2.getText();
			Assert.assertEquals(rowtext2, "Is featured product?");
			WebElement Rowtable3 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]"));
			String rowtext3 = Rowtable3.getText();
			Assert.assertEquals(rowtext3, "Display order");
			WebElement Rowtable4 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[4]"));
			String rowtext4 = Rowtable4.getText();
			Assert.assertEquals(rowtext4, "View");
			WebElement Rowtable5 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[5]"));
			String rowtext5 = Rowtable5.getText();
			Assert.assertEquals(rowtext5, "Edit");
			WebElement Rowtable6 = baseTable
					.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[6]"));
			String rowtext6 = Rowtable6.getText();
			Assert.assertEquals(rowtext6, "Delete");
			ExtentTestManager.getTest().log(Status.PASS, "Product column name details passed successfully");

			WebElement cellNo1 = Rowtable1
					.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[1]"));
			String valueNo1 = cellNo1.getText();
			System.out.println("Cell value is : " + valueNo1);
			Assert.assertEquals(valueNo1, "Windows 8 Pro");
			WebElement cellNo2 = Rowtable2
					.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[3]"));
			String valueNo2 = cellNo2.getText();
			Assert.assertEquals(valueNo2, "1");
			WebElement cellNo4 = Rowtable4.findElement(By.xpath("//a[text()='View']"));
			String valueNo4 = cellNo4.getText();
			Assert.assertEquals(valueNo4, "View");
			WebElement cellNo5 = Rowtable5.findElement(By.xpath("//a[text()='Edit']"));
			String valueNo5 = cellNo5.getText();
			System.out.println("the value no 9 is" + valueNo5);
			Assert.assertEquals(valueNo5, "Edit");
			WebElement cellNo9 = Rowtable6.findElement(By.xpath("//a[text()='Delete']"));
			String valueNo9 = cellNo9.getText();
			System.out.println("the value no 9 is" + valueNo9);
			Assert.assertEquals(valueNo9, "Delete");
			click_btn(AddCatSaveAndEdit);
			getElementText(AddCatInfoTxt, "Category info");
			click_btn(saveBtn);
			getElementText(CategorySearchBtn, "Search");
			ExtentTestManager.getTest().log(Status.PASS, "Product selected column details passed successfully");
			return this;
		}
		public Categories_Page getFontColor(By element, String Expectedcolor) {
			WebElement t = driver.findElement(element);
			String s = t.getCssValue("color");
			String c = Color.fromString(s).asHex();
			Assert.assertEquals(c, Expectedcolor);
			return this;
		}

		public Categories_Page getBackgroundColor(By element, String Expectedcolor) {
			WebElement t = driver.findElement(element);
			String s = t.getCssValue("background-color");
			String c = Color.fromString(s).asHex();
			Assert.assertEquals(c, Expectedcolor);
			return this;
		}
		public Categories_Page verifyProdName(String prodName) {
			String productName = driver.findElement(By.xpath("//td[text()='" + prodName + "']")).getText();
			Assert.assertEquals(productName, prodName);
			return this;
		}

		
		public Categories_Page verifyPagination(String prodNameLeft, String prodNameRight) throws InterruptedException {
			WebElement l = driver.findElement(paginationLeftArrow);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

			Thread.sleep(6000);
			click_btn(paginationLeftArrow);
			// ScrollPage_Down();
			// Thread.sleep(5000);
			verifyProdName(prodNameLeft);
			getFontColor(pnSelectedNum, "#000000");
			WebElement l1 = driver.findElement(paginationLeftArrow);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l1);
			getBackgroundColor(pnSelectedNum, "#ffffff");
			getFontColor(pnUnselectedNum, "#666666");
			getBackgroundColor(pnUnselectedNum, "#fafafa");
			click_btn(paginationRightArrow);
			// ScrollPage_Down();
			verifyProdName(prodNameRight);
			ExtentTestManager.getTest().log(Status.PASS,
					"Pagination controls are showing at the bottom of the page passed successfully");
			return this;
		}


		public Categories_Page verifyShowItems() throws InterruptedException {
			Select showItems = new Select(driver.findElement(showItemsDD));
			List<WebElement> options = showItems.getOptions();

			int size = options.size();
			Assert.assertEquals(size, 5);
			for (int i = 0; i < size; i++) {
				String text = options.get(i).getText();
				System.out.println("the options text" + text);
				if (text.contains("7 items")) {
					Assert.assertEquals(text, "7 items");
				} else if (text.contains("15 items")) {
					Assert.assertEquals(text, "15 items");
				} else if (text.contains("20 items")) {
					Assert.assertEquals(text, "20 items");
				} else if (text.contains("50 items")) {
					Assert.assertEquals(text, "50 items");
				} else if (text.contains("100 items")) {
					Assert.assertEquals(text, "100 items");
				}

			}
			showItems.selectByIndex(2);
			Thread.sleep(2000);

			String noOfItems = driver.findElement(ShowItemsRecord).getText();
//			Assert.assertEquals(noOfItems, noOfItems.contains("1-20 of"));
			click_btn(Refreshbutton);
			ExtentTestManager.getTest().log(Status.PASS,
					"Show Items and Refresh button at the bottom of the page passed successfully");
			return this;
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}