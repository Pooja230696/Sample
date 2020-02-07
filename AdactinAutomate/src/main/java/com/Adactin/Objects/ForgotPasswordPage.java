package com.Adactin.Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.FunctionalLibrary;

public class ForgotPasswordPage extends FunctionalLibrary{
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private  WebElement ForgotPasswordLink;
	
	
	@FindBy(className="login_title")
	private WebElement ForgotPasswordFormHeader;
	
	@FindBy(id="emailadd_recovery")
	private WebElement RecoveryEmailField;
	
	@FindBy(id="Submit")
	private WebElement EmailPaswrdBtn;
	
	@FindBy(id="Reset")
	private WebElement ResetBtn;

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}

	public WebElement getForgotPasswordFormHeader() {
		return ForgotPasswordFormHeader;
	}

	public WebElement getRecoveryEmailField() {
		return RecoveryEmailField;
	}

	public WebElement getEmailPaswrdBtn() {
		return EmailPaswrdBtn;
	}

	public WebElement getResetBtn() {
		return ResetBtn;
	}
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	

}
