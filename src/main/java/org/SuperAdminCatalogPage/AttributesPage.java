
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

public class AttributesPage extends AbstractPage {

	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	private static final By AttributesTab = By.xpath("(//i[@class='fas fa-plus-square red-color'])[1]");
	private static final By prodAttributesTab = By.xpath("//span[text()='Product']");

	private static final By prodAddNewBtn = By.xpath("//a[text()=' Add new ']");
	private static final By prodDeleteBtn = By.id("delete-selected-specification-attributes");
	private static final By chkOutDeleteBtn =By.id("delete-selected");
	private static final By GoBackBtn = By.xpath("//button[@name='Go-Back']");
	private static final By saveBtn = By.xpath("//button[@name='save']");
	private static final By AddNewProdInfo = By.xpath("//div[text()='Info']");
	private static final By AddNewProdInfoNameTxt = By.xpath("//label[@for='Name']");

	private static final By AddNewProdInfoNameTxtBx = By.xpath("//input[@class='form-control text-box single-line']");

	private static final By saveAndEditBtn = By.xpath("//button[@name='save-continue']");
	private static final By PredefinedValuesTxt = By.xpath("//div[text()='Predefined values']");
	private static final By preValuesKnowMoreTxt = By.xpath("//div[@class='search-text-info']");
	private static final By preValuesKnowMoreDet = By.xpath("//div[@class='search-body info-content closed']");
	private static final By AddNewValueTxt = By.id("btnAddNewValue");
	private static final By PEDEPAAddNewValueName = By.xpath("//label[@for='Name']");
	private static final By PEDEPAAddNewValueNameTxt = By.xpath("//input[@id='Name']");
	private static final By PEDEPAAddNewValuePriceAdj = By.xpath("//label[@for='PriceAdjustment']");
	private static final By PEDEPAAddNewValuePriceAdjPer = By.xpath("//label[@for='PriceAdjustmentUsePercentage']");
	private static final By PEDEPAAddNewValuePriceAdjPerChk = By.id("PriceAdjustmentUsePercentage");
	private static final By PEDAddNewAttCondTxt = By.xpath("//div[text()='Condition']");
	private static final By PEDEPAAddNewValueWtAdj = By.xpath("//label[@for='WeightAdjustment']");
	private static final By PEDEPAAddNewValueCost = By.xpath("//label[@for='Cost']");
	private static final By PEDEPAEditValueIsPreSel = By.xpath("//label[@for='IsPreSelected']");
	private static final By PEDEPAEditValueIsPreSelChk = By.id("IsPreSelected");

	public static final By PEDRelProdDispTxtBx = By.xpath("//input[@class='userinput']");
	private static final By prodEditDisplayOrder = By.xpath("//label[@for='DisplayOrder']");
	private static final By TestEditBtn = By.xpath("//td[text()='Test']/following :: a[text()='Edit']");
	private static final By TestTxt = By.xpath("//td[text()='Test']");
	private static final By usedProdTxt = By.xpath("//div[text()='Used by products']");
	private static final By usedProdKnowTxt = By.xpath("(//div[@class='search-text-info'])[2]");
	private static final By usedProdKnowDetails = By.xpath("(//div[@class='search-body info-content closed'])[2]");
	private static final By testingProcessTxt = By.xpath("//td[text()='Testing process']");
	private static final By prodTxtboxReq = By.xpath("//div[@class='input-group-btn']");
	private static final By ProdNameTxtbox = By.xpath("//div[@class='input-group input-group-required']/input");
	private static final By ProductInfoText = By.xpath("(//div[@class='card-title'])[1]");
	private static final By speciAttTxt = By.xpath("//span[text()='Specification']");
	private static final By chkOutAttTxt = By.xpath("//span[text()='Checkout']");

