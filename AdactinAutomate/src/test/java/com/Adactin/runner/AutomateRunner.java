package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.baseclass.FunctionalLibrary;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= { "pretty", "json:src\\test\\resource\\com\\adactin\\reports\\Adactin.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		                    features = "src\\test\\java\\com\\Adactin\\Feature\\",
		                    glue = "com.Adactin.stepdefnition",
		                    dryRun= false,  strict=true,monochrome=true)
		                    
		                 

public class AutomateRunner {
	
	public static WebDriver driver;

	@BeforeClass
	public static void initializeBrowser() {
		FunctionalLibrary.initializeBrowser();

	}
		
	@AfterClass
	public static void writeExtentReport() {
Reporter.loadXMLConfig(System.getProperty("user.dir")+"src\\test\\resource\\com\\Adactin\\props\\ExtentReport.xml");
	}
	}


