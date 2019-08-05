Feature: Test Suites For AdactinHotel

@1
Scenario: Verify Valid LogIn Details
Given User Launches The AdactinHotel Application
When User Enters The Username 
And User Enters The Password
And User Clicks LogIn Button
Then User Verify The Title Hello Username

Scenario: Verify whether check-out date field accepts a later date than checkin date.
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today+7Days
And User Select The CheckOutDate As Today+5Daya
And User Clicks Search Button
Then User Verify Error Saying ‘check-in-date should not be later than check-out-date’.

Scenario: Verify If System Reports An Error Message ‘Enter Valid dates’.
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today-5Daya
And User Select The CheckOutDate As Today-3Days
And User Clicks Search Button
Then User Verify Error Saying ‘Enter Valid dates’.

Scenario Outline: Verify If Location Displayed Is Same As Location Selected
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The '<Location>'
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
Then Verify If Location Displayed Is Same As '<Location>' Selected

Examples:
|Location|
|Sydney|
|Melbourne|

Scenario Outline: Verify If CheckInDate And CheckOutDate Displayed Are Same As The Selected
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As '<CheckInDate>'
And User Select The CheckOutDate As '<CheckOutDate>'
And User Clicks Search Button
Then User Verify If CheckInDate And CheckOutDate Displayed Are Same As The Selected'<CheckInDate>'and '<CheckOutDate>'

Examples:
|CheckInDate|CheckOutDate|
|27/07/2019|28/07/2019|
|03/08/2019|07/08/2019|

Scenario: Verify If NoOfRooms Displayed Is Same As  Selected NoOfRooms
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms As 3
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
Then Verify If NoOfRooms Displayed Is Same As  Selected NoOfRooms

Scenario: Verify If RoomType Displayed Is Same As  Selected RoomType
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType As Deluxe
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
Then Verify If RoomType Displayed Is Same As  Selected RoomType

Scenario: Verify Whether Total Price Is“price per night * no. of nights* no of rooms”.
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
Then User Verify Whether Total Price Is“price per night * no. of nights* no of rooms”.

Scenario: Verify LogOut Function
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Clicks Continue Button
And User Enters FirstName,LastName,Address,
And User Enters Credit Card Number
And User Selects Credit Card Type And The Expiry Month/Year
And User Enters CVV Number
And User Clicks BookNow Button
And User Clicks LogOut Button
Then User Verify LogOutMessage

Scenario: Verify Total Price Is Being Calculated As “price per night*no of days*no of rooms"" in Book A Hotel Page
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Clicks Continue Button
Then Verify If Total Price Is Being Calculated As “price per night*no of days*no of rooms"" in Book A Hotel Page

Scenario: Verify If Data In BookingConfirmationPage And BookAHotelPage Are Same
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Gets Entered Values For Verification
And User Clicks Continue Button
Then Verify If Data In BookingConfirmationPage And BookAHotelPage Are Same

Scenario: Verify If Final Billed Price Is Total Price + 10% Total Price In BookAHotelPage
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Gets Entered Values For Verification
And User Clicks Continue Button
Then Verify  If Final Billed Price Is Total Price + 10% Total Price In BookAHotelPage


Scenario: Verify Whether The Data Displayed Is Same as the Selected Data in Booking Confirmation Page
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Clicks Continue Button
And User Enters FirstName,LastName,Address,
And User Enters Credit Card Number
And User Selects Credit Card Type And The Expiry Month/Year
And User Enters CVV Number
And User Clicks BookNow Button
Then Verify Whether The Data Displayed Is Same as the Selected Data in Booking Confirmation Page


Scenario: Verify Order Number Is Generated In BookingConfirmationPage
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Clicks Continue Button
And User Enters FirstName,LastName,Address,
And User Enters Credit Card Number
And User Selects Credit Card Type And The Expiry Month/Year
And User Enters CVV Number
And User Clicks BookNow Button
Then Verify Order Number Is Generated In BookingConfirmationPage


Scenario: Verify Whether The Booked Itinerary Details Are Not Editable.
Given User Launches The AdactinHotel Application
When User Enters The Username
And User Enters The Password
And User Clicks LogIn Button
And User Select The Location
And User Select The Hotel
And User Select The RoomType
And User Select The No Of Rooms
And User Select The CheckInDate As Today
And User Select The CheckOutDate As Today
And  User Select The AdultsPerRoom
And  User Select The ChildrenPerRoom
And User Clicks Search Button
And User Clicks Select Radio Button
And User Clicks Continue Button
And User Enters FirstName,LastName,Address,
And User Enters Credit Card Number
And User Selects Credit Card Type And The Expiry Month/Year
And User Enters CVV Number
And User Clicks BookNow Button
And User Clicks MyItineraryBtn
Then User Verify Whether The Booked Itinerary Details Are Not Editable