	private static final By speciAttAddNewTxt = By.id("addgroup");
	private static final By speciExpandBtn = By.id("attribute-expand");
	private static final By speciCollapseBtn = By.id("attribute-collapse");
	private static final By speciAttGroupInfo = By.xpath("//div[text()='Attribute group info']");
	private static final By specifAttGroupNameTxt = By.xpath("//label[@for='Name']");
	private static final By AddNewSpeciAttTxt = By.xpath("//span[text()='Add a new specification attribute group']");
	private static final By EditSpeciAttTxt = By.xpath("//span[text()='Edit specification attribute group details']");
	private static final By attGroupInoNameTxtbox = By.xpath("//input[@class='form-control text-box single-line']");
	private static final By ColDetailHeadFour = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[4]");
	private static final By ColDetailHeadFive = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[5]");
	private static final By ColDetailHeadSix = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[6]");
	private static final By ColDetailHeadSeven = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[7]");
	private static final By ColDetailHeadEight = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[8]");
	private static final By ColDetailRowOne = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[1]");
	private static final By ColDetailRowTwo = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[2]");
	private static final By ColDetailRowThree = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[3]");
	private static final By ColDetailRowFour = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[4]");
	private static final By ColDetailRowFive = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[5]");
	private static final By ColDetailRowSix = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[6]");
	private static final By ColDetailRowSeven = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[7]");

	private static final By ColDetailRowEight = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[8]");

	private static final By ColDetailRowNine = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[9]");

	private static final By ColDetailRowTen = By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[10]");
	private static final By ColDetailRowEleven = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[11]");
	private static final By ColDetailRowThirteen = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[13]");
	
	private static final By ColDetailRowSixteen = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[16]");
	private static final By ColDetailRowEighteen = By
			.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[18]");

	private static final By ESADOPtionText = By.xpath("//div[text()='Options']");

