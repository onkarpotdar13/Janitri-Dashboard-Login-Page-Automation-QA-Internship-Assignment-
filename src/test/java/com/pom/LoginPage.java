package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	// constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	// locators
	@FindBy(css = "img[alt='CDSCO']")
	WebElement cdscoLogo;
	
	@FindBy(css = "img[alt='ISO ']")
	WebElement isoLogo;
	
	@FindBy(css = ".sub-title")
	WebElement subTitle;
	
	@FindBy(css = "#formEmail")
	WebElement txt_userid;	
	
	@FindBy(css = "#formPassword")
	WebElement txt_password;
	
	@FindBy(css = "img[alt='Password Not Visible']")
	WebElement tgl_eye_icon_1;
	
	@FindBy(css = "img[alt=' Password Visible']")
	WebElement tgl_eye_icon_2;
	
	@FindBy(css = "button[type='submit']")
	WebElement btn_login;
	
	@FindBy(css = ".partner-and-supporter")
	WebElement partner_support_title;
	
	@FindBy(css = ".logo-carousel")
	WebElement carousel_logo;
	
	@FindBy(css = "div.invalid-credential-div")
	WebElement error_message;

	
	// action methods
	public void clearLoginFields() {
		txt_userid.clear();
		txt_password.clear();
	}
	
	public boolean isLoginButtonEnabled() {
		try {
			return btn_login.isEnabled();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void setUserId(String userID) {
		txt_userid.sendKeys(userID);
	}
	
	public void setPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btn_login.click();
	}
	
	public void clickToggleButton_1() {
		tgl_eye_icon_1.click();
	}
	
	public void clickToggleButton_2() {
		tgl_eye_icon_2.click();
	}
	
	public String getPasswordFieldType() {
		return txt_password.getAttribute("type");
	}
	
	public String getErrorMessage() {
		try {
			return error_message.getText();
		}catch(Exception e) {
			return "";
		}
	}
	
	
	public String getPageTitle() {
        return driver.getTitle();
    }
	
	public boolean isCdscoLogoDisplayed() {
		try {
			return cdscoLogo.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean isIsoLogoDisplayed() {
		try {
			return isoLogo.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getSubTitle() {
		return subTitle.getText();
	}
	
	public boolean isUsernameFieldPresent() {
		try {
			return txt_userid.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean isPasswordFieldPresent() {
		try {
			return txt_password.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean isEyeIconPresent() {
		try {
			return tgl_eye_icon_1.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean isLoginButtonPresent() {
		try {
			return btn_login.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public String getPartnerSupportTitle() {
		return partner_support_title.getText();
	}
	
	public boolean isCarouselLogoPresent() {
		try {
			return carousel_logo.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	

}
