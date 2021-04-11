package com.oxytech.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;




public class BaseClass {
	
	
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public Robot robot;
	public static BaseClass base = new BaseClass();
	
	
	public void initializePageFactory() {
		
//		PageFactory.initElements(driver, ElementXpath.class);
//		PageFactory.initElements(driver, FlowPageXPath.class);
	}
	
	public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
              "C:\\Work\\chromedriver.exe");
     
				
		driver = new ChromeDriver();
        driver.get("https://app.canopusdata.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        Thread.sleep(5000);
        
		
	}
	
	@BeforeClass
	public void browserInitialize() throws AWTException, InterruptedException {
//		initializeBrowser(BROWSER);
		openBrowser();
		login();
		initializePageFactory();
	}
	
	public void login() throws InterruptedException {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("daniel");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("ascedtek123");
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
				
	}

	@AfterClass
	public void flush() {
		
		driver.quit();
	}

}
