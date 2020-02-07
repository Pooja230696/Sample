Feature: Adactin HotelBooking




Background: Login Page
Given user opens the Chrome browser
When user goes inside the application
Then user enters the Username in Username field
And user enter the Password in Password field
Then user clicks the Login Button
Then user Gives their preffered Location
Then user selects the Hotel Name
Then user selects the Room Type
And user enters the number of rooms


Scenario: To verify whether the Checkout date field accepts a later date than Checkin date
Then user enter the Checkin date
Then user enter the Checkout date
And user enters the number of adults per room
Then user enters the number of childrens per room
Then user clicks on Search Button
Then it checks for the proper checkin and checkout date


Scenario: To verify whether it accepts a past checkout date

Then user enter their Checkin date
Then user enter their Checkout date
And  user enters the total  adults per room
Then user enters the totalchildrens per room
Then user clicks the Search Button
Then it checks for the proper checkin and checkout date in their field

@TC103
Scenario: To verify whether locations in Select Hotel  page are  displayed according to the location  selected in  Search Hotel

Then user enter their Checkin date in that field
Then user enter their Checkout date in thatfield
And  user enter the total  adults per room
Then user enter the total childrens per room
Then user clicks on the Search Button
Then it checks for the Location displayed is equal to the Location searched.

Scenario: To verify whether Checkin and Checkout dates in Select Hotel  page are  displayed according to the Checkin and Checkout date selected in  Search Hotel
Then user enters their Checkin date in that field
Then user enters their Checkout date in thatfield
And  user enters the total  adult per room
Then user enters  total childrens per room
Then user click on the Search Button
Then it checks for the Checkin Checkout date displayed is equal to the Checkin and checkout date searched.

Scenario: To verify whether number of rooms in Select Hotel  page are  displayed according to the number of rooms selected in  Search Hotel
Then user enters their Checkin date in that  field
Then user enters their Checkout date in thatfield
And  user enters the total  adult per room
Then user enters  total childrens per room
Then user click on the Search Button
Then it checks for the Checkin Checkout date displayed is equal to the Checkin and checkout date searched.











