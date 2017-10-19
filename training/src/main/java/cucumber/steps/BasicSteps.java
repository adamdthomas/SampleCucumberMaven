package cucumber.steps;

import cucumber.api.java.en.*;
import lfg.lfgdotcom.HomePage;

public class BasicSteps extends BaseSteps{

	@When("^I click on the \"([^\"]*)\" link$")
	public void i_click_on_the_link(String linkText) throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.ClickLinkByText(linkText);
	}
}
