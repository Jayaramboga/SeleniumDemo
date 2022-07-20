import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class T1Helloworld{
    public static void main(String[] args) {
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        try {
            driver.get("https://google.com");
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys("q" + Keys.ENTER);

        } finally{
            driver.quit();
        }

        }
        }

