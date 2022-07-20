
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Welcome{
    public static void main(String[] args) {
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver","C:\\Selenium-Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        //WebElement searchBox = driver.findElement(By.name("q"));
        WebElement gmaillink = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
        gmaillink.click();
        //WebElement searchButton = driver.findElement(By.name("btnK"));
        //searchBox.sendKeys("Selenium");
        //searchButton.click();
//        driver.quit();



    }
}
