//Tu package
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleHomePage extends Base {
	
		By searchGoogle = By.name("q");

		public GoogleHomePage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		public void SearchInGoogle() {
			click(searchGoogle);
			type("Hola Mundo", searchGoogle);
			
		}

}
