
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

public class ProductReviewPage extends AbstractPage {

	private static final By productReviewTab = By.xpath("//span[text()='Product reviews']");
	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	private static final By prodRevSearchBtnTxt = By.xpath("//div[text()='Search']");
	private static final By prodRevApproveBtnTxt = By.id("approve-selected");
	private static final By prodRevDisApproveBtnTxt = By.id("disapprove-selected");
	private static final By prodRevExpandBtnTxt = By.id("productreview-list-expand");
	private static final By prodRevDeleteBtnTxt = By.id("delete-selected");
	private static final By prodReviewCreatedFromTxt = By.xpath("//label[@for='CreatedOnFrom']");
	private static final By paginationLeftArrow = By.xpath("//i[@class='k-icon k-i-arrow-e']");
	private static final By paginationRightArrow = By.xpath("//i[@class='k-icon k-i-arrow-w']");
	private static final By pnSelectedNum = By.xpath("//li[@class='paginate_button page-item active']/a");
	private static final By pnUnselectedNum = By.xpath("//li[@class='paginate_button page-item ']/a");
	private static final By showItemsDD = By.xpath("//select[@name='productreviews-grid_length']");
	private static final By ShowItemsRecord = By.xpath("//div[@id='productreviews-grid_info']");
	private static final By Refreshbutton = By.xpath("//button[@class='btn btn-secondary']");
	private static final By prodRevSearchTxt = By.id("search-productreviews");
	private static final By createdFromCal = By.xpath("(//span[@class='k-icon k-i-calendar'])[1]");
	private static final By createdFromToCal = By.xpath("(//span[@class='k-icon k-i-calendar'])[2]");
	private static final By clickYear = By.xpath("//a[@class='k-link k-nav-fast']");
	private static final By clickYearPrev = By.xpath("//a[@aria-label='Previous']//span[1]");
	private static final By clickMonth = By.xpath("//a[contains(text(),'Jan')]");
	private static final By clickDate = By.xpath("//a[text()='19']");

	private static final By click18Date = By.xpath("//a[@data-value='2023/4/18']");
	private static final By prodRevMessageTxt = By.xpath("//label[@for='SearchText']");

	private static final By prodRevMessageTxtBox = By.xpath("//input[@id='SearchText']");
	private static final By prodRevAppxt = By.xpath("//label[@for='SearchApprovedId']");
	private static By prodRevAppDisBtSel = By.xpath("//i[contains(@ost-value,'e')]");
	private static By prodRevChkBoxCol = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[1]");

