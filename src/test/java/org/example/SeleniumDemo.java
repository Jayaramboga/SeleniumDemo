package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class SeleniumDemo
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void seleniumDemo()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/downloads/");
    }
}

