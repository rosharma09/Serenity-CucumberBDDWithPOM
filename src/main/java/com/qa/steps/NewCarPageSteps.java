package com.qa.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.pages.FindNewCarPage;

import net.thucydides.core.annotations.Step;

public class NewCarPageSteps {

	FindNewCarPage findNewCarPageObj;

	@Step
	public void ChecklabelHeading(String label) {

		System.out.println("Expected Label heading: " + label);
		System.out.println("Actual Label heading : " + findNewCarPageObj.getLabelHeading());
		Assert.assertTrue("The expected [" + label + "]and the actual [" + findNewCarPageObj.getLabelHeading()
				+ "] label heading are not same", label.equals(findNewCarPageObj.getLabelHeading()));
	}

	@Step
	public void searchNewCarwithBrandAs(String carBrand) {
		findNewCarPageObj.clickOnTheBrand(carBrand);
	}

	@Step
	public void carsForTheBrandAreDisplayed() {
		Map<String, String> carPriceDetails = findNewCarPageObj.getCarPriceDetails();
		System.out.println(carPriceDetails);

	}

	@Step
	public void clickOnBodyType() {
		findNewCarPageObj.clickBodyTypeLabel();
	}

	@Step
	public void selectTheBodyTypeAs(String bodyType) {
		findNewCarPageObj.clickOnBodyType(bodyType);
		String heading = findNewCarPageObj.getHeading();
		int carCount = findNewCarPageObj.carCountLabel();

		System.out.println("Body Type Label Displayed: " + heading);
		System.out.println("Car count displayed :" + carCount);
		// Assert.assertTrue("Body Type Clicked and Body type displayed are not same",
		// heading.contains(bodyType));

	}

	@Step
	public void clickOnPetrolType() {
		findNewCarPageObj.clickPetrolTypeLabel();
	}

	@Step
	public void selectTheFuelTypeAs(String fuelType) {
		findNewCarPageObj.selectFuelTypeAs(fuelType);
	}

	@Step
	public void carForTheSpecifiedFuelTypeAreDisplayed() {
		List<String> carName = findNewCarPageObj.getFuelSpecificCarNames();
		List<String> carPrices = findNewCarPageObj.getFuelSpecificCarPrices();

		System.out.println(carName);
		System.out.println(carPrices);

	}

	@Step
	public void updateTheCarDetailsFor(String fuelType) {
		List<String> carName = findNewCarPageObj.getFuelSpecificCarNames();
		List<String> carPrices = findNewCarPageObj.getFuelSpecificCarPrices();
		findNewCarPageObj.writeCarPriceInFile(fuelType, carName, carPrices);
	}

}
