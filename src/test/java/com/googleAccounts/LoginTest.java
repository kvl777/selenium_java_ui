package com.googleAccounts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends BeforeAfter {

    @Test
    public void testLoginValid() {

        loginPage.enterLogin("kvl.qae@gmail.com");
        loginPage.clickNextButton();
        passwordPage.enterPassword("Qawsedr12345");
        accountPage.waitUntilLoad();

        String title = cDriver.getTitle();
        Assert.assertTrue(title.equals("Аккаунт Google"));

    }

    @Test
    public void testNoLogin() {

        loginPage.clickNextButton();

        Assert.assertTrue(cDriver.findElement(By.cssSelector("div[jsname='B34EJ']")).isDisplayed());

    }

}
