package cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSteps {
	
	protected static WebDriver driver;
	
	public void CreateDriver() {
		
		try {
			driver.getCurrentUrl();
		} catch (Exception e) {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
	}

}
