package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By pageText= By.xpath("//h3[contains(text(),'Log in to your account')]");
    By emailField =By.id("email");
    By continueButton =By.xpath("//span[contains(text(),'Continue')]");
    By secureCheckOut =By.xpath("//*[@id=\"content\"]/div/div/div/div/div/h1");
    By firstNameField = By.id("shippingaddress-firstname");
    By lastNameField = By.id("shippingaddress-lastname");
    By addressField = By.id("shippingaddress-street");
    By cityField =By.id("shippingaddress-custom-state");
    By checkBox =By.xpath("//input[@id='create_profile']");
    By passwordField = By.xpath("//input[@id='password']");
    By localShipping = By.id("method128");
    By paymentMethodCOD =By.id("pmethod6");
    By totalPrice =By.xpath("//*[@id='content']/div/div/div/div/div/div/div[2]/div[2]/div[1]/div[3]/span[2]/span/span");
    By placeOrderButton = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/button[1]");
    By confirmationText = By.xpath("//h1[@id='page-title']");


public void setFirstNameField(String firstName){
    sendTextToElement(firstNameField,firstName);
}
public void setLastNameField(String lastName){
    sendTextToElement(lastNameField,lastName);
}
public void setAddressField(String address){
    sendTextToElement(addressField,address);
}
public void  setCityField(String city){
    sendTextToElement(cityField,city);
}
public void clickOnCheckBox(){
    clickOnElement(checkBox);
}
public void setPasswordField(String password){
    sendTextToElement(passwordField,password);
}
public void clickOnLocalShipping(){
    clickOnElement(localShipping);
}
public void clickOnCODPaymentMethod(){
    clickOnElement(paymentMethodCOD);
}
public String getTotalPriceText() throws InterruptedException {
    Thread.sleep(1000);
    return getTextFromElement(totalPrice);
}
public void clickOnPlaceOrder() throws InterruptedException {
    Thread.sleep(1000);
    clickOnElement(placeOrderButton);
}
public String getConformationText(){
    return getTextFromElement(confirmationText);
}




    public String  getPageText(){
        return getTextFromElement(pageText);
    }
    public void setEmailField(String email){
        sendTextToElement(emailField,email);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public String getSecureCheckOutText(){
        return getTextFromElement(secureCheckOut);
    }
}
