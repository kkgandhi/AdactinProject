package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {

	public WebDriver driver;
	public UserHomePage(WebDriver ldriver) {
        this.driver=ldriver;
        PageFactory.initElements(driver, this);
}
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement roomType;
	
	@FindBy(name="room_nos")
	private WebElement roomNos;
	
	@FindBy(name="datepick_in")
	private WebElement CheckInDate;
	
	@FindBy(name="datepick_out")
	private WebElement CheckOutDate;
	
	@FindBy(name="Submit")
	private WebElement SearchButton;
	
	@FindBy(name="username_show")
	private WebElement AccountName;
	
	@FindBy(xpath="//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement SystemError;
	
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement Title;
	
	@FindBy(name="adult_room")
	private WebElement AdultsPerRoom;
	
	@FindBy(name="child_room")
	private WebElement ChildrenPerRoom;
	
	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getAccountName() {
		return AccountName;
	}

	public WebElement getSystemError() {
		return SystemError;
	}

	public WebElement getTitle() {
		return Title;
	}

	

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}
	
	
	
	
	
	
	
	
	
	
	
}
