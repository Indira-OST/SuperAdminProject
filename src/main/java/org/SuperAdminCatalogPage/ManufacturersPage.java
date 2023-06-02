
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

public class ManufacturersPage extends AbstractPage {

	private static final By ManufalogTab = By.xpath("//span[text()='Manufalog']");
	private static final By clickManufTab = By.xpath("//span[text()='Manufacturers']");
	private static final By ManufSearchBtnTxt = By.xpath("//div[text()='Search']");
	private static final By ManufNewBtn = By.id("manufacturer-list-addNew");

	private static final By ManufListExpand = By.id("manufacturer-list-expand");
	private static final By ManufListExport = By.xpath("//button[@id='manufacturer-list-export']");
	private static final By ManufListImport = By.id("manufacturer-list-import");
	private static final By ManufListDelete = By.xpath("//button[text()=' Delete (selected) ']");
	private static final By ManufacturerNameTxt=By.xpath("//label[@for='SearchManufacturerName']");	
	private static final By ManufacturerNameTxtBx=By.xpath("//input[@id='SearchManufacturerName']");
	private static final By ManufacturerPublishedText=By.xpath("//label[@for='SearchPublishedId']");
	private static final By ManufacturerPublishedSel=By.id("SearchPublishedId");
	private static final By ManufacturerSearchBtn=By.xpath("//button[text()=' Search ']");
	private static final By ManufAddNewManInfoTxt=By.xpath("//div[text()='Manufacturer info']");
	private static final By ManufAddNewDisTxt=By.xpath("//div[text()='Display']");
	private static final By ManufAddNewMapTxt=By.xpath("//div[text()='Mappings']");
	private static final By ManufAddNewSEOTxt=By.xpath("//div[text()='SEO']");
	private static final By ManufAddNewProductsTxt=By.xpath("//div[text()='Products']");
	private static final By AddManufInfoTxt=By.xpath("//div[text()='Manufacturer info']");
	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	private static final By AddManufInfoName=By.xpath("//label[@for='Name']");
	private static final By AddManufInfoNameTxtBoxReq = By.xpath("//div[@class='input-group-btn']");
	private static final By AddManufInfoNameTxtBox = By.xpath("//div[@class='input-group input-group-required']/input");
	private static final By AddManufSaveAndEdit = By.xpath("//button[@name='save-continue']");
	private static final By AddManufNameError = By.xpath("//span[@id='Name-error']");
	private static final By GobackButton = By.xpath("//button[contains(text(),' Go back ')]");
	private static final By ManufSearchName=By.xpath("(//tr[@class='odd']//td)[2]");
	private static final By ManufEditButton=By.xpath("(//tr[@class='odd']//td)[5]");
	private static final By ManufPublishedTxt=By.xpath("//label[@for='Published']");
	private static final By ManufPublishedChkBx=By.xpath("//input[@id='Published']");
	private static final By ManufAllowCusTxt=By.xpath("//label[@for='AllowCustomersToSelectPageSize']");
	private static final By ManufAllowCusChkBox=By.xpath("//input[@id='AllowCustomersToSelectPageSize']");
	private static final By ManufPageSizeTxt=By.xpath("//label[@for='PageSizeOptions']");
	private static final By ManufPageSizeTxtBox=By.xpath("//input[@id='PageSizeOptions']");
	private static final By ManufPriceRangeTxt =By.xpath("//label[@for='PriceRangeFiltering']");
	private static final By ManufPriceRangeChkBx=By.id("PriceRangeFiltering");
	private static final By ManufEnterPriceRangeTxt =By.xpath("//label[@for='ManuallyPriceRange']");
	private static final By ManufEnterPriceRangeChkBx=By.id("ManuallyPriceRange");
	private static final By ManufPriceFromTxt =By.xpath("//label[@for='PriceFrom']");
	private static final By ManufPriceToTxt =By.xpath("//label[@for='PriceTo']");
	private static final By ManufPDisOrderTxt =By.xpath("//label[@for='DisplayOrder']");
	private static final By ManufMappingDiscounts=By.xpath("//label[@for='SelectedDiscountIds']");
	private static final By ManufMappingTxt=By.xpath("//div[text()='Mappings']");
	private static final By ManufLimitedCusRolesOpt=By.xpath("(//div[@role='listbox'])[2]");
	private static final By ManufMappingLimToCus=By.xpath("//label[@for='SelectedCustomerRoleIds']");		
	private static final By ManufLimToCusAdminOpt=By.xpath("(//ul[@id='SelectedCustomerRoleIds_taglist']/li/span)[1]");
	private static final By ManufLimToCusUserOpt=By.xpath("(//ul[@id='SelectedCustomerRoleIds_taglist']/li/span)[3]");
	
