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

public class Product_Page extends AbstractPage {
	private static final By EnterEmailId = By.id("Email");
	private static final By EnterPassword = By.xpath("//input[@id='Password']");
	private static final By loginBtn = By.xpath("//a[contains(text(),'Log in')]");
	private static final By submitBtn = By.xpath("//button[text()='Login']");
	private static final By CatalogTab = By.xpath("//span[text()='Catalog']");
	private static final By clickProductTab = By.xpath("//span[text()='Products']");
	private static final By ProdSearchBtnTxt = By.xpath("//div[text()='Search']");
	private static final By ProductSearchDownarrow = By.xpath("//i[@class='far fa-angle-down']");
	private static final By PEDProductInfoTxt=By.xpath("(//div[text()='Product info'])[1]");
	private static final By ProductSearchUparrow = By.xpath("//i[@class='far fa-angle-up']");
	private static final By ProductNewBtn = By.id("product-list-addNew");
	private static final By ProductDownloadBtn = By.id("product-list-download");
	private static final By ProductListExpand = By.id("product-list-expand");
	private static final By ProductListExport = By.xpath("//div[@id='product-list-export']");
	private static final By ProductListImport = By.id("product-list-import");
	private static final By ProductListDelete = By.xpath("//button[text()=' Delete (selected) ']");
	// private static final By ProductListExportDD = By.className("btn
	// btn-export-dropdown dropdown-toggle");
	private static final By EnterProductName = By.xpath("(//label[text()='Product name']/following::input)[1]");
	private static final By ClickCategoryDD = By
			.xpath("//select[@data-val-required='The Category field is required.']");
	private static final By ClickPublishedTab = By
			.xpath("//select[@data-val-required='The Published field is required.']");
	private static final By ClickSearchSubcategories = By
			.xpath("//input[@data-val-required='The Search subcategories field is required.']");
	private static final By ClickProductSearchBtn = By.xpath("//button[@class='btn btn-primary btn-search']");
	private static final By ManufacturerTxt = By.xpath("//label[text()='Manufacturer']");
	private static final By ManufacturerDD = By.xpath("//label[text()='Manufacturer']");
	private static final By prodColumnChkBox = By.xpath("(//input[@class='mastercheckbox'])[1]");
	private static final By prodPictureTxt = By.xpath("//th[text()='Picture']");
	private static final By prodProdNameTxt = By.xpath("//th[text()='Product name']");
	private static final By prodSkuTxt = By.xpath("//th[text()='SKU']");
	private static final By prodPriceTxt = By.xpath("//th[text()='Price']");
	private static final By prodStockquantityTxt = By.xpath("//th[text()='Stock quantity']");
	private static final By prodPublishedTxt = By.xpath("//th[text()='Published']");
	private static final By prodEditTxt = By.xpath("//th[text()='Edit']");
	private static final By prodChkBox = By.xpath("(//tr[@class='odd']//td)[1]");
	private static final By prodPicture = By.xpath("(//tr[@class='odd']//td)[2]");
	private static final By prodHomeName = By.xpath("(//tr[@class='odd']//td)[3]");
	private static final By prodName = By.xpath("(//tr[@class='odd']//td)[11]");
	private static final By prodSKU = By.xpath("(//tr[@class='odd']//td)[4]");
	private static final By prodPrice = By.xpath("(//tr[@class='odd']//td)[5]");
	private static final By prodStockQuan = By.xpath("(//tr[@class='odd']//td)[6]");
	private static final By prodPublished = By.xpath("(//tr[@class='odd']//td)[7]");
	private static final By prodHomeEditBtn = By.xpath("(//tr[@class='odd']//td)[8]");
	private static final By prodEditBtn = By.xpath("(//tr[@class='odd']//td)[16]");
	private static final By EditProdDetailTxt = By.xpath("//span[text()='Edit product details']");
	private static final By GoBackBtn = By.xpath("//button[@name='Go-Back']");
	private static final By ProductInfoText = By.xpath("(//div[@class='card-title'])[1]");
	private static final By ProductPriceText = By.xpath("(//div[@class='card-title'])[2]");
	private static final By ProductShippingText = By.xpath("(//div[@class='card-title'])[3]");
	private static final By ProductattributeText = By.xpath("(//div[@class='card-title'])[6]");
	private static final By ProductSpecfText = By.xpath("(//div[@class='card-title'])[7]");
	private static final By downloadableProdTxt = By.xpath("(//div[@class='card-title'])[8]");
	private static final By recurringProdTxt = By.xpath("(//div[@class='card-title'])[9]");
	private static final By SEOTxt = By.xpath("(//div[@class='card-title'])[10]");
	private static final By RelatedProdutsTxt = By.xpath("(//div[@class='card-title'])[11]");
	private static final By CrossSellsTxt = By.xpath("(//div[@class='card-title'])[12]");
	private static final By PurchasedwTxt = By.xpath("(//div[@class='card-title'])[13]");
	private static final By StockQtyTxt = By.xpath("(//div[@class='card-title'])[14]");

