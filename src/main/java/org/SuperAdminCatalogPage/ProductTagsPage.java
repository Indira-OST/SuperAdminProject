
package org.SuperAdminCatalogPage;

import java.time.Duration;

import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.ElementImpl;
import org.openqa.selenium.Alert;
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

public class ProductTagsPage extends AbstractPage {

	private static final By productTagsTab = By.xpath("//span[text()='Product tags']");
	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	private static final By prodTabSearchBtnTxt = By.xpath("//div[text()='Search']");

	private static final By prodRevDeleteBtnTxt = By.id("delete-selected");
	private static final By paginationLeftArrow = By.xpath("//i[@class='k-icon k-i-arrow-e']");
	private static final By paginationRightArrow = By.xpath("//i[@class='k-icon k-i-arrow-w']");
	private static final By pnSelectedNum = By.xpath("//li[@class='paginate_button page-item active']/a");
	private static final By pnUnselectedNum = By.xpath("//li[@class='paginate_button page-item ']/a");
	private static final By showItemsDD = By.xpath("//select[@name='product-tags-grid_length']");
	private static final By ShowItemsRecord = By.xpath("//div[@id='product-tags-grid_info']");
	private static final By Refreshbutton = By.xpath("//button[@class='btn btn-secondary']");
	private static final By prodTagNameTxt=By.xpath("//label[@for='SearchTagName']");
	private static final By prodTagNameTxtBox=By.id("SearchTagName");
	private static final By prodTagSearchBtn=By.id("search-product-tags");
	
	private static final By prodTagEditBtn=By.xpath("//a[text()='Edit']");
	private static final By prodTagGoBackBtn=By.xpath("//button[@name='Go-Back']");
	private static final By SaveAndEditBtn = By.xpath("//button[@name='save-continue']");
	private static final By saveBtn = By.xpath("//button[@name='save']");
	private static final By EPTDeleteBtn=By.id("producttag-delete");
	private static final By EPTTagNameTxt=By.xpath("//label[@for='Name']");
	private static final By EPTTagNameTxtBox=By.id("Name");
	
	
			

	
	
	
		

	public ProductTagsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}
	public ProductTagsPage ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}
	public ProductTagsPage ClickProductTagsTab() {

		click_btn(productTagsTab);

		return this;

	}
	public ProductTagsPage verifyProdTagDetails() throws InterruptedException {

		Thread.sleep(3000);

		String prodSearch = driver.findElement(prodTabSearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");

	
		String prodDelete = driver.findElement(prodRevDeleteBtnTxt).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Product tags available details passed successfully");
		return this;
	}
	public ProductTagsPage getFontColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}

	public ProductTagsPage getBackgroundColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("background-color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}
	public ProductTagsPage verifyProdName(String prodName) {
		String productName = driver.findElement(By.xpath("//td[text()='" + prodName + "']")).getText();
		Assert.assertEquals(productName, prodName);
		return this;
	}
	

	public ProductTagsPage verifyPagination(String prodNameLeft, String prodNameRight) throws InterruptedException {
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
	
	
	public ProductTagsPage verifyShowItems() throws InterruptedException {
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
	public ProductTagsPage prodTagsSearchDetails() {
	
		if (driver.findElement(prodTagNameTxt).isDisplayed()) {
			getElementText(prodTagNameTxt, "Tag name");
			
		}else {
			click_btn(prodTabSearchBtnTxt);
		}
		send_keys(prodTagNameTxtBox, "book");
		click_btn(prodTagSearchBtn);
		ExtentTestManager.getTest().log(Status.PASS,
				"Product search details  passed successfully");
		return this;
	}
	public ProductTagsPage verifyProdRevColTable() throws InterruptedException {

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
		Assert.assertEquals(rowtext1, "Tag name");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Tagged products");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[4]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Edit");

		ExtentTestManager.getTest().log(Status.PASS, "Product tag search table Column name details passed successfully");

		
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "book");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[3]"));
		String valueNo2 = cellNo2.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo2, "3");
		WebElement cellNo3 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[4]"));
		String valueNo3 = cellNo3.getText();
		Assert.assertEquals(valueNo3, "Edit");
		ExtentTestManager.getTest().log(Status.PASS, "Category table  details passed successfully");
		return this;
	}
	
	
	public ProductTagsPage VerifyEditProductTagDetails() {

		click_btn(prodTagEditBtn);
		getElementText(prodTagGoBackBtn, "Go back");
		getElementText(SaveAndEditBtn, "Save & edit");
		getElementText(saveBtn, "Save");
		getElementText(EPTDeleteBtn, "Delete");
		getElementText(EPTTagNameTxt, "Tag name");
		ExtentTestManager.getTest().log(Status.PASS, "Edit product tag details passed successfully");
		driver.findElement(EPTTagNameTxtBox).clear();
		send_keys(EPTTagNameTxtBox, "books");
		click_btn(SaveAndEditBtn);
		String books=driver.findElement(EPTTagNameTxtBox).getAttribute("value");
		Assert.assertEquals(books, "books");
		click_btn(saveBtn);
		getElementText(prodRevDeleteBtnTxt, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Tag name saved passed successfully");
		return this;

	}
	public ProductTagsPage verifyDeleteBtn() {
		if (driver.findElement(prodTagNameTxt).isDisplayed()) {
			getElementText(prodTagNameTxt, "Tag name");
			
		}else {
			click_btn(prodTabSearchBtnTxt);
		}
		send_keys(prodTagNameTxtBox, "Gift");
		click_btn(prodTagSearchBtn);
		click_btn(prodTagEditBtn);
		click_btn(EPTDeleteBtn);
		 Alert alert = driver.switchTo().alert();	
		 
		 String msg=driver.switchTo().alert().getText();	
		 System.out.println("The message is"+msg);
		 alert.accept();
		 ExtentTestManager.getTest().log(Status.PASS, "Deleted tag name successfully");
		 getElementText(prodRevDeleteBtnTxt, "Delete (selected)");
		return this;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}