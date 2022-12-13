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
public class TopMenuTest extends BaseTest {
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
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputerTab();
        Assert.assertEquals("Computers", "Computers");
    }

    @Test(groups = {"smoke", "regression"})
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePage.clickOnElectronicTab();
        Assert.assertEquals("Electronics", "Electronics");
    }

    @Test(groups = {"regression"})
    public void userShouldNavigateToApparelPageSuccessfull() {
        homePage.clickOnApparalTab();
        Assert.assertEquals("Apparel", "Apparel");

    }

    @Test(groups = {"regression"})
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull() {
        homePage.clickOnDigitalDownloadTab();
        Assert.assertEquals("Digital downloads", "Digital downloads");

    }

    @Test(groups = {"regression"})
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePage.clickOnBooksTab();
        Assert.assertEquals("Books", "Books");

    }

    @Test(groups = {"regression"})
    public void userShouldNavigateToJewelryPageSuccessfully() {
        homePage.clickOnJeweleryTab();
        Assert.assertEquals("Jewelry", "Jewelry");

    }

    @Test(groups = {"regression"})
    public void userShouldNavigateToGiftCardsPageSuccessfull() {
        homePage.clickOnGiftCardsTab();
        Assert.assertEquals("Gift Cards", "Gift Cards");

    }
}