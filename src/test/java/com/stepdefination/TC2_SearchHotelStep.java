package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Used to run search hotel scenarios
 * @date 26-01-2023
 *
 */
public class TC2_SearchHotelStep extends BaseClass {
	
	PageObjectManager pom =new PageObjectManager();

	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkInOutDate
	 * @param AdultsPerRoom
	 * @param childPerRoom
	 * @see Used to enter search hotel credentials
	 */
	@Then("User should perform search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_perform_search_hotel_and(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkInOutDate, String AdultsPerRoom, String childPerRoom) {

		pom.getSearchHotelPage().searchHotels(location, hotels, roomType, noOfRooms, checkInDate, checkInOutDate, AdultsPerRoom, childPerRoom);
	}

	/**
	 * 
	 * @param expAfterSearchSuccessMessage
	 * @see Used to verify after search hotel success message
	 */
	@Then("User should verify after search hotel the success message {string}")
	public void user_should_verify_after_search_hotel_the_success_message(String expAfterSearchSuccessMessage) {
		
		WebElement textSearchSuccessMessage = pom.getSelectHotelPage().getTxtSearchSuccessMessage();
		
		String actAfterSearchSuccessMessage = elementGetText(textSearchSuccessMessage);
		
		Assert.assertEquals("verify after search hotel the success message", expAfterSearchSuccessMessage,actAfterSearchSuccessMessage);
		
	}

	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkInOutDate
	 * @param AdultsPerRoom
	 * @see Used to search hotels with mandatory credentials
	 */
	@Then("User should Enter only mandatory fields  {string},{string},{string},{string}{string}")
	public void user_should_enter_only_mandatory_fields(String location, String noOfRooms, String checkInDate, String checkInOutDate, String AdultsPerRoom) {
		
		pom.getSearchHotelPage().searchHotels(location, noOfRooms, checkInDate, checkInOutDate, AdultsPerRoom);

	}

	/**
	 * 
	 * @param expCheckinDateErrorMessage
	 * @param expCheckOutDateErrorMessage
	 * @see Used to after search hotel in wrong date verify the error message 
	 */
	@Then("User should verify after search hotel the error message {string} , {string}")
	public void user_should_verify_after_search_hotel_the_error_message(String expCheckinDateErrorMessage, String expCheckOutDateErrorMessage) {
		
		WebElement textCheckinDateErrorMsg = pom.getSearchHotelPage().getTxtCheckinDateErrorMsg();
		
		String actCheckinDateErrorMessage = elementGetText(textCheckinDateErrorMsg);
		
		Assert.assertEquals("verify after search hotel invalid check in date", expCheckinDateErrorMessage,actCheckinDateErrorMessage);
		
		WebElement textCheckOutDateErrorMsg = pom.getSearchHotelPage().getTxtCheckOutDateErrorMsg();
		
		String actCheckOutDateErrorMessage = elementGetText(textCheckOutDateErrorMsg);
		
		Assert.assertEquals("verify after search hotel invalid check out date", expCheckOutDateErrorMessage,actCheckOutDateErrorMessage);

	}

	/**
	 * @see Used to search hotel without credentials
	 */
	@Then("User should perform to click search button")
	public void user_should_perform_to_click_search_button() {
		
		pom.getSearchHotelPage().searchHotels();

	}

	/**
	 * 
	 * @param expLocationErrorMessage
	 * @see Used should verify the location error message after without entering credentials in  search hotel 
	 */
	@Then("User should verify after search hotel the error message {string}")
	public void user_should_verify_after_search_hotel_the_error_message(String expLocationErrorMessage) {
		
		WebElement textLocationErrorMessage = pom.getSearchHotelPage().getTxtLocationErrorMessage();
		
		String actLocationErrorMessage = elementGetText(textLocationErrorMessage);
		
		Assert.assertEquals("verify after search hotel without creditionals ", expLocationErrorMessage,actLocationErrorMessage);

	}






	



	

}
