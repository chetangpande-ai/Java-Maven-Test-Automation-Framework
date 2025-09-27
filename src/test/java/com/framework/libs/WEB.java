package com.framework.libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEB {
    private static  WebDriver driver;

    public WEB() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openUrl(String url) {
        driver.get(url);
    }

    public static void typeText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public static void click(By locator) {
        driver.findElement(locator).click();
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
