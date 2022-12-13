package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderButton;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dayOfBirthField;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthField;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Company")
    WebElement companyNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField1;

    @CacheLookup
    @FindBy(name = "ConfirmPassword")
    WebElement conformPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;


    public String getRegisterText() {
        Reporter.log(" Will get text " + registerText.toString());
        CustomListeners.test.log(Status.PASS, " Will get text ");
        return getTextFromElement(registerText);
    }

    public void setGenderButton() {
        Reporter.log(" Enter Gender " + genderButton.toString());
        clickOnElement(genderButton);
        CustomListeners.test.log(Status.PASS, " Enter Gender  ");
    }

    public void setFirstName(String firstName) {
        Reporter.log(" Enter Firstname " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
        CustomListeners.test.log(Status.PASS, " Enter Firstname  ");
    }

    public void setLastName(String lastName) {
        Reporter.log(" Enter lastname " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
        CustomListeners.test.log(Status.PASS, " Enter last name  ");
    }

    public void setDayOfBirth(String dayOfBirth) {
        Reporter.log(" Enter day of birth " + dayOfBirthField.toString());
        sendTextToElement(dayOfBirthField, dayOfBirth);
        CustomListeners.test.log(Status.PASS, " Enter day of birth  ");
    }

    public void setMonthOfBirth(String monthOfBirth) {
        Reporter.log(" Enter month of birth " + monthOfBirthField.toString());
        sendTextToElement(monthOfBirthField, monthOfBirth);
        CustomListeners.test.log(Status.PASS, " Enter month of birth  ");
    }

    public void setYearOfBirth(String yearOfBirth) {
        Reporter.log(" Enter year of birth " + yearOfBirthField.toString());
        sendTextToElement(yearOfBirthField, yearOfBirth);
        CustomListeners.test.log(Status.PASS, " Enter year of birth  ");
    }

    public void setCompanyName(String companyName) {
        Reporter.log(" Enter company name " + companyNameField.toString());
        sendTextToElement(companyNameField, companyName);
        CustomListeners.test.log(Status.PASS, " Enter company name  ");
    }

    public void setPasswordField(String passwordField) {
        Reporter.log(" Enter password " + passwordField1.toString());
        sendTextToElement(passwordField1, passwordField);
        CustomListeners.test.log(Status.PASS, " Enter pasword  ");
    }

    public void setConformPasswordField(String conformPassword) {
        Reporter.log(" Enter password " + conformPasswordField.toString());
        sendTextToElement(conformPasswordField, conformPassword);
        CustomListeners.test.log(Status.PASS, " Enter pasword  ");
    }

    public void setRegisterButton() {
        Reporter.log(" Click on register button " + registerButton.toString());
        clickOnElement(registerButton);
        CustomListeners.test.log(Status.PASS, " Click on register button ");
    }

}