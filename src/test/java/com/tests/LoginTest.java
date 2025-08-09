package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pom.LoginPage;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void testLoginButtonDisabledWhenFieldAreEmpty() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.clearLoginFields();
		
		boolean loginButtonStatus = loginPage.isLoginButtonEnabled();
		System.out.println("Login Button Status : " + loginButtonStatus);
		Assert.assertFalse(loginButtonStatus, "Login button should be disable when fields are empty");
		System.out.println("----------------------------------------------------");
	}
	
	@Test
	public void testPasswordMaskedButton() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setPassword("pass@123");
		
		String passwordFieldType = loginPage.getPasswordFieldType();
		System.out.println("Password field type default : " + passwordFieldType);
		Assert.assertEquals(passwordFieldType, "password", "password should be masked by default..");
		System.out.println("----------------------------------------------------");
	}
	
	@Test
	public void testInvalidLoginShowErrorMsg()  {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.clearLoginFields();
		loginPage.setUserId("onkarpotdar");
		loginPage.setPassword("pass@123");
		loginPage.clickLoginButton();
		
		String errorMessage = loginPage.getErrorMessage();
		System.out.println("Error Message : " + errorMessage);
		
		Assert.assertTrue(
				errorMessage.toLowerCase().contains("invalid") ||
				errorMessage.toLowerCase().contains("incorrect") ||
				errorMessage.toLowerCase().contains("authentication field"), 
				"Expected invalid login error message, but got : " + errorMessage);
		System.out.println("----------------------------------------------------");
	}
	
	@Test
	public void testPasswordMaskingToggle() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setPassword("pass@123");
		
		loginPage.clickToggleButton_1();
		String typeAfterFirstClick = loginPage.getPasswordFieldType();
		System.out.println("Password field type after first click : " + typeAfterFirstClick);
		Assert.assertEquals(typeAfterFirstClick, "text", "Password should be visiable after first click");
		
		loginPage.clickToggleButton_2();
		String typeAfterSecondClick = loginPage.getPasswordFieldType();
		System.out.println("Password field type after second click : " + typeAfterSecondClick);
		Assert.assertEquals(typeAfterSecondClick, "password", "Password should be masked again after second click");
		System.out.println("----------------------------------------------------");
		
	}
	
	@Test
	public void testLoginWithBlankFields() {
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.clearLoginFields();
		loginPage.clickLoginButton();
		
		String errorMessage = loginPage.getErrorMessage();
		System.out.println("Error Message : " + errorMessage);
		
		Assert.assertTrue(errorMessage.contains("required") || errorMessage.contains("Please enter"), "Expected error message for blank fields");
		System.out.println("----------------------------------------------------");
	}
	
	
	
	@Test
    public void testPresenceOfPageElements() {
        LoginPage loginPage = new LoginPage(driver);
        
        //Title
        System.out.println("Page title: " + loginPage.getPageTitle());
        
        // CDSCO LOGO
        boolean cdscoLogoStatus = loginPage.isCdscoLogoDisplayed();
        System.out.println("CDSCO Logo Displayed: " + cdscoLogoStatus);
        Assert.assertTrue(cdscoLogoStatus,"CDSCO logo is missing..");
        
        // ISO LOGO
        boolean isoLogoStatus = loginPage.isIsoLogoDisplayed();
        System.out.println("ISO Logo Displayed: " + isoLogoStatus);
        Assert.assertTrue(isoLogoStatus,"ISO logo is missing..");
        
        // Sub Title
        String subTitle = loginPage.getSubTitle();
        System.out.println("Sub Title : " + subTitle);
        Assert.assertEquals(subTitle, "Your Pregnancy and Newborn Monitoring Partner");
        
        // Username Field
        boolean usernameFieldPresent = loginPage.isUsernameFieldPresent();
        System.out.println("Username Field: " + usernameFieldPresent);
        Assert.assertTrue(usernameFieldPresent,"Username Field is missing..");
        
        // Password Field
        boolean passwordFieldPresent = loginPage.isPasswordFieldPresent();
        System.out.println("Password Field: " + passwordFieldPresent);
        Assert.assertTrue(passwordFieldPresent,"Password Field is missing..");
        
        // Eye-Icon
        boolean eyeIconPresent = loginPage.isEyeIconPresent();
        System.out.println("Eye-Icon : " + eyeIconPresent);
        Assert.assertTrue(eyeIconPresent,"Eye-Icon toggel button is missing..");
        
        // Login Button
        boolean loginButtonPresent = loginPage.isLoginButtonPresent();
        System.out.println("Login Button : " + loginButtonPresent);
        Assert.assertTrue(loginButtonPresent,"Login button is missing..");
        
        // Sub Title
        String partnerSupportTitle = loginPage.getPartnerSupportTitle();
        System.out.println("Partner Support Title : " + partnerSupportTitle);
        Assert.assertEquals(partnerSupportTitle, "Partners & Supporters");
        
        // Carousel Logo
        boolean carouselLogoPresent = loginPage.isCarouselLogoPresent();
        System.out.println("Carousel Logos : " + carouselLogoPresent);
        Assert.assertTrue(carouselLogoPresent,"Carousel Logo is missing..");
        
        System.out.println("----------------------------------------------------");
    }

}
