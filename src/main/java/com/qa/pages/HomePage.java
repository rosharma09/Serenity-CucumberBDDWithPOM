package com.qa.pages;

import java.util.Iterator;
import org.openqa.selenium.WebElement;
import com.qa.base.Languages;
import com.qa.base.TestBase;

public class HomePage extends TestBase {

	// o-cpnuEd o-XylGE _1fftdA
	String allCarOptionsList = "className=o-bkmzIL o-cpnuEd";
	String newCarMenuOption = "xpath=//*[text() = 'NEW CARS']";
	String findNewCarOption = "xpath=//*[text() = 'Find New Cars']";
	String findUpcomingCarOption = "xpath=//*[text() = 'Upcoming Cars']";
	String usedCarOption = "xpath=//*[text() = 'USED CARS']";
	String checkCarEvaluation = "xpath=//*[text() = 'Check Car Valuation']";
	String newCarLaunchesOption = "xpath=//*[text() = 'New Launches']";
	String headerSearchBar = "xpath=//header//input";
	String carOptionsDisplayed = "xpath=//div[@class = 'o-eEgygU o-eZTujG o-eemiLE  ']//li/div/span/mark";
	String changeLanugageDiv = "xpath=//div[@class = 'o-cKuOoN _2kW_1A']";
	String latestArticleLabel = "xpath=//div[contains(text(), ' Latest Articles')]";

	public FindNewCarPage findNewCarFunctionality() {
		moveMouseTo(newCarMenuOption);
		clickOnElement(findNewCarOption);
		return this.switchToPage(FindNewCarPage.class);

	}

	public UpcomingNewCarPage upComingNewNewCarFunctionality() {
		moveMouseTo(newCarMenuOption);
		clickOnElement(findUpcomingCarOption);
		return new UpcomingNewCarPage();

	}

	public UsedCarEvaluationPage getToUsedCarEvaluationSection() {
		moveMouseTo(usedCarOption);
		clickOnElement(checkCarEvaluation);
		return new UsedCarEvaluationPage();
	}

	public void findNewCarLaunches() {
		moveMouseTo(newCarMenuOption);
		clickOnElement(newCarLaunchesOption);
	}

	public void searchCar(String carName) {
		System.out.println("Searching for the car: " + carName);
		enterTextInto(headerSearchBar, carName);

	}

	public void selectOptionInSearchBar(String optionToSelect) {

		waitFor(getElementUsingLocator("xpath=//div[@class = 'o-eEgygU o-eZTujG o-eemiLE  ']/ul/li[1]"));
		String carOptionsDisplayed = "xpath=//div[@class = 'o-eEgygU o-eZTujG o-eemiLE  ']/ul/li[1]//li";
		Iterator<WebElement> it = getElements(carOptionsDisplayed).iterator();

		while (it.hasNext()) {
			String currentOptionText = it.next().getText();
			System.out.println("Checking the car Option: " + currentOptionText);
			if (currentOptionText.length() == it.next().getText().length()
					&& currentOptionText.equals(optionToSelect)) {
				System.out.println("Clicking on option: " + it.next().getText());
				clickOn(it.next());
				break;

			}
		}

	}

	public FindNewCarPage selectMenuOption(String option, String menuOption) {

		withAction().moveToElement(getElementUsingLocator("xpath=//*[text() = '" + menuOption + "']")).perform();
		clickOnElement("xpath=//*[text() = '" + option + "']");
		return this.switchToPage(FindNewCarPage.class);
	}

	public Boolean isSearchBarDisplayed() {
		return getElementUsingLocator(headerSearchBar).isDisplayed();
	}

	public boolean isLanguageChangeIconDisplayed() {
		return getElementUsingLocator(changeLanugageDiv).isDisplayed();
	}

	public void selectTheLanguage(String lang) {
		Iterator<WebElement> it = getElements("xpath=//input[@name = 'language']").iterator();

		if (lang.toLowerCase().equals(String.valueOf(Languages.HINDI).toLowerCase())) {
			while (it.hasNext()) {
				if (it.next().getAttribute("value").equals("hi")) {
					it.next().click();
				}
			}
		}

		if (lang.toLowerCase().equals(String.valueOf(Languages.ENGLISH).toLowerCase())) {
			while (it.hasNext()) {
				if (it.next().getAttribute("value").equals("en")) {
					clickOn(it.next());
				}
			}
		}
	}

	public void selectMenuOption(String menuOption) {
		System.out.println("Menu Option to select: " + menuOption.replaceAll("\"", ""));
		withAction().moveToElement(getElementUsingLocator("xpath=//*[text() = '" + menuOption + "']")).perform();

	}

	public boolean latestArticleLabelIsDisplayed() {
		if (getElementUsingLocator(latestArticleLabel).isDisplayed()) {
			return true;
		} else
			return false;
	}

}
