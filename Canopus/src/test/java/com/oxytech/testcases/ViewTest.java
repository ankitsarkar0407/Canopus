package com.oxytech.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.oxytech.utilities.BaseClass;

public class ViewTest extends BaseClass {
	
	@Test
	public void intelyHealthLastNameTest() throws InterruptedException {
		
		Thread.sleep(10000);
		WebElement intelyArc = driver.findElement(By.xpath("//div[@class='archover']"));
		
		//div[contains(@class,'archover')]//div[contains(@class,'arc2')]
		intelyArc.click();
		Thread.sleep(3000);
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Test");
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.xpath("//button[contains(@type,'button') and text()='Search']"));
		search.click();
		Thread.sleep(1000);
		
		
		
	}
	
	@Test(dependsOnMethods="intelyHealthLastNameTest")
	public void reportTesting() throws InterruptedException {
		
		WebElement view_first = driver.findElement(By.xpath("(//div[(@title='View')])[1]"));
		view_first.click();
		Thread.sleep(5000);
		
				
		WebElement health_report_card = driver.findElement(By.xpath("(//span[contains(text(),'Health Report Card')])[1]"));
		health_report_card.click();
		Thread.sleep(15000);
		
		WebElement cross_buttons = driver.findElement(By.xpath("//div[contains(@class,'modal-header')]//i"));
		cross_buttons.click();
		Thread.sleep(5000);
		
	}
	
	
	@Test(dependsOnMethods="intelyHealthLastNameTest")
	public void radiologyReports() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(5000);
		WebElement multiple_x_ray = driver.findElement(By.xpath("(//span[contains(text(),'Multiple-X-Ray')])[1]"));
		multiple_x_ray.click();
		Thread.sleep(5000);
		WebElement cross_buttons = driver.findElement(By.xpath("//div[contains(@class,'modal-header')]//i"));
		cross_buttons.click();
		Thread.sleep(5000);
		
	}
	

}
