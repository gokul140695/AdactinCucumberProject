package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Used to run cancel booking scenarios use cancel booking pom page
 * @date 26-01-2023
 *
 */
public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "search_result_error")
	private WebElement txtCancelBookingSuccessMsg;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement linkBookedIt;

	public WebElement getTxtCancelBookingSuccessMsg() {
		return txtCancelBookingSuccessMsg;
	}

	@FindBy(id = "order_id_text")
	private WebElement txtOrderNo;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancelOrderId;

	public WebElement getLinkBookedIt() {
		return linkBookedIt;
	}

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancelOrderId() {
		return btnCancelOrderId;
	}

	/**
	 * 
	 * @param orderNo
	 * @see Used to cancel the order no 
	 */
	public void CancelBooking(String orderNo) {

		elementClick(getLinkBookedIt());
		elementSendkeys(getTxtOrderNo(), orderNo);
		elementClick(getBtnGo());
		elementClick(getBtnCancelOrderId());
		acceptInAlert();
	}

}
