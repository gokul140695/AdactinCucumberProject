package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author ELCOT
 * @see Used to run search hotel scenarios using search hotel pom page
 * @date 26-01-2023
 *
 */
public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username_show")
	private WebElement txtLoginSuccessMsg;


	
	public WebElement getTxtLoginSuccessMsg() {
		return txtLoginSuccessMsg;
	}

	@FindBy(id="checkin_span")
	private WebElement txtCheckinDateErrorMsg;
	
	public WebElement getTxtCheckinDateErrorMsg() {
		return txtCheckinDateErrorMsg;
	}

	public WebElement getTxtCheckOutDateErrorMsg() {
		return txtCheckOutDateErrorMsg;
	}

	public WebElement getTxtLocationErrorMessage() {
		return txtLocationErrorMessage;
	}

	@FindBy(id="checkout_span")
	private WebElement txtCheckOutDateErrorMsg;
	
	@FindBy(id="location_span")
	private WebElement txtLocationErrorMessage;

	
	
	@FindBy(id = "location")
	private WebElement dDnLocation;

	@FindBy(id = "hotels")
	private WebElement dDnHotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnNoOfRooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckInDate;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOutDate;

	@FindBy(id = "adult_room")
	private WebElement dDnAdultsRoom;

	@FindBy(id = "child_room")
	private WebElement dDnChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsRoom() {
		return dDnAdultsRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkInOutDate
	 * @param AdultsPerRoom
	 * @see Common steps for search hotel credentials 
	 */
	public void searchHotelsCommonStep(String location, String noOfRooms, String checkInDate, String checkInOutDate,
			String AdultsPerRoom) {

		selectOptionByText(getdDnLocation(), location);
		selectOptionByText(getdDnNoOfRooms(), noOfRooms);
		
		sendkeysByJs(getTxtCheckInDate(), checkInDate);
		sendkeysByJs(getTxtCheckOutDate(), checkInOutDate);
		
		
		selectOptionByText(getdDnAdultsRoom(), AdultsPerRoom);

	}

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
	 * @see search hotel with all credentials
	 */
	public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkInDate,
			String checkInOutDate, String AdultsPerRoom, String childPerRoom) {

		searchHotelsCommonStep(location, noOfRooms, checkInDate, checkInOutDate, AdultsPerRoom);

		selectOptionByText(getdDnHotels(), hotels);
		selectOptionByText(getdDnRoomType(), roomType);
		selectOptionByText(getdDnChildRoom(), childPerRoom);
		elementClick(getBtnSearch());

	}

	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param checkInDate
	 * @param checkInOutDate
	 * @param AdultsPerRoom
	 * @see search hotel with madentory credentials
	 * 
	 */
	public void searchHotels(String location, String noOfRooms, String checkInDate, String checkInOutDate,
			String AdultsPerRoom) {

		searchHotelsCommonStep(location, noOfRooms, checkInDate, checkInOutDate, AdultsPerRoom);
		elementClick(getBtnSearch());

	}

	/**
	 * @see search hotel with without credentials
	 */
	public void searchHotels() {

		elementClick(getBtnSearch());
	}

}
