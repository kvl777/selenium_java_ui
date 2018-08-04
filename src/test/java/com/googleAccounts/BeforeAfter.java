package com.googleAccounts;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeforeAfter {

    public ChromeDriver cDriver;
    public LoginPage loginPage;
    public PasswordPage passwordPage;
    public AccountPage accountPage;

    @Before
    public void setUp() {
        cDriver = new ChromeDriver();

        loginPage = new LoginPage(cDriver);
        passwordPage = new PasswordPage(cDriver);
        accountPage = new AccountPage(cDriver);

        cDriver.get("https://accounts.google.com/");
    }

    @After
    public void closeBrowser() {
        if (cDriver != null)
            cDriver.quit();
    }

}
