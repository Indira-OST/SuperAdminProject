package org.openshopee.ui.page;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.SuperAdminCatalogPage.AdminPortalPage;
import org.SuperAdminCatalogPage.ProductReviewPage;
import org.SuperAdminCatalogPage.Product_Page;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.utilities;

public class AbstractPage {
	public  WebDriver driver=null;
	ExtentReports extent;
	
	public Properties prop;

	@BeforeClass
	public void launchBrowserone() throws InterruptedException {
	

		readConifg();
		WebDriverManager.chromedriver().setup();
		System.out.println("set up successfully");
	//	ExtentTestManager.getTest().log(Status.INFO, "Enter product name successfully");
		driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		System.out.println("read config file successfulluy");
		
	//	driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
//		public AdminPortalPage clickLogin() throws InterruptedException {
			
			Thread.sleep(3000);
		//	driver.manage().window().maximize();
			//Thread.sleep(10000);
			//click_btn(wishList);
			//driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();	
			
	
	//	driver.get("https://choithram.nighbro.com");
//		String browserName=prop.getProperty("browser");
//		if(browserName.equalsIgnoreCase("Chrome")) {
//			driver= new ChromeDriver();
//			System.out.println("chrome open successfully");
//	}else if (browserName.equalsIgnoreCase("Firefox")) {
//			driver= new FirefoxDriver();
//			
//		}else if (browserName.equalsIgnoreCase("Edge")) {
//			driver= new EdgeDriver();
//		}
//		

		//driver.get("https://choithram.nighbro.com");
	}


	public void readConifg() {
		prop=new Properties();
		try {
			FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+
"/Configuration/config.properties");
				
			System.out.println("config file started");
			prop.load(fs);
			System.out.println("fs successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void send_keys(By locator,String name) {
	driver.findElement(locator).sendKeys(name);
	}
	public void click_btn(By locator) {
		driver.findElement(locator).click();
	}
	public void getElementText(By element,String ExpectedText) {
		String eleText=driver.findElement(element).getText();
		Assert.assertEquals(eleText, ExpectedText);
		
	}
	public void element_isDisplayed(By element) {
		driver.findElement(element).isDisplayed();
		
		
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	public void loadConifg() {
		
		try {
			prop=new Properties();
			FileInputStream fs= new FileInputStream(System.getProperty("user.dir/")+
					"/Configuration/config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
