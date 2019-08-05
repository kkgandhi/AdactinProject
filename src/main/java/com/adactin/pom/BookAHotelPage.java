package com.adactin.pom;

import java.time.temporal.WeekFields;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage {

	public WebDriver driver;
	public BookAHotelPage(WebDriver ldriver) {
           this.driver=ldriver;
           PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="total_price_dis")
	private WebElement TotalPrice;
	
	@FindBy(name="first_name")
	private WebElement FirstName;
	
	@FindBy(name="last_name")
	private WebElement LastName;
	
	@FindBy(name="address")
	private WebElement Address;
	
	@FindBy(name="cc_num")
	private WebElement CreditCardNo;
	
	@FindBy(name="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(name="cc_cvv")
	private WebElement CVVNo;
	
	@FindBy(name="book_now")
	private WebElement BookNowButton;
	
	@FindBy(name="hotel_name_dis")
	private WebElement HotelName;
	
	@FindBy(name="location_dis")
	private WebElement Location;
	
	@FindBy(name="room_type_dis")
	private WebElement RoomType;
	
	@FindBy(name="price_night_dis")
	private WebElement PricePerNight;
	
	@FindBy(name="final_price_dis")
	private WebElement FinalBilledPrice;
	
	@FindBy(name="gst_dis")
	private WebElement GST;
	
	
	
	public WebElement getTotalPrice() {
		return TotalPrice;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCVVNo() {
		return CVVNo;
	}

	public WebElement getBookNowButton() {
		return BookNowButton;
	}

	public WebElement getHotelName() {
		return HotelName;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getPricePerNight() {
		return PricePerNight;
	}

	public WebElement getFinalBilledPrice() {
		return FinalBilledPrice;
	}

	public WebElement getGST() {
		return GST;
	}
	
	
	
	
}
