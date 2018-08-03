package com.googleAccounts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends BeforAfter {

    @Test
    public void testLoginValid() {

        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kvl.qae@gmail.com");
        driver.findElement(By.id("identifierNext")).click();

        WebElement nextButton = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));

        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Qawsedr12345");
        driver.findElement(By.id("passwordNext")).click();

        WebElement searchBar = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='paz5i']")));

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Аккаунт Google"));

    }

    @Test
    public void testLoginNotValid() {

        driver.findElement(By.id("identifierNext")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("div[jsname='B34EJ']")).isDisplayed());

    }

}
