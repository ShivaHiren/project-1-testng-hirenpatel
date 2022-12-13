package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void UserShouldNavigateToRegisterPageSuccessfully() {
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(), "Register", "Register");

    }

    @Test(groups = {"smoke", "regression"})
    public void userSholdRegisterAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        Assert.assertEquals(registerPage.getRegisterText(), "Register", "Register");
        registerPage.setGenderButton();
        registerPage.setFirstName("London");
        registerPage.setLastName("King");
        registerPage.setDayOfBirth("1");
        registerPage.setMonthOfBirth("January");
        registerPage.setYearOfBirth("2000");
        loginPage.enterEmailId("london2@gmail.com");
        registerPage.setCompanyName("Prime");
        registerPage.setPasswordField("london1");
        registerPage.setConformPasswordField("london1");
        registerPage.setRegisterButton();
        Assert.assertEquals("Your registration completed", "Your registration completed");

    }
}