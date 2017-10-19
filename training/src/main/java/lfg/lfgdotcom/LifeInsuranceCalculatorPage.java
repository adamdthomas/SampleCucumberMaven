package lfg.lfgdotcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LifeInsuranceCalculatorPage {
	/*
	And I open the life insurance calculator
	Then I see the How Much Life Insurance calculator
	And I enter basic Age Income and Assumptions data
	And I enter basic immediate cash data
	And I enter basic long term income needs data
	And I enter basic availible resources data
	When I click Submit 
	Then I see my results
	*/
	
	WebDriver driver;
	
	public LifeInsuranceCalculatorPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void OpenCalculator(){
		WebElement calcButton = driver.findElement(By.xpath("//a[contains(.,'Use this calculator')]"));
		calcButton.click();
	}
	
	public void calcField(String labelText, String value) {
		driver.findElement(By.xpath("//label[contains(.,'" + labelText + "')]//following::input[1]")).clear();
		driver.findElement(By.xpath("//label[contains(.,'" + labelText + "')]//following::input[1]")).sendKeys(value);
	}
	
	public void BasicAgeInput() {
		GoToCalcFrame();
		calcField("Current annual income","75000");
		calcField("s annual income","150000");
		calcField("s current age","35");
		calcField("s desired retirement","60");
		calcField("Investment return","8");
		calcField("inflation","4");
		driver.switchTo().defaultContent();
	}
	
	public void ImmediateCaseInput() {
		GoToCalcFrame();
		calcField("Funeral expenses", "10000");
		calcField("Final expenses", "100000");
		calcField("Mortgage balance", "200000");
		calcField("Other debts", "500000");
		driver.switchTo().defaultContent();
	}
	public void LongTermInput() {
		GoToCalcFrame();
		calcField("Desired annual income needs", "8000");
		calcField("Number of years income is needed", "60");
		calcField("College needs", "100000");
		
		driver.switchTo().defaultContent();
	}
	public void AvailibleResourcesInput() {
		GoToCalcFrame();
		calcField("Investment assets", "5000000");
		calcField("Existing life insurance", "1000000");
		
		driver.switchTo().defaultContent();
	}
	
	public void Submit() {
		GoToCalcFrame();
		WebElement submit = driver.findElement(By.xpath("//button[.='Submit']"));
		submit.click();
		driver.switchTo().defaultContent();
	}
	
	
	private void GoToCalcFrame() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);	
	}
	
	public boolean ResultsExist() {
		boolean resExists = false;
		GoToCalcFrame();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[.='Explanation of Results']")));
		
		resExists = driver.findElements(By.xpath("//h3[.='Explanation of Results']")).size() > 0;
		driver.switchTo().defaultContent();
		
		return resExists;
	}
	
	public boolean CalulatorExist() {
		
		boolean calcExists = false;
		
		GoToCalcFrame();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h2[@class='calcTitle']")));
		
		calcExists = driver.findElements(By.xpath("//h2[@class='calcTitle']")).size() > 0;
		
		driver.switchTo().defaultContent();
		
		return calcExists;
		
	}

}
