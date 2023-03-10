package org.example.first.pages;

import org.openqa.selenium.By;

public class MainShopPage extends BasePage {
    By linkShop = (By.xpath("*//h3[@class='LC20lb MBeuO DKV0Md']"));
    By imgLogo = (By.xpath("*//img [@alt='Rozetka Logo']"));
    By searchField = (By.xpath("*//input[@name='search']"));
    By searchButton = (By.xpath("*//button [@class = 'button button_color_green button_size_medium search-form__submit ng-star-inserted']"));

    public void clickShopLink (){

        driver.findElement(linkShop).click();
    }

    public boolean findLogo (){
        driver.findElement(imgLogo);
        return true;
    }

    public void enterSearchValue (String searchValue) {
        driver.findElement(searchField).sendKeys(searchValue);
    }

    public void clickSearchButton (){
        driver.findElement(searchButton).click();
    }

}
