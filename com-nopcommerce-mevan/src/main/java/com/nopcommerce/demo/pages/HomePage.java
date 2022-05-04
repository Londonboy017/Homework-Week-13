package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By computerLink = By.linkText("Computers");

    public void  selectMenu(String name)
    {
        if (name == "Computers") {
            //find computer tab and click
            clickOnElement(By.linkText("Computers"));


        } else if (name == "Electronics") {
            clickOnElement(By.linkText("Electronics"));

        } else if (name == "Apparel") {
            clickOnElement(By.linkText("Apparel"));

        } else if (name == "Digital downloads") {
            clickOnElement(By.linkText("Digital downloads"));

        } else if (name == "Books") {
            clickOnElement(By.linkText("Books"));

        } else if (name == "Jewelry") {
            clickOnElement(By.linkText("Jewelry"));

        } else if (name == "Gift Cards") {
            clickOnElement(By.xpath("//a[contains(text(),'Gift Cards')]"));

        } else {
            System.out.println("Please enter valid Top-menu name or check actual Top-menu name");
        }
    }

    public void clickOnComputerLink()
    {
        clickOnElement(computerLink);

    }

    public void clickOnDesktopLink()
    {
        clickOnElement(By.linkText("Desktops"));
    }

    public String getWelcomeToOurStoreText()
    {
        return getTextFromElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
    }

    public void mouseHoverONElectronics()
    {
        mouseHoverOnElement(By.linkText("Electronics"));
    }

    public void mouseHoverAndClickONCellPhone()
    {
        clickOnMouseHoverOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]"));
    }

    public String getCellPhoneText()
    {
        return getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
    }

    public void clickOnLogOutLink()
    {
        clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
    }

    public String getCurrentUrl()
    {
        String url = driver.getCurrentUrl();
        return url;
    }

}
