package com.kodilla.testing2;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by ola on 30/11/2017.
 */
public class MyTest {

    public static final String XPATH_LOGIN_BUTTON = "/html/body/div[1]/div[2]/a[1]";
    public static final String TRELLO_URL = "https://trello.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driverTrello.get(TRELLO_URL);

        WebElement loginButton = driverTrello.findElement(By.xpath(XPATH_LOGIN_BUTTON));
        loginButton.click();

        driverTrello.findElement(By.id("user")).sendKeys("aleksandraksiazek");
        driverTrello.findElement(By.id("password")).sendKeys("MartynaHinz1988");
        driverTrello.findElement(By.id("login")).submit();

        Thread.sleep(2000);


    }
}
