package com.Adactin.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.FunctionalLibrary;

public class SearchHotel extends FunctionalLibrary {

	@FindBy(id="location")
	private WebElement Location;

@FindBy(id="hotels")
private WebElement Hotels;

@FindBy(id="room_type")
private WebElement RoomType;

@FindBy(id="room_nos")
private WebElement NumofRooms;

@FindBy(id="datepick_in")
private WebElement Checkin;

@FindBy(id="datepick_out")
private WebElement Checkout;

@FindBy(id="adult_room")
private WebElement AdultPerRoom;

@FindBy(id="child_room")
private WebElement ChildrenRoom;

@FindBy(id="Submit")
private WebElement SearchBtn;

@FindBy(id="Reset")
private WebElement ResetBtn;

@FindBy(id="checkout_span")
private WebElement Properbookindate;



public WebElement getProperbookindate() {
	return Properbookindate;
}

public WebElement getLocation() {
	return Location;
}

public WebElement getHotels() {
	return Hotels;
}

public WebElement getRoomType() {
	return RoomType;
}

public WebElement getNumofRooms() {
	return NumofRooms;
}

public WebElement getCheckin() {
	return Checkin;
}

public WebElement getCheckout() {
	return Checkout;
}

public WebElement getAdultPerRoom() {
	return AdultPerRoom;
}

public WebElement getChildrenRoom() {
	return ChildrenRoom;
}

public WebElement getSearchBtn() {
	return SearchBtn;
}

public WebElement getResetBtn() {
	return ResetBtn;
}

public SearchHotel() {
	PageFactory.initElements(driver, this);
}
}
