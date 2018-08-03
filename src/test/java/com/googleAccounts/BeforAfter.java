package com.googleAccounts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforAfter {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
    }

    @After
    public void close() {
        driver.quit();
    }
}
