package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 *@see Used to run the book hotel scenarios using book hotel pom page
 *@date 26-01-2023
 */
public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {

		PageFactory.initElements(driver, this);
		
		}

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement txtAfterSelectHotelsuccessMsg;
		
		public WebElement getTxtAfterSelectHotelsuccessMsg() {
		return txtAfterSelectHotelsuccessMsg;
	}

		@FindBy(id="first_name")
		private WebElement txtFirstName;
		
		@FindBy(id="last_name")
		private WebElement txtLastName;
		
		@FindBy(id="address")
		private WebElement txtAddress;
		
		@FindBy(id="cc_num")
		private WebElement txtCreditCardNo;
		
		@FindBy(id="cc_type")
		private WebElement dDnCreditCardType;
		
		@FindBy(id="cc_exp_month")
		private WebElement dDnMonth;
		
		@FindBy(id="cc_exp_year")
		private WebElement dDnYear;
		
		@FindBy(id="cc_cvv")
		private WebElement txtCvvNo;
		
		@FindBy(id="book_now")
		private WebElement btnBookNow;
		
		@FindBy(id="first_name_span")
		private WebElement txtFirstNameErrorMsg;
		
		@FindBy(id="last_name_span")
		private WebElement txtLastNameErrorMsg;
		
	

		public WebElement getTxtFirstNameErrorMsg() {
			return txtFirstNameErrorMsg;
		}

		public WebElement getTxtLastNameErrorMsg() {
			return txtLastNameErrorMsg;
		}

		
		@FindBy(id="address_span")
		private WebElement txtAddressErrorMsg;
		
		@FindBy(id="cc_num_span")
		private WebElement txtCreditCardErrorMsg;
		
		@FindBy(id="cc_type_span")
		private WebElement txtCreditCardTypeErrorMsg;
		
		@FindBy(id="cc_expiry_span")
		private WebElement txtExpiryErrorMsg;
		
		@FindBy(id="cc_cvv_span")
		private WebElement txtCvvNumberErrorMsg;
		
		

		public WebElement getTxtAddressErrorMsg() {
			return txtAddressErrorMsg;
		}

		public WebElement getTxtCreditCardErrorMsg() {
			return txtCreditCardErrorMsg;
		}

		public WebElement getTxtCreditCardTypeErrorMsg() {
			return txtCreditCardTypeErrorMsg;
		}

		public WebElement getTxtExpiryErrorMsg() {
			return txtExpiryErrorMsg;
		}

		public WebElement getTxtCvvNumberErrorMsg() {
			return txtCvvNumberErrorMsg;
		}

		public WebElement getTxtFirstName() {
			return txtFirstName;
		}

		public WebElement getTxtLastName() {
			return txtLastName;
		}

		public WebElement getTxtAddress() {
			return txtAddress;
		}

		public WebElement getTxtCreditCardNo() {
			return txtCreditCardNo;
		}

		public WebElement getdDnCreditCardType() {
			return dDnCreditCardType;
		}

		public WebElement getdDnMonth() {
			return dDnMonth;
		}

		public WebElement getdDnYear() {
			return dDnYear;
		}

		public WebElement getTxtCvvNo() {
			return txtCvvNo;
		}

		public WebElement getBtnBookNow() {
			return btnBookNow;
		}
		
		/**
		 * 
		 * @param firstName
		 * @param lastName
		 * @param address
		 * @see book hotel with credentials
		 */
		public void BookAHotel(String firstName,String lastName,String address) {

			elementSendkeys(getTxtFirstName(), firstName);
			elementSendkeys(getTxtLastName(), lastName);
			elementSendkeys(getTxtAddress(), address);
			
			
		}
		/**
		 * @see book hotel without credentials
		 */
		public void BookHotel() {

			elementClick(getBtnBookNow());
			
		}
		
		
		
		
		
		
		

}
