package stepdefinations;

import com.qa.steps.HomePageSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChangeLanguageStepDefinations {
	
	@Steps
	HomePageSteps homePageStepsObj;

	@Then("^Change language icon is displayed in the global menu bar$")
	public void change_language_icon_is_displayed_in_the_global_menu_bar() {
		homePageStepsObj.checkForTheChangeLanguageDisplayed();
	}

	@When("^User change the language to \"([^\"]*)\"$")
	public void user_change_the_language_to(String lang) {
		homePageStepsObj.changeLanguageTo(lang);
	}

	@Then("^User can see the heading displayed as \"([^\"]*)\"$")
	public void user_can_see_the_heading_displayed_as(String headingDisplayed) {
		homePageStepsObj.checkHeading(headingDisplayed);
	}

}
