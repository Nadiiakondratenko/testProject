package org.example.first.tests;

import org.example.first.framework.BrowserFactory;
import org.example.first.framework.BrowserType;
import org.example.first.demo.LoginGoogle;
import org.example.first.pages.GoogleMainPage;
import org.example.first.pages.GoogleSearchResult;
import org.example.first.pages.MainShopPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends LoginGoogle {
    private LoginGoogle loginGoogle;

    @BeforeClass
        public void initDriver () {
        BrowserFactory.initDriver(BrowserType.GC);
        WebDriver driver = BrowserFactory.getDriver();
    }

    @Test
    public void openGoogle() {

        /**String expectedValue = "Speedtest by Ookla - The Global Broadband Speed Test";
        String text="Speedtest by Ookl";**/

        String expectedValue = "Интернет-магазин ROZETKA™: официальный сайт самого ...";
        String text="ROZETKA";

        //Launch website
        GoogleMainPage mainPage = new GoogleMainPage();
        mainPage.openMainPage()
                .closeTermCond()
                .inputSearchText(text)
                .clickSearchButton();

        GoogleSearchResult searchResultPage = new GoogleSearchResult();
        String actualResult = searchResultPage.findActualResult();
       Assert.assertEquals(actualResult, expectedValue);
    }
    @Test
    public void openShop (){
        boolean expectedResult = true;
        MainShopPage shopPage = new MainShopPage();
        shopPage.clickShopLink();
        boolean actualResult = shopPage.findLogo();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @AfterClass
    public void closeBrowser (){
        BrowserFactory.closeDriver();
    }


}
