package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class HomePage extends Utility {
    By shippingLink = By.linkText("Shipping");
    By newLink =By.linkText("New!");
    By comingSoonLink = By.linkText("Coming soon");
    By contactUsLink =By.linkText("Contact us");
    By hotDealMouseHover =By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");
    By sale =By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='sale_products/']");
    By bestsellers =By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/ul[1]/li[2]/child::a");

    public void mouseHoverOnHotDeal (){
        mouseHoverOnElement(hotDealMouseHover);
    }
    public void clickOnSale(){
        clickOnElement(sale);
    }
    public void clickOnBestSellers(){
        clickOnElement(bestsellers);
    }


    public void clickOnShippingLink(){
        clickOnElement(shippingLink);
    }
    public void clickOnNewLink(){
        clickOnElement(newLink);
    }

    public void clickOnComingSoonLink(){
        clickOnElement(comingSoonLink);
    }
    public void clickOnContactUsLink(){
        clickOnElement(contactUsLink);
    }

}
