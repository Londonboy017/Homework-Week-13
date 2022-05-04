package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.Utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerText = By.xpath("//div[@class='page-title']");
    By femaleRadioButton = By.xpath("//span[@class='female']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By monthofBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By yearofBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");


    public void enterFisrtName(String fname)
    {
        sendTextToElement(firstName,fname);
    }

    public void enterLastName(String lname)
    {
        sendTextToElement(lastName,lname);
    }

    public void selectFemaleRadioButton()
    {
        clickOnElement(femaleRadioButton);
    }


    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void selectDateOfBirth(String date)
    {
        selectByVisibleTextFromDropDown(dateOfBirth,date);
    }

    public void selectMonthOfBirth(String month)
    {
        selectByVisibleTextFromDropDown(monthofBirth,month);
    }

    public void selectYearOfBirth(String year)
    {
        selectByVisibleTextFromDropDown(yearofBirth,year);
    }

    public void enterEmail(String email)
    {
        sendTextToElement(emailId,email);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void enterConfirmPassword(String c_pwd)
    {
        sendTextToElement(confirmPassword,c_pwd);
    }
    public void clickonRegisterButton()
    {
        clickOnElement(registerButton);
    }
}
