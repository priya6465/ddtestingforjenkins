package com.qa.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertdemo {
	@Test
	public void  verifydemo()  {
		SoftAssert sassert=new SoftAssert();
		System.setProperty("webdriver.chrome.d"+"river", "E:\\Browserselenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String Title=driver.getTitle();
		sassert.assertEquals(Title, "title not matched");
	

}
}