	private static final By ColDetailHeadOne = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[1]");
	private static final By ColDetailHeadTwo = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[2]");
	private static final By ColDetailHeadThree = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]");

	private static final By ColDetailHeadDelete = By
			.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[5]");

	private static final By optAddNewTxt = By.id("btnAddNewOption");
	private static final By optAddNewOptionTxt = By.xpath("//h1[@class='float-left']");

	private static final By AddNewNameTxtBx = By.xpath("(//input[@class='form-control text-box single-line'])[1]");
	private static final By AddNewSpecifyTxt = By.xpath("//label[text()='Specify color']");
	private static final By AddNewSpecifyChk = By.xpath("//label[@for='EnableColorSquaresRgb']");
	private static final By AddNewRGBTxt = By.xpath("//label[@for='ColorSquaresRgb']");
	private static final By ProdInfoTxt = By.xpath("(//div[text()='Product info'])[1]");

	private static final By AddNewRGBTxtBx = By.xpath("//input[@name='ColorSquaresRgb']");
	private static final By chkOutAttAddNewTxt=By.xpath("//span[text()='Add a new checkout attribute']");
	private static final By addNewChkOutInfo=By.xpath("//div[text()='Attribute info']");
	private static final By PEDAddNewAttTxtPrmpt = By.xpath("//label[@for='TextPrompt']");
	private static final By PEDAddNewAttTxtPrmptbox = By.id("TextPrompt");
	private static final By PEDAddNewAttIsReq = By.xpath("//label[@for='IsRequired']");
	private static final By PEDAddNewAttIsReqchk = By.id("IsRequired");
	private static final By PEDAddNewAttContType = By.xpath("//label[@for='AttributeControlTypeId']");
	private static final By PEDAddNewAttDisOrder = By.xpath("//label[@for='DisplayOrder']");
	private static final By PEDShippableProdReqTxt = By.xpath("//label[@for='ShippableProductRequired']");
	private static final By PEDShippableProdReqChkBx = By.id("ShippableProductRequired");

	private static final By PEDTaxExempt = By.xpath("//label[@for='IsTaxExempt']");
	private static final By PEDTaxExemptChkbox = By.id("IsTaxExempt");
	private static final By PEDTaxCategoryTxt = By.xpath("//label[@for='TaxCategoryId']");
	private static final By PEDTaxCategoryDD = By.id("TaxCategoryId");
	private static final By prodEditLimToStores = By.id("SelectedStoreIds_label");
	private static final By prodEditLimToStoresDd = By.xpath("//input[@aria-describedby='SelectedStoreIds_taglist']");
	private static final By limitedStoreMegaMart2=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[1]");
	private static final By limitedStoreMegaMart1=By.xpath("(//ul[@id='SelectedStoreIds_taglist']/li/span)[3]");
	private static final By chkOutAttValueTxt=By.xpath("//div[text()='Attribute values']");
	private static final By chkOutValueKnowMoreTxt=By.xpath("(//div[@class='search-text-info'])[1]");
	private static final By chkOutValueKnowMoreDet=By.xpath("(//div[@class='search-body info-content closed'])[1]");
	


	
	

	public AttributesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}

	public AttributesPage ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}

	public AttributesPage ClickAttributesTab() throws InterruptedException {
		Thread.sleep(2000);
		click_btn(AttributesTab);
		Thread.sleep(2000);
		return this;

	}

	public AttributesPage ClickProductAttTab() {

		click_btn(prodAttributesTab);

		return this;

	}

	public AttributesPage verifyProdAttDetails() throws InterruptedException {

		Thread.sleep(3000);

		String addNewBtn = driver.findElement(prodAddNewBtn).getText();

		Assert.assertEquals(addNewBtn, "Add new");

		String prodDelete = driver.findElement(chkOutDeleteBtn).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Product attributes available details passed successfully");
		return this;
	}

	public AttributesPage clickDollarUPBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Increase value']//span)[" + index + "]")).click();
		return this;

	}

	public AttributesPage clickDollarDownBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Decrease value']//span)[" + index + "]")).click();
		return this;

	}

	public AttributesPage ClickDollarTxtBox(int index, String dollar) {

		String price = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[" + index + "]"))
				.getAttribute("title");
		Assert.assertEquals(price, dollar);
		return this;
	}

	public AttributesPage verifyAddNewBtn() throws InterruptedException {

		click_btn(prodAddNewBtn);
		getElementText(AddNewProdInfo, "Info");
		getElementText(PredefinedValuesTxt, "Predefined values");
		getElementText(saveAndEditBtn, "Save & edit");
		getElementText(saveBtn, "Save");
		getElementText(GoBackBtn, "Go back");

		if (driver.findElement(AddNewProdInfoNameTxt).isDisplayed()) {
			getElementText(AddNewProdInfoNameTxt, "Name");
			getElementText(AddNewProdInfo, "Info");

		} else {
			click_btn(AddNewProdInfo);
		}
		if (driver.findElement(preValuesKnowMoreTxt).isDisplayed()) {
			System.out.println("It is displaying");
		} else {
			click_btn(PredefinedValuesTxt);
		}
		Thread.sleep(2000);
		getElementText(preValuesKnowMoreTxt, "Know more about Predefined values");
		click_btn(preValuesKnowMoreTxt);
		getElementText(preValuesKnowMoreDet,
				"You need to save the product attribute before you can add values for this page.");

		send_keys(AddNewProdInfoNameTxtBx, "Testing process");
		click_btn(saveAndEditBtn);
		return this;
	}

	public AttributesPage EPADPredValuesAddNew() throws InterruptedException {

		click_btn(preValuesKnowMoreTxt);
		getElementText(preValuesKnowMoreDet,
				"Predefined (default) values are helpful for a store owner when creating new products. Then when you add the attribute to a product, you don't have to create the values again.");
		getElementText(AddNewValueTxt, "Add a new value");

		// click_btn(AddNewValueTxt);

		getElementText(AddNewValueTxt, "Add a new value");
		click_btn(AddNewValueTxt);
		String addReqWindow = driver.getWindowHandle();
		// click_btn(prodEditAddReqProd);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new value / Ost administration")) {

				getElementText(PEDEPAAddNewValueName, "Name");
				send_keys(PEDEPAAddNewValueNameTxt, "Add a new value text");
				getElementText(PEDEPAAddNewValuePriceAdj, "Price adjustment");
				ClickDollarTxtBox(1, "0.0000 ");
				clickDollarUPBtn(1);
				clickDollarUPBtn(1);
				clickDollarDownBtn(1);
				ClickDollarTxtBox(1, "1.0000 ");
				click_btn(saveBtn);
				Thread.sleep(3000);
				ExtentTestManager.getTest().log(Status.PASS, "Add new values details passed successfully");
				// driver.close();

			}

		}

		driver.switchTo().window(addReqWindow);
		Thread.sleep(3000);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[2]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Price adjustment");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td[2]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "1");
		click_btn(AddNewValueTxt);
		String addReqWindow1 = driver.getWindowHandle();
		// click_btn(prodEditAddReqProd);
		Set<String> windows1 = driver.getWindowHandles();
		Iterator<String> itr1 = windows1.iterator();
		while (itr1.hasNext()) {
			String window = itr1.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new value / Ost administration")) {

				getElementText(PEDEPAAddNewValueName, "Name");
				send_keys(PEDEPAAddNewValueNameTxt, "Add a new value text");
				getElementText(PEDEPAAddNewValuePriceAdj, "Price adjustment");
				ClickDollarTxtBox(1, "0.0000 ");
				clickDollarUPBtn(1);
				clickDollarUPBtn(1);
				clickDollarDownBtn(1);
				ClickDollarTxtBox(1, "1.0000 ");
				getElementText(PEDEPAAddNewValuePriceAdjPer, "Price adjustment. Use percentage");
				click_btn(PEDEPAAddNewValuePriceAdjPerChk);
				// click_btn(saveBtn);
				// driver.close();

				getElementText(PEDEPAAddNewValueWtAdj, "Weight adjustment");
				ClickDollarTxtBox(2, "0.0000 ");
				clickDollarUPBtn(2);
				clickDollarUPBtn(2);
				clickDollarDownBtn(2);
				ClickDollarTxtBox(2, "1.0000 ");
				getElementText(PEDEPAAddNewValueCost, "Cost");
				ClickDollarTxtBox(3, "0.0000 ");
				clickDollarUPBtn(3);
				clickDollarUPBtn(3);
				clickDollarUPBtn(3);
				clickDollarDownBtn(3);
				ClickDollarTxtBox(3, "2.0000 ");
				getElementText(PEDEPAEditValueIsPreSel, "Is pre-selected");
				click_btn(PEDEPAEditValueIsPreSelChk);
				getElementText(prodEditDisplayOrder, "Display order");
				ClickDollarTxtBox(4, "0 ");
				clickDollarUPBtn(4);
				clickDollarUPBtn(4);
				clickDollarDownBtn(4);
				ClickDollarTxtBox(4, "1 ");

				click_btn(saveBtn);

				driver.switchTo().window(addReqWindow1);

				Thread.sleep(3000);
				// click_btn(GoBackBtn);

				// getElementText(PEDAddNewAttCondTxt, "Condition");
				// Thread.sleep(3000);

			}

		}

		return this;

	}

	public AttributesPage verifyAddNewAttValues() {

		driver.findElement(PredefinedValuesTxt).isDisplayed();
		System.out.println("The element is displayed");
		WebElement l = driver.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		List<WebElement> columns = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));
		int columnCount = columns.size();
		System.out.println("No of columns in a table : " + columnCount);
		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td"));
		int rowCount = rows.size();
		System.out.println("No of rows in a table : " + rowCount);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable1 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[1])[1]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Name");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[2])[1]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Price adjustment");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[3])[1]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Weight adjustment");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[4])[1]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Is pre-selected");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[5])[1]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "Display order");
		WebElement Rowtable8 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[6])[1]"));
		String rowtext8 = Rowtable8.getText();
		Assert.assertEquals(rowtext8, "Edit");
		WebElement Rowtable9 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[7])[1]"));
		String rowtext9 = Rowtable9.getText();
		Assert.assertEquals(rowtext9, "Delete");

		ExtentTestManager.getTest().log(Status.PASS, "Product attribute column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[1])[2]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Add a new value text");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[2])[1]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "1");
		WebElement cellNo4 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[2])[2]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "1 %");
		WebElement cellNo5 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[3])[2]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "1");
		WebElement cellNo6 = Rowtable7
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[5])[2]"));
		String valueNo6 = cellNo6.getText();
		System.out.println("the value no 6 is" + valueNo6);
		Assert.assertEquals(valueNo6, "1");

		WebElement cellNo9 = Rowtable8.findElement(By.xpath("//button[text()='Edit']"));
		String valueNo9 = cellNo9.getText();
		Assert.assertEquals(valueNo9, "Edit");
		WebElement cellNo10 = Rowtable9.findElement(By.xpath("//a[text()='Delete']"));
		String valueNo10 = cellNo10.getText();
		Assert.assertEquals(valueNo10, "Delete");
		click_btn(GoBackBtn);
		WebElement l1 = driver.findElement(testingProcessTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l1);
		getElementText(testingProcessTxt, "Testing process");
		ExtentTestManager.getTest().log(Status.PASS, "Product attribute column details passed successfully");
		return this;

	}

	public AttributesPage verifyUsedByProducts() {

		WebElement l = driver.findElement(TestTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		click_btn(TestEditBtn);
		if (driver.findElement(usedProdKnowTxt).isDisplayed()) {
			System.out.println("It is displayed");
		} else {
			click_btn(usedProdTxt);
		}
		getElementText(usedProdTxt, "Used by products");
		getElementText(usedProdKnowTxt, "Know more about Used by products");
		click_btn(usedProdKnowTxt);
		getElementText(usedProdKnowDetails, "Here you can see a list of products which use this attribute.");

		return this;

	}

	public AttributesPage verifyUseByProdValues() {

		WebElement l = driver.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		List<WebElement> columns = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));
		int columnCount = columns.size();
		System.out.println("No of columns in a table : " + columnCount);
		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td"));
		int rowCount = rows.size();
		System.out.println("No of rows in a table : " + rowCount);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable1 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[8]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Product");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[9]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Published");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[10]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "View");

		ExtentTestManager.getTest().log(Status.PASS, "Used by product column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[15]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "test @123");

		WebElement cellNo5 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[17]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "View");

		ExtentTestManager.getTest().log(Status.PASS, "Used by products column details passed successfully");
		return this;

	}

	public AttributesPage verifyViewBtnValues() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[17]")).click();
		Thread.sleep(2000);
		if (driver.findElement(ProdNameTxtbox).isDisplayed()) {
			System.out.println("It is up arrow");

		} else {
			click_btn(ProductInfoText);
		}
		Thread.sleep(2000);
		String prodName = driver.findElement(ProdNameTxtbox).getAttribute("value");
		Assert.assertEquals(prodName, "test @123");
		return this;

	}

	public AttributesPage ClickSepciAttTab() {

		click_btn(speciAttTxt);
		return this;

	}
	public AttributesPage ClickChkOutAttTab() {

		click_btn(chkOutAttTxt);
		return this;

	}
	public AttributesPage verifySpecifAttDetails() throws InterruptedException {

		Thread.sleep(3000);

		String addNewBtn = driver.findElement(speciAttAddNewTxt).getText();

		Assert.assertEquals(addNewBtn, "Add attributee");
		click_btn(speciExpandBtn);
		String prodDelete = driver.findElement(prodDeleteBtn).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		click_btn(speciCollapseBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Specification attributes available details passed successfully");
		return this;
	}
	public AttributesPage verifyChkOutAttDetails() throws InterruptedException {

		Thread.sleep(3000);

		String addNewBtn = driver.findElement(prodAddNewBtn).getText();

		Assert.assertEquals(addNewBtn, "Add new");
		
		String prodDelete = driver.findElement(chkOutDeleteBtn).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		
		ExtentTestManager.getTest().log(Status.PASS, "Checkout attributes available details passed successfully");
		return this;
	}

	public AttributesPage verifyAddAttribute() {

		click_btn(speciAttAddNewTxt);
		getElementText(GoBackBtn, "Go back");
		getElementText(AddNewSpeciAttTxt, "Add a new specification attribute group");
		getElementText(saveAndEditBtn, "Save & edit");
		getElementText(saveBtn, "Save");
		getElementText(speciAttGroupInfo, "Attribute group info");
		if (driver.findElement(specifAttGroupNameTxt).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(speciAttGroupInfo);
		}
		getElementText(specifAttGroupNameTxt, "Name");
		send_keys(attGroupInoNameTxtbox, "test @123");
		getElementText(prodEditDisplayOrder, "Display order");
		ClickDollarTxtBox(1, "0 ");
		clickDollarUPBtn(1);
		clickDollarUPBtn(1);
		clickDollarDownBtn(1);
		ClickDollarTxtBox(1, "1 ");
		click_btn(saveAndEditBtn);

		getElementText(EditSpeciAttTxt, "Edit specification attribute group details");

		click_btn(saveBtn);
		getElementText(speciAttAddNewTxt, "Add attributee");
		return this;

	}
	public AttributesPage verifyAddNewChkAttribute() {

		click_btn(prodAddNewBtn);
		getElementText(GoBackBtn, "Go back");
		getElementText(chkOutAttAddNewTxt, "Add a new checkout attribute");
		getElementText(saveAndEditBtn, "Save & edit");
		getElementText(saveBtn, "Save");
		getElementText(addNewChkOutInfo, "Attribute info");
		if (driver.findElement(AddNewProdInfoNameTxt).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(addNewChkOutInfo);
		}
		getElementText(AddNewProdInfoNameTxt, "Name");
		send_keys(AddNewNameTxtBx, "test @123");
		getElementText(PEDAddNewAttTxtPrmpt, "Text prompt");
		send_keys(PEDAddNewAttTxtPrmptbox, "The Text prmpt box entered");
		getElementText(PEDAddNewAttIsReq, "Required");
		click_btn(PEDAddNewAttIsReqchk);
		getElementText(PEDShippableProdReqTxt, "Shippable product required");
		click_btn(PEDShippableProdReqChkBx);
		getElementText(PEDAddNewAttDisOrder, "Display order");
		ClickDollarTxtBox(1, "0 ");
		clickDollarUPBtn(1);
		clickDollarUPBtn(1);
		clickDollarDownBtn(1);
		ClickDollarTxtBox(1, "1 ");
		if (driver.findElement(PEDTaxCategoryTxt).isDisplayed()) {
			System.out.println("It is displayed");
			
		} else {
			click_btn(PEDTaxExemptChkbox);
		}
		getElementText(PEDTaxCategoryTxt, "Tax category");
		Select taxCat = new Select(driver.findElement(PEDTaxCategoryDD));
		taxCat.selectByIndex(3);
		getElementText(prodEditLimToStores, "Limited to stores");
		click_btn(prodEditLimToStoresDd);
		driver.findElement(By.xpath("//li[normalize-space()='Megamart - Store 2']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Megamart - Store 1']")).click();
		click_btn(prodEditLimToStores);

		getElementText(limitedStoreMegaMart2, "Megamart - Store 2");
		getElementText(limitedStoreMegaMart1, "Megamart - Store 1");
		
		
		return this;

	}
	public AttributesPage chkOutAddNewAttValue() throws InterruptedException {
		System.out.println("It is displayed att new att vlaue");
		
		Thread.sleep(2000);
		if(driver.findElement(chkOutValueKnowMoreTxt).isDisplayed()) {
			System.out.println("It is displyaed");
		}else {
			click_btn(chkOutAttValueTxt);
		}
			getElementText(chkOutAttValueTxt, "Attribute values");
			getElementText(chkOutValueKnowMoreTxt, "Know more about Attribute values");
			click_btn(chkOutValueKnowMoreTxt);
			getElementText(chkOutValueKnowMoreDet, "You need to save the checkout attribute before you can add values for this checkout attribute page.");
			click_btn(saveAndEditBtn);
			System.out.println("It is saved and edited");
			WebElement l = driver.findElement(chkOutAttValueTxt);
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
			if(driver.findElement(AddNewValueTxt).isDisplayed()) {
				System.out.println("It is displyaed");
			}else {
				click_btn(chkOutAttValueTxt);
			}
			getElementText(AddNewValueTxt, "Add a new checkout attribute value");
			String addReqWindow = driver.getWindowHandle();
			click_btn(AddNewValueTxt);
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> itr = windows.iterator();
			while (itr.hasNext()) {
				String window = itr.next();
				driver.switchTo().window(window);
				if (driver.getTitle().equals("Add a new checkout attribute value / Ost administration")) {
					System.out.println("new window is opening");
					getElementText(AddNewProdInfoNameTxt, "Name");
					send_keys(AddNewNameTxtBx, "test @123");
					getElementText(PEDEPAAddNewValuePriceAdj, "Price adjustment");
					ClickDollarTxtBox(1, "0.0000 QAR");
					clickDollarUPBtn(1);
					clickDollarUPBtn(1);
					clickDollarDownBtn(1);
					ClickDollarTxtBox(1, "1.0000 QAR");
					getElementText(PEDEPAAddNewValueWtAdj, "Weight adjustment");
					ClickDollarTxtBox(2, "0.0000 gram(s)");
					clickDollarUPBtn(2);
					clickDollarUPBtn(2);
					clickDollarDownBtn(2);
					ClickDollarTxtBox(2, "1.0000 gram(s)");
					getElementText(PEDEPAEditValueIsPreSel, "Pre-selected");
					click_btn(PEDEPAEditValueIsPreSelChk);
					getElementText(prodEditDisplayOrder, "Display order");
					ClickDollarTxtBox(3, "0 ");
					clickDollarUPBtn(3);
					clickDollarUPBtn(3);
					clickDollarDownBtn(3);
					ClickDollarTxtBox(3, "1 ");
					Thread.sleep(2000);
					click_btn(saveBtn);
					Thread.sleep(2000);
					// driver.close();
				}

			}

			driver.switchTo().window(addReqWindow);
			Thread.sleep(3000);
			getElementText(chkOutAttValueTxt, "Attribute values");
			
			
		return this;
		
		
		
	}
	public AttributesPage verifyChkOutAttValuesCol() {
		getElementText(ColDetailHeadOne, "Name");
		getElementText(ColDetailHeadTwo, "Price adjustment");
		getElementText(ColDetailHeadThree, "Weight adjustment");
		getElementText(ColDetailHeadFour, "Pre-selected");
		getElementText(ColDetailHeadFive, "Display order");
		getElementText(ColDetailHeadSix, "Edit");
		getElementText(ColDetailHeadSeven, "Delete");
		getElementText(ColDetailRowOne, "test @123");
		getElementText(ColDetailRowTwo, "1");
		getElementText(ColDetailRowThree, "1");
		getElementText(ColDetailRowFive, "1");

		getElementText(ColDetailRowSix, "Edit");
		getElementText(ColDetailRowSeven, "Delete");
		
		return this;
		
		
	}

	public AttributesPage verifySpecinAttCol() {

		WebElement l = driver.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		List<WebElement> columns = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));
		int columnCount = columns.size();
		System.out.println("No of columns in a table : " + columnCount);
		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td"));
		int rowCount = rows.size();
		System.out.println("No of rows in a table : " + rowCount);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable1 = baseTable.findElement(ColDetailHeadTwo);
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Name");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[3]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Display order");

		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[14]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "test @123");

		WebElement cellNo5 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[15]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "1");

		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute column details passed successfully");
		return this;

	}

	public AttributesPage specifAttColDetails() {

		click_btn(ColDetailRowFour);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable1 = baseTable.findElement(ColDetailHeadFive);
		String rowtext1 = Rowtable1.getText();
		Assert.assertEquals(rowtext1, "Name");
		WebElement Rowtable2 = baseTable.findElement(ColDetailHeadSix);
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Display order");
		WebElement Rowtable3 = baseTable.findElement(ColDetailHeadSeven);
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Edit");

		WebElement cellNo1 = Rowtable1.findElement(ColDetailRowNine);
		String valueNo1 = cellNo1.getText();
		Assert.assertEquals(valueNo1, "CPU Type");
		WebElement cellNo2 = Rowtable2.findElement(ColDetailRowTen);
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "2");
		WebElement cellNo3 = Rowtable3.findElement(ColDetailRowEleven);
		String valueNo3 = cellNo3.getText();
		Assert.assertEquals(valueNo3, "Edit");
		return this;
	}

	public AttributesPage verifyEditSpeciAttDetails() {

		click_btn(ColDetailRowEleven);

		if (driver.findElement(specifAttGroupNameTxt).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(speciAttGroupInfo);
		}
		getElementText(specifAttGroupNameTxt, "Name");
		// send_keys(attGroupInoNameTxtbox, "test @123");
		String attInfoTxt = driver.findElement(attGroupInoNameTxtbox).getAttribute("value");
		Assert.assertEquals(attInfoTxt, "CPU Type");
		getElementText(ESADOPtionText, "Options");
		getElementText(usedProdTxt, "Used by products");
		return this;
	}

	public AttributesPage VerifyESADoptions() throws InterruptedException {

		if (driver.findElement(ColDetailHeadOne).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(ESADOPtionText);
		}
		getElementText(ColDetailHeadOne, "Name");
		getElementText(ColDetailHeadTwo, "Display order");
		getElementText(ColDetailHeadThree, "Number of associated products");
		getElementText(ColDetailHeadFour, "Edit");
		getElementText(ColDetailHeadFive, "Delete");
		click_btn(optAddNewTxt);
		String addReqWindow = driver.getWindowHandle();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new option / Ost administration")) {
				getElementText(AddNewProdInfoNameTxt, "Name");
				send_keys(AddNewNameTxtBx, "test @123");
				getElementText(AddNewSpecifyTxt, "Specify color");
				click_btn(AddNewSpecifyChk);
				getElementText(AddNewRGBTxt, "RGB color");
				String rgbTxtBx = driver.findElement(AddNewRGBTxtBx).getAttribute("value");
				Assert.assertEquals(rgbTxtBx, "#FFFFFF");
				Thread.sleep(3000);
				getElementText(prodEditDisplayOrder, "Display order");
				ClickDollarTxtBox(1, "0 ");
				clickDollarUPBtn(1);
				clickDollarUPBtn(1);
				clickDollarDownBtn(1);
				ClickDollarTxtBox(1, "1 ");

				click_btn(saveBtn);
				// driver.close();
			}

		}

		driver.switchTo().window(addReqWindow);
		Thread.sleep(3000);
		getElementText(ColDetailRowSix, "test @123");
		getElementText(ColDetailRowSeven, "1");
		getElementText(ColDetailRowEight, "0");
		getElementText(ColDetailRowNine, "Edit");
		getElementText(ColDetailRowTen, "Delete");

		return this;
	}

	public AttributesPage verifyESAPUsedByProducts() {
		if (driver.findElement(ColDetailHeadSix).isDisplayed()) {
			System.out.println("It is displayed");
		} else {
			click_btn(usedProdTxt);
		}
		getElementText(ColDetailHeadSix, "Product");
		getElementText(ColDetailHeadSeven, "Published");
		getElementText(ColDetailHeadEight, "View");
		getElementText(ColDetailRowSixteen, "Apple MacBook Pro 13-inch");
		getElementText(ColDetailRowEighteen, "View");
		click_btn(ColDetailRowEighteen);

		if (driver.findElement(AddNewProdInfoNameTxt).isDisplayed()) {
		//	getElementText(AddNewProdInfoNameTxt, "Name");
			System.out.println("It is displayed");

		} else {
			click_btn(ProdInfoTxt);
		}
		String attvalue = driver.findElement(AddNewNameTxtBx).getAttribute("value");
		Assert.assertEquals(attvalue, "Apple MacBook Pro 13-inch");
		return this;

	}

}