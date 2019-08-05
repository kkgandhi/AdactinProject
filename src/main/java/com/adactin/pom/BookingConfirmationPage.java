package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage {
	public WebDriver driver;
	public BookingConfirmationPage(WebDriver ldriver) {
           this.driver=ldriver;
           PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="logout")
     private WebElement LogoutButton;
	
	@FindBy(name="hotel_name")
    private WebElement HotelName;
	
	@FindBy(name="room_type")
    private WebElement RoomType;
	
	@FindBy(name="arrival_date")
    private WebElement CheckInDate;
	
	@FindBy(name="departure_date")
    private WebElement CheckOutDate;
	
	@FindBy(name="total_rooms")
    private WebElement NoOfRooms;
	
	@FindBy(name="adults_room")
    private WebElement AdultsPerRoom;
	
	@FindBy(name="children_room")
    private WebElement ChildrenPerRoom;
	
	@FindBy(name="order_no")
	private WebElement OrderNo; 
	
	@FindBy(name="my_itinerary")
	private WebElement MyItinerayBtn;
	
	public WebElement getHotelName() {
		return HotelName;
	}


	public WebElement getRoomType() {
		return RoomType;
	}


	public WebElement getCheckInDate() {
		return CheckInDate;
	}


	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}


	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}


	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}


	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}


	public WebElement getLogoutButton() {
		return LogoutButton;
	}


	public WebElement getOrderNo() {
		return OrderNo;
	}


	public WebElement getMyItinerayBtn() {
		return MyItinerayBtn;
	}
	
	
	
}
