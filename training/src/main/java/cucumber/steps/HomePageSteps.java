package cucumber.steps;

import org.testng.Assert;

import cucumber.api.java.en.*;

public class HomePageSteps {

	@Given("^I navigate to the lfg homepage$")
	public void i_navigate_to_the_lfg_homepage() throws Throwable {
		System.out.println("Navigating home");
	}

	@When("^I enter my username \"([^\"]*)\"$")
	public void i_enter_my_username(String userName) throws Throwable {

		System.out.println("Entering user name " + userName);
	}

	@When("^I click next$")
	public void i_click_next() throws Throwable {
		
		System.out.println("Clicking Next");
	}

	@Then("^I should be at the sign on page$")
	public void i_should_be_at_the_sign_on_page() throws Throwable {
		System.out.println("Asserting that I am at the login page");
		
		Assert.assertTrue(true);
		
	}
	
}