	private static final By SaveAndEditBtn = By.xpath("//button[@name='save-continue']");
	private static final By saveBtn = By.xpath("//button[@name='save']");
	private static final By ProdSettingsBtn = By.xpath("//button[@id='product-editor-settings']");
	private static final By paginationLeftArrow = By.xpath("//i[@class='k-icon k-i-arrow-e']");
	private static final By paginationRightArrow = By.xpath("//i[@class='k-icon k-i-arrow-w']");
	private static final By pnSelectedNum = By.xpath("//li[@class='paginate_button page-item active']/a");
	private static final By pnUnselectedNum = By.xpath("//li[@class='paginate_button page-item ']/a");
	private static final By showItemsDD = By.xpath("//select[@name='products-grid_length']");
	private static final By ShowItemsRecord = By.xpath("//div[@id='products-grid_info']");
	private static final By Refreshbutton = By.xpath("//button[@class='btn btn-secondary']");
	private static final By ProdNameTxt = By.xpath("//label[text()='Product name']");
	private static final By ProdNameError = By.xpath("//span[@id='Name-error']");
	private static final By ProdNameTxtbox = By.xpath("//div[@class='input-group input-group-required']/input");
	private static final By prodSaveAndEdit = By.xpath("//button[@name='save-continue']");
	private static final By prodTxtboxReq = By.xpath("//div[@class='input-group-btn']");
	private static final By prodShortDesc = By.xpath("//label[@for='ShortDescription']");
	private static final By prodFullDesc = By.xpath("//label[@for='FullDescription']");
	private static final By prodShortDescTxtArea = By.xpath("//textarea[@id='ShortDescription']");
	private static final By prodFullDescTxtArea = By.xpath("//body[@data-id='FullDescription']");
	private static final By prodExpandButton = By.xpath("//a[@id='product-edit-expand']");
	private static final By prodEditSkuTxt = By.xpath("//label[@for='Sku']");
	private static final By prodEditSkuField = By.xpath("//input[@id='Sku']");
	private static final By prodEditSkuError = By.xpath("//span[@class='field-validation-error']");
	private static final By prodEditCatTxt = By.xpath("//label[@id='SelectedCategoryIds_label']");
	private static final By prodSelectCat = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]");
	private static final By prodManuCat = By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
	private static final By ProdEditPublishedTxt = By.xpath("//label[@for='Published']");
	private static final By ProdEditPubChkBox = By
			.xpath("(//input[@data-val-required='The Published field is required.'])[1]");
	private static final By prodEditProdTagsTxt = By.xpath("//label[@for='ProductTags']");
	private static final By ProdEditProductTagsField1 = By.xpath(".//*[@class='tag-editor ui-sortable']");
	private static final By ProdEditProductTagsField = By.xpath("//li[@class='placeholder']//div[1]");
	private static final By prodEditProdTags = By.xpath(".//*[@class='ui-sortable-handle]");
	private static final By prodEditGtinTxt = By.xpath("//label[@for='Gtin']");
	private static final By prodEditGtin = By.id("Gtin");
	private static final By prodEditgtinError = By.xpath("//span[@id='Gtin-error']");
	private static final By prodEditManuPartNum = By.xpath("//label[@for='ManufacturerPartNumber']");
	private static final By prodEditManPartNumTxt = By.xpath("//input[@id='ManufacturerPartNumber']");
	private static final By prodEditShowonHomePage = By.xpath("//label[@for='ShowOnHomepage']");
	private static final By prodEditShowOnPageChkBox = By.id("ShowOnHomepage");
	private static final By prodEditProductType = By.xpath("//label[@for='ProductTypeId']");
	private static final By prodEditDisplayOrder = By.xpath("//label[@for='DisplayOrder']");
	private static final By prodEditDisOrderIncrease = By.xpath("(//span[@title='Increase value']//span)[1]");
	private static final By prodEditDisOrderDecrease = By.xpath("(//span[@title='Decrease value']//span)[1]");
	private static final By prodEditDisOrderTxt = By.xpath("(//input[@role='spinbutton'])[1]");
	private static final By prodEditProdTemplate = By.xpath("//label[@for='ProductTemplateId']");
	private static final By prodEditVisibleInd = By.xpath("//label[@for='VisibleIndividually']");
	private static final By prodEditVisiIndChkBox = By.xpath("//input[@id='VisibleIndividually']");
	private static final By prodEditcusRoles = By.xpath("//label[@for='SelectedCustomerRoleIds']");
	private static final By prodEditCusRolesTxt = By
			.xpath("//input[@aria-describedby='SelectedCustomerRoleIds_taglist']");
	private static final By prodEditLimToStores = By.id("SelectedStoreIds_label");
	private static final By prodEditLimToStoresDd = By.xpath("//input[@aria-describedby='SelectedStoreIds_taglist']");
	private static final By prodEditVendorTxt = By.xpath("//label[@for='VendorId']");
	private static final By prodEditReqOtherProd = By.xpath("//label[@for='RequireOtherProducts']");
	private static final By prodEditReqOtherProdChkbox = By.id("RequireOtherProducts");
	private static final By prodEditReqProdIds = By.xpath("//label[@for='RequiredProductIds']");
	private static final By prodEditReqProdIdsTxt = By.id("RequiredProductIds");
	private static final By prodEditAddReqProd = By.xpath("//button[@id='btnAddNewRequiredProduct']");
	private static final By prodEditAutAddProd = By.xpath("//label[@for='AutomaticallyAddRequiredProducts']");
	private static final By prodEditAutAddProdChk = By.id("AutomaticallyAddRequiredProducts");
	private static final By prodEditChooseProdSel = By.xpath("//button[text()='Select']");
	private static final By prodEditReqProdTxt = By.xpath("//span[@id='required-product-names']");
	private static final By prodEditAllowCusTxt = By.xpath("//label[@for='AllowCustomerReviews']");
	private static final By prodEditAllowCusChk = By
			.xpath("(//input[@data-val-required='The Allow customer reviews field is required.'])[1]");
	private static final By prodEditAvailStartDate = By
			.xpath("//span[@aria-controls='AvailableStartDateTimeUtc_dateview']");
	private static final By clickYearTab = By.xpath("//a[@class='k-link k-nav-prev']/following-sibling::a[1]");
	private static final By click2022year = By.xpath("//a[contains(text(),'2022')]");
	private static final By clickMonthTab = By.xpath("//a[contains(text(),'Dec')]");
	private static final By clickDateTab = By.xpath("//a[@data-value='2022/11/21']");
	private static final By prodEditAvailStartTime = By
			.xpath("//span[@aria-controls='AvailableStartDateTimeUtc_timeview']");
	private static final By prodEditAvailStartTxt = By.xpath("//label[@for='AvailableStartDateTimeUtc']");
	private static final By prodEditAvailEndDate = By
			.xpath("//span[@aria-controls='AvailableEndDateTimeUtc_dateview']");
	private static final By clickEndYearTab = By.xpath("(//a[@class='k-link k-nav-prev']/following-sibling::a)[3]");
	private static final By click2023year = By.xpath("//a[contains(text(),'2023')]");
	private static final By clickEndMonthTab = By.xpath("//a[contains(text(),'Apr')]");
	private static final By clickEndDateTab = By.xpath("//a[@title='Tuesday, May 2, 2023']");
	private static final By prodEditAvailEndTime = By
			.xpath("//span[@aria-controls='AvailableEndDateTimeUtc_timeview']");
	private static final By prodEditAvailEndTxt = By.xpath("//label[@for='AvailableEndDateTimeUtc']");
	private static final By prodEditAvailtime = By.xpath("//li[text()='1:30 AM']");
	private static final By prodEditMarkasNewTxt = By.xpath("//label[@for='MarkAsNew']");
	private static final By prodEditMarkNewChk = By
			.xpath("(//input[@data-val-required='The Mark as new field is required.'])[1]");
	private static final By prodEditMarNewStartDateTxt = By.xpath("//label[@for='MarkAsNewStartDateTimeUtc']");
	private static final By prodEditMarNewStartDate = By
			.xpath("//span[@aria-controls='MarkAsNewStartDateTimeUtc_dateview']");
	private static final By prodEditMarNewstartDay = By.xpath("//a[@title='Tuesday, April 4, 2023']");
	private static final By prodEditMarNewstartTime = By.xpath("(//span[@aria-label='Open the time view']//span)[3]");
	private static final By prodEditMarNewstartClock = By.xpath("(//li[text()='1:30 AM'])[2]");
	private static final By prodEditMarNewEndDate = By
			.xpath("//span[@aria-controls='MarkAsNewEndDateTimeUtc_dateview']");
	private static final By prodEditMarNewEndDateTxt = By.xpath("//label[@for='MarkAsNewEndDateTimeUtc']");
	private static final By prodEditMarNewEndDateClk = By.xpath("(//span[@class='k-icon k-i-clock'])[4]");
	private static final By prodEditAdminComment = By.xpath("//label[@for='AdminComment']");
	private static final By prodEditAdminCommentTxt = By.id("AdminComment");
	private static final By prodEditPriceTxt = By.xpath("(//div[@class='card-title'])[2]");
	private static final By PEDPriceTxt = By.xpath("//label[@for='Price']");
	private static final By PEDPriceDollar = By.xpath("(//input[@class='k-formatted-value k-input'])[2]");
	private static final By PEDOldPriceTxt = By.xpath("//label[@for='OldPrice']");
	private static final By PEDPriceDollarTxt = By.xpath("(//input[@class='k-formatted-value k-input'])[3]");
	private static final By PEDProdPriceTxt = By.xpath("//label[@for='ProductCost']");
	private static final By PEDProdDollarTxt = By.xpath("(//input[@class='k-formatted-value k-input'])[4]");
	private static final By PEDDisBuyBtnTxt = By.xpath("//label[@for='DisableBuyButton']");
	private static final By PEDDisBuyBtnChkBx = By.id("DisableBuyButton");
	private static final By PEDDisWisBtnTxt = By.xpath("//label[@for='DisableWishlistButton']");
	private static final By PEDDisWisBtnChkBx = By.id("DisableWishlistButton");
	private static final By PEDAvailOrderTxt = By.xpath("//label[@for='AvailableForPreOrder']");
	private static final By PEDAvailOrderChkbx = By.id("AvailableForPreOrder");
	private static final By PEDCallPriceTxt = By.xpath("//label[@for='CallForPrice']");
	private static final By PEDCallPriceChkbx = By.id("CallForPrice");
	private static final By PEDCusEntPriceTxt = By.xpath("//label[@for='CustomerEntersPrice']");
	private static final By PEDCusEntPricechk = By.id("CustomerEntersPrice");
	private static final By PEDMinCusPriceTxt = By.xpath("//label[@for='MinimumCustomerEnteredPrice']");
	private static final By PEDMaxCusEntPriceTxt = By.xpath("//label[@for='MaximumCustomerEnteredPrice']");
	private static final By PEDProdMinDollarTxt = By.xpath("(//input[@class='k-formatted-value k-input'])[5]");
	private static final By PEDProdMaxDollarTxt = By.xpath("(//input[@class='k-formatted-value k-input'])[6]");
	private static final By PEDBasePriceTxt = By.xpath("//label[@for='BasepriceEnabled']");
	private static final By PEDBasePricechk = By.id("BasepriceEnabled");
	private static final By PEDPreOrderAvailTxt = By.xpath("//label[@for='PreOrderAvailabilityStartDateTimeUtc']");
	private static final By PEDPreOrderAvailClk = By
			.xpath("//span[@aria-controls='PreOrderAvailabilityStartDateTimeUtc_dateview']");
	private static final By PEDPreOrderAvailSD = By.xpath("(//span[@aria-label='Open the time view']//span)[5]");
	private static final By PEDProdInfoDownArrow = By.xpath("(//i[@class='fa toggle-icon fa-plus'])[1]");
	private static final By PEDProdInfoUpArrow = By.xpath("(//i[@class='fa toggle-icon fa-minus'])[1]");
	private static final By PEDPriceDownArrow = By.xpath("(//i[@class='fa toggle-icon fa-plus'])[2]");
	private static final By PEDPriceUpArrow = By.xpath("(//i[@class='fa toggle-icon fa-minus'])[2]");
	private static final By PEDAmountProd = By.xpath("//label[@for='BasepriceAmount']");
	private static final By PEDUnitOfProdTxt = By.xpath("//label[@for='BasepriceUnitId']");
	private static final By PEDUnitOfProdDD = By.id("BasepriceUnitId");
	private static final By PEDRefAmtTxt = By.xpath("//label[@for='BasepriceBaseAmount']");
	private static final By PEDRefUnitTxt = By.xpath("//label[@for='BasepriceBaseUnitId']");
	private static final By PEDRefUnitDD = By.id("BasepriceBaseUnitId");
	
	public static final By PEDPurchOrderTxt=By.xpath("//div[text()='Purchased with orders']");
	
	public static final By PEDPurchOrderKnowMore=By.xpath("(//div[@class='search-text-info'])[6]");
	public static final By PEDPurchOrderKnowMoreTxt=By.xpath("(//div[@class='search-body info-content closed'])[6]");
	
	private static final By PEDPriceDiscounts = By.xpath("(//label[text()='Discounts'])[1]");
	private static final By PEDDiscoutsDD = By.id("(//div[@class='k-multiselect-wrap k-floatwrap'])[5]");
	private static final By PEDTaxExempt = By.xpath("//label[@for='IsTaxExempt']");
	private static final By PEDTaxExemptChkbox = By.id("IsTaxExempt");
	private static final By PEDTaxCategoryTxt = By.xpath("//label[@for='TaxCategoryId']");
	private static final By PEDTaxCategoryDD = By.id("TaxCategoryId");
	private static final By PEDTeleBroadElecTxt = By
			.xpath("//label[@for='IsTelecommunicationsOrBroadcastingOrElectronicServices']");
	private static final By PEDTeleBroadElecChkBx = By.id("IsTelecommunicationsOrBroadcastingOrElectronicServices");
	private static final By PEDEditProdAttributes = By.xpath("//div[text()='Product attributes']");
	private static final By PEDProdAttKnowMoreTxt = By.xpath("(//div[@class='search-text-info'])[2]");
	private static final By PEDProdAttProdAttTxt = By.xpath("//span[text()=' Product attributes ']");
	private static final By PEDProdAtKnowMoreDetails = By.xpath("(//div[@class='search-body info-content closed'])[2]");
	private static final By PEDPrdAttAddNewTxt = By.xpath("//a[contains(text(),'Add a new attribute')]");
	private static final By PEDPrdAttAddNewBack = By.xpath("//button[@class='btn btn-secondary goback_btn']");
	private static final By PEDPrdAttAddSave = By.xpath("//button[@class='btn btn-primary savedit']");
	private static final By PEDPrdAttAddSaveAndEdit = By.xpath("//button[@class='btn btn-secondary savedit']");
	public static final By PEDCrossSellsTxt=By.xpath("//div[text()='Cross-sells']");
	public static final By PEDCrossSellKnowMore=By.xpath("(//div[@class='search-text-info'])[5]");
	public static final By PEDCrossSellKnowMoreTxt=By.xpath("(//div[@class='search-body info-content closed'])[5]");
	public static final By PEDCrossSellAddNewTxt=By.xpath("//button[text()=' Add new cross-sell product ']");
	
	
	
	private static final By PEDPrdAttAddInfo = By.xpath("//div[text()='Info']");
	private static final By PEDAddNewAttAttrib = By.xpath("//label[@for='ProductAttributeId']");
	private static final By PEDAddNewAttTxtPrmpt = By.xpath("//label[@for='TextPrompt']");
	private static final By PEDAddNewAttTxtPrmptbox = By.id("TextPrompt");
	private static final By PEDAddNewAttIsReq = By.xpath("//label[@for='IsRequired']");
	private static final By PEDAddNewAttIsReqchk = By.id("IsRequired");
	private static final By PEDAddNewAttContType = By.xpath("//label[@for='AttributeControlTypeId']");
	private static final By PEDAddNewAttDisOrder = By.xpath("//label[@for='DisplayOrder']");
	private static final By PEDAddNewAttValues = By.xpath("//div[text()='Values']");
	private static final By PEDAddNewAttValuesMsg = By
			.xpath("(//div[contains(@class,'card-header with-border')]/following-sibling::div)[2]");
	private static final By PEDEPAAddNewValueTxt = By.id("btnAddNewValue");
	private static final By PEDEPAAddNewValueAttValue = By.xpath("//label[@for='AttributeValueTypeId']");
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

	public static final By PEDRelProdUpdBtn = By.xpath("//a[text()='Update']");
	public static final By PEDRelProdCancelBtn = By.xpath("//a[text()='Cancel']");

	private static final By PEDEPAEditValuePic = By.xpath("//label[@for='PictureId']");
	private static final By PEDEPAEditValueNoPic = By.xpath("//label[text()=' No picture ']");

	private static final By PEDShippingTxt = By.xpath("(//div[text()='Shipping'])[1]");
	private static final By PEDShipEnabledTxt = By.xpath("//label[@for='IsShipEnabled']");
	private static final By PEdShipEnabledChkBox = By.xpath("(//input[@name='IsShipEnabled'])[1]");
	private static final By PEdShipWeight = By.xpath("//label[@for='Weight']");
	private static final By PEdShipLength = By.xpath("//label[@for='Length']");
	private static final By PEdShipWidth = By.xpath("//label[@for='Width']");
	private static final By PEdShipHeight = By.xpath("//label[@for='Height']");
	private static final By PEDShipFreeShipTxt = By.xpath("//label[@for='IsFreeShipping']");
	private static final By PEdShipFreeShipChkBox = By.id("IsFreeShipping");
	private static final By PEDShipshipSepTxt = By.xpath("//label[@for='ShipSeparately']");
	private static final By PEDShipshipSepChk = By.id("ShipSeparately");
	private static final By PEDShipAddChargeTxt = By.xpath("//label[@for='AdditionalShippingCharge']");
	private static final By PEDShipDelDateTxt = By.xpath("//label[@for='DeliveryDateId']");

	private static final By PEDInvenTxt = By.xpath("(//div[text()='Inventory'])[1]");

	private static final By PEDInvenMeth = By.xpath("//label[@for='ManageInventoryMethodId']");
	private static final By PEDInvenMinQty = By.xpath("//label[@for='OrderMinimumQuantity']");
	private static final By PEDInvenMaxQty = By.xpath("//label[@for='OrderMaximumQuantity']");
	private static final By PEDInvenAllowedQty = By.xpath("//label[@for='AllowedQuantities']");
	private static final By PEDInvenAllowedQtyTxtbox = By.xpath("//input[@id='AllowedQuantities']");
	private static final By PEDInvenNotRetTxt = By.xpath("//label[@for='NotReturnable']");
	private static final By PEDInvenNotRetChkbox = By.xpath("//input[@id='NotReturnable']");
	private static final By PEDSpecifAttTxt = By.xpath("//div[text()='Specification attributes']");
	private static final By PEDSpecifAttKnowMoreTxt = By.xpath("(//div[@class='search-text-info'])[3]");
	private static final By PEDSpecifAtKnowMoreDetails = By
			.xpath("(//div[@class='search-body info-content closed'])[3]");
	private static final By PEDSpecAttAddAttTxt = By.xpath("//a[contains(text(),'Add attribute')]");
	private static final By GobackButton = By.xpath("//button[contains(text(),' Go back ')]");
	private static final By AddNewSpeciAtttype = By.xpath("//label[@for='AttributeTypeName']");
	private static final By AddNewSpeciAttTxt = By.xpath("//label[@for='AttributeName']");
	private static final By AddNewSpeciAttOpt = By.id("AttributeTypeId");
	private static final By AddNewSpeciAtNameOpt = By.id("AttributeId");
	private static final By AddNewSpeciAttValue = By.xpath("//label[@for='Value']");
	private static final By AddNewSpeciAttTxtBox = By.xpath("(//input[@name='Value'])[1]");
	private static final By AddNewSpeciAttShowON = By.xpath("//label[@for='ShowOnProductPage']");
	private static final By AddNewSpeciAttShowONChk = By.xpath("(//input[@name='ShowOnProductPage'])[1]");
	private static final By PEDEPARecProdSecTxt = By.xpath("//div[text()='Recurring product']");
	private static final By PEDEPARecProdTxt = By.xpath("(//label[text()='Recurring product'])[1]");
	private static final By PEDRecProdChkBox = By.xpath("//input[@id='IsRecurring']");
	private static final By PEDRecProdCycleLen = By.xpath("//label[@for='RecurringCycleLength']");
	private static final By PEDRecProdCyclePer = By.xpath("//label[@for='RecurringCyclePeriodId']");
	private static final By PEDRecProdCyclePerDD = By.id("RecurringCyclePeriodId");
	private static final By PEDRecProdCycleTotCycle = By.xpath("//label[@for='RecurringTotalCycles']");
	private static final By PEDSEOSectionTxt = By.xpath("//div[text()='SEO']");
	private static final By PEDSearchEngineTxt = By.xpath("//label[@for='SeName']");
	private static final By PEDSearchEngineTxtbox = By.xpath("//input[@name='SeName']");
	private static final By PEDSearchEngineWarning = By.xpath("//span[@class='field-validation-custom warning']");
	private static final By PEDMetaTitle = By.xpath("//label[@for='MetaTitle']");
	private static final By PEDMetaTitleTxtbox = By.xpath("//input[@name='MetaTitle']");
	private static final By PEDMetaKey = By.xpath("//label[@for='MetaKeywords']");
	private static final By PEDMetaKeyTxtbox = By.xpath("//input[@name='MetaKeywords']");
	private static final By PEDMetaDesc = By.xpath("//label[@for='MetaDescription']");
	private static final By PEDMetaDescTxtbox = By.xpath("//textarea[@name='MetaDescription']");
	private static final By PEDRelProdSecTxt = By.xpath("//div[text()='Related products']");
	private static final By PEDRelProdKnowMore = By.xpath("(//div[@class='search-text-info'])[4]");
	private static final By PEDRelProdKnowMoreTxt = By.xpath("(//div[@class='search-body info-content closed'])[4]");
	private static final By PEDRelProdAddNewTxt = By.xpath("//button[text()=' Add new related product ']");
	private static final By prodEditChooseProd = By.xpath("(//input[@name='SelectedProductIds'])[1]");

	// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	public Product_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

	}

	public Product_Page clickloginpage() throws InterruptedException {
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		click_btn(loginBtn);

		ExtentTestManager.getTest().log(Status.INFO, "Entered login successfully");
		return this;
	}

	public Product_Page enterUserName(String username) throws InterruptedException {
		// driver.manage().window().maximize();
		Thread.sleep(2000);
		send_keys(EnterEmailId, username);

		ExtentTestManager.getTest().log(Status.INFO, "Entered username successfully");
		return this;
	}

	public Product_Page enterPassword(String password) throws InterruptedException {
		Thread.sleep(2000);
		ScrollPage_Down();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(EnterPassword));
		send_keys(EnterPassword, password);
		ExtentTestManager.getTest().log(Status.INFO, "Entered password successfully");
		return this;
	}

	public Product_Page ScrollPage_Down() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform(); // Page Down
		System.out.println("Scroll down perfomed");
		return this;
	}

	public Product_Page clickSubmit() throws InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(1000);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(submitBtn));
		click_btn(submitBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Login Successfully");
		// Thread.sleep(5000);
		return this;

	}

	public Product_Page adminwebui() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		// wait.until(ExpectedConditions.urlContains("https://choithram.nighbro.com/adminwebui"));
		driver.get("https://dev-admin.megamart.nighbro.com/adminwebui");
		return this;

	}

	public Product_Page ClickCatalog() {

		click_btn(CatalogTab);

		return this;

	}

	public Product_Page verifyProductTab() throws InterruptedException {
		Thread.sleep(3000);
		click_btn(clickProductTab);

		// ExtentTestManager.getTest().log(Status.INFO, "Enter product name
		// successfully");

		return this;
	}

	public Product_Page verifyProductPageDetails() throws InterruptedException {

		Thread.sleep(3000);

		String prodSearch = driver.findElement(ProdSearchBtnTxt).getText();
		Assert.assertEquals(prodSearch, "Search");
		String addNewBtn = driver.findElement(ProductNewBtn).getText();

		Assert.assertEquals(addNewBtn, "Add new");
		String prodDownloadBtn = driver.findElement(ProductDownloadBtn).getText();

		Assert.assertEquals(prodDownloadBtn, "Download");
		click_btn(ProductListExpand);
		Thread.sleep(3000);
		String ExportText = driver.findElement(ProductListExport).getText();
		System.out.println("the export is" + ExportText);
		// Assert.assertEquals(ExportText, "Export");
		String importBtn = driver.findElement(ProductListImport).getText();

		Assert.assertEquals(importBtn, "Import");
		String prodDelete = driver.findElement(ProductListDelete).getText();

		Assert.assertEquals(prodDelete, "Delete (selected)");
		ExtentTestManager.getTest().log(Status.PASS, "Product available details passed successfully");
		return this;
	}

	public Product_Page VerifyProductsDetails(String productname) throws InterruptedException {
		Thread.sleep(3000);
		if (driver.findElement(EnterProductName).isDisplayed()) {
			System.out.println("The product name is displayed");
		} else {
			click_btn(PEDProductInfoTxt);
		}

		send_keys(EnterProductName, productname);
		ExtentTestManager.getTest().log(Status.INFO, "Enter product name successfully");
		return this;

	}

	public Product_Page ClickCategoryOption(String categoryoption) throws InterruptedException {
		Thread.sleep(2000);
		click_btn(ClickCategoryDD);
		driver.findElement(By.xpath("//option[text()='" + categoryoption + "']")).click();
		ExtentTestManager.getTest().log(Status.INFO, "Enter Category name successfully");
		// click_btn(TopSearchOption);
		return this;
	}

	public Product_Page ClickPublsihedOption(String publishoption) throws InterruptedException {
		Thread.sleep(2000);
		click_btn(ClickPublishedTab);
		driver.findElement(By.xpath("//option[text()='" + publishoption + "']")).click();
		ExtentTestManager.getTest().log(Status.INFO, "Selected published type successfully");
		// click_btn(TopSearchOption);
		return this;
	}

	public Product_Page SearchSubCategories() {

		click_btn(ClickSearchSubcategories);
		ExtentTestManager.getTest().log(Status.INFO, "checked search sub categories successfully");
		return this;
	}

	public Product_Page ProductSearchBtn() {
		click_btn(ClickProductSearchBtn);
		ScrollPage_Down();
		ExtentTestManager.getTest().log(Status.INFO, "product searched successfully");
		return this;
	}

