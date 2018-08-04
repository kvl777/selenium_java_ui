package com.googleAccounts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
    private ChromeDriver cDriver;
    private WebDriverWait wait;

    public AccountPage(ChromeDriver driver) {
        cDriver = driver;
        wait = new WebDriverWait(cDriver, 30);

        PageFactory.initElements(cDriver, this);
    }

    public void waitUntilLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='paz5i']")));
    }
}
