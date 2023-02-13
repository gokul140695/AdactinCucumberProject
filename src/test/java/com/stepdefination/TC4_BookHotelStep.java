package com.stepdefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Used to run book hotel scenarios
 * @date 26-01-2023
 *
 */
public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param dataTable
	 * @see Used to perform  book hotel with all credntials
	 */
	@Then("User should perform Book a hotel {string},{string} and {string}")
	public void user_should_perform_book_a_hotel_and(String firstName, String lastName, String address,
			io.cucumber.datatable.DataTable dataTable) {

		pom.getBookHotelPage().BookAHotel(firstName, lastName, address);

		List<Map<String, String>> mp = dataTable.asMaps();

		Map<String, String> e = mp.get(1);

		String creditCardNo = e.get("Credit Card No");

		String ccType = e.get("Credit Card Type");

		String expMonth = e.get("Expiry Month");

		String expYear = e.get("Expiry Year");

		String cvvNumber = e.get("CVV Number");

		elementSendkeys(pom.getBookHotelPage().getTxtCreditCardNo(), creditCardNo);
		elementSendkeys(pom.getBookHotelPage().getdDnCreditCardType(), ccType);
		elementSendkeys(pom.getBookHotelPage().getdDnMonth(), expMonth);
		elementSendkeys(pom.getBookHotelPage().getdDnYear(), expYear);
		elementSendkeys(pom.getBookHotelPage().getTxtCvvNo(), cvvNumber);
		elementClick(pom.getBookHotelPage().getBtnBookNow());
	}

	@Then("User should verify after booking the success message {string} and save the order id")
	public void user_should_verify_after_booking_the_success_message_and_save_the_order_id(String expAfterBookHotelSuccessMessage) {
		WebElement txtAfterBookHtelSuccessMsg = pom.getBookingConfirmationPage().getTxtAfterBookHtelSuccessMsg();

		String actAfterBookHotelSuccessMessage = elementGetText(txtAfterBookHtelSuccessMsg);

		Assert.assertEquals("verify after book hotel success message", expAfterBookHotelSuccessMessage,actAfterBookHotelSuccessMessage);

		String orderId = elementGetAttribute(pom.getBookingConfirmationPage().getOrderNo());
		
		System.out.println(orderId);

	}

	/**
	 * @see Used to perform without enter credentials to perform book now
	 */
	@Then("User should perform to click book now button")
	public void user_should_perform_to_click_book_now_button() {

		pom.getBookHotelPage().BookHotel();

	}

	/**
	 * 
	 * @param expFirstNameErrorMessage
	 * @param expLastNameErrorMessage
	 * @param expAddressErrorMessage
	 * @param expCreditCardNumberErrorMessage
	 * @param expCreditCardTypeErrorMessage
	 * @param expExpiryErrorMessage
	 * @param expCvvNumberErrorMessage
	 * @see Used to verify the all error message in without enter any fields
	 */
	@Then("User should verify after book hotel the error message {string},{string},{string},{string},{string},{string},{string}")
	public void user_should_verify_after_book_hotel_the_error_message(String expFirstNameErrorMessage,	String expLastNameErrorMessage, String expAddressErrorMessage, String expCreditCardNumberErrorMessage, String expCreditCardTypeErrorMessage, String expExpiryErrorMessage,String expCvvNumberErrorMessage) {

		WebElement firstNameErrorMsg = pom.getBookHotelPage().getTxtFirstNameErrorMsg();

		String actFirstNameErrorMessage = elementGetText(firstNameErrorMsg);

		Assert.assertEquals("verify after booHotel firstname error message", expFirstNameErrorMessage,actFirstNameErrorMessage);

		WebElement lastNameErrorMsg = pom.getBookHotelPage().getTxtLastNameErrorMsg();

		String actLastNameErrorMessage = elementGetText(lastNameErrorMsg);

		Assert.assertEquals("verify after booHotel lastname error message", expLastNameErrorMessage,actLastNameErrorMessage);
		
		WebElement addressErrorMsg = pom.getBookHotelPage().getTxtAddressErrorMsg();

		String actAddressErrorMessage = elementGetText(addressErrorMsg);

		Assert.assertEquals("verify after booHotel address error message", expAddressErrorMessage,actAddressErrorMessage);
		
		WebElement creditCardNumberErrorMsg = pom.getBookHotelPage().getTxtCreditCardErrorMsg();

		String actCreditCardNumberErrorMessage = elementGetText(creditCardNumberErrorMsg);

		Assert.assertEquals("verify after booHotel crditCardNumber error message", expCreditCardNumberErrorMessage,actCreditCardNumberErrorMessage);
		
		WebElement creditCardTyperErrorMsg = pom.getBookHotelPage().getTxtCreditCardTypeErrorMsg();

		String actCreditCardTypeErrorMessage = elementGetText(creditCardTyperErrorMsg);

		Assert.assertEquals("verify after booHotel crditCardType error message", expCreditCardTypeErrorMessage,actCreditCardTypeErrorMessage);
		
		WebElement expiryErrorMsg = pom.getBookHotelPage().getTxtExpiryErrorMsg();

		String actExpiryErrorMessage = elementGetText(expiryErrorMsg);

		Assert.assertEquals("verify after booHotel crditCardNumber error message", expExpiryErrorMessage,actExpiryErrorMessage);
		
		WebElement cvvNumberErrorMsg = pom.getBookHotelPage().getTxtCvvNumberErrorMsg();

		String actCvvNumberErrorMessage = elementGetText(cvvNumberErrorMsg);

		Assert.assertEquals("verify after booHotel crditCardNumber error message", expCvvNumberErrorMessage,actCvvNumberErrorMessage);
		
		
		
		

	}

}
