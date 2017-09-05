package com.brianthi.automation;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Configuration
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber"},
                 features = "src/test/resources/com/brianthi/automation/craigslist")
public class CraigslistChromeTestRunner {

    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        return new ChromeDriver();
    }

}
