package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton   = By.id("login-button");
    By checkText= By.xpath("//span[contains(text(),'Products')]");
    By userNameText  = By.xpath("//div[@id='flash']");
    By passwordText  = By.xpath("//div[@id='flash']");

    public void setUserNameField(String userName){
     sendTextToElement(userNameField,userName);
    }
    public void setPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getCheckText(){
        return  getTextFromElement(checkText);
    }
    public String getUserNameErrorText(){
        return getTextFromElement(userNameText);
    }
    public String getPasswordErrorText(){
        return getTextFromElement(passwordText);
    }

}
