package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class RegisterPage extends Utility {

    By genderRadioMale = By.id("gender-male");
    By firstNameField = By.name("FirstName");
    By lastNameField = By.name("LastName");
    By dateDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By monthDropDown =By.xpath("//select[@name='DateOfBirthMonth']");
    By yearDropDown =By.xpath("//select[@name='DateOfBirthYear']");
    By emailField = By.id("Email");
    By passwordField = By.cssSelector("#Password");
    By confirmPasswordField =By.name("ConfirmPassword");
    By registerButton  =By.name("register-button");
    By actualRegisterText = By.xpath("//div[contains(text(),'Your registration completed')]");


    public void selectGenderRadio(){
        clickOnElement(genderRadioMale);
    }
    public void sendTextToFirstNameField(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void sendTextToLastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void selectDOBDropDown(String date,String month,String year){
        selectByVisibleTextFromDropDown(dateDropDown,date);
        selectByVisibleTextFromDropDown(monthDropDown,month);
        selectByVisibleTextFromDropDown(yearDropDown,year);
    }
    public void sendTextToEmailField(String email){
        sendTextToElement(emailField,email);
    }
    public void sendTextToPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void sendTextToConfirmPasswordField(String password){
        sendTextToElement(confirmPasswordField,password);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
    }
    public String registrationMessage(){
        return getTextFromElement(actualRegisterText);
    }



}
