package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.junit.Test;
import org.openqa.selenium.By;

public class AccountOverviewPage extends Utility{
    By welcomeText   = By.tagName("h1");
    By logoutLink  = By.xpath("//a[contains(text(),'Log Out')]");
    By loggedInText = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in')]");

    public String getLoggedInText(){
        return  getTextFromElement(loggedInText);
    }

   public String getWelcomeText(){
        return  getTextFromElement(welcomeText);
    }
    public void clickOnLogoutLink(){
        clickOnElement(logoutLink);
    }

}
