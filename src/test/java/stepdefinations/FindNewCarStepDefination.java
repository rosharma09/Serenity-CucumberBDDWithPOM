package stepdefinations;

import com.qa.steps.HomePageSteps;
import com.qa.steps.NewCarPageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FindNewCarStepDefination {

	@Steps
	HomePageSteps homePageSteps;
	
	@Steps 
	NewCarPageSteps newCarPageSteps;

	@Given("^User is on the Car wale website$")
	public void user_is_on_the_Car_wale_website() {
		homePageSteps.NavigateTo();

	}

	@When("^User navigates to the \"([^\"]*)\" option under the \"([^\"]*)\" menu option$")
	public void user_navigates_to_the_option_under_the_menu_option(String option, String menuOption) {
		homePageSteps.selectMenuOption(option, menuOption);
	}

	@Then("^User can see the \"([^\"]*)\" label displayed on the page$")
	public void user_can_see_the_label_displayed_on_the_page(String label) {
		newCarPageSteps.ChecklabelHeading(label);
	}

	@When("^User selects the car brand as \"([^\"]*)\"$")
	public void user_selects_the_car_brand_as(String carBrand) {
		
		System.out.println("Selecting the car Brand as: "+carBrand);
		newCarPageSteps.searchNewCarwithBrandAs(carBrand);

	}

	@Then("^User can see the cars for the respective brands$")
	public void user_can_see_the_cars_for_the_respective_brands() {
		
		newCarPageSteps.carsForTheBrandAreDisplayed();

	}

}
