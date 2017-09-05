package com.brianthi.automation.craigslist;

public interface BasePage {

    /**
     * Checks to see if the browser is currently at the page's URL.
     */
    boolean isAt();

    /**
     * Navigates to the implementing page's URL.
     */
    void goTo();
}
