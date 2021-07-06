//Tu package aqui.

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GooglePage_Test {
	
	private WebDriver driver;
	GoogleHomePage googlepage;
	
	@BeforeTest
	public void setUp() throws Exception {
		googlepage = new GoogleHomePage(driver);
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
