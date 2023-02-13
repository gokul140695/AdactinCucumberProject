package com.stepdefination;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author ELCOT
 * @see Uesd to run login scenarios
 * @date 26-01-2023
 *
 */
public class TC1_LoginStep extends BaseClass{
	
	PageObjectManager pom =new PageObjectManager();


	
	/**
	 * 		
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see Used to launch the browser and url
	 */
	@Given("User is on the Adactin login page")
	public void user_is_on_the_adactin_login_page() throws FileNotFoundException, IOException {
		
			}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @see Used to perform login
	 */
	@When("User should perform login {string} and {string}")
	public void user_should_perform_login_and(String username, String password) {
		
		pom.getLoginPage().login(username, password);
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws AWTException
	 * @see Used to perform login with enter key
	 */
	
	@When("User should perform login {string},{string} with Enter key")
	public void user_should_perform_login_with_enter_key(String username, String password) throws AWTException {
		
		pom.getLoginPage().loginWithEnterKey(username, password);
	}

	/**
	 * 
	 * @param expLoginErrorMessage
	 * @see Userd to verify after login error message
	 */
	@Then("User should verify after login with invalid credentials error message contains {string}")
	public void user_should_verify_after_login_with_invalid_credentials_error_message_contains(String expLoginErrorMessage) {

		WebElement txtErrorMessage = pom.getLoginPage().getTxtLoginErrorMessage();
		
		String actLoginErrorMessage = elementGetText(txtErrorMessage);
	
		boolean b = actLoginErrorMessage.contains(expLoginErrorMessage);
		
		Assert.assertTrue("veify after login with invalid credentials ",b);
	}












	
}
