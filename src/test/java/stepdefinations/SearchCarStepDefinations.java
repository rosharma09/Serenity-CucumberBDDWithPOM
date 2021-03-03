package stepdefinations;

import com.qa.steps.HomePageSteps;
import com.qa.steps.SearchPageSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SearchCarStepDefinations {

	@Steps
	HomePageSteps homePageStepsObj;
	
	@Steps
	SearchPageSteps searchPageSteps;

	@Then("^Search bar is visible to the user$")
	public void search_bar_is_visible_to_the_user() {
		homePageStepsObj.checkForTheSearchBar();
	}

	@When("^User enters the \"([^\"]*)\" in the search box$")
	public void user_enters_the_in_the_search_box(String carSearched) {
		homePageStepsObj.serachForCar(carSearched);
	}

	@When("^Select the \"([^\"]*)\" in the list of car Names Displayed$")
	public void select_the_in_the_list_of_car_Names_Displayed(String optionToSelect) {
		homePageStepsObj.selectTheCarOption(optionToSelect);
	}
	
	@Then("^User can see the Car Name, Car Price and EMI as follow \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_can_see_the_Car_Name_Car_Price_and_EMI_as_follow_and(String carName, String carPrice, String emi) {
		searchPageSteps.carNameIsDisplayedAs(carName);
		searchPageSteps.carPriceIsDisplayedAs(carPrice);
		searchPageSteps.carEMIisDisplayedAs(emi);
	}

}
