package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

import java.security.PublicKey;

public class RegisterPage extends Utility{

    By signUpText = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstNameField =By.xpath("//input[@id=\"customer.firstName\"]");
    By lastNameField = By.name("customer.lastName");
    By addressField = By.id("customer.address.street");
    By cityField =By.xpath("//input[@name='customer.address.city' or @id='customer.address.city']");
    By stateField =By.xpath("//input[@name='customer.address.state']");
    By zipCodeField = By.id("customer.address.zipCode");
    By phoneNumberField = By.name("customer.phoneNumber");
    By ssnNumberField = By.name("customer.ssn");
    By userNameField =By.name("customer.username");
    By passwordField = By.name("customer.password");
    By confirmPasswordField =By.name("repeatedPassword");
    By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");



    public String getSignUpText(){
        return getTextFromElement(signUpText);
    }
    public void setFirstNameField(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void setLastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void setAddressField(String address){
        sendTextToElement(addressField,address);
    }
    public void setCityField(String city){
        sendTextToElement(cityField,city);
    }
    public void setStateField(String state){
        sendTextToElement(stateField,state);
    }
    public void setZipCodeField(String zipCode){
        sendTextToElement(zipCodeField,zipCode);
    }
    public void setSsnNumberField(String ssn){
        sendTextToElement(ssnNumberField,ssn);
    }
    public void setPhoneNumberField(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }
    public void setUserNameField(String userName){
        sendTextToElement(userNameField,userName);
    }
    public void setPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void setConfirmPasswordField(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegisterButton (){
        clickOnElement(registerButton);
    }

}
