package com.brianthi.automation.craigslist.pages;

import com.brianthi.automation.craigslist.BasePage;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountPage implements BasePage {

    public static final String URL = "https://accounts.craigslist.org/login/home?lang=en&cc=us";

    @Autowired
    WebDriver webDriver;

    @Override
    public boolean isAt() {
        return URL.equals(webDriver.getCurrentUrl());
    }

    @Override
    public void goTo() {
        webDriver.get(URL);
    }

}
