package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By signInButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By checkText = By.xpath("//li[contains(text(),'Invalid email or password.')]");
    By welcomeText = By.xpath("//h1[@class='page__heading']");

    public void setEmailField(String userName) {
        sendTextToElement(emailField, userName);
    }

    public void setPasswordField(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(signInButton);
    }

    public String getErrorText() {
        return getTextFromElement(checkText);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

}
