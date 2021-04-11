package com.oxytech.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopulationCounter {
	public static WebDriver driver;
	
@Test	
public void openBrowser() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
              "C:\\Work\\chromedriver.exe");
     
				
		driver = new ChromeDriver();
        driver.get("https://www.worldometers.info/world-population/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        Thread.sleep(5000);
        int value = 0;
        
        while (value < 20) {
        	WebElement mainCounter = driver.findElement(By.xpath("//div[contains(@class,'maincounter-number')]//span"));
            System.out.println(mainCounter.getText() +" -- Current World Population");
            
            WebElement birthCounter = driver.findElement(By.xpath("(//div[@class='sec-counter']//span)[1]"));
            System.out.println(birthCounter.getText() +" -- Current birth today");
            
            WebElement deathToday = driver.findElement(By.xpath("(//div[@class='sec-counter']//span)[6]"));
            System.out.println(deathToday.getText() +" -- Current death today");
            
            WebElement populationGrowth = driver.findElement(By.xpath("(//div[@class='sec-counter']//span)[11]"));
            System.out.println(populationGrowth.getText() +" -- Current population Growth");
            

            WebElement birthThisYear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[4]"));
            System.out.println(birthThisYear.getText() +" -- Birth This Year");
            
            WebElement deathThisYear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[5]"));
            System.out.println(deathThisYear.getText() +" -- Death This Year");
            
            WebElement PopulationGrowthThisYear = driver.findElement(By.xpath("(//div[@class='sec-counter'])[6]"));
            System.out.println(PopulationGrowthThisYear.getText() +" -- Popluation Growth This Year");
            
            Thread.sleep(value);
            value++;
        }
        driver.close();	
	}



}
