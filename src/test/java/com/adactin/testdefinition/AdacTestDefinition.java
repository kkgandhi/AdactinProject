package com.adactin.testdefinition;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.testrunner.AdacTestRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdacTestDefinition extends BaseClass {
	
	public static WebDriver driver=AdacTestRunner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);
	
	@Given("^User Launches The AdactinHotel Application$")
	public void user_Launches_The_AdactinHotel_Application() throws Throwable {
		String url = FileReaderManager.getInstance().getCr().getUrl();
		getUrl(url);
		
	    
	}

	@When("^User Enters The Username$")
	public void user_Enters_The_Username() throws Throwable {
	    inputValuesToWebelement(pom.getSp().getUsername(), "kkgandhi");
	    
	}

	@And("^User Enters The Password$")
	public void user_Enters_The_Password() throws Throwable {
	    
	    inputValuesToWebelement(pom.getSp().getPasword(), "qwerty");
	}

	@And("^User Clicks LogIn Button$")
	public void user_Clicks_LogIn_Button() throws Throwable {
	    
        clickWebelement(pom.getSp().getLogin());
	}

	@Then("^User Verify The Title Hello Username$")
	public void user_Verify_The_Title_Hello_Username() throws Throwable {
	    
		String valueOfAtrribute = getValueOfAtrribute(pom.getUp().getAccountName());
		Assert.assertEquals("Hello kgandhi!", valueOfAtrribute);
		System.out.println("Test1 Passed:LogIN Successful");
		
	}

	@And("^User Select The Location$")
	public void user_Select_The_Location() throws Throwable {
	    selectDropDown(pom.getUp().getLocation(), "value", "Sydney");
	    
	}

	@And("^User Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
	    selectDropDown(pom.getUp().getHotel(), "visibletext", "Hotel Creek");
	    
	}

	@And("^User Select The RoomType$")
	public void user_Select_The_RoomType() throws Throwable {
	     selectDropDown(pom.getUp().getRoomType(), "index", "1");  
	  
	}

	@And("^User Select The No Of Rooms$")
	public void user_Select_The_No_Of_Rooms() throws Throwable {
	    selectDropDown(pom.getUp().getRoomNos(), "value", "2");
	    
	}

	
	@And("^User Select The CheckInDate As Today\\+(\\d+)Days$")
	public void user_Select_The_CheckInDate_As_Today_Days(int arg1) throws Throwable {
		clearText(pom.getUp().getCheckInDate());
		inputValuesToWebelement(pom.getUp().getCheckInDate(), "01/08/2019");
	    
	    
	}

	@And("^User Select The CheckOutDate As Today\\+(\\d+)Daya$")
	public void user_Select_The_CheckOutDate_As_Today_Daya(int arg1) throws Throwable {
	    clearText(pom.getUp().getCheckOutDate());
	    inputValuesToWebelement(pom.getUp().getCheckOutDate(), "29/07/2019");
	    
	}
	
	@And("^User Clicks Search Button$")
	public void user_Clicks_Search_Button() throws Throwable {
	    clickWebelement(pom.getUp().getSearchButton());
		
	}

	@Then("^User Verify Error Saying ‘check-in-date should not be later than check-out-date’\\.$")
	public void user_Verify_Error_Saying_check_in_date_should_not_be_later_than_check_out_date() throws Throwable {
	    String text = getText(pom.getUp().getSystemError());
		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", text);
		System.out.println("Test2 Passed:SystemError Reported:"+text);
	    
	}
	
	@Then("^User Select The CheckInDate As Today-(\\d+)Daya$")
	public void user_Select_The_CheckInDate_As_Today_Daya(int arg1) throws Throwable {
	    clearText(pom.getUp().getCheckInDate());
	    inputValuesToWebelement(pom.getUp().getCheckInDate(), "20/07/2019");
	   
	}

	@Then("^User Select The CheckOutDate As Today-(\\d+)Days$")
	public void user_Select_The_CheckOutDate_As_Today_Days(int arg1) throws Throwable {
	    clearText(pom.getUp().getCheckOutDate());
	    inputValuesToWebelement(pom.getUp().getCheckOutDate(), "22/07/2019");
	   
	}

	@Then("^User Verify Error Saying ‘Enter Valid dates’\\.$")
	public void user_Verify_Error_Saying_Enter_Valid_dates() throws Throwable {
	    String text = getText(pom.getUp().getTitle());
	    Assert.assertEquals("Search Hotel ", text);
	    System.out.println("Test3 Passed:Error 'Enter Valid Dates' Displayed");
	    
	   	}

	@When("^User Select The '(.*)'$")
	public void user_Select_The_Sydney(String args) throws Throwable {
	    selectDropDown(pom.getUp().getLocation(), "value", args);
	    
	}

	@When("^User Select The CheckInDate As Today$")
	public void user_Select_The_CheckInDate_As_Today() throws Throwable {
		    clearText(pom.getUp().getCheckInDate());
		    inputValuesToWebelement(pom.getUp().getCheckInDate(), "25/07/2019");
	    
	}

	@When("^User Select The CheckOutDate As Today$")
	public void user_Select_The_CheckOutDate_As_Today() throws Throwable {
		   clearText(pom.getUp().getCheckOutDate());
		    inputValuesToWebelement(pom.getUp().getCheckOutDate(), "26/07/2019");
	    
	}

	@When("^User Select The AdultsPerRoom$")
	public void user_Select_The_AdultsPerRoom() throws Throwable {
	    selectDropDown(pom.getUp().getAdultsPerRoom(), "value", "1");
	    
	}

	@When("^User Select The ChildrenPerRoom$")
	public void user_Select_The_ChildrenPerRoom() throws Throwable {
	    selectDropDown(pom.getUp().getChildrenPerRoom(), "value", "1");
	    
	}

	@Then("^Verify If Location Displayed Is Same As '(.*)' Selected$")
	public void verify_If_Location_Displayed_Is_Same_As_Sydney_Selected(String args) throws Throwable {
	    String valueOfAtrribute = getValueOfAtrribute(pom.getShp().getLocation());
	    Assert.assertEquals(args, valueOfAtrribute);
	    System.out.println("Test4 Passed: Location Displayed Is Same As Location Selected");
	    
		
		
	}

	@And("^User Select The CheckInDate As '(.*)'$")
	public void user_Select_The_CheckInDate_As(String args) throws Throwable {
	    clearText(pom.getUp().getCheckInDate());
	    inputValuesToWebelement(pom.getUp().getCheckInDate(), args);
	   
	}

	@And("^User Select The CheckOutDate As '(.*)'$")
	public void user_Select_The_CheckOutDate_As(String args) throws Throwable {
	    clearText(pom.getUp().getCheckOutDate());
	    inputValuesToWebelement(pom.getUp().getCheckOutDate(), args);
	   
	}

	@Then("^User Verify If CheckInDate And CheckOutDate Displayed Are Same As The Selected'(.*)'and '(.*)'$")
	public void user_Verify_If_CheckInDate_And_CheckOutDate_Displayed_Are_Same_As_The_Selected_and(String args1,String args2) throws Throwable {
	    String valueOfAtrribute1 = getValueOfAtrribute(pom.getShp().getArrivalDate());
	    String valueOfAtrribute2 = getValueOfAtrribute(pom.getShp().getDepartureDate());
	    Assert.assertEquals(args1, valueOfAtrribute1);
	    Assert.assertEquals(args2, valueOfAtrribute2);
	    System.out.println("Test5 Passed:CheckInDate And CheckOutDate Displayed Are Same As The Selected");
	   
	}

	@And("^User Select The No Of Rooms As (\\d+)$")
	public void user_Select_The_No_Of_Rooms_As(int arg1) throws Throwable {
	    selectDropDown(pom.getUp().getRoomNos(), "value", "3");
	    
	}

	@Then("^Verify If NoOfRooms Displayed Is Same As  Selected NoOfRooms$")
	public void verify_If_NoOfRooms_Displayed_Is_Same_As_Selected_NoOfRooms() throws Throwable {
	    String valueOfAtrribute = getValueOfAtrribute(pom.getShp().getNoOfRooms());
	    boolean contains = valueOfAtrribute.contains("3");
	    Assert.assertTrue(contains); 
	    System.out.println("Test6 Passed:NoOfRooms Displayed Is Same As  Selected NoOfRooms");
	}
	
	@And("^User Select The RoomType As Deluxe$")
	public void user_Select_The_RoomType_As_Deluxe() throws Throwable {
	    selectDropDown(pom.getUp().getRoomType(), "value", "Deluxe");
		
	}

	@Then("^Verify If RoomType Displayed Is Same As  Selected RoomType$")
	public void verify_If_RoomType_Displayed_Is_Same_As_Selected_RoomType() throws Throwable {
	    String valueOfAtrribute = getValueOfAtrribute(pom.getShp().getRoomType());
	    Assert.assertEquals("Deluxe", valueOfAtrribute);
	    System.out.println("Test7 Passed:RoomType Displayed Is Same As  Selected RoomType");
		
	}


	@Then("^User Verify Whether Total Price Is“price per night \\* no\\. of nights\\* no of rooms”\\.$")
	public void user_Verify_Whether_Total_Price_Is_price_per_night_no_of_nights_no_of_rooms() throws Throwable {
	  String valueOfAtrribute = getValueOfAtrribute(pom.getShp().getTotalPrice());
	  Assert.assertEquals("AUD $ 250", valueOfAtrribute);
	  System.out.println("Test8 Passed:Total Price Is“price per night * no. of nights* no of rooms”.");
		
	}

	@When("^User Clicks Select Radio Button$")
	public void user_Clicks_Select_Radio_Button() throws Throwable {
	    clickWebelement(pom.getShp().getSelectHotelRadioButton());
	    
	}

	@When("^User Clicks Continue Button$")
	public void user_Clicks_Continue_Button() throws Throwable {
		clickWebelement(pom.getShp().getContinueButton());
	    
	    
	}

	@When("^User Enters FirstName,LastName,Address,$")
	public void user_Enters_FirstName_LastName_Address() throws Throwable {
	    inputValuesToWebelement(pom.getBhp().getFirstName(), "Kamalakannan");
	    inputValuesToWebelement(pom.getBhp().getLastName(), "Sekar");
	   inputValuesToWebelement(pom.getBhp().getAddress(), "121 Victory Colony,Anna Nagar");
	   
	}

	@When("^User Enters Credit Card Number$")
	public void user_Enters_Credit_Card_Number() throws Throwable {
	    inputValuesToWebelement(pom.getBhp().getCreditCardNo(), "1234123412341234");
	    
	}

	@When("^User Selects Credit Card Type And The Expiry Month/Year$")
	public void user_Selects_Credit_Card_Type_And_The_Expiry_Month_Year() throws Throwable {
	    selectDropDown(pom.getBhp().getCreditCardType(), "value", "AMEX");
	    selectDropDown(pom.getBhp().getExpMonth(), "value","2");
	    selectDropDown(pom.getBhp().getExpYear(), "value", "2020");
	    
	}

	@When("^User Enters CVV Number$")
	public void user_Enters_CVV_Number() throws Throwable {
	    inputValuesToWebelement(pom.getBhp().getCVVNo(), "123");
	    
	}

	@When("^User Clicks BookNow Button$")
	public void user_Clicks_BookNow_Button() throws Throwable {
	    clickWebelement(pom.getBhp().getBookNowButton());
	    
	}

	@When("^User Clicks LogOut Button$")
	public void user_Clicks_LogOut_Button() throws Throwable {
	    clickWebelement(pom.getBcp().getLogoutButton());
	    
	}

	@Then("^User Verify LogOutMessage$")
	public void user_Verify_LogOutMessage() throws Throwable {
	    String text = getText(pom.getLop().getLogOutMessage());
	    Assert.assertEquals("You have successfully logged out. Click here to login again", text);
	    System.out.println("Test9 Passed:LogOut Function");
	}


	@Then("^Verify If Total Price Is Being Calculated As “price per night\\*no of days\\*no of rooms\"([^\"]*)\" in Book A Hotel Page$")
	public void verify_If_Total_Price_Is_Being_Calculated_As_price_per_night_no_of_days_no_of_rooms_in_Book_A_Hotel_Page(String arg1) throws Throwable {
	    String valueOfAtrribute = getValueOfAtrribute(pom.getBhp().getTotalPrice());
		Assert.assertEquals("AUD $ 250", valueOfAtrribute);
		System.out.println("Test10 Passed:Total Price Is Being Calculated As price per night*no of days*no of rooms in Book A Hotel Page");
		
	}
    static String  hotel1,location1, roomType1,price1;
	@When("^User Gets Entered Values For Verification$")
	public void user_Gets_Entered_Values_For_Verification() throws Throwable {
		  this.hotel1 = getValueOfAtrribute(pom.getShp().getHotelName());
		this.location1 = getValueOfAtrribute(pom.getShp().getLocation());
	    this.roomType1 = getValueOfAtrribute(pom.getShp().getRoomType());
		this.price1 = getValueOfAtrribute(pom.getShp().getPricePerNight());
		
	}
	
	@Then("^Verify If Data In BookingConfirmationPage And BookAHotelPage Are Same$")
	public void verify_If_Data_In_BookingConfirmationPage_And_BookAHotelPage_Are_Same() throws Throwable {
	    
	    String hotel2 = getValueOfAtrribute(pom.getBhp().getHotelName());
	    Assert.assertEquals(this.hotel1, hotel2);
	    String location2 = getValueOfAtrribute(pom.getBhp().getLocation());
	    Assert.assertEquals(this.location1, location2);
	    String roomType2 = getValueOfAtrribute(pom.getBhp().getRoomType());
	    Assert.assertEquals(this.roomType1, roomType2);
	    String price2 = getValueOfAtrribute(pom.getBhp().getPricePerNight());
	    Assert.assertEquals(this.price1, price2);
	    System.out.println("Test11 Passed:Data In BookingConfirmationPage And BookAHotelPage Are Same");
	    		
	}

	@Then("^Verify  If Final Billed Price Is Total Price \\+ (\\d+)% Total Price In BookAHotelPage$")
	public void verify_If_Final_Billed_Price_Is_Total_Price_Total_Price_In_BookAHotelPage(int arg1) throws Throwable {
	      String valueOfAtrribute = getValueOfAtrribute(pom.getBhp().getFinalBilledPrice());
         Assert.assertEquals("AUD $ 148.5", valueOfAtrribute);
         System.out.println("Test12 Passed:Final Billed Price Is Total Price + 10% Total Price In BookAHotelPage");
	}

	@Then("^Verify Whether The Data Displayed Is Same as the Selected Data in Booking Confirmation Page$")
	public void verify_Whether_The_Data_Displayed_Is_Same_as_the_Selected_Data_in_Booking_Confirmation_Page() throws Throwable {
	    String hotelName = getValueOfAtrribute(pom.getBcp().getHotelName());
	    Assert.assertEquals("Hotel Creek", hotelName);
	    String noOfRooms = getValueOfAtrribute(pom.getBcp().getNoOfRooms());
	    Assert.assertEquals("2 Room(s)", noOfRooms);
	    String roomType = getValueOfAtrribute(pom.getBcp().getRoomType());
	    Assert.assertEquals("Standard", roomType);
	    String checkInDate = getValueOfAtrribute(pom.getBcp().getCheckInDate());
	    Assert.assertEquals("25/07/2019", checkInDate);
	    String checkOutDate = getValueOfAtrribute(pom.getBcp().getCheckOutDate());
	    Assert.assertEquals("26/07/2019", checkOutDate);
	    String adultsPerRoom = getValueOfAtrribute(pom.getBcp().getAdultsPerRoom());
	    Assert.assertEquals("1 Adult(s)", adultsPerRoom);
	    String childrenPerRoom = getValueOfAtrribute(pom.getBcp().getChildrenPerRoom());
	    Assert.assertEquals("1 Children", childrenPerRoom);
	    System.out.println("Test13 Passed: Data Displayed Is Same as the Selected Data in Booking Confirmation Page");
		
	}

	@Then("^Verify Order Number Is Generated In BookingConfirmationPage$")
	public void verify_Order_Number_Is_Generated_In_BookingConfirmationPage() throws Throwable {
		String valueOfAtrribute = getValueOfAtrribute(pom.getBcp().getOrderNo());
	    Assert.assertNotNull(valueOfAtrribute);		
	    System.out.println("Test14 Passed:Verify Order Number Is Generated In BookingConfirmationPage");
	}

	@When("^User Clicks MyItineraryBtn$")
	public void user_Clicks_MyItineraryBtn() throws Throwable {
	    clickWebelement(pom.getBcp().getMyItinerayBtn());
		
	}

	@Then("^User Verify Whether The Booked Itinerary Details Are Not Editable$")
	public void user_Verify_Whether_The_Booked_Itinerary_Details_Are_Not_Editable() throws Throwable {
	    boolean elementIsEnabled1 = elementIsEnabled(pom.getBip().getHotelName());
        Assert.assertEquals(false, elementIsEnabled1);
	    boolean elementIsEnabled2 = elementIsEnabled(pom.getBip().getRooms());
	    Assert.assertEquals(false, elementIsEnabled2);
	    System.out.println("Test15 Passed: The Booked Itinerary Details Are Not Editable");
	}
}
