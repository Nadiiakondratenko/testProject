package org.example.first.pages;

import org.example.first.framework.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class BasePage {
  protected WebDriver driver;
    public BasePage(){
        this.driver= BrowserFactory.getDriver();
    };
}
