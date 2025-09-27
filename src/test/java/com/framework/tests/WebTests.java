package com.framework.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.framework.libs.WEB;

public class WebTests {

  

    @Test
    public void testGoogleSearch() {
        WEB.openUrl("https://www.google.com");
        WEB.typeText(By.name("q"), "Selenium WebDriver");
        WEB.click(By.name("btnK"));

        String title = WEB.getText(By.tagName("h3"));
        Assert.assertTrue(title.toLowerCase().contains("selenium"));
    }

    @AfterClass
    public void tearDown() {
        WEB.quit();
    }
}

