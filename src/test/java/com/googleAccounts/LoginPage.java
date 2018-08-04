package com.googleAccounts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private ChromeDriver cDriver;

    @FindBy(css = "input[type='email']")
    WebElement loginField;

    @FindBy(id = "identifierNext")
    WebElement nextButton;

    public LoginPage(ChromeDriver driver) {
        cDriver = driver;

        PageFactory.initElements(cDriver, this);
    }

    public void enterLogin(String text) {
        loginField.sendKeys(text);
    }

    public void clickNextButton() {
        nextButton.click();
    }
}
