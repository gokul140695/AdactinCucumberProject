package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Used to generate the order id 
 * @date 26-01-2023
 *
 */
public class BookingConfirmationPage extends BaseClass {
	
	public BookingConfirmationPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement txtAfterBookHtelSuccessMsg;

	public WebElement getTxtAfterBookHtelSuccessMsg() {
		return txtAfterBookHtelSuccessMsg;
	}
	
	
	
	
	
	
	
	
	

}
