package lfg.lfgdotcom;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	//Holds data about this page
	public String pageTitle;
	
	
	//Constructs this page
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//Page methods
	public String EnterUserName(String userName){
		//WebElement txtUserName = driver.findElement(By.id("dropdown-username"));
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement txtUserName = wait.until(ExpectedConditions.elementToBeClickable(By.id("banner-username")));
		
		
		txtUserName.sendKeys(userName);
		
		String actualUserName = txtUserName.getText();
		
		return actualUserName;

	}
	
	public String GoToLoginPage(){
		
		WebElement btnNext = driver.findElement(By.id("next-btn-banner"));
		btnNext.click();
		
		pageTitle = driver.getTitle();
		
		return pageTitle;
	}
	
	public void ClickLinkByText(String linkText){
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
		link.click();

	}
	
}
