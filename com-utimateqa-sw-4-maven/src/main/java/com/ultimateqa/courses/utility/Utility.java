package com.ultimateqa.courses.utility;

import com.google.common.base.Function;

import com.ultimateqa.courses.driverfactory.ManageDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class Utility extends ManageDriver {
    //This method will click on element
    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }

    //This method get text from element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //This method will send text to element
    public void sendTextToElement(By by,String text) {
        driver.findElement(by).sendKeys(text);
    }
    //This method verify the expected text
    public void assertVerifyText(By by,String expectedtext){
        String actualText = getTextFromElement(by);
        String expectedText =expectedtext;
        Assert.assertEquals("Error>Test failed  : ",expectedText,actualText);
    }

    //*********************Alert methods**********************//
    /*
     * This method will switch to the alert
     * */
    public void switchToAlert() {
        driver.switchTo().alert();
    }
    /*
     * This metod will accept the alert
     * */
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    /**
     * This method will get text from alert
     */
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }
    /**
     * This method will dismiss alert
     */
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    /**
     * This method will send text to alert
     */
    public void sendKeysToAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }



    /*********Select class *************/
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void selectByValueFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByValue(text);
    }

    public void selectByIndexFromDropDown(By by, int a) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByIndex(a);
    }
    public void selectByGetAllOptionFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        List<WebElement> allOptions = select.getOptions();
        for (WebElement element : allOptions
        ) {
            //System.out.println(element.getText());//to print all countries
            if (element.getText().equals(text)) {
                element.click();
            }
        }
    }
    //*************************** Window Handle Methods ***************************************//

    /**
     * This method will close all windows
     */
    public void closeAllWindows(List<String> hList, String parentWindow) {
        for (String str : hList) {
            if (!str.equals(parentWindow)) {
                driver.switchTo().window(str).close();
            }
        }
    }

    /**
     * This method will switch to parent window
     */
    public void switchToParentWindow(String parentWindowId) {
        driver.switchTo().window(parentWindowId);
    }

    /**
     * This method will find that we switch to right window
     */
    public boolean switchToRightWindow(String windowTitle, List<String> hList) {
        for (String str : hList) {
            String title = driver.switchTo().window(str).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window....");
                return true;
            }
        }
        return false;
    }

    //*************************** Action Methods ***************************************//
    /**
     * This method will use to hover mouse on element
     */
    public void mouseHoverOnElement (By by){
        Actions actions = new Actions(driver);
        WebElement xyz =driver.findElement(by);
        actions.moveToElement(xyz).build().perform();
    }

    public void clickOnMouseHoverOnElement (By by){
        Actions actions = new Actions(driver);
        WebElement xyz =driver.findElement(by);
        actions.moveToElement(xyz).click().build().perform();
    }
    /**************************************drag and drop***********************************/
    public void  dragAndDrop(By by,By by1){
        Actions actions = new Actions(driver);//object
        WebElement draggable = driver.findElement(by);//from
        WebElement droppable = driver.findElement(by1);//to
        actions.dragAndDrop(draggable,droppable).build().perform();
    }
    //************************** Waits Methods *********************************************//

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitForElementWithFluentWait(By by, int time, int pollingTime) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(time))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(by);
            }
        });
        return element;
    }

}
