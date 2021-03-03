package com.qa.steps;

import org.junit.Assert;

import com.qa.pages.FindNewCarPage;
import com.qa.pages.HomePage;
import com.qa.pages.UpcomingNewCarPage;
import com.qa.pages.UsedCarEvaluationPage;

import net.thucydides.core.annotations.Step;

public class HomePageSteps {

	HomePage homePageObj;
	UpcomingNewCarPage upcomingNewCarPageObj;
	UsedCarEvaluationPage usedCarEvalPageObj;
	FindNewCarPage findNewCarPageObj;

	@Step("Navigating to the carwale.com website")
	public HomePageSteps NavigateTo() {
		homePageObj.open();
		return this;
	}

	@Step
	public FindNewCarPage navigateToNewCarOption() {
		return homePageObj.findNewCarFunctionality();
	}

	@Step
	public void findNewUpcomingCars() {
		upcomingNewCarPageObj = homePageObj.upComingNewNewCarFunctionality();

	}

	@Step
	public void navigateToUsedCarEvaluation() {
		usedCarEvalPageObj = homePageObj.getToUsedCarEvaluationSection();
	}

	@Step
	public void navigateToNewCarLaunches() {
		homePageObj.findNewCarLaunches();
	}

	@Step("Search Bar is displayed to the user")
	public void checkForTheSearchBar() {
		Boolean isDisplayed = homePageObj.isSearchBarDisplayed();
		Assert.assertTrue("The search bar is not displayed", isDisplayed);
	}

	@Step("User search for the car : {0}")
	public void serachForCar(String carName) {
		homePageObj.searchCar(carName);
	}

	@Step("Select the option as {0} in the menu option {1}")
	public NewCarPageSteps selectMenuOption(String option, String menuOption) {
		findNewCarPageObj = homePageObj.selectMenuOption(option, menuOption);
		return new NewCarPageSteps();
	}

	@Step("User wants to select the car options as {0}")
	public void selectTheCarOption(String optionToSelect) {
		homePageObj.selectOptionInSearchBar(optionToSelect);

	}

	@Step("User checks for the change language icon displayed")
	public void checkForTheChangeLanguageDisplayed() {
		boolean isDisplayed = homePageObj.isLanguageChangeIconDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@Step("User change the language to {0}")
	public void changeLanguageTo(String lang) {
		homePageObj.selectTheLanguage(lang);
	}

	@Step("The heading to be displayed as {0}")
	public void checkHeading(String headingDisplayed) {

		System.out.println("Expected Heading: " + headingDisplayed);
		System.out.println("Actual Heading: " + homePageObj.getHeading());
		Assert.assertTrue("Actual and expected heading are not same",
				homePageObj.getHeading().equals(headingDisplayed));
		;
	}

}
