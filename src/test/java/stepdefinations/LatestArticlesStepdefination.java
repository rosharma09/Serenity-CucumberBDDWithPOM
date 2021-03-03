package stepdefinations;

import org.junit.Assert;

import com.qa.pages.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LatestArticlesStepdefination {
	
	HomePage homePageObj;
	
	@When("^Selects (.*) menu option$")
	public void selects_menu_option(String menuOption) {
		homePageObj.selectMenuOption(menuOption);
	}

	@Then("^User can see the latest article section$")
	public void user_can_see_the_latest_article_section() {
		boolean isDisplayed = homePageObj.latestArticleLabelIsDisplayed();
		if(!isDisplayed) {
			System.out.println("Latest Article Label is not displayed");
		}
		
		Assert.assertTrue("The Latest Label is not displayed", isDisplayed);
	}

}