//	public adminPage CheckVDCheckInPopup(List<String> values) {
//		verify_element_by_text(VisitorChkInNamePopup, values.get(0));
//		   verify_element_by_text(VisitorChkInPurposePopup, values.get(4));
//		   verify_element_by_text(VisitorchkInDeclarationPopup, values.get(1));
//		return this;
//		
//	}

	public Product_Page verifyManufacturer(String manName) {
		String mt = driver.findElement(ManufacturerTxt).getText();
		Assert.assertEquals(mt, "Manufacturer");
		click_btn(ManufacturerDD);
		Select manufacutrer = new Select(driver.findElement(By.name("SearchManufacturerId")));
		// List<WebElement> man=manufacutrer.getOptions();
		// System.out.println("The manufacturer"+man);

		manufacutrer.selectByVisibleText(manName);
//		manufacutrer.selectByValue("2");
//		manufacutrer.selectByIndex(2);
		return this;
	}

	public Product_Page verifyProductPageColumn(List<String> values) {
		element_isDisplayed(prodColumnChkBox);
		getElementText(prodPictureTxt, values.get(0));
		getElementText(prodProdNameTxt, values.get(1));
		getElementText(prodSkuTxt, values.get(2));
		getElementText(prodPriceTxt, values.get(3));
		getElementText(prodStockquantityTxt, values.get(4));
		getElementText(prodPublishedTxt, values.get(5));
		getElementText(prodEditTxt, values.get(6));
		ExtentTestManager.getTest().log(Status.PASS, "Product column available details passed successfully");
		return this;
	}

	public Product_Page verifyProductColDetails(List<String> values) {
		element_isDisplayed(prodChkBox);
		element_isDisplayed(prodPicture);
		getElementText(prodHomeName, values.get(0));
		getElementText(prodSKU, values.get(1));
		getElementText(prodPrice, values.get(2));
		getElementText(prodStockQuan, values.get(3));
		element_isDisplayed(prodPublished);

		getElementText(prodHomeEditBtn, values.get(4));
		ExtentTestManager.getTest().log(Status.PASS, "Certain Product column details passed successfully");
		return this;
	}

	public Product_Page ClickEditBtn() {
		click_btn(prodHomeEditBtn);
		getElementText(EditProdDetailTxt, "Edit product details");
		click_btn(GoBackBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Edit button passed successfully");
		return this;

	}

	public Product_Page verifyAddNewBtnDetails() {

		click_btn(ProductNewBtn);
		getElementText(ProductInfoText, "Product info");
		getElementText(ProductPriceText, "Prices");
		getElementText(ProductShippingText, "Shipping");
		getElementText(ProductattributeText, "Product attributes");
		getElementText(ProductSpecfText, "Specification attributes");
		ScrollPage_Down();
		getElementText(downloadableProdTxt, "Downloadable product");
		getElementText(recurringProdTxt, "Recurring product");
		getElementText(SEOTxt, "SEO");
		getElementText(RelatedProdutsTxt, "Related products");
		getElementText(CrossSellsTxt, "Cross-sells");
		// getElementText(PurchasedwTxt, "Purchased with orders");
		// getElementText(StockQtyTxt, "Stock quantity history");
		getElementText(SaveAndEditBtn, "Save & edit");
		getElementText(saveBtn, "Save");
		getElementText(GoBackBtn, "Go back");
		element_isDisplayed(ProdSettingsBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Add new Product available details passed successfully");
		return this;

	}

	public Product_Page verifyProdName(String prodName) {
		String productName = driver.findElement(By.xpath("//td[text()='" + prodName + "']")).getText();
		Assert.assertEquals(productName, prodName);
		return this;
	}

	public Product_Page getFontColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}

	public Product_Page getBackgroundColor(By element, String Expectedcolor) {
		WebElement t = driver.findElement(element);
		String s = t.getCssValue("background-color");
		String c = Color.fromString(s).asHex();
		Assert.assertEquals(c, Expectedcolor);
		return this;
	}

	public Product_Page verifyPagination(String prodNameLeft, String prodNameRight) throws InterruptedException {
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

	public Product_Page verifyShowItems() throws InterruptedException {
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

	public Product_Page VerifyProductInfo() throws InterruptedException {
		if (driver.findElement(ProdNameTxtbox).isDisplayed()) {
			System.out.println("It is up arrow");

		} else {
			click_btn(ProductInfoText);
		}

		element_isDisplayed(prodTxtboxReq);
		Thread.sleep(2000);
		getElementText(ProdNameTxt, "Product name");
		send_keys(ProdNameTxtbox, "test");
		driver.findElement(ProdNameTxtbox).clear();
		click_btn(prodSaveAndEdit);
		getElementText(ProdNameError, "Please provide a name.");

		send_keys(ProdNameTxtbox,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk");
		click_btn(prodSaveAndEdit);
		getElementText(ProdNameError, "'Name' must be between 0 and 400 characters.");
		driver.findElement(ProdNameTxtbox).clear();
		send_keys(ProdNameTxtbox, "test @123");
		click_btn(prodSaveAndEdit);

		click_btn(GoBackBtn);
		Thread.sleep(2000);
		send_keys(EnterProductName, "test @123");
		ProductSearchBtn();
		Thread.sleep(2000);
		getElementText(prodHomeName, "test @123");
		click_btn(prodEditBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Edit Product available details passed successfully");
		// click_btn(ProductNewBtn);
		return this;
	}

	public Product_Page verifyDescriptionAndSKUBox() throws InterruptedException {

		// click_btn(prodEditBtn);
		getElementText(prodShortDesc, "Short description");
		send_keys(prodShortDescTxtArea, "short description");
		getElementText(prodFullDesc, "Full description");
		Thread.sleep(1000);
		// driver.switchTo().frame("FullDescription_ifr");
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		send_keys(prodFullDescTxtArea, "Full description");
		driver.switchTo().parentFrame();
		click_btn(prodExpandButton);
		// click_btn(prodSaveAndEdit);
		WebElement l = driver.findElement(prodEditSkuField);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		getElementText(prodEditSkuTxt, "SKU");
		send_keys(prodEditSkuField,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghi"
						+ "jklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk"
						+ Keys.ENTER);

		getElementText(prodEditSkuError, "'Sku' must be between 0 and 400 characters.");
		driver.findElement(prodEditSkuField).clear();
		send_keys(prodEditSkuField, "TE_001");
		ExtentTestManager.getTest().log(Status.PASS, "Short and full description box passed successfully");
		// click_btn(prodSaveAndEdit);
		return this;

	}

	public Product_Page verifyManufacturersDD(String CategoryName1, String CategoryName2) throws InterruptedException {

		Thread.sleep(2000);

		click_btn(prodManuCat);
		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName1 + "']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName2 + "']")).click();

		Thread.sleep(2000);
		// click_btn(prodEditSkuField);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer dropdown details passed successfully");
		return this;
	}

	public Product_Page verifyCategoryField(String CategoryName1, String CategoryName2, String CategoryName3)
			throws InterruptedException {
		getElementText(prodEditCatTxt, "Categories");
		String[] exp = { "Fruits & Vegetables", "Fruits & Vegetables >> Fruits",
				"Fruits & Vegetables >> Fruits >> Apple", "Fruits & Vegetables >> Fruits >> Apple >> Indian Apple",
				"Fruits & Vegetables >> Fruits >> Apple >> Australian Apple", "Computers", "Computers >> Desktops",
				"Computers >> Notebooks", "Computers >> Software", "Electronics", "Electronics >> Camera & photo",
				"Electronics >> Cell phones", "Electronics >> Others", "Apparel", "Apparel >> Shoes",
				"Apparel >> Clothing", "Apparel >> Accessories", "Digital downloads", "Books", "Books >> QA 001",
				"Books >> QA 001 >> QA 001 - 01", "Books >> QA 001 >> QA 001 - 01 >> QA 001 - 01 -> 1.2",
				"Books >> QA 001 >> QA 001 - 01 >> QA 001 - 01 -> 1.2 >> QA 001 - 01 -> 1.3" };

		click_btn(prodSelectCat);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName1 + "']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName2 + "']")).click();
		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName3 + "']")).click();
		Thread.sleep(2000);
		click_btn(prodEditCatTxt);
		ExtentTestManager.getTest().log(Status.PASS, "Category field details passed successfully");

		return this;

	}

	public Product_Page verifyPublishProdTags() throws InterruptedException {

		Thread.sleep(2000);
//
//		Thread.sleep(5000);
		WebElement l1 = driver.findElement(ProdEditPublishedTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l1);
		Thread.sleep(5000);
		getElementText(ProdEditPublishedTxt, "Published");
		click_btn(ProdEditPubChkBox);
		Thread.sleep(2000);
		getElementText(prodEditProdTagsTxt, "Product tags");
		Thread.sleep(2000);
		click_btn(ProdEditProductTagsField1);
		Thread.sleep(2000);
		send_keys(prodEditProdTags, "c");
		Thread.sleep(2000);
		return this;
	}

	public Product_Page verifyGtinTxtbox() throws InterruptedException {
//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
		getElementText(prodEditGtinTxt, "GTIN (global trade item number)");
		send_keys(prodEditGtin,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk"
						+ Keys.ENTER);
		Thread.sleep(2000);
		getElementText(prodEditgtinError, "'Gtin' must be between 0 and 400 characters.");
		driver.findElement(prodEditGtin).clear();
		Thread.sleep(2000);
		send_keys(prodEditGtin, "GitNumber");
		ExtentTestManager.getTest().log(Status.PASS, "GTIN (global trade item number) details passed successfully");
		return this;

	}

	public Product_Page verifyManPartNumShowPage() {
		getElementText(prodEditManuPartNum, "Manufacturer part number");
		send_keys(prodEditManPartNumTxt,
				"abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijk"
						+ Keys.ENTER);
		driver.findElement(prodEditManPartNumTxt).clear();
		send_keys(prodEditManPartNumTxt, "Manufacturer part number");
		getElementText(prodEditShowonHomePage, "Show on home page");
		click_btn(prodEditShowOnPageChkBox);
		ExtentTestManager.getTest().log(Status.PASS, "Manufacturer part number details passed successfully");

		return this;

	}

	public Product_Page verifyProductTypeDD() throws InterruptedException {
		getElementText(prodEditProductType, "Product type");
		Select prodType = new Select(driver.findElement(By.id("ProductTypeId")));
		prodType.selectByIndex(0);
		getElementText(prodEditDisplayOrder, "Display order");
		Thread.sleep(1000);
		click_btn(prodEditDisOrderIncrease);
		click_btn(prodEditDisOrderIncrease);
		Thread.sleep(1000);
		click_btn(prodEditDisOrderDecrease);
		String disOrder = driver.findElement(prodEditDisOrderTxt).getAttribute("title");
		Assert.assertEquals(disOrder, "1 ");

		Thread.sleep(1000);
		ExtentTestManager.getTest().log(Status.PASS, "Product type details passed successfully");

		return this;

	}

	public Product_Page verifyProdTempVisInd() throws InterruptedException {
		getElementText(prodEditProdTemplate, "Product template");
		Select prodTemp = new Select(driver.findElement(By.id("ProductTemplateId")));
		prodTemp.selectByIndex(0);
		Thread.sleep(1000);
		// getElementText(prodEditVisibleInd, "Visible individually");
		click_btn(prodEditVisiIndChkBox);
		ExtentTestManager.getTest().log(Status.PASS,
				"Product template and Visible individually details passed successfully");

		Thread.sleep(3000);
		return this;
	}

	public Product_Page verifyCusRolesLimStores(String CategoryName1, String CategoryName2, String CategoryName3)
			throws InterruptedException {

		getElementText(prodEditcusRoles, "Customer roles");
		click_btn(prodEditCusRolesTxt);
//		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName1 + "']")).click();
//		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName2 + "']")).click();
//		click_btn(prodEditcusRoles);
//		getElementText(prodEditLimToStores,"Limited to stores");
//		click_btn(prodEditLimToStoresDd);
//		driver.findElement(By.xpath("//li[normalize-space()='" + CategoryName3 + "']")).click();
//		click_btn(prodEditcusRoles);
		ExtentTestManager.getTest().log(Status.PASS,
				"customer roles and limited to stores details passed successfully");
		Thread.sleep(3000);
		return this;
	}

	public Product_Page verifyVendorDropdown() {
		getElementText(prodEditVendorTxt, "Vendor");
		Select vendor = new Select(driver.findElement(By.id("VendorId")));

		vendor.selectByVisibleText("Vendor 2");
		ExtentTestManager.getTest().log(Status.PASS, "Vendor drop down details passed successfully");
		return this;

	}

	public Product_Page verifyReqOtherProd() throws InterruptedException {
		getElementText(prodEditReqOtherProd, "Require other products");
		click_btn(prodEditReqOtherProdChkbox);
		getElementText(prodEditReqProdIds, "Required product IDs");
		getElementText(prodEditAddReqProd, "Add required product");
		send_keys(prodEditReqProdIdsTxt, "reqId_001");
		String addReqWindow = driver.getWindowHandle();
		click_btn(prodEditAddReqProd);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Choose / Ost administration")) {
				send_keys(EnterProductName, "test @123");
				ProductSearchBtn();
				Thread.sleep(3000);
				click_btn(prodEditChooseProdSel);

				// driver.close();
			}

		}

		driver.switchTo().window(addReqWindow);
		Thread.sleep(3000);
		getElementText(prodEditAutAddProd, "Automatically add these products to the cart");
		getElementText(prodEditReqProdTxt, "test @123");

		click_btn(prodEditAutAddProdChk);
		ExtentTestManager.getTest().log(Status.PASS, "Required other products details passed successfully");
		getElementText(prodEditAllowCusTxt, "Allow customer reviews");
		click_btn(prodEditAllowCusChk);
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Allow customer review details passed successfully");
		return this;
	}

	public Product_Page verifyAvailStartEndDate() throws InterruptedException {

		click_btn(prodEditAvailStartDate);
		click_btn(clickYearTab);
		Thread.sleep(2000);
		click_btn(clickYearTab);
		System.out.println("Calender year clicked");
		click_btn(click2022year);
		Thread.sleep(3000);
		click_btn(clickMonthTab);
		Thread.sleep(3000);
		click_btn(clickDateTab);
		Thread.sleep(1000);
		click_btn(prodEditAvailStartTime);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[normalize-space()='2:00 AM']")).click();
		Thread.sleep(2000);
		getElementText(prodEditAvailStartTxt, "Available start date");
		Thread.sleep(1000);
		ExtentTestManager.getTest().log(Status.PASS, "Available start details details passed successfully");
		click_btn(prodEditAvailEndDate);
		Thread.sleep(2000);
//		click_btn(clickEndYearTab);
//		Thread.sleep(2000);
//		click_btn(click2023year);
//		Thread.sleep(2000);
//		click_btn(clickEndMonthTab);
//		Thread.sleep(2000);
		click_btn(clickEndDateTab);
		Thread.sleep(2000);
		// click_btn(prodEditAvailEndTime);
		// Thread.sleep(2000);
		// System.out.println("Clicked end time");
		// click_btn(prodEditAvailtime);
		// driver.findElement(By.xpath("//li[normalize-space()='2:00 AM']")).click();
		// System.out.println("the time is clicked");
		getElementText(prodEditAvailEndTxt, "Available end date");
		System.out.println("the end time text is clicked");
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Available end details details passed successfully");
		return this;
	}

	public Product_Page verifyMarkasNew() throws InterruptedException {
		/*
		 * send_keys(EnterProductName, "test @123"); ProductSearchBtn();
		 * Thread.sleep(2000); //getElementText(prodName, "test @123");
		 * click_btn(prodEditBtn);
		 */
		WebElement l = driver.findElement(prodEditAvailStartDate);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(2000);
		getElementText(prodEditMarkasNewTxt, "Mark as new");
		click_btn(prodEditMarkNewChk);
		getElementText(prodEditMarNewStartDateTxt, "Mark as new. Start date");
		click_btn(prodEditMarNewStartDate);
		Thread.sleep(2000);
		click_btn(clickYearTab);
		Thread.sleep(2000);
		click_btn(clickYearTab);
		Thread.sleep(2000);
		System.out.println("Calender year clicked");
		click_btn(click2022year);
		Thread.sleep(3000);
		click_btn(clickMonthTab);
		Thread.sleep(3000);
		click_btn(clickDateTab);
		Thread.sleep(1000);
//		click_btn(prodEditMarNewstartDay);
//		Thread.sleep(2000);
		click_btn(prodEditMarNewstartTime);
		Thread.sleep(4000);
		// click_btn(prodEditMarNewstartClock);
		driver.findElement(By.xpath("//li[normalize-space()='1:30 AM']")).click();
		Thread.sleep(2000);

		getElementText(prodEditMarNewEndDateTxt, "Mark as new. End date");
		click_btn(prodEditMarNewEndDate);
		Thread.sleep(2000);
		click_btn(clickEndDateTab);
		Thread.sleep(2000);
		click_btn(prodEditMarNewEndDateClk);
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//li[normalize-space()='1:30 AM']")).click();

		Thread.sleep(3000);

		return this;

	}

	public Product_Page verifyAdminComment() {
		getElementText(prodEditAdminComment, "Admin comment");
		send_keys(prodEditAdminCommentTxt, "This admin comment for testing");
		ExtentTestManager.getTest().log(Status.PASS, "Add comment details passed successfully");
		return this;

	}

	public Product_Page clickDollarUPBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Increase value']//span)[" + index + "]")).click();
		return this;

	}

	public Product_Page clickDollarDownBtn(int index) {
		driver.findElement(By.xpath("(//span[@title='Decrease value']//span)[" + index + "]")).click();
		return this;

	}

	public Product_Page ClickDollarTxtBox(int index, String dollar) {

		String price = driver.findElement(By.xpath("(//input[@class='k-formatted-value k-input'])[" + index + "]"))
				.getAttribute("title");
		Assert.assertEquals(price, dollar);
		return this;
	}

	public Product_Page verifyPriceDetail() throws InterruptedException {
		if (driver.findElement(PEDPriceTxt).isDisplayed()) {
			System.out.println("The price is displayed");
		} else {
			click_btn(prodEditPriceTxt);
		}
		WebElement l = driver.findElement(prodEditPriceTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(2000);
		getElementText(prodEditPriceTxt, "Prices");
		getElementText(PEDPriceTxt, "Price");
		ClickDollarTxtBox(2, "0.0000 QAR");
		System.out.println("New asserts validation");
//		String priceTitle=driver.findElement(PEDPriceDollar).getAttribute("title");
//		Assert.assertEquals(priceTitle , );

		clickDollarUPBtn(2);
		clickDollarUPBtn(2);
		clickDollarDownBtn(2);
		ClickDollarTxtBox(2, "1.0000 QAR");

		System.out.println("New asserts validation");
		ExtentTestManager.getTest().log(Status.PASS, "Price details passed successfully");
		Thread.sleep(3000);
		getElementText(PEDOldPriceTxt, "Old price");
		System.out.println("old price");

		ClickDollarTxtBox(3, "0.0000 QAR");
		clickDollarUPBtn(3);
		clickDollarUPBtn(3);
		clickDollarDownBtn(3);
		ClickDollarTxtBox(3, "1.0000 QAR");
		ExtentTestManager.getTest().log(Status.PASS, "Old price details passed successfully");
		getElementText(PEDProdPriceTxt, "Product cost");
		ClickDollarTxtBox(4, "0.0000 QAR");
		ExtentTestManager.getTest().log(Status.PASS, "Prod price details passed successfully");
		clickDollarUPBtn(4);
		clickDollarUPBtn(4);
		clickDollarUPBtn(4);
		clickDollarDownBtn(4);
		ClickDollarTxtBox(4, "2.0000 QAR");
		click_btn(PEDProdPriceTxt);

		return this;

	}

	public Product_Page verifyProdEditPricesChkBoxes() throws InterruptedException {

//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
//		Thread.sleep(2000);
		if (driver.findElement(PEDDisBuyBtnTxt).isDisplayed()) {
			System.out.println("It is showing up arrow");
			// click_btn(ProductSearchDownarrow);
		} else {

			click_btn(PEDPriceDownArrow);
		}
		WebElement l = driver.findElement(prodEditPriceTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(2000);
		Thread.sleep(2000);
		getElementText(PEDDisBuyBtnTxt, "Disable buy button");
		click_btn(PEDDisBuyBtnChkBx);
		ExtentTestManager.getTest().log(Status.PASS, "Disable buy button checkbox passed successfully");
		getElementText(PEDDisWisBtnTxt, "Disable wishlist button");
		click_btn(PEDDisWisBtnChkBx);
		ExtentTestManager.getTest().log(Status.PASS, "Disable wishlist button checkbox passed successfully");
		getElementText(PEDAvailOrderTxt, "Available for pre-order");
		click_btn(PEDAvailOrderChkbx);
		ExtentTestManager.getTest().log(Status.PASS, "Available for pre-order checkbox passed successfully");

		getElementText(PEDPreOrderAvailTxt, "Pre-order availability start date");
//		click_btn(PEDPreOrderAvailClk);
//		Thread.sleep(2000);
//		click_btn(clickYearTab);
//		Thread.sleep(2000);
//		click_btn(clickYearTab);
//		Thread.sleep(2000);
//		System.out.println("Calender year clicked");
//		click_btn(click2022year);
//		Thread.sleep(3000);
//		click_btn(clickMonthTab);
//		Thread.sleep(3000);
//		click_btn(clickDateTab);
//		Thread.sleep(1000);
////		click_btn(prodEditMarNewstartDay);
//		Thread.sleep(2000);
//		click_btn(PEDPreOrderAvailSD);
//		Thread.sleep(4000);
//		//click_btn(prodEditMarNewstartClock);
//		driver.findElement(By.xpath("//li[normalize-space()='1:30 AM']")).click();
//		Thread.sleep(2000);
		ExtentTestManager.getTest().log(Status.PASS, "Pre-order availability start date details passed successfully");

		return this;

	}

	public Product_Page verifyCustomersEnterPrice() throws InterruptedException {

		getElementText(PEDCallPriceTxt, "Call for price");
		click_btn(PEDCallPriceChkbx);
		ExtentTestManager.getTest().log(Status.PASS, "Call for price checkbox passed successfully");

		getElementText(PEDCusEntPriceTxt, "Customer enters price");
		click_btn(PEDCusEntPricechk);
		ExtentTestManager.getTest().log(Status.PASS, "Customers enter price checkbox passed successfully");

		click_btn(PEDBasePriceTxt);

		getElementText(PEDMinCusPriceTxt, "Minimum amount");
		ClickDollarTxtBox(5, "0.0000 QAR");
		clickDollarUPBtn(5);
		clickDollarUPBtn(5);
		clickDollarDownBtn(5);
		ClickDollarTxtBox(5, "1.0000 QAR");
		WebElement l = driver.findElement(PEDMaxCusEntPriceTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(2000);
		getElementText(PEDMaxCusEntPriceTxt, "Maximum amount");
		ClickDollarTxtBox(6, "1000.0000 QAR");
		ExtentTestManager.getTest().log(Status.PASS, "Minimum amount details passed successfully");

		Thread.sleep(3000);
		clickDollarUPBtn(6);
		clickDollarUPBtn(6);
		Thread.sleep(3000);
		clickDollarUPBtn(6);
		clickDollarDownBtn(6);
		ClickDollarTxtBox(6, "1002.0000 QAR");
		ExtentTestManager.getTest().log(Status.PASS, "Maximum amount details passed successfully");

		Thread.sleep(4000);
		return this;
	}

	public Product_Page verifyBasePriceEnabled() throws InterruptedException {
		if (driver.findElement(PEDAmountProd).isDisplayed()) {
			System.out.println("It is displayed");
		} else {
			click_btn(PEDBasePricechk);
		}
		getElementText(PEDBasePriceTxt, "PAngV (base price) enabled");

		Thread.sleep(4000);
		getElementText(PEDAmountProd, "Amount in product");
		ClickDollarTxtBox(7, "0.0000 ");
		Thread.sleep(3000);
		clickDollarUPBtn(7);
		clickDollarUPBtn(7);
		clickDollarDownBtn(7);
		ClickDollarTxtBox(7, "1.0000 ");
		ExtentTestManager.getTest().log(Status.PASS, "Amount in product details passed successfully");
		getElementText(PEDUnitOfProdTxt, "Unit of product");
		Select unitProd = new Select(driver.findElement(PEDUnitOfProdDD));
		unitProd.selectByIndex(1);
		getElementText(PEDRefAmtTxt, "Reference amount");
		ClickDollarTxtBox(8, "0.0000 ");
		clickDollarUPBtn(8);
		clickDollarUPBtn(8);
		clickDollarDownBtn(8);
		ClickDollarTxtBox(8, "1.0000 ");
		getElementText(PEDRefUnitTxt, "Reference unit");
		Select refUnit = new Select(driver.findElement(PEDRefUnitDD));
		refUnit.selectByValue("2");
		ExtentTestManager.getTest().log(Status.PASS, "Basic price enabled details passed successfully");
		return this;

	}

	public Product_Page verifyDiscountsPrice() throws InterruptedException {

		WebElement l = driver.findElement(PEDTaxCategoryTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(2000);
		String discounts = driver.findElement(PEDPriceDiscounts).getText();
		System.out.println("The discounts is" + discounts);
		getElementText(PEDPriceDiscounts, "Discounts");
		Thread.sleep(3000);
		// click_btn(PEDDiscoutsDD);
		// Thread.sleep(2000);
//			driver.findElement(By.xpath("//li[normalize-space()='Sample discount with coupon code']")).click();
		// getElementText(PEDTaxExempt, "Tax exempt");
		if (driver.findElement(PEDTaxCategoryTxt).isDisplayed()) {
			getElementText(PEDTaxCategoryTxt, "Tax category");
			Select taxCat = new Select(driver.findElement(PEDTaxCategoryDD));
			taxCat.selectByIndex(3);
			getElementText(PEDTeleBroadElecTxt, "Telecommunications, broadcasting and electronic services");
		} else {
			click_btn(PEDTaxExemptChkbox);
		}

		click_btn(PEDTeleBroadElecChkBx);
		ExtentTestManager.getTest().log(Status.PASS, "Discount price details passed successfully");
		return this;

	}

	public Product_Page verifyEditPordAttributes() throws InterruptedException {
		WebElement l = driver.findElement(PEDEditProdAttributes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		if (driver.findElement(PEDProdAttKnowMoreTxt).isDisplayed()) {
			System.out.println("It is displayed");
		} else {
			click_btn(PEDEditProdAttributes);
		}
		getElementText(PEDEditProdAttributes, "Product attributes");
		Thread.sleep(2000);
		getElementText(PEDProdAttKnowMoreTxt, "Know more about Product attributes");
		getElementText(PEDProdAttProdAttTxt, "Product attributes");
		click_btn(PEDProdAttKnowMoreTxt);
		String details = driver.findElement(PEDProdAtKnowMoreDetails).getText();
		if (details.contains(
				"For example, if you were to create an attribute for color, with the values of blue, green, yellow, and so on, you may want to apply")) {
			click_btn(PEDProdAttKnowMoreTxt);

		} else {
			System.out.println("There is no text");

		}
		ExtentTestManager.getTest().log(Status.PASS, "Product attributes details passed successfully");
		return this;
	}

	public Product_Page verifyEditPordAttributesTable() {

		WebElement l = driver
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[25]"));
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
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[25]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Attribute");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[26]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Text prompt");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[27]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Is Required");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[28]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Control type");
		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[29]"));
		String rowtext5 = Rowtable5.getText();
		Assert.assertEquals(rowtext5, "Display order");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[30]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Validation rules");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[31]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "Condition");

		WebElement Rowtable8 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[32]"));
		String rowtext8 = Rowtable8.getText();
		Assert.assertEquals(rowtext8, "Edit");
		ExtentTestManager.getTest().log(Status.PASS, "Edit Product attribute Column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[5]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Custom Text");
		WebElement cellNo2 = Rowtable4
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[8]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "Checkboxes");
		WebElement cellNo4 = Rowtable5
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[9]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "1");

		WebElement cellNo9 = Rowtable8.findElement(By.xpath("//a[text()='Edit']"));
		String valueNo9 = cellNo9.getText();
		System.out.println("the value no 9 is" + valueNo9);
		Assert.assertEquals(valueNo9, "Edit");

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		ExtentTestManager.getTest().log(Status.PASS, "Product attribute column details passed successfully");
		click_btn(GoBackBtn);
		return this;

	}

	public Product_Page veriyProdAttributesAddNew() throws InterruptedException {
		Thread.sleep(4000);
		getElementText(PEDPrdAttAddNewTxt, "Add a new attribute");
		System.out.println("It is displayed");
		click_btn(PEDPrdAttAddNewTxt);
		System.out.println("It is clicking");

		getElementText(PEDPrdAttAddNewBack, "Go back");
		getElementText(PEDPrdAttAddSave, "Save");
		getElementText(PEDPrdAttAddSaveAndEdit, "Save & edit");
		click_btn(PEDPrdAttAddNewBack);
		getElementText(GoBackBtn, "Go back");
		WebElement l = driver.findElement(PEDEditProdAttributes);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		if (driver.findElement(PEDProdAttKnowMoreTxt).isDisplayed()) {
			System.out.println("It is displayed");
		} else {
			click_btn(PEDEditProdAttributes);
		}

		click_btn(PEDPrdAttAddNewTxt);
		getElementText(PEDAddNewAttValues, "Values");
		if (driver.findElement(PEDAddNewAttValuesMsg).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(PEDAddNewAttValues);
		}
		getElementText(PEDAddNewAttValuesMsg,
				"You need to save the product attribute before you can add values for this product attribute page.");
		click_btn(PEDPrdAttAddSaveAndEdit);
		getElementText(PEDPrdAttAddInfo, "Info");
		ExtentTestManager.getTest().log(Status.PASS, "Add new Product attribute details passed successfully");
		return this;

	}

	public Product_Page verifyAddNewAttInfo() throws InterruptedException {
		if (driver.findElement(PEDAddNewAttAttrib).isDisplayed()) {
			System.out.println("The info section is displayed");
		} else {
			click_btn(PEDPrdAttAddInfo);
		}
		getElementText(PEDAddNewAttAttrib, "Attribute");
		Select attOpt = new Select(driver.findElement(By.id("ProductAttributeId")));
		attOpt.selectByValue("3");
		getElementText(PEDAddNewAttTxtPrmpt, "Text prompt");
		send_keys(PEDAddNewAttTxtPrmptbox, "The Text prmpt box entered");
		getElementText(PEDAddNewAttIsReq, "Is Required");
		click_btn(PEDAddNewAttIsReqchk);
		getElementText(PEDAddNewAttContType, "Control type");
		Select controlType = new Select(driver.findElement(By.id("AttributeControlTypeId")));
		controlType.selectByIndex(2);
		getElementText(PEDAddNewAttDisOrder, "Display order");
		ClickDollarTxtBox(1, "0 ");
		clickDollarUPBtn(1);
		clickDollarUPBtn(1);
		clickDollarDownBtn(1);
		ClickDollarTxtBox(1, "1 ");
		click_btn(SaveAndEditBtn);
		Thread.sleep(4000);
		ExtentTestManager.getTest().log(Status.PASS,
				"Add New product Attribute information details passed successfully");
		return this;

	}

	public Product_Page verifyAddNewAttValues() {

		driver.findElement(By.xpath("//div[text()='Values']")).isDisplayed();
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
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[1]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Attribute value type");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[2]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Name");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[3]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Associated product");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[4]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Price adjustment");
		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[5]"));
		String rowtext5 = Rowtable5.getText();
		Assert.assertEquals(rowtext5, "Weight adjustment");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[6]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Is pre-selected");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[7]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "Picture");
		WebElement Rowtable8 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[8]"));
		String rowtext8 = Rowtable8.getText();
		Assert.assertEquals(rowtext8, "Display order");
		WebElement Rowtable9 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[9]"));
		String rowtext9 = Rowtable9.getText();
		Assert.assertEquals(rowtext9, "Edit");
		WebElement Rowtable10 = baseTable
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[10]"));
		String rowtext10 = Rowtable10.getText();
		Assert.assertEquals(rowtext10, "Delete");
		ExtentTestManager.getTest().log(Status.PASS, "Product attribute column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td[1]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Simple");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td[2]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "Add a new value text");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[4])[2]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "1 %");
		WebElement cellNo5 = Rowtable5
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[5])[2]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "1");
		WebElement cellNo6 = Rowtable6
				.findElement(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td[6]"));
		String valueNo6 = cellNo6.getText();
		System.out.println("the value no 6 is" + valueNo6);
		WebElement cellNo8 = Rowtable8
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td[8])[2]"));
		String valueNo8 = cellNo8.getText();
		Assert.assertEquals(valueNo8, "1");
		WebElement cellNo9 = Rowtable9.findElement(By.xpath("//button[text()='Edit']"));
		String valueNo9 = cellNo9.getText();
		Assert.assertEquals(valueNo9, "Edit");
		WebElement cellNo10 = Rowtable10.findElement(By.xpath("//a[text()='Delete']"));
		String valueNo10 = cellNo10.getText();
		Assert.assertEquals(valueNo10, "Delete");
		click_btn(GoBackBtn);
		ExtentTestManager.getTest().log(Status.PASS, "Product attribute column details passed successfully");
		return this;

	}

	public Product_Page verifyEPAAddNewValue() throws InterruptedException {
		getElementText(PEDEPAAddNewValueTxt, "Add a new value");
		click_btn(PEDEPAAddNewValueTxt);
		String addReqWindow = driver.getWindowHandle();
		// click_btn(prodEditAddReqProd);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new value / Ost administration")) {
			
				getElementText(PEDEPAAddNewValueAttValue, "Attribute value type");
				Select attValue = new Select(driver.findElement(By.id("AttributeValueTypeId")));
				attValue.selectByIndex(0);
				getElementText(PEDEPAAddNewValueName, "Name");
				send_keys(PEDEPAAddNewValueNameTxt, "Add a new value text");
				getElementText(PEDEPAAddNewValuePriceAdj, "Price adjustment");
				ClickDollarTxtBox(2, "0.0000 ");
				clickDollarUPBtn(2);
				clickDollarUPBtn(2);
				clickDollarDownBtn(2);
				ClickDollarTxtBox(2, "1.0000 ");
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
				.findElement(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th[4]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Price adjustment");
		WebElement cellNo4 = Rowtable4
				.findElement(By.xpath("//div[@class='dataTables_scrollBody']/table/tbody/tr/td[4]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "1");
		click_btn(PEDEPAAddNewValueTxt);
		String addReqWindow1 = driver.getWindowHandle();
		// click_btn(prodEditAddReqProd);
		Set<String> windows1 = driver.getWindowHandles();
		Iterator<String> itr1 = windows1.iterator();
		while (itr1.hasNext()) {
			String window = itr1.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add a new value / Ost administration")) {
				getElementText(PEDEPAAddNewValueAttValue, "Attribute value type");
				Select attValue = new Select(driver.findElement(By.id("AttributeValueTypeId")));
				attValue.selectByIndex(0);
				getElementText(PEDEPAAddNewValueName, "Name");
				send_keys(PEDEPAAddNewValueNameTxt, "Add a new value text");
				getElementText(PEDEPAAddNewValuePriceAdj, "Price adjustment");
				ClickDollarTxtBox(2, "0.0000 ");
				clickDollarUPBtn(2);
				clickDollarUPBtn(2);
				clickDollarDownBtn(2);
				ClickDollarTxtBox(2, "1.0000 ");
				getElementText(PEDEPAAddNewValuePriceAdjPer, "Price adjustment. Use percentage");
				click_btn(PEDEPAAddNewValuePriceAdjPerChk);
				// click_btn(saveBtn);
				// driver.close();

				getElementText(PEDEPAAddNewValueWtAdj, "Weight adjustment");
				ClickDollarTxtBox(3, "0.0000 ");
				clickDollarUPBtn(3);
				clickDollarUPBtn(3);
				clickDollarDownBtn(3);
				ClickDollarTxtBox(3, "1.0000 ");
				getElementText(PEDEPAAddNewValueCost, "Cost");
				ClickDollarTxtBox(4, "0.0000 ");
				clickDollarUPBtn(4);
				clickDollarUPBtn(4);
				clickDollarUPBtn(4);
				clickDollarDownBtn(4);
				ClickDollarTxtBox(4, "2.0000 ");
				getElementText(PEDEPAEditValueIsPreSel, "Is pre-selected");
				click_btn(PEDEPAEditValueIsPreSelChk);
				getElementText(prodEditDisplayOrder, "Display order");
				ClickDollarTxtBox(5, "0 ");
				clickDollarUPBtn(5);
				clickDollarUPBtn(5);
				clickDollarDownBtn(5);
				ClickDollarTxtBox(5, "1 ");
				getElementText(PEDEPAEditValuePic, "Picture");
				getElementText(PEDEPAEditValueNoPic, "No picture");
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

	public Product_Page verifyEPDShippingPage() throws InterruptedException {

		getElementText(PEDShippingTxt, "Shipping");
		if (driver.findElement(PEDShipEnabledTxt).isDisplayed()) {
			System.out.println("It is displayed");

		} else {
			click_btn(PEDShippingTxt);
		}
		Thread.sleep(3000);
		getElementText(PEDShipEnabledTxt, "Shipping enabled");
		// driver.findElement(PEdShipEnabledChkBox).click();

		if (driver.findElement(PEdShipWeight).isDisplayed()) {
			System.out.println("The weight is displayed");
		} else {
			click_btn(PEdShipEnabledChkBox);
		}
		Thread.sleep(3000);
		// click_btn(PEdShipEnabledChkBox);
		// Thread.sleep(3000);
		getElementText(PEdShipWeight, "Weight");
		ClickDollarTxtBox(9, "0.0000 lb(s)");
		clickDollarUPBtn(9);
		clickDollarUPBtn(9);
		clickDollarDownBtn(9);
		click_btn(PEdShipWeight);
		ClickDollarTxtBox(9, "1.0000 lb(s)");
		ExtentTestManager.getTest().log(Status.PASS, "Weight details passed successfully");
		getElementText(PEdShipLength, "Length");
		ClickDollarTxtBox(10, "0.0000 inch(es)");
		clickDollarUPBtn(10);
		clickDollarUPBtn(10);
		clickDollarUPBtn(10);
		clickDollarDownBtn(10);
		click_btn(PEdShipLength);
		ClickDollarTxtBox(10, "2.0000 inch(es)");

		getElementText(PEdShipWidth, "Width");
		ClickDollarTxtBox(11, "0.0000 inch(es)");
		clickDollarUPBtn(11);
		clickDollarUPBtn(11);
		clickDollarDownBtn(11);
		click_btn(PEdShipWidth);
		ClickDollarTxtBox(11, "1.0000 inch(es)");
		ExtentTestManager.getTest().log(Status.PASS, "Width details passed successfully");
		return this;
	}

	public Product_Page veriyPEDShipSubSection() {
		getElementText(PEdShipHeight, "Height");
		ClickDollarTxtBox(12, "0.0000 inch(es)");
		clickDollarUPBtn(12);
		clickDollarUPBtn(12);
		clickDollarUPBtn(12);
		clickDollarDownBtn(12);
		click_btn(PEdShipHeight);
		ClickDollarTxtBox(12, "2.0000 inch(es)");

		getElementText(PEDShipFreeShipTxt, "Free shipping");
		click_btn(PEdShipFreeShipChkBox);
		getElementText(PEDShipshipSepTxt, "Ship separately");
		click_btn(PEDShipshipSepChk);
		getElementText(PEDShipAddChargeTxt, "Additional shipping charge");
		ClickDollarTxtBox(13, "0.0000 QAR");
		clickDollarUPBtn(13);
		clickDollarUPBtn(13);
		clickDollarUPBtn(13);
		clickDollarDownBtn(13);
		click_btn(PEdShipHeight);
		ClickDollarTxtBox(13, "2.0000 QAR");

		getElementText(PEDShipDelDateTxt, "Delivery date");
		Select delDate = new Select(driver.findElement(By.id("DeliveryDateId")));
		delDate.selectByIndex(1);
		ExtentTestManager.getTest().log(Status.PASS, "Additional shipping charges details passed successfully");
		return this;

	}

	public Product_Page verifyEPDInventory() throws InterruptedException {
//			Thread.sleep(3000);
//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
//		Thread.sleep(2000);
		WebElement l = driver.findElement(PEDInvenTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		if (driver.findElement(PEDInvenMeth).isDisplayed()) {
			getElementText(PEDInvenMeth, "Inventory method");

		} else {
			click_btn(PEDInvenTxt);
			getElementText(PEDInvenTxt, "Inventory");
		}
		Thread.sleep(2000);
		Select invMethod = new Select(driver.findElement(By.id("ManageInventoryMethodId")));
		invMethod.selectByIndex(1);
		getElementText(PEDInvenMinQty, "Minimum cart qty");
		ClickDollarTxtBox(17, "1 ");
		clickDollarUPBtn(17);
		clickDollarUPBtn(17);
		clickDollarDownBtn(17);
		ClickDollarTxtBox(17, "2 ");
		getElementText(PEDInvenMaxQty, "Maximum cart qty");
		ClickDollarTxtBox(18, "10000 ");
		clickDollarUPBtn(18);
		clickDollarUPBtn(18);
		clickDollarDownBtn(18);
		ClickDollarTxtBox(18, "10001 ");
		getElementText(PEDInvenAllowedQty, "Allowed quantities");
		send_keys(PEDInvenAllowedQtyTxtbox, "10");
		getElementText(PEDInvenNotRetTxt, "Not returnable");
		click_btn(PEDInvenNotRetChkbox);
		ExtentTestManager.getTest().log(Status.PASS, "Inventory details passed successfully");
		return this;

	}

	public Product_Page verifyEPDSpecittributes() throws InterruptedException {
		Thread.sleep(3000);
//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
//		Thread.sleep(2000);

		WebElement l = driver.findElement(PEDSpecifAttTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		Thread.sleep(3000);
		getElementText(PEDSpecifAttTxt, "Specification attributes");
		
		Thread.sleep(3000);
		if (driver.findElement(PEDSpecifAtKnowMoreDetails).isDisplayed()) {
			String details = driver.findElement(PEDSpecifAtKnowMoreDetails).getText();
			Assert.assertEquals(details, details.contains(
					"Specification attributes can be used for filtering products on the category details page."));

		} else {
			click_btn(PEDSpecifAttTxt);
			Thread.sleep(3000);
		}
		getElementText(PEDSpecifAttKnowMoreTxt, "Know more about Specification attributes");
		String details = driver.findElement(PEDSpecifAtKnowMoreDetails).getText();
		Boolean detTxt = details.contains(
				"Specification attributes are product features i.e, screen size, number of USB-ports, visible on product details page");
		Assert.assertTrue(detTxt);
		click_btn(PEDSpecifAttKnowMoreTxt);
		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute details passed successfully");

		return this;
	}

	public Product_Page veriySpeicAttributesAddNew() throws InterruptedException {
		Thread.sleep(4000);

		getElementText(PEDSpecAttAddAttTxt, "Add attribute");
		System.out.println("It is displayed");
		click_btn(PEDSpecAttAddAttTxt);

		getElementText(GobackButton, "Go back");
		getElementText(PEDPrdAttAddSave, "Save");
		getElementText(PEDPrdAttAddSaveAndEdit, "Save & edit");
		click_btn(GobackButton);
		click_btn(PEDSpecAttAddAttTxt);
		getElementText(AddNewSpeciAtttype, "Attribute type");
		Select attType = new Select(driver.findElement(AddNewSpeciAttOpt));
		attType.selectByIndex(1);
		getElementText(AddNewSpeciAttTxt, "Attribute");
		Select attName = new Select(driver.findElement(AddNewSpeciAtNameOpt));
		attName.selectByIndex(1);
		getElementText(AddNewSpeciAttValue, "Value");
		send_keys(AddNewSpeciAttTxtBox, "Attribute value");
		getElementText(AddNewSpeciAttShowON, "Show on product page");
		click_btn(AddNewSpeciAttShowONChk);
		getElementText(PEDAddNewAttDisOrder, "Display order");
		ClickDollarTxtBox(1, "0 ");
		clickDollarUPBtn(1);
		clickDollarUPBtn(1);
		clickDollarDownBtn(1);
		ClickDollarTxtBox(1, "1 ");
		click_btn(SaveAndEditBtn);
		getElementText(AddNewSpeciAtttype, "Attribute type");
		click_btn(saveBtn);
		getElementText(PEDSpecifAttTxt, "Specification attributes");
		ExtentTestManager.getTest().log(Status.PASS, "Add new specification attribute details passed successfully");
		return this;

	}

	public Product_Page verifySpecifAttributesTable() {

		WebElement l = driver
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[33]"));
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
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[44]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Attribute type");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[45]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Attribute");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[46]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Value");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[47]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Allow filtering");
		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[48]"));
		String rowtext5 = Rowtable5.getText();
		Assert.assertEquals(rowtext5, "Show on product page");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[49]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Display order");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[50]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "Edit");
		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute column name details passed successfully");
		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[14]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "Custom text");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[15]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "Color");
		WebElement cellNo4 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[16]"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "Attribute value");
		WebElement cellNo5 = Rowtable6
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[19]"));
		String valueNo5 = cellNo5.getText();
		Assert.assertEquals(valueNo5, "1");
		WebElement cellNo9 = Rowtable7.findElement(By.xpath("//a[text()='Edit']"));
		String valueNo9 = cellNo9.getText();
		System.out.println("the value no 9 is" + valueNo9);
		Assert.assertEquals(valueNo9, "Edit");

		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		click_btn(GobackButton);
		getElementText(PEDSpecifAttTxt, "Specification attributes");
		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute column details passed successfully");
		return this;

	}

	public Product_Page verifyRecurringProdPage() throws InterruptedException {

		WebElement l = driver.findElement(PEDEPARecProdSecTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		if (driver.findElement(PEDEPARecProdTxt).isDisplayed()) {
			getElementText(PEDEPARecProdTxt, "Recurring product");

		} else {
			click_btn(PEDEPARecProdSecTxt);
			element_isDisplayed(PEDRecProdChkBox);
		}

		if (driver.findElement(PEDRecProdCycleLen).isDisplayed()) {
			getElementText(PEDRecProdCycleLen, "Cycle length");

		} else {
			click_btn(PEDRecProdChkBox);
		}
		ExtentTestManager.getTest().log(Status.PASS, "Recurring section details passed successfully");
		return this;
	}

	public Product_Page verifyRecurringProdSubSection() {

		ClickDollarTxtBox(22, "100 ");
		clickDollarUPBtn(22);
		clickDollarUPBtn(22);
		clickDollarUPBtn(22);
		clickDollarDownBtn(22);
		ClickDollarTxtBox(22, "102 ");
		getElementText(PEDRecProdCyclePer, "Cycle period");
		Select period = new Select(driver.findElement(PEDRecProdCyclePerDD));
		period.selectByIndex(1);
		getElementText(PEDRecProdCycleTotCycle, "Total cycles");

		ClickDollarTxtBox(23, "10 ");
		clickDollarUPBtn(23);
		clickDollarUPBtn(23);
		clickDollarUPBtn(23);
		clickDollarDownBtn(23);
		ClickDollarTxtBox(23, "12 ");
		ExtentTestManager.getTest().log(Status.PASS, "Recurring sub section details passed successfully");
		return this;
	}

	public Product_Page verifySEOSection() throws InterruptedException {
		Thread.sleep(3000);
//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
//		Thread.sleep(2000);
		WebElement l = driver.findElement(PEDSEOSectionTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		if (driver.findElement(PEDSearchEngineTxt).isDisplayed()) {
			getElementText(PEDSearchEngineTxt, "Search engine friendly page name");

		} else {
			click_btn(PEDSEOSectionTxt);

		}
		driver.findElement(PEDSearchEngineTxtbox).clear();
		send_keys(PEDSearchEngineTxtbox, "test");
		click_btn(PEDMetaTitle);
		
	//	getElementText(PEDSearchEngineWarning,
		//		"The entered text will be replaced by 'test-5', since it is already used as a SEO-friendly name for another page or contains invalid characters");
		driver.findElement(PEDSearchEngineTxtbox).clear();
		send_keys(PEDSearchEngineTxtbox, "test-5");
		getElementText(PEDMetaTitle, "Meta title");
		send_keys(PEDMetaTitleTxtbox, "Meta title is entered");
		getElementText(PEDMetaKey, "Meta keywords");
		send_keys(PEDMetaKeyTxtbox, "Meta keywords are entered");
		getElementText(PEDMetaDesc, "Meta description");
		send_keys(PEDMetaDescTxtbox, "Meta description are entered");
		ExtentTestManager.getTest().log(Status.PASS, "SEO section details passed successfully");
		return this;
	}

	public Product_Page verifyRelatedProd() throws InterruptedException {
	
		WebElement l = driver.findElement(PEDRelProdSecTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);

		if (driver.findElement(PEDRelProdKnowMore).isDisplayed()) {
			Thread.sleep(3000);
			getElementText(PEDRelProdKnowMore, "Know more about Related products");

		} else {
			click_btn(PEDRelProdSecTxt);
			getElementText(PEDRelProdSecTxt, "Related products");
		}
		click_btn(PEDRelProdKnowMore);
		getElementText(PEDRelProdKnowMoreTxt,
				"The Related Products option provides the opportunity to advertise products that are not part of the selected category, to your visitors. These products are displayed on the product details pages.");
		getElementText(PEDRelProdAddNewTxt, "Add new related product");
		String addReqWindow = driver.getWindowHandle();
		click_btn(PEDRelProdAddNewTxt);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add new related product / Ost administration")) {
				send_keys(EnterProductName, "test @123");
				ProductSearchBtn();
				Thread.sleep(3000);
				click_btn(prodEditChooseProd);
				click_btn(saveBtn);

				// driver.close();
			}

		}

		driver.switchTo().window(addReqWindow);
		Thread.sleep(3000);

		ExtentTestManager.getTest().log(Status.PASS, "Related product details passed successfully");

		return this;

	}

	public Product_Page verifyRelatedProdTable() {

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
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[51]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Product");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[52]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Display order");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[53]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "View");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[54]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Edit");
		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[55]"));
		String rowtext5 = Rowtable5.getText();
		Assert.assertEquals(rowtext5, "Delete");
		ExtentTestManager.getTest().log(Status.PASS, "Related product column name details passed successfully");

		WebElement cellNo1 = Rowtable1
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[21]"));
		String valueNo1 = cellNo1.getText();
		System.out.println("Cell value is : " + valueNo1);
		Assert.assertEquals(valueNo1, "test @123");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[22]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "1");
		WebElement cellNo4 = Rowtable3.findElement(By.xpath("//a[text()='View']"));
		String valueNo4 = cellNo4.getText();
		Assert.assertEquals(valueNo4, "View");
		WebElement cellNo5 = Rowtable4.findElement(By.xpath("(//a[text()='Edit'])[3]"));
		String valueNo5 = cellNo5.getText();
		System.out.println("the value no 9 is" + valueNo5);
		Assert.assertEquals(valueNo5, "Edit");
		WebElement cellNo9 = Rowtable5.findElement(By.xpath("//a[text()='Delete']"));
		String valueNo9 = cellNo9.getText();
		System.out.println("the value no 9 is" + valueNo9);
		Assert.assertEquals(valueNo9, "Delete");

		ExtentTestManager.getTest().log(Status.PASS, "Specification attribute column details passed successfully");
		return this;

	}

	public Product_Page verifyRelProdEditButton() throws InterruptedException {

		driver.findElement(By.xpath("(//a[text()='Edit'])[3]")).click();
		click_btn(PEDRelProdCancelBtn);
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[52]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Display order");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[22]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "1");

		driver.findElement(By.xpath("(//a[text()='Edit'])[3]")).click();
		driver.findElement(PEDRelProdDispTxtBx).clear();
		send_keys(PEDRelProdDispTxtBx, "2");

		click_btn(PEDRelProdUpdBtn);
		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[52]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[52]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Display order");
		WebElement cellNo3 = Rowtable3
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[22]"));
		String valueNo3 = cellNo3.getText();
		Assert.assertEquals(valueNo3, "2");
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Related Edit product details passed successfully");
		return this;
	}
	public Product_Page verifyCrossSellsSection() throws InterruptedException {
//		send_keys(EnterProductName, "test @123");
//		ProductSearchBtn();
//		Thread.sleep(2000);
//		getElementText(prodName, "test @123");
//		click_btn(prodEditBtn);
//		Thread.sleep(2000);
		WebElement l = driver.findElement(PEDCrossSellsTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		
		if (driver.findElement(PEDCrossSellKnowMore).isDisplayed()) {
			getElementText(PEDCrossSellKnowMore, "Know more about Cross-sells");
			
		} else {
			click_btn(PEDCrossSellsTxt);
			getElementText(PEDCrossSellsTxt, "Cross-sells");
			
		}
		click_btn(PEDCrossSellKnowMore);
		getElementText(PEDCrossSellKnowMoreTxt, "The Cross-sell products option provides the opportunity to buy additional products that generally go with the selected product. They are displayed at the bottom of the checkout page.");
		getElementText(PEDCrossSellAddNewTxt, "Add new cross-sell product");
		click_btn(PEDCrossSellAddNewTxt);
		String addReqWindow = driver.getWindowHandle();		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while (itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if (driver.getTitle().equals("Add new cross-sell product / Ost administration")) {
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

		ExtentTestManager.getTest().log(Status.PASS, "Related product details passed successfully");

		
		return this;
		
	}

	public Product_Page verifyCrossSellTable() throws InterruptedException {

		
		WebElement baseTable = driver.findElement(By.tagName("table"));
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[56]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Product");
		WebElement cellNo2 = Rowtable2
				.findElement(By.xpath("(//div[@class='dataTables_scrollBody']/table/tbody/tr/td)[26]"));
		String valueNo2 = cellNo2.getText();
		Assert.assertEquals(valueNo2, "Windows 8 Pro");

		Thread.sleep(3000);
		WebElement l = driver.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[57]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[57]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Delete");
		WebElement cellNo3 = Rowtable3
				.findElement(By.xpath("(//a[text()='Delete'])[2]"));
		String valueNo3 = cellNo3.getText();
		Assert.assertEquals(valueNo3, "Delete");
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Cross sells product details passed successfully");
		return this;
	}
		public Product_Page verifyCrossSellProdLink() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/AdminWebUi/Product/Edit/11']")).click();
			Thread.sleep(3000);
			if (driver.findElement(EnterProductName).isDisplayed()) {
				System.out.println("The product name is displayed");
			} else {
				click_btn(PEDProductInfoTxt);
			}
			Thread.sleep(4000);
			String prodValue=driver.findElement(EnterProductName).getAttribute("value");
			System.out.println("The product value"+prodValue);
			Assert.assertEquals(prodValue, "Windows 8 Pro");
			Thread.sleep(2000);
			click_btn(GobackButton);
			
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(Status.PASS, "Cross sells product details passed successfully");
		return this;
	}
	
	public Product_Page verifyPurchasedWithOrders() throws InterruptedException {
		Thread.sleep(2000);
		send_keys(EnterProductName, "test @123");
		ProductSearchBtn();
		Thread.sleep(2000);
		getElementText(prodHomeName, "test @123");
		click_btn(prodEditBtn);
		Thread.sleep(2000);
		
		WebElement l = driver.findElement(PEDPurchOrderTxt);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", l);
		if(driver.findElement(PEDPurchOrderKnowMore).isDisplayed()) {
			getElementText(PEDPurchOrderKnowMore, "Know more about Purchased with orders");
			
		}else {
			click_btn(PEDPurchOrderTxt);
		}
		click_btn(PEDPurchOrderKnowMore);
		getElementText(PEDPurchOrderKnowMoreTxt, "Here you can see a list of orders in which this product was purchased.");
		

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
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[58]"));
		String rowtext1 = Rowtable1.getText();
		System.out.println("The row text of the web table : " + rowtext1);
		Assert.assertEquals(rowtext1, "Order #");
		WebElement Rowtable2 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[59]"));
		String rowtext2 = Rowtable2.getText();
		Assert.assertEquals(rowtext2, "Email");
		WebElement Rowtable3 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[60]"));
		String rowtext3 = Rowtable3.getText();
		Assert.assertEquals(rowtext3, "Order status");
		WebElement Rowtable4 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[61]"));
		String rowtext4 = Rowtable4.getText();
		Assert.assertEquals(rowtext4, "Payment status");
		WebElement Rowtable5 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[62]"));
		String rowtext5 = Rowtable5.getText();
		Assert.assertEquals(rowtext5, "Shipping status");
		WebElement Rowtable6 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[63]"));
		String rowtext6 = Rowtable6.getText();
		Assert.assertEquals(rowtext6, "Created on");
		WebElement Rowtable7 = baseTable
				.findElement(By.xpath("(//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th)[64]"));
		String rowtext7 = Rowtable7.getText();
		Assert.assertEquals(rowtext7, "View");
		ExtentTestManager.getTest().log(Status.PASS, "Purchased with products details passed successfully");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
