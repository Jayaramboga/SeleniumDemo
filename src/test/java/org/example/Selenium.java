package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
    @Test
    public void display()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        WebDriver  driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bing.com/search?q=selenium+documentation&cvid=108f01393fe347abba2d92a19e3015da&aqs=edge.1.69i57j0l8j69i11004.9486j0j1&pglt=2083&FORM=ANNAB1&PC=U531&ntref=1");
    }
}
