package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotelPage;
import com.adactin.pom.BookedItineraryPage;
import com.adactin.pom.BookingConfirmationPage;
import com.adactin.pom.LogOutPage;
import com.adactin.pom.SelectHotelPage;
import com.adactin.pom.SignInPage;
import com.adactin.pom.UserHomePage;

public class PageObjectManager {
	
	public WebDriver driver;
	public SignInPage sp;
	public UserHomePage up;
	public SelectHotelPage shp;
	public BookAHotelPage bhp;
	public BookingConfirmationPage bcp;
	public LogOutPage lop;
	public BookedItineraryPage bip;
	
	public SignInPage getSp() {
		if (sp==null) {
			sp=new SignInPage(driver);
		}
		return sp;
	}
	public UserHomePage getUp() {
		if (up==null) {
			up=new UserHomePage(driver);
		}
		return up;
	}
	
	public SelectHotelPage getShp() {
		if (shp==null) {
			shp=new SelectHotelPage(driver);
		}
		return shp;
	}
	
	public BookAHotelPage getBhp() {
		if (bhp==null) {
			bhp=new BookAHotelPage(driver);
		}
		return bhp;
	}
	
	public BookingConfirmationPage getBcp() {
		if (bcp==null) {
			bcp=new BookingConfirmationPage(driver);
		}
		return bcp;
	}
	
	public LogOutPage getLop() {
		if (lop==null) {
			lop=new LogOutPage(driver);
		}
		return lop;
	}
	
	
	
	public BookedItineraryPage getBip() {
		if (bip==null) {
			bip=new BookedItineraryPage(driver);
		}
		return bip;
	}
	public PageObjectManager(WebDriver mdriver) {
         this.driver=mdriver;
	    
	}
	
	
	

}
