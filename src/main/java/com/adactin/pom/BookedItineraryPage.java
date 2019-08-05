package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage {
	
	public WebDriver driver;
	public BookedItineraryPage(WebDriver ldriver) {
           this.driver=ldriver;
           PageFactory.initElements(driver, this);
	}
@FindBy(name="hotel_name_306534")
private WebElement HotelName;

@FindBy(name="rooms_306549")
private WebElement Rooms;


public WebElement getHotelName() {
	return HotelName;
}

public WebElement getRooms() {
	return Rooms;
}


	
}
