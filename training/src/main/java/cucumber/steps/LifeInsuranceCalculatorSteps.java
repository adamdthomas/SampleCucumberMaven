package cucumber.steps;


import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import lfg.lfgdotcom.LifeInsuranceCalculatorPage;

public class LifeInsuranceCalculatorSteps extends BaseSteps{
	
	LifeInsuranceCalculatorPage lifeInsuranceCalculatorPage;
	
	@Then("^I see the How Much Life Insurance calculator$")
	public void i_see_the_How_Much_Life_Insurance_calculator() throws Throwable {
		lifeInsuranceCalculatorPage = new LifeInsuranceCalculatorPage(driver);
	    Assert.assertTrue(lifeInsuranceCalculatorPage.CalulatorExist());
	}
	
	@Then("^I enter basic Age Income and Assumptions data$")
	public void i_enter_basic_Age_Income_and_Assumptions_data() throws Throwable {
	    lifeInsuranceCalculatorPage.BasicAgeInput();
	}
	
	@Then("^I enter basic immediate cash data$")
	public void i_enter_basic_immediate_cash_data() throws Throwable {
	    lifeInsuranceCalculatorPage.ImmediateCaseInput();
	}
	
	@Then("^I enter basic long term income needs data$")
	public void i_enter_basic_long_term_income_needs_data() throws Throwable {
	    lifeInsuranceCalculatorPage.LongTermInput();
	}
	
	@Then("^I enter basic availible resources data$")
	public void i_enter_basic_availible_resources_data() throws Throwable {
	    lifeInsuranceCalculatorPage.AvailibleResourcesInput();
	}
	
	@When("^I click Submit$")
	public void i_click_Submit() throws Throwable {
	    lifeInsuranceCalculatorPage.Submit();
	}
	
	@Then("^I see my results$")
	public void i_see_my_results() throws Throwable {
		Assert.assertTrue(lifeInsuranceCalculatorPage.ResultsExist());
	}
	
}
