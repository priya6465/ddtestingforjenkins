package com.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenFieldvalue {

	@Test
	public void hiddenfieldvalue() {
		System.setProperty("webdriver.chrome.d"+"river", "E:\\Browserselenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 driver.get("https://www.letskodeit.com/practice");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//        String s = js.executeScript("return document.getElementById('hide-textbox').getAttribute('value')").toString();
//        System.out.println("Hidden field value is "  +s);
      driver.quit();
     
		
	}
}
