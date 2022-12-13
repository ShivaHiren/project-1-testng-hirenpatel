package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(id = "small=-searchterms")
    WebElement searchField;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Computers ']")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Electronics ']")
    WebElement electronicTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Apparel ']")
    WebElement apparalTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Digital downloads ']")
    WebElement digitalDownloadTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Books ']")
    WebElement booksTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Jewelry ']")
    WebElement jeweleryTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Gift Cards ']")
    WebElement giftCardsTab;


    public void clickOnLoginLink() {
        Reporter.log("Click on the login Button " + loginLink.toString());
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on the login Button ");
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on the Register Button " + registerLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on the Register Button ");
    }

    public void enterTextToSearchField(String text) {
        Reporter.log("Enter Text " + registerLink.toString());
        sendTextToElement(registerLink, text);
        CustomListeners.test.log(Status.PASS, "Enter Text ");
    }

    public void clickOnComputerTab() {
        Reporter.log("Click on the Computer Tab " + computerTab.toString());
        clickOnElement(computerTab);
        CustomListeners.test.log(Status.PASS, "Click on the Computer Tab ");
    }

    public void clickOnElectronicTab() {
        Reporter.log("Click on the Electronic Tab " + electronicTab.toString());
        clickOnElement(electronicTab);
        CustomListeners.test.log(Status.PASS, "Click on the Electronic Tab ");
    }

    public void clickOnApparalTab() {
        Reporter.log("Click on the Apparal Tab " + apparalTab.toString());
        clickOnElement(apparalTab);
        CustomListeners.test.log(Status.PASS, "Click on the Apparal Tab ");
    }

    public void clickOnDigitalDownloadTab() {
        Reporter.log("Click on the Digital Download Tab " + digitalDownloadTab.toString());
        clickOnElement(digitalDownloadTab);
        CustomListeners.test.log(Status.PASS, "Click on the Digital Download Tab ");
    }

    public void clickOnBooksTab() {
        Reporter.log("Click on the Books Tab " + booksTab.toString());
        clickOnElement(booksTab);
        CustomListeners.test.log(Status.PASS, "Click on the Books Tab ");
    }

    public void clickOnJeweleryTab() {
        Reporter.log("Click on the Jewelery Tab " + jeweleryTab.toString());
        clickOnElement(jeweleryTab);
        CustomListeners.test.log(Status.PASS, "Click on the Jewelery Tab ");
    }

    public void clickOnGiftCardsTab() {
        Reporter.log("Click on the Gift Cards Tab " + giftCardsTab.toString());
        clickOnElement(giftCardsTab);
        CustomListeners.test.log(Status.PASS, "Click on the Gift Cards Tab ");
    }


}
