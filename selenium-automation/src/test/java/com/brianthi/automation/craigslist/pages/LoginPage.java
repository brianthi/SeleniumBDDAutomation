package com.brianthi.automation.craigslist.pages;

import com.brianthi.automation.craigslist.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginPage implements BasePage {

    public static final String URL = "https://accounts.craigslist.org/login";

    @Autowired
    private WebDriver webDriver;

    @FindBy(id = "inputEmailHandle")
    private WebElement emailField;

    @FindBy(id = "inputPassword")
    private WebElement passwordField;

    @FindBy(css = "body > section > section > div > div.accountform.login-box > form > div.accountform-actions > button")
    private WebElement loginSubmitButton;

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogInButton() {
        loginSubmitButton.click();
    }

    @Override
    public boolean isAt() {
        return URL.equals(webDriver.getCurrentUrl());
    }

    @Override
    public void goTo() {
        webDriver.get(URL);
    }

}
