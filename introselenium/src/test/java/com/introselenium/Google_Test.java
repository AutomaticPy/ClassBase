package com.introselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Test {
	
	public WebDriver driver;
	Google_page googlepage;
	
	@BeforeTest
	public void setUp() throws Exception {
		googlepage = new Google_page(driver);
		driver = googlepage.chromeDriverConnection();
		driver.manage().window().maximize();
		googlepage.visit("https://www.google.com");
			
	}

	@Test
	public void test() throws InterruptedException {
		googlepage.SearchInGoogle();
	}
	

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}	
	
}