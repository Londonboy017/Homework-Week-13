package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CartPage extends Utility {
    By pageText =By.id("page-title");
    By subTotal =By.xpath("//*[@id=\"shopping-cart\"]/ul/li/span/span/span");
    By total =By.xpath("//*[@id=\"cart-right\"]/ul/li[4]/span/span");
    By checkOutButton = By.xpath("//span[text()='Go to checkout']");
    By emptyCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By deletePopUPText =By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By emptyCartMText =By.xpath("//h1[contains(text(),'Your cart is empty')]");


    public String getEmptyCartText(){
        return getTextFromElement(emptyCartMText);
    }
    public String getDeletePopUpMessageText(){
        return getTextFromElement(deletePopUPText);
    }
    public void clickOnEmptyCart(){
        clickOnElement(emptyCart);
    }
    public String getTextSubTotal(){
        return getTextFromElement(subTotal);
    }
    public String  getTextTotal(){
        return getTextFromElement(total);
    }
    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public String getTextPage (){
        return getTextFromElement(pageText);
    }
}
