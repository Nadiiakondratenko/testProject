package org.example.first.pages;

import org.example.first.framework.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleMainPage extends BasePage{
    By tc = By.id("L2AGLb");
    By searchInputField = By.xpath("*//form/descendant::input");

    By searchButton = By.xpath("*//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']");


   /** public GoogleMainPage(){
        this.driver= BrowserFactory.getDriver();
    };**/

    public GoogleMainPage openMainPage(){
        String page = "http://www.google.pl/";
        driver.navigate().to(page);
        return this;
    }
    public GoogleMainPage closeTermCond (){
        driver.findElement(tc).click();
        return this;
    }

    public GoogleMainPage inputSearchText(String text){
        driver.findElement(searchInputField).sendKeys(text);
        return  this;
    }

    public void clickSearchButton () {
      driver.findElement(searchButton).click();
    }

}
