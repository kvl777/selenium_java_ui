package com.googleAccounts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BeforeAfter {

    @Test
    public void testLoginValid() {

        System.out.println("Test valid login enter");
        System.out.println("Step 1: enter email from the task");
        loginPage.enterLogin("kvl.qae@gmail.com");
        System.out.println("Step 2: click Next button");
        loginPage.clickNextButton();
        System.out.println("Step 3: enter password from the task");
        passwordPage.enterPassword("Qawsedr12345");
        accountPage.waitUntilLoad();

        System.out.println("Check if page title is correct");
        String title = cDriver.getTitle();
        Assert.assertTrue(title.equals("Аккаунт Google"));

    }

    @Test
    public void testNoLogin() {

        System.out.println("Test no login enter");
        System.out.println("Step 1: click Next button leaving Email field empty");
        loginPage.clickNextButton();

        System.out.println("Check if error massage is displayed");
        Assert.assertTrue(cDriver.findElement(By.cssSelector("div[jsname='B34EJ']")).isDisplayed());

    }

}
