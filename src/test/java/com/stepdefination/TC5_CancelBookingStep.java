package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Used to run cancel booking scenarios
 * @date 26-01-2023
 *
 */
public class TC5_CancelBookingStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see Used to cancel booking with order id
	 */
	@Then("User should perform cancel booking using with order id")
	public void user_should_perform_cancel_booking_using_with_order_id() {
		
		WebElement orderNo = pom.getBookingConfirmationPage().getOrderNo();
		
		String orderId = elementGetAttribute(orderNo);
		
		pom.getCancelBookingPage().CancelBooking(orderId);

	}
	/**
	 * 
	 * @param expCancelBookingSuccessMessage
	 * @see Used to after cancel booking  verify the error message
	 */

	@Then("User should verify after cancel booking the success message {string}")
	public void user_should_verify_after_cancel_booking_the_success_message(String expCancelBookingSuccessMessage) {
		
		WebElement txtCancelBookingSuccessMsg = pom.getCancelBookingPage().getTxtCancelBookingSuccessMsg();
		
		String actCancelBookingSuccessMessage = elementGetText(txtCancelBookingSuccessMsg);
		
		Assert.assertEquals("verify after cancel booking success message",expCancelBookingSuccessMessage, actCancelBookingSuccessMessage);
	
	}
	
	/**
	 * 
	 * @param orderId
	 * @see Used to cancel booking with existing order id
	 */

	@Then("User should perform to cancel booking for existing order id {string}")
	public void user_should_perform_to_cancel_booking_for_existing_order_id(String orderId) {
		
		pom.getCancelBookingPage().CancelBooking(orderId);

	}




}
