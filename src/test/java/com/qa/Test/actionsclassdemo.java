package com.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class actionsclassdemo {

	@Test
	public void  tooltipsdemo() throws InterruptedException {
		
		//WebDriver  driver=WebDriverManager.chromedriver().create();
    System.setProperty("webdriver.chrome.d"+"river", "E:\\Browserselenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	    
	WebElement ele= driver.findElement(By.xpath("//button[@class='dropbtn'and text()='Automation Tools']"));
	Actions action=new Actions(driver);
	action.moveToElement(ele).build().perform();
	String text=driver.findElement(By.xpath("//div[@class='dropdown-content']//a[text()='Selenium']")).getText();
	System.out.println(text);
	Assert.assertEquals(text, "Selenium");
	
	
}
}