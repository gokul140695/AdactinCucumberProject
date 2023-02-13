package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Used to run login scenarios use login pom page
 * @date 26-01-2023
 *
 */
public class LoginPage extends BaseClass {

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//b[contains(text(),'Invalid Login details ')]")
	private WebElement txtLoginErrorMessage;

	
	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPassword;

	public WebElement getTxtLoginErrorMessage() {
		return txtLoginErrorMessage;
	}
	@FindBy(id = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @see To create common step for login credentials
	 */
	public void loginCommonStep(String username,String password) {

		elementSendkeys(getTxtUserName(), username);
		elementSendkeys(getTxtPassword(), password);
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @see Used to run login credentials
	 */
	public void login(String username,String password) {

		loginCommonStep(username, password);
		elementClick(getBtnLogin());
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws AWTException
	 * @see Used to run login with enter key
	 */
	public void loginWithEnterKey(String username,String password) throws AWTException {

		loginCommonStep(username, password);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	
	

}
