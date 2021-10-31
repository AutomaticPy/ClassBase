package com.introselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_page extends Base {

		By searchGoogle = By.name("q");
	
		public Google_page(WebDriver driver) {
		super(driver);
	}

		public void SearchInGoogle() {
			click(searchGoogle);
			type("Hola Mundo", searchGoogle);
			
		}

}
