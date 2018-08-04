package com.googleAccounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasswordPage {
    private ChromeDriver cDriver;
    private WebDriverWait wait;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(id = "passwordNext")
    WebElement nextButton;

    public PasswordPage(ChromeDriver driver) {
        cDriver = driver;
        wait = new WebDriverWait(cDriver, 30);

        PageFactory.initElements(cDriver, this);
    }

    public void enterPassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='password']")));
        passwordField.sendKeys("Qawsedr12345");
        nextButton.click();
    }
}
