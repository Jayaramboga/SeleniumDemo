package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Basic1 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //driver.get("https://www.google.com/intl/en-GB/gmail/about/");
        /*driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("The page title is : " +title);
        WebElement searchBox = driver.findElement(By.id("input"));
        //WebElement searchButton = driver.findElement(By.name("btnK"));
        WebElement searchButton = driver.findElement(By.id("input"));
        searchBox.sendKeys("Selenium");
        //searchButton.click();
        driver.findElement(By.name("Google Search")).click();*/
        String baseUrl = "http://demo.guru99.com/test/login.html";
        driver.get(baseUrl);

        // Get the WebElement corresponding to the Email Address(TextField)
        WebElement email = driver.findElement(By.id("email"));

        // Get the WebElement corresponding to the Password Field
        WebElement password = driver.findElement(By.name("passwd"));

        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        System.out.println("Text Field Set");

        // Deleting values in the text box
        email.clear();
        password.clear();
        System.out.println("Text Field Cleared");

        // Find the submit button
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        // Using click method to submit form
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcdefghlkjl");
        login.click();
        System.out.println("Login Done with Click");

        //using submit method to submit the form. Submit used on password field
        driver.get(baseUrl);
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
        driver.findElement(By.id("SubmitLogin")).submit();
        System.out.println("Login Done with Submit");
    }
}
