package org.example.first.pages;

import org.example.first.framework.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResult extends BasePage{
       By value = (By.xpath("*//h3[@class='LC20lb MBeuO DKV0Md']"));

   /** public GoogleSearchResult (){
        this.driver= BrowserFactory.getDriver();
    }**/
    public String findActualResult () {
        return driver.findElement(value).getText();
    }
}
