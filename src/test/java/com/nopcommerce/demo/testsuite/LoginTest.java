package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(loginPage.getWelcomeText(), "Welcome, Please Sign In!", "Welcome, Please Sign In!");
    }

    @Test(groups = {"smoke", "regression"})

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("london2@gmail.com");
        loginPage.enterPassword("london1");
        loginPage.clickOnLoginButton();
        Assert.assertEquals("Log out", "Log out");
    }

    @Test(groups = {"regression"})
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("email@gmail.com");
        loginPage.enterPassword("123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage, "Error message not displayed");

    }
}
