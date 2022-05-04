package com.herokuapp.the_internet.pages;

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("username");
    By passwordField = By.name("password");
    By loginButton   = By.cssSelector("i.fa.fa-2x.fa-sign-in");
    By secureAreaText= By.tagName("h2");
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
    public String getSecureAreaText(){
        return  getTextFromElement(secureAreaText);
    }
    public String getUserNameErrorText(){
        return getTextFromElement(userNameText);
    }
    public String getPasswordErrorText(){
        return getTextFromElement(passwordText);
    }

}
