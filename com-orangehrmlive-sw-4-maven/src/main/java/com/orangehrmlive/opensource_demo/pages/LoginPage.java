package com.orangehrmlive.opensource_demo.pages;


import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("txtUsername");
    By passwordField = By.name("txtPassword");
    By loginButton   = By.className("button");
    By welcomeText   = By.id("welcome");
    By forgetPasswordLink  = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By forgetPasswordText  = By.tagName("h1");

    public void setUserNameField(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void setPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return  getTextFromElement(welcomeText);
    }
    public void clickOnForgetPasswordLink(){
        clickOnElement(forgetPasswordLink);
    }
    public String getForgetPasswordText(){
        return getTextFromElement(forgetPasswordText);
    }

}
