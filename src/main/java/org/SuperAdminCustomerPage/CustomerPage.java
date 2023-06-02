package org.SuperAdminCustomerPage;

import java.time.Duration;

import org.SuperAdminCatalogPage.Product_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openshopee.ui.page.AbstractPage;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utility.ExtentTestManager;

public class CustomerPage extends AbstractPage {

		private static final By CatalogTab = By.xpath("//span[text()='Customers']");
		private static final By clickCustomerMenu = By.xpath("(//span[text()='Customers'])[1]");
		private static final By ProdSearchBtnTxt = By.xpath("//div[text()='Search']");







		public CustomerPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		}

	

		public CustomerPage clickCustomerMenu() {

			click_btn(CatalogTab);

			return this;

		}
//
//		public Product_Page verifyProductTab() throws InterruptedException {
//			Thread.sleep(3000);
//			click_btn(clickProductTab);
//
//			// ExtentTestManager.getTest().log(Status.INFO, "Enter product name
//			// successfully");
//
//			return this;
//		}
//
//		public Product_Page verifyProductPageDetails() throws InterruptedException {
//
//			Thread.sleep(3000);
//
//			String prodSearch = driver.findElement(ProdSearchBtnTxt).getText();
//			Assert.assertEquals(prodSearch, "Search");
//			String addNewBtn = driver.findElement(ProductNewBtn).getText();
//
//			Assert.assertEquals(addNewBtn, "Add new");
//			String prodDownloadBtn = driver.findElement(ProductDownloadBtn).getText();
//
//			Assert.assertEquals(prodDownloadBtn, "Download");
//			click_btn(ProductListExpand);
//			Thread.sleep(3000);
//			String ExportText = driver.findElement(ProductListExport).getText();
//			System.out.println("the export is" + ExportText);
//			// Assert.assertEquals(ExportText, "Export");
//			String importBtn = driver.findElement(ProductListImport).getText();
//
//			Assert.assertEquals(importBtn, "Import");
//			String prodDelete = driver.findElement(ProductListDelete).getText();
//
//			Assert.assertEquals(prodDelete, "Delete (selected)");
//			ExtentTestManager.getTest().log(Status.PASS, "Product available details passed successfully");
//			return this;
//		}













}