	private static final By ManufLimitedtoStoressOpt=By.xpath("(//div[@role='listbox'])[3]");
	private static final By ManufMappingLimToStores=By.xpath("//label[@for='SelectedStoreIds_label']");		
	private static final By ManufMappingMegaMart1=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[1]");
	private static final By ManufMappingMegaMart2=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[3]");
	private static final By ManufSEOSectionTxt = By.xpath("//div[text()='SEO']");
	private static final By ManufSearchEngineTxt = By.xpath("//label[@for='SeName']");
	private static final By ManufSearchEngineTxtbox = By.xpath("//input[@name='SeName']");
	private static final By ManufSearchEngineWarning = By.xpath("//span[@class='field-validation-custom warning']");
	private static final By ManufMetaTitle = By.xpath("//label[@for='MetaTitle']");
	private static final By ManufMetaTitleTxtbox = By.xpath("//input[@name='MetaTitle']");
	private static final By ManufMetaKey = By.xpath("//label[@for='MetaKeywords']");
	private static final By ManufMetaKeyTxtbox = By.xpath("//input[@name='MetaKeywords']");
	private static final By ManufMetaDesc = By.xpath("//label[@for='MetaDescription']");
	private static final By ManufMetaDescTxtbox = By.xpath("//textarea[@name='MetaDescription']");
	private static final By ManufProductsTxt= By.xpath("//div[text()='Products']");	
	private static final By ManufAddNewProdTxt= By.xpath("//button[text()=' Add a new product ']");
	private static final By EnterProductName = By.xpath("(//label[text()='Product name']/following::input)[1]");
	private static final By prodEditChooseProd = By.xpath("(//input[@name='SelectedProductIds'])[1]");

	private static final By saveBtn = By.xpath("//button[@name='save']");	
	
	
	
	
	
	public ManufacturersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
	
