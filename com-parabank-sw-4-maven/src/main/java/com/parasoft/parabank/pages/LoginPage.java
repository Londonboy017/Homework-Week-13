package com.parasoft.parabank.pages;


import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility{
    By userNameField = By.xpath("//input[@name=\"username\"]");
    By passwordField = By.xpath("//input[@name=\"password\"]");
    By loginButton = By.xpath("//input[@value=\"Log In\"]");
    By customerText = By.xpath("//h2[contains(text(),'Customer Login')]");
    By errorText = By.xpath("//p[contains(text(),'The username and password could not be verified.')]");
    By registerLink = By.xpath("//a[contains(text(),'Register')]");

    public void setUserNameField(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void setPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getCustomerText() {
        return getTextFromElement(customerText);
    }

    public String getErrorText() {
        return getTextFromElement(errorText);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
}
