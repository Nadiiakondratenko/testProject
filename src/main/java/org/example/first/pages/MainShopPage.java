package org.example.first.pages;

import org.openqa.selenium.By;

public class MainShopPage extends BasePage {
    By linkShop = (By.xpath("*//h3[@class='LC20lb MBeuO DKV0Md']"));
    By imgLogo = (By.xpath("*//img [@alt='Rozetka Logo']"));

    public void clickShopLink (){
        driver.findElement(linkShop).click();
    }

    public boolean findLogo (){
        driver.findElement(imgLogo);
        return true;
    }

}
