package org.example.first.pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{
    By searchResult = (By.xpath("*//a [@class = 'goods-tile__heading ng-star-inserted']"));

    public void clickOnElement (){
        driver.findElement(searchResult).click();
    }
    public String result (){
       return driver.findElement(searchResult).getText();
    }
    public boolean containsWord () {
        String actualResultSentence = result();
        if (actualResultSentence.matches(".* Gerber .*")) {
            return true;
        } else {
            return false;
        }
    }
    //сщ
}
