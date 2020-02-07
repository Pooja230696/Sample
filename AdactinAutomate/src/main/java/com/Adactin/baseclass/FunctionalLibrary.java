package com.Adactin.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FunctionalLibrary {
	
	public static WebDriver driver;
	public static WebDriver initializeBrowser() {
		try {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\eclipse-workspace\\AdactinAutomate\\src\\test\\resource\\com\\Adactin\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 

		}
		catch (Exception e) {
		e.printStackTrace();
	}
		return driver;
		
	}
		public static void openApp(String url) {
			try {
		
			
				driver.get(url);
			}
		 catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		public  static void enterText(WebElement element,String name) {
			element.sendKeys(name);

		}
	
		public static boolean elementIsDisplayed(WebElement element) {
			boolean displayed = element.isDisplayed();
			return displayed;
		}
		
		public static void clickbtn(WebElement element) {
			element.click();
		}
		
		public static void dropDown(WebElement element, String value, String options) {
			Select s = new Select(element);
			if (options.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (options.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			} else {
				s.selectByVisibleText(value);
			}
		}
		public static void driverquit() {
driver.quit();
		}

		
		public static void  mouseHover(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
			
		}
		public static boolean elementIsDisplayed1 (WebElement element) throws Exception {
			try {
				boolean displayed = element.isDisplayed();
				return displayed;
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception();

			}
		}
		
		

		
		}

