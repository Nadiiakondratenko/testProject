package org.example.first.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
   String page = "http://www.google.pl/";
    void navigateToGoogle () {
        WebDriver driver = new ChromeDriver();


        driver.navigate().to(page);
        driver.manage().window().maximize();
    }
}
