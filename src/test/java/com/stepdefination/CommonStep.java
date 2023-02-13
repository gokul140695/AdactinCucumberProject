package com.stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author ELCOT
 * @see Used to maintain the common step definations
 * @date 26-01-2023
 *
 */
public class CommonStep extends BaseClass {

	PageObjectManager pom=new PageObjectManager();
	
	/**
	 * 
	 * @param expLoginSuccessMessage
	 * @see Used to verify after login success message	
	 * 
	 */
	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expLoginSuccessMessage) {
		
	WebElement successMsg = pom.getSearchHotelPage().getTxtLoginSuccessMsg();
	
	String actLoginSuccessMessage = elementGetAttribute(successMsg);
	
	Assert.assertEquals("verify after login success message", expLoginSuccessMessage,actLoginSuccessMessage);
		
		

	}

	
	
}
