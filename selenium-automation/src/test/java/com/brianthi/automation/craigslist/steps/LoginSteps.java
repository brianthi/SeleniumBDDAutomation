package com.brianthi.automation.craigslist.steps;

import com.brianthi.automation.craigslist.pages.AccountPage;
import com.brianthi.automation.craigslist.pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

@ContextConfiguration("classpath:cucumber.xml")
public class LoginSteps {

    @Autowired
    WebDriver webDriver;

    @Autowired
    LoginPage loginPage;

    @Autowired
    AccountPage accountPage;

    @Before
    public void before()
    {
        PageFactory.initElements(webDriver, loginPage);
    }

    @Given("^On Craigsist login page$")
    public void givenOnCraigslistLoginPage() {
        loginPage.goTo();
        assertTrue(loginPage.isAt());
    }

    @When("^Submit valid email:(.*) and password:(.*)$")
    public void whenSubmitValidEmailAndPassword(String email, String password) {
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
        loginPage.clickLogInButton();
    }

    @Then("^Redirected to account page$")
    public void thenCurrentlyOnAccountPage() {
        assertTrue(accountPage.isAt());
    }

}