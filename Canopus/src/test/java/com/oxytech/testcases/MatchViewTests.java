package com.oxytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class MatchViewTests extends BaseClass {
	
	@Test
	public void intelyHealthLastNameTest() throws InterruptedException {
		
		Thread.sleep(10000);
		WebElement intelyMatch = driver.findElement(By.xpath("//div[@class='matchhover']"));
		
		intelyMatch.click();
		Thread.sleep(3000);
		//Selecting matches from the dropDown
		Select drpSelect = new Select(driver.findElement(By.xpath("//select[contains(@class,'firstselect')]")));
		drpSelect.selectByValue("matches");
		Thread.sleep(3000);
		
		Select valueSelect = new Select(driver.findElement(By.xpath("//select[contains(@class,'secondselect')]")));
		valueSelect.selectByValue("match4");
		Thread.sleep(3000);
		
		WebElement view_first = driver.findElement(By.xpath("(//div//p[contains(@title,'View')])[1]"));
		view_first.click();
		Thread.sleep(5000);
		
		WebElement record2_option = driver.findElement(By.xpath("(//div[contains(@id,'checkicondiv1')])[2]"));
		record2_option.click();
		Thread.sleep(3000);
		
		WebElement no_option = driver.findElement(By.xpath("//button[contains(text(),'No')]"));
		no_option.click();
		Thread.sleep(3000);
		
		
		
		
	}

}
