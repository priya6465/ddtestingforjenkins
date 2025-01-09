package com.qa.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	@Test
	public void test1() {
	WebDriver driver=WebDriverManager.chromedriver().create();	
		//System.setProperty("webdriver.chrome.d"+"river", "E:\\Browserselenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		    //WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
String title=driver.getTitle();
System.out.println("title of google is"+title);


	}
	@Test
	public void test2() {
		System.out.println("test 2");
	}
		@Test
	public void test3() {
		System.out.println("test 3");
	}

}