	public ManufacturersPage ClickManufacturerTab() {

		click_btn(clickManufTab);

		return this;

	}
	public ManufacturersPage ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}
	public ManufacturersPage verifyManufPageDetails() throws InterruptedException {

		Thread.sleep(3000);

		String prodSearch = driver.findElement(ManufSearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");
		String addNewBtn = driver.findElement(ManufNewBtn).getText();

		Assert.assertEquals(addNewBtn, "Add new");

		click_btn(ManufListExpand);
		Thread.sleep(3000);
		String ExportText = driver.findElement(ManufListExport).getText();
		System.out.println("the export is" + ExportText);
		// Assert.assertEquals(ExportText, "Export");
		String importBtn = driver.findElement(ManufListImport).getText();

		Assert.assertEquals(importBtn, "Import");
		String prodDelete = driver.findElement(ManufListDelete).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer available details passed successfully");
		return this;
	}
	public ManufacturersPage ClickManufalog() {

		click_btn(ManufalogTab);

		return this;
	}
	
	public ManufacturersPage verifySearchProd() {
		
		if (driver.findElement(ManufacturerNameTxt).isDisplayed()) {
			getElementText(ManufacturerNameTxt, "Manufacturer name");
		} else {
			click_btn(ManufSearchBtnTxt);

		}
		send_keys(ManufacturerNameTxtBx, "Fruits");
		return this;
	}
public ManufacturersPage  duplicateverifySearchProd() {
		
		if (driver.findElement(ManufacturerNameTxt).isDisplayed()) {
			getElementText(ManufacturerNameTxt, "Manufacturer name");
		} else {
			click_btn(ManufSearchBtnTxt);

		}
		send_keys(ManufacturerNameTxtBx, "Fruits");
		return this;
	}
	 public ManufacturersPage verifyPublished() throws InterruptedException {

			Thread.sleep(3000);
			getElementText(ManufacturerPublishedText, "Published");
			Select pub= new Select(driver.findElement(ManufacturerPublishedSel));
			pub.selectByIndex(1);
			click_btn(ManufacturerSearchBtn);
			Thread.sleep(3000);
			ExtentTestManager.getTest().log(Status.PASS, "Published details passed successfully");
			return this;
		}
	 public ManufacturersPage clickSearchBtn() {
			
			click_btn(ManufacturerSearchBtn);
			return this;
		}
	

	public ManufacturersPage verifyManuColTable() throws InterruptedException {
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
	
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer search table Column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Fruits");
		WebElement cellNo2 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[4]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "0");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[5]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "Edit");

		
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer table  details passed successfully");
		return this;
		
	}
	public ManufacturersPage verifyAddNewPageDetails() {
		click_btn(ManufNewBtn);
		getElementText(ManufAddNewManInfoTxt, "Manufacturer info");
		getElementText(ManufAddNewDisTxt, "Display");
		getElementText(ManufAddNewMapTxt, "Mappings");
		getElementText(ManufAddNewSEOTxt, "SEO");
		getElementText(ManufAddNewProductsTxt, "Products");
		ExtentTestManager.getTest().log(Status.PASS, "Add new Manufacturer sections text passed successfully");
		return this;
	}
	public ManufacturersPage verifyManufInfo() throws InterruptedException {

		if (driver.findElement(AddManufInfoName).isDisplayed()) {
			getElementText(AddManufInfoName, "Name");
		}else {
			click_btn(AddManufInfoTxt);
			getElementText(AddManufInfoTxt, "Manufacturer info");
		}
		element_isDisplayed(AddManufInfoNameTxtBoxReq);
		Thread.sleep(2000);
		send_keys(AddManufInfoNameTxtBox, "test");
		driver.findElement(AddManufInfoNameTxtBox).clear();
		click_btn(AddManufSaveAndEdit);
		getElementText(AddManufNameError, "Please provide a name.");

		send_keys(AddManufInfoNameTxtBox,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk");
		click_btn(AddManufSaveAndEdit);
		getElementText(AddManufNameError, "'Name' must be between 0 and 400 characters.");
		driver.findElement(AddManufInfoNameTxtBox).clear();
		send_keys(AddManufInfoNameTxtBox, "test @123");
		click_btn(AddManufSaveAndEdit);

		click_btn(GobackButton);
		Thread.sleep(2000);
		
		ExtentTestManager.getTest().log(Status.PASS, "Edit Product available details passed successfully");
			
		
		return this;
	}
	public ManufacturersPage verifyManufDisplaySection() throws InterruptedException {
		
		send_keys(ManufacturerNameTxtBx, "test @123");
		clickSearchBtn();
		Thread.sleep(2000);
		getElementText(ManufSearchName, "test @123");
		click_btn(ManufEditButton);
		if (driver.findElement(AddManufInfoName).isDisplayed()) {
			getElementText(AddManufInfoName, "Name");
		}else {
			click_btn(AddManufInfoTxt);
			getElementText(AddManufInfoTxt, "Manufacturer info");
		}
		getElementText(ManufPublishedTxt, "Published");
		click_btn(ManufPublishedChkBx);
		click_btn(ManufPublishedChkBx);
		getElementText(ManufAllowCusTxt, "Allow customers to select page size");
		click_btn(ManufAllowCusChkBox);
		click_btn(ManufAllowCusChkBox);
		Thread.sleep(3000);
		getElementText(ManufPageSizeTxt, "Page size options");
		driver.findElement(ManufPageSizeTxtBox).clear();
		send_keys(ManufPageSizeTxtBox, "1,3,5");
		click_btn(AddManufSaveAndEdit);
		String pageSize=driver.findElement(ManufPageSizeTxtBox).getAttribute("value");
		Assert.assertEquals(pageSize, "1,3,5");
		ExtentTestManager.getTest().log(Status.PASS, "Display section and price range details passed successfully");
		Thread.sleep(4000);
		
		return this;
	}
	public ManufacturersPage clickDollarUPBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Increase value']//span)[" + index + "]")).click();
		return this;

	}

	public ManufacturersPage clickDollarDownBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Decrease value']//span)[" + index + "]")).click();
		return this;

	}

	public ManufacturersPage ClickDollarTxtBox(int index, String dollar) {

		String price = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[" + index + "]"))
				.getAttribute("title");
		Assert.assertEquals(price, dollar);
		return this;
	}

	public ManufacturersPage verifyPriceRangeFilter() throws InterruptedException {
		

		getElementText(ManufPriceRangeTxt, "Price range filtering");
		click_btn(ManufPriceRangeChkBx);
		click_btn(ManufPriceRangeChkBx);
		Thread.sleep(3000);
		getElementText(ManufEnterPriceRangeTxt, "Enter price range manually");
		click_btn(ManufEnterPriceRangeChkBx);
		click_btn(ManufEnterPriceRangeChkBx);
		getElementText(ManufPriceFromTxt, "Price 'from'");
		ClickDollarTxtBox(2, "0.0000 QAR");
		clickDollarUPBtn(2);
		clickDollarUPBtn(2);
		clickDollarDownBtn(2);
		ClickDollarTxtBox(2, "1.0000 QAR");
		getElementText(ManufPriceToTxt, "Price 'to'");
		ClickDollarTxtBox(3, "10000.0000 QAR");
		clickDollarUPBtn(3);
		clickDollarUPBtn(3);
		clickDollarDownBtn(3);
		ClickDollarTxtBox(3, "10001.0000 QAR");
		WebElement l = driver.findElement((ManufPDisOrderTxt));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		getElementText(ManufPDisOrderTxt, "Display order");
		ClickDollarTxtBox(4, "0 ");
		clickDollarUPBtn(4);
		clickDollarUPBtn(4);
		clickDollarUPBtn(4);
		clickDollarDownBtn(4);
		ClickDollarTxtBox(4, "2 ");
		ExtentTestManager.getTest().log(Status.PASS, "Price range filter details details passed successfully");
		return this;
		
		
		
	}
	public ManufacturersPage selectOptions(String options) {
		driver.findElement(By.xpath("//li[normalize-space()='"+options+"']")).click();
		return this;
	}
	public ManufacturersPage verifyManufMappingsSection() throws InterruptedException {
//		send_keys(ManufacturerNameTxtBx, "test @123");
//		clickSearchBtn();
//		Thread.sleep(2000);
//		getElementText(ManufSearchName, "test @123");
//		click_btn(ManufEditButton);
//		Thread.sleep(3000);
		if (driver.findElement(ManufMappingDiscounts).isDisplayed()) {
			System.out.println("It is displayed");
		}else {
			click_btn(ManufMappingTxt);
			
		}
		
		getElementText(ManufMappingTxt, "Mappings");
		getElementText(ManufMappingLimToCus, "Limited to customer roles");
		WebElement l = driver.findElement((ManufMappingLimToCus));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		click_btn(ManufLimitedCusRolesOpt);
		Thread.sleep(2000);
		selectOptions("Picker");
	//	click_btn(ManufLimitedCusRolesOpt);
		Thread.sleep(2000);
		selectOptions("Registered User");
		click_btn(ManufMappingDiscounts);
		Thread.sleep(5000);
		getElementText(ManufLimToCusAdminOpt, "Picker");
		
		getElementText(ManufLimToCusUserOpt, "Registered User");
		
		
		getElementText(ManufMappingLimToCus, "Limited to customer roles");
		click_btn(ManufLimitedtoStoressOpt);
		Thread.sleep(2000);
		selectOptions("Megamart - Store 1");
		Thread.sleep(2000);
		//selectOptions("Megamart - Store 2");
		click_btn(ManufMappingDiscounts);
		Thread.sleep(2000);
		getElementText(ManufMappingMegaMart1, "Megamart - Store 1");
		//getElementText(ManufMappingMegaMart2, "Megamart - Store 2");
		Thread.sleep(5000);
		return this;
		
		
	}
	public ManufacturersPage verifySEOSection() throws InterruptedException {
		Thread.sleep(3000);
//		send_keys(ManufacturerNameTxtBx, "test @123");
//		clickSearchBtn();
//		Thread.sleep(2000);
//		getElementText(ManufSearchName, "test @123");
//		click_btn(ManufEditButton);
//		Thread.sleep(3000);
		
		WebElement l = driver.findElement(ManufSEOSectionTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		if (driver.findElement(ManufSearchEngineTxt).isDisplayed()) {
			getElementText(ManufSearchEngineTxt, "Search engine friendly page name");

		} else {
			click_btn(ManufSEOSectionTxt);

		}
		driver.findElement(ManufSearchEngineTxtbox).clear();
		send_keys(ManufSearchEngineTxtbox, "test");
		click_btn(ManufMetaTitle);
		
	//	getElementText(ManufSearchEngineWarning,
		//		"The entered text will be replaced by 'test-5', since it is already used as a SEO-friendly name for another page or contains invalid characters");
		driver.findElement(ManufSearchEngineTxtbox).clear();
		send_keys(ManufSearchEngineTxtbox, "test-5");
		getElementText(ManufMetaTitle, "Meta title");
		send_keys(ManufMetaTitleTxtbox, "Meta title is entered");
		getElementText(ManufMetaKey, "Meta keywords");
		send_keys(ManufMetaKeyTxtbox, "Meta keywords are entered");
		getElementText(ManufMetaDesc, "Meta description");
		send_keys(ManufMetaDescTxtbox, "Meta description are entered");
		ExtentTestManager.getTest().log(Status.PASS, "SEO section details passed successfully");
		return this;
	}
	public ManufacturersPage verifyProductsSection() throws InterruptedException {
		
		
		if (driver.findElement(ManufAddNewProdTxt).isDisplayed()) {
			getElementText(ManufAddNewProdTxt, "Add a new product");
			
		} else {
			click_btn(ManufProductsTxt);
			getElementText(ManufProductsTxt, "Products");
		}
		click_btn(ManufAddNewProdTxt);
		String addReqWindow = driver.getWindowHandle();		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new product / Ost administration")) {
				send_keys(EnterProductName, "Windows 8 Pro");
				clickSearchBtn();
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
	

	public ManufacturersPage verifyProductTable() throws InterruptedException {

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
		click_btn(AddManufSaveAndEdit);
		getElementText(ManufAddNewManInfoTxt, "Manufacturer info");
		click_btn(saveBtn);
		getElementText(ManufSearchBtnTxt, "Search");
		ExtentTestManager.getTest().log(Status.PASS, "Product selected column details passed successfully");
		return this;
	}
}