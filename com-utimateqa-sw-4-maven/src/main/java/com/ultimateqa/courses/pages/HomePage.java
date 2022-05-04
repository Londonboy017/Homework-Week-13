package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

    public void clickOnSignInLink(){
        clickOnElement(signInLink);
    }
}
