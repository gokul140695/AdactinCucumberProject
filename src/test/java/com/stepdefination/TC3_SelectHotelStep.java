package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Used to run select hotel scenarios
 * @date 26-01-2023
 *
 */
public class TC3_SelectHotelStep extends BaseClass {
	
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * @see Used to run with selecting hotel
	 */
	@Then("User should perform select hotel")
	public void user_should_perform_select_hotel() {
		
		pom.getSelectHotelPage().selectHotel();

	}

	/**
	 * 
	 * @param expAfterSelectHptelSuccessMessage
	 * @see Used to verify the success message after select hotel 
	 */
	@Then("User should verify after select hotel success message {string}")
	public void user_should_verify_after_select_hotel_success_message(String expAfterSelectHptelSuccessMessage) {
		
		WebElement txtAfterSelectHotelsuccessMsg = pom.getBookHotelPage().getTxtAfterSelectHotelsuccessMsg();
		
		String actAfterSelectHptelSuccessMessage = elementGetText(txtAfterSelectHotelsuccessMsg);
		
		Assert.assertEquals("verify after select hotel success message", expAfterSelectHptelSuccessMessage,actAfterSelectHptelSuccessMessage);

	}

	/**
	 * @see Used to run without select hotel
	 */
	@Then("User should click continue button without select hotel")
	public void user_should_click_continue_button_without_select_hotel() {
		
		pom.getSelectHotelPage().withOutSelectHotel();

	}
	
	/**
	 * 
	 * @param expSelectHotelErrorMessage
	 * @see Used to verfiy the error message after without selecting hotel
	 */
	@Then("User should verify after select hotel the error message {string}")
	public void user_should_verify_after_select_hotel_the_error_message(String expSelectHotelErrorMessage) {
		
		WebElement txtSelectHotelErrorMsg = pom.getSelectHotelPage().getTxtSelectHotelErrorMsg();
		
		String actSelectHotelErrorMessage = elementGetText(txtSelectHotelErrorMsg);
		
		Assert.assertEquals("verify after select hotelerror message", expSelectHotelErrorMessage,actSelectHotelErrorMessage);

	}
	

}
