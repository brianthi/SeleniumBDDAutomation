package com.brianthi.automation.craigslist.pages;

import com.brianthi.automation.craigslist.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage implements BasePage {

    public static final String URL = "https://accounts.craigslist.org/login?lang=en&cc=us";
    public static final String LOGOUT_URL = "https://accounts.craigslist.org/logout?lang=en&cc=us";

    @Autowired
    private WebDriver webDriver;

    @FindBy(id = "inputEmailHandle")
    private WebElement emailField;

    @FindBy(id = "inputPassword")
    private WebElement passwordField;

    @FindBy(css = "body > section > section > div > div.accountform.login-box > form > div.accountform-actions > button")
    private WebElement loginSubmitButton;

    @FindBy(css = "body > section > section > div > div.accountform.login-box > form > div.alert.alert-sm.alert-error > p")
    private WebElement loginErrorMessage;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogInButton() {
        loginSubmitButton.click();
    }

    public boolean isLoginErrorDisplayed() {
        return loginErrorMessage.isDisplayed();
    }

    @Override
    public boolean isAt() {
        return URL.equals(webDriver.getCurrentUrl());
    }

    @Override
    public void goTo() {
        webDriver.get(URL);
    }

    public void logout() {
        webDriver.get(LOGOUT_URL);
    }
}
