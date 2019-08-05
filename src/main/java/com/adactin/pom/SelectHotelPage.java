package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public WebDriver driver;
	public SelectHotelPage(WebDriver ldriver) {
              this.driver=ldriver;
              PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="hotel_name_0")
	private WebElement HotelName;
	
	@FindBy(name="location_0")
	private WebElement Location;
	
	@FindBy(id="arr_date_0")
	private WebElement ArrivalDate;
	
	@FindBy(id="dep_date_0")
	private WebElement DepartureDate;
	
	@FindBy(name="rooms_0")
	private WebElement NoOfRooms;
	
	@FindBy(name="room_type_0")
	private WebElement RoomType;
	
	@FindBy(name="no_days_0")
    private WebElement NoOfDays;
	
	@FindBy(name="price_night_0")
	private WebElement PricePerNight;
	
	@FindBy(name="total_price_0")
	private WebElement TotalPrice;
	
	@FindBy(name="radiobutton_0")
	private WebElement SelectHotelRadioButton;
	
	@FindBy(name="continue")
	private WebElement ContinueButton;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getArrivalDate() {
		return ArrivalDate;
	}

	public WebElement getDepartureDate() {
		return DepartureDate;
	}

	public WebElement getNoOfRooms() {
		return NoOfRooms;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNoOfDays() {
		return NoOfDays;
	}

	public WebElement getPricePerNight() {
		return PricePerNight;
	}

	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	public WebElement getSelectHotelRadioButton() {
		return SelectHotelRadioButton;
	}

	public WebElement getContinueButton() {
		return ContinueButton;
	}

	public WebElement getHotelName() {
		return HotelName;
	}
	
	
	
	
	
}
