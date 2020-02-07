package com.Adactin.stepdefnition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.Adactin.Objects.LoginPage;
import com.Adactin.Objects.SearchHotel;
import com.Adactin.Objects.SelectHotelPage;
import com.Adactin.Objects.Singleton;
import com.Adactin.baseclass.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends FunctionalLibrary {
	
	Singleton s = new Singleton();
	
	@Given("^user opens the Chrome browser$")
	public void user_opens_the_Chrome_browser() throws Throwable {
	
	}

	@When("^user goes inside the application$")
	public void user_goes_inside_the_application() throws Throwable {
		openApp("https://adactin.com/HotelApp/");
	}

	@Then("^user enters the Username in Username field$")
	public void user_enters_the_Username_in_Username_field() throws Throwable {
//		LoginPage lp = new LoginPage();
		enterText(s.getLp().getUsername(), "Pooja2306");
	
	}

	@Then("^user enter the Password in Password field$")
	public void user_enter_the_Password_in_Password_field() throws Throwable {
		LoginPage lp = new LoginPage();
		enterText(lp.getPassword(), "Pooja@1996");
	}

	@Then("^user clicks the Login Button$")
	public void user_clicks_the_Login_Button() throws Throwable {
		LoginPage lp = new LoginPage();
		clickbtn(lp.getLoginBtn());
	}

	@Then("^user Gives their preffered Location$")
	public void user_Gives_their_preffered_Location() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getLocation(), "Sydney", "value");
		Thread.sleep(1000);
		
	}

	@Then("^user selects the Hotel Name$")
	public void user_selects_the_Hotel_Name() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getHotels(), "Hotel Creek", "value");
		Thread.sleep(1000);

	}

	@Then("^user selects the Room Type$")
	public void user_selects_the_Room_Type() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getRoomType(), "Standard", "value");
		Thread.sleep(1000);
	}

	@Then("^user enters the number of rooms$")
	public void user_enters_the_number_of_rooms() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getNumofRooms(), "1", "value");
		Thread.sleep(1000);
	}

	@Then("^user enter the Checkin date$")
	public void user_enter_the_Checkin_date() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckin().clear();
		enterText(sh.getCheckin(), "07/02/2020");
		Thread.sleep(1000);
	}

	@Then("^user enter the Checkout date$")
	public void user_enter_the_Checkout_date() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckout().clear();
		enterText(sh.getCheckout(), "05/02/2020");
		Thread.sleep(1000);
	}

	@Then("^user enters the number of adults per room$")
	public void user_enters_the_number_of_adults_per_room() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getAdultPerRoom(), "2", "value");
		
		Thread.sleep(1000);
	}

	@Then("^user enters the number of childrens per room$")
	public void user_enters_the_number_of_childrens_per_room() throws Throwable {
	}

	@Then("^user clicks on Search Button$")
	public void user_clicks_on_Search_Button() throws Throwable {
		SearchHotel sh = new SearchHotel();
		clickbtn(sh.getSearchBtn());
	}
	@Then("^it checks for the proper checkin and checkout date$")
	public void it_checks_for_the_proper_checkin_and_checkout_date() throws Throwable {
		SearchHotel sh = new SearchHotel();
		elementIsDisplayed(sh.getProperbookindate());
		String text = sh.getProperbookindate().getText();
		System.out.println(text);
		Thread.sleep(3000);

	}
		@Then("^user enter their Checkin date$")
	public void user_enter_their_Checkin_date() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckin().clear();
		enterText(sh.getCheckin(), "27/01/2020");
		Thread.sleep(1000);

	}

	@Then("^user enter their Checkout date$")
	public void user_enter_their_Checkout_date() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckout().clear();
		enterText(sh.getCheckout(), "25/01/2020");
		Thread.sleep(1000);

	}

	@Then("^user enters the total  adults per room$")
	public void user_enters_the_total_adults_per_room() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getAdultPerRoom(), "2", "value");
		Thread.sleep(1000);

	}

	@Then("^user enters the totalchildrens per room$")
	public void user_enters_the_totalchildrens_per_room() throws Throwable {
	}

	@Then("^user clicks the Search Button$")
	public void user_clicks_the_Search_Button() throws Throwable {
		SearchHotel sh = new SearchHotel();
		clickbtn(sh.getSearchBtn());

	}

	@Then("^it checks for the proper checkin and checkout date in their field$")
	public void it_checks_for_the_proper_checkin_and_checkout_date_in_their_field() throws Throwable {
		SearchHotel sh = new SearchHotel();
		elementIsDisplayed(sh.getProperbookindate());
Thread.sleep(1000);
	}

	@Then("^user enter their Checkin date in that field$")
	public void user_enter_their_Checkin_date_in_that_field() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckin().clear();
		enterText(sh.getCheckin(), "10/02/2020");
		Thread.sleep(1000);
		
	}

	@Then("^user enter their Checkout date in thatfield$")
	public void user_enter_their_Checkout_date_in_thatfield() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		sh.getCheckout().clear();
		enterText(sh.getCheckout(), "13/02/2020");
		Thread.sleep(1000);

	}

	@Then("^user enter the total  adults per room$")
	public void user_enter_the_total_adults_per_room() throws Throwable {
		SearchHotel sh  =  new SearchHotel();
		dropDown(sh.getAdultPerRoom(), "2", "value");
		Thread.sleep(1000);

	}

	@Then("^user enter the total childrens per room$")
	public void user_enter_the_total_childrens_per_room() throws Throwable {
	}

	@Then("^user clicks on the Search Button$")
	public void user_clicks_on_the_Search_Button() throws Throwable {
		SearchHotel sh = new SearchHotel();
		clickbtn(sh.getSearchBtn());

	}
	@Then("^it checks for the Location displayed is equal to the Location searched\\.$")
	public void it_checks_for_the_Location_displayed_is_equal_to_the_Location_searched() throws Throwable {
		SelectHotelPage slh = new SelectHotelPage();
		WebElement selectedHotelLocation = slh.getSelectedHotelLocation();
		SearchHotel sh = new SearchHotel();
		WebElement SearchLocation = sh.getLocation();
				Assert.assertEquals(SearchLocation, selectedHotelLocation);
				
	}
		

		@Then("^user enters their Checkin date in that field$")
		public void user_enters_their_Checkin_date_in_that_field() throws Throwable {
			SearchHotel sh  =  new SearchHotel();
			sh.getCheckin().clear();
			enterText(sh.getCheckin(), "10/02/2020");
			Thread.sleep(1000);
						
		}

		@Then("^user enters their Checkout date in thatfield$")
		public void user_enters_their_Checkout_date_in_thatfield() throws Throwable {
			SearchHotel sh  =  new SearchHotel();
			sh.getCheckout().clear();
			enterText(sh.getCheckout(), "13/02/2020");
			Thread.sleep(1000);

		}

		@Then("^user enters the total  adult per room$")
		public void user_enters_the_total_adult_per_room() throws Throwable {
			SearchHotel sh  =  new SearchHotel();
			dropDown(sh.getAdultPerRoom(), "2", "value");
			Thread.sleep(1000);
		}

		@Then("^user enters  total childrens per room$")
		public void user_enters_total_childrens_per_room() throws Throwable {
		}

		@Then("^user click on the Search Button$")
		public void user_click_on_the_Search_Button() throws Throwable {
			SearchHotel sh = new SearchHotel();
			clickbtn(sh.getSearchBtn());
		}

		@Then("^it checks for the Checkin Checkout date displayed is equal to the Checkin and checkout date searched\\.$")
		public void it_checks_for_the_Checkin_Checkout_date_displayed_is_equal_to_the_Checkin_and_checkout_date_searched() throws Throwable {
			SelectHotelPage slh = new SelectHotelPage();
			
		}
		
		
	
}
