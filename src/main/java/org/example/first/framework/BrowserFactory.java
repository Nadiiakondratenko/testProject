package org.example.first.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BrowserFactory {
    private static WebDriver driver;
    public static void initDriver (BrowserType browser) {
        switch (browser){
            case GC:
                driver = new ChromeDriver ();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
            case EDGE:
                driver = new EdgeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().window().maximize();
                break;
        }
    }
    public static WebDriver getDriver(){

        return driver;
    }
    public static void closeDriver (){
        if (driver!=null) {
            driver.close();
        }
    }
}
