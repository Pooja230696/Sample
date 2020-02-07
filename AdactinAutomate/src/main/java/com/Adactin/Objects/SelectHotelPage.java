package com.Adactin.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.FunctionalLibrary;

public class SelectHotelPage extends FunctionalLibrary{
	
	@FindBy(className="login_title")
    private WebElement SelectHotelHeader;
	
	@FindBy(id="radiobutton_0")
	private WebElement SelectRadioBtn;
	
	@FindBy(id="location_0")
	private WebElement SelectedHotelLocation;
	
	@FindBy(xpath="(//input[@class='select_text'])[3]")
	private WebElement SelectedNumofRooms;
	
	@FindBy(xpath="(//input[@class='select_text'])[4]")
	private WebElement SelectedCheckInDate;
	
	@FindBy(xpath="(//input[@class='select_text'])[5]")
	private WebElement SelectedCheckOutDate;
	
	@FindBy(xpath="(//input[@class='select_text'])[7]")
	private WebElement SelectedRoomType;

	public WebElement getSelectHotelHeader() {
		return SelectHotelHeader;
	}

	public WebElement getSelectRadioBtn() {
		return SelectRadioBtn;
	}

	public WebElement getSelectedHotelLocation() {
		return SelectedHotelLocation;
	}

	public WebElement getSelectedNumofRooms() {
		return SelectedNumofRooms;
	}

	public WebElement getSelectedCheckInDate() {
		return SelectedCheckInDate;
	}

	public WebElement getSelectedCheckOutDate() {
		return SelectedCheckOutDate;
	}

	public WebElement getSelectedRoomType() {
		return SelectedRoomType;
	}
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
}
