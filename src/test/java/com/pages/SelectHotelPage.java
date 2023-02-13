package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Used to run select hotel scenarios use select hotel pom page
 *
 */
public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(className="login_title")
	private WebElement txtSearchSuccessMessage;
	
	@FindBy(xpath="//label[@id='radiobutton_span']")
	private WebElement txtSelectHotelErrorMsg;

	public WebElement getTxtSelectHotelErrorMsg() {
		return txtSelectHotelErrorMsg;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement btnSelectHotel;

	@FindBy(id = "continue")
	private WebElement btnContinue;

	public WebElement getBtnSelectHotel() {
		return btnSelectHotel;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	

	public WebElement getTxtSearchSuccessMessage() {
		return txtSearchSuccessMessage;
	}

	/**
	 * @see To perform to select hotel
	 */
	public void selectHotel() {

		elementClick(getBtnSelectHotel());
		elementClick(getBtnContinue());
	}

	/**
	 * @see To peform without selecting hotel
	 */
	public void withOutSelectHotel() {

		elementClick(getBtnContinue());
	}

}
