package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "")
    WebElement logoutButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;


    public String getWelcomeText() {
        Reporter.log(" Will get text from element " + welcomeText.toString());
        CustomListeners.test.log(Status.PASS, "Will get text from element");
        return getTextFromElement(welcomeText);

    }

    public void enterEmailId(String email) {
        Reporter.log(" Enter email Id " + emailField.toString());
        sendTextToElement(emailField, email);
        CustomListeners.test.log(Status.PASS, " Enter email Id  ");
    }

    public void enterPassword(String password) {
        Reporter.log(" Enter password " + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, " Enter password ");
    }

    public void clickOnLoginButton() {
        Reporter.log(" Click on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, " Click on Login Button ");
    }

    public String getErrorMessage() {
        Reporter.log(" Will get errror message " + errorMessage.toString());
        CustomListeners.test.log(Status.PASS, "  ");
        return getTextFromElement(errorMessage);
    }

    public void clickOnLogoutButton() {
        Reporter.log(" Click on Logout Button " + logoutButton.toString());
        clickOnElement(logoutButton);
        CustomListeners.test.log(Status.PASS, " Click on Logout Button");
    }
}