	public ProductReviewPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}

	public ProductReviewPage ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}

	public ProductReviewPage ClickProductReviewTab() {

		click_btn(productReviewTab);

		return this;

	}
	

	public ProductReviewPage verifyProdRevDetails() throws InterruptedException {

		Thread.sleep(3000);

		String prodSearch = driver.findElement(prodRevSearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");
		String addNewBtn = driver.findElement(prodRevApproveBtnTxt).getText();

		Assert.assertEquals(addNewBtn, "Approve selected");
		String disappBtn = driver.findElement(prodRevDisApproveBtnTxt).getText();

		Assert.assertEquals(disappBtn, "Disapprove selected");

		click_btn(prodRevExpandBtnTxt);
		Thread.sleep(3000);

		String prodDelete = driver.findElement(prodRevDeleteBtnTxt).getText();

		Assert.assertEquals(prodDelete, "Delete selected");
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer available details passed successfully");
		return this;
	}

	public ProductReviewPage verifyProdRevSearchProd() throws InterruptedException {

		if (driver.findElement(prodReviewCreatedFromTxt).isDisplayed()) {
			getElementText(prodReviewCreatedFromTxt, "Created from");
		} else {
			click_btn(prodRevSearchBtnTxt);

		}

		click_btn(createdFromCal);
		// click_btn(clickYear);
		click_btn(clickYearPrev);
		click_btn(clickYear);
		click_btn(clickMonth);
		click_btn(clickDate);

		click_btn(createdFromToCal);
		Thread.sleep(2000);
		click_btn(click18Date);

		getElementText(prodRevMessageTxt, "Message");
		Thread.sleep(2000);
		send_keys(prodRevMessageTxtBox, "Quality and Quantity are Good.. Delivery are good");
		getElementText(prodRevAppxt, "Approved");
		Select app = new Select(driver.findElement(By.id("SearchApprovedId")));
		app.selectByIndex(0);
		click_btn(prodRevSearchTxt);

		return this;
	}

	public ProductReviewPage getFontColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}

	public ProductReviewPage getBackgroundColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("background-color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}

	public ProductReviewPage verifyProdName(String prodName) {
		String productName = driver.findElement(By.xpath("//a[text()='" + prodName + "']")).getText();
		Assert.assertEquals(productName, prodName);
		return this;
	}

	public ProductReviewPage verifyShowItems() throws InterruptedException {
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
//		Assert.assertEquals(noOfItems, noOfItems.contains("1-20 of"));
		click_btn(Refreshbutton);
		ExtentTestManager.getTest().log(Status.PASS,
				"Show Items and Refresh button at the bottom of the page passed successfully");
		return this;
	}

	public ProductReviewPage verifyPagination(String prodNameLeft, String prodNameRight) throws InterruptedException {
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

	public ProductReviewPage verifyProdRevColTable() throws InterruptedException {

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
//		WebElement Rowtable10 = baseTable
//				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[2]"));
//		String rowtext10 = Rowtable10.getText();
//		System.out.println("The row text of the web table : " + rowtext10);
//		Assert.assertEquals(rowtext10, "Store");
		WebElement Rowtable1 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[2]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Product");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Customer");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[4]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Title");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[5]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Review text");

		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[6]"));
		String rowtext5 = Rowtable5.getText();
		System.out.println("The row text of the web table : " + rowtext5);
		Assert.assertEquals(rowtext5, "Reply text");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[7]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Rating");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[8]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "Is approved");
		WebElement Rowtable8 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[9]"));
		String rowtext8 = Rowtable8.getText();
		Assert.assertEquals(rowtext8, "Created on");
		WebElement Rowtable9 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[10]"));
		String rowtext9 = Rowtable9.getText();
		Assert.assertEquals(rowtext9, "Edit");

		ExtentTestManager.getTest().log(Status.PASS, "Category search table Column name details passed successfully");

//		WebElement cellNo10 = Rowtable10
//				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]"));
//		String valueNo10 = cellNo10.getText();
//		System.out.println("Cell value is : " + valueNo10);

		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Strawberry Ice cream");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[3]"));
		String valueNo2 = cellNo2.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo2, "superadmintest@openshopee.com");
		WebElement cellNo3 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[4]"));
		String valueNo3 = cellNo3.getText();
		Assert.assertEquals(valueNo3, "Strawberry Ice cream");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[5]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "Quality and Quantity are Good.. Delivery are good");
		WebElement cellNo5 = Rowtable5
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[7]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "5");
		WebElement cellNo8 = Rowtable8
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[9]"));
		String valueNo8 = cellNo8.getText();
		Assert.assertEquals(valueNo8, "05/15/2023 8:04:05 AM");
		WebElement cellNo9 = Rowtable9
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[10]"));
		String valueNo9 = cellNo9.getText();
		Assert.assertEquals(valueNo9, "Edit");

		ExtentTestManager.getTest().log(Status.PASS, "Category table  details passed successfully");
		return this;
	}

	public ProductReviewPage verifyAppDisAppBtn() throws InterruptedException {

		click_btn(prodRevChkBoxCol);
		Thread.sleep(2000);
		String appBtn = driver.findElement(prodRevAppDisBtSel).getAttribute("ost-value");
		Assert.assertEquals(appBtn, "true");
		click_btn(prodRevDisApproveBtnTxt);
		Thread.sleep(2000);
		String DisAppBtn = driver.findElement(prodRevAppDisBtSel).getAttribute("ost-value");
		Assert.assertEquals(DisAppBtn, "false");

		Thread.sleep(2000);
		driver.findElement(prodRevMessageTxtBox).clear();
		send_keys(prodRevMessageTxtBox, "Quality and Quantity are Good.. Delivery are good");
		click_btn(prodRevSearchTxt);
		click_btn(prodRevChkBoxCol);
		Thread.sleep(2000);
		click_btn(prodRevApproveBtnTxt);
		Thread.sleep(3000);
//		String appBtn1=driver.findElement(prodRevAppDisBtSel).getAttribute("ost-value");
//		Assert.assertEquals(appBtn1, "true");
//		Thread.sleep(4000);
		return this;

	}

}