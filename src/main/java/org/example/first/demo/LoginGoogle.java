package org.example.first.demo;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginGoogle {
 //  WebDriver driver = new ChromeDriver();
    public void test() {

        //WebDriver driver = new FirefoxDriver();
     WebDriver driver = new ChromeDriver();
       //WebDriver driver = new EdgeDriver();
       // StartChromeDriver scd = new StartChromeDriver(driver);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String expected_value = "Speedtest by Ookla - The Global Broadband Speed Test";

        //Launch website


       //navigateToGoogle();
        GoogleSearchPage lc = new GoogleSearchPage();
        lc.navigateToGoogle();
     /**  String page = "http://www.google.pl/";
       driver.navigate().to(page);
       driver.manage().window().maximize();**/



        WebElement tc = driver.findElement(By.xpath(".//*[@id='L2AGLb']"));
        tc.click();

        WebElement search_field = driver.findElement(By.xpath("./html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        search_field.sendKeys("Speedtest by Ookla");
        WebElement search_button = driver.findElement(By.xpath("./html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        search_button.click();

        WebElement value = driver.findElement(By.xpath("./html/body/div[7]/div/div[11]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
        String actual_value = value.getText();
        System.out.println(actual_value);


        Assert.assertEquals(actual_value, expected_value);

        //Close the Browser.
      //  driver.close();

    }
  /** void navigateToGoogle () {
      // WebDriver driver = new ChromeDriver();

      String page = "http://www.google.pl/";
      driver.navigate().to(page);
      driver.manage().window().maximize();
   }**/
}