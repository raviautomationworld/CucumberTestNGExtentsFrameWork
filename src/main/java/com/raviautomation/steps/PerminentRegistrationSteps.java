package com.raviautomation.steps;

import org.testng.Assert;

import com.raviautomation.pages.HomePage;
import com.raviautomation.testbase.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PerminentRegistrationSteps extends TestBase {

	HomePage homePage = new HomePage();
	
	@Given("navigated to registration link when user in homepage")
	public void navigated_to_registration_link() {
		boolean val = homePage.borderText.getText().contains(prop.getProperty("username"));
		Assert.assertTrue(val);
		homePage.registration.click();
		
	}
	
	@Then("verify perminate registration link")
	public void verify_perminate_registration_link() {

		boolean val = homePage.perminentRegistration.isDisplayed();
		
		Assert.assertTrue(val);
		
	}
}
