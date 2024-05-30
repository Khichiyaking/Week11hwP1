package commen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CommenTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        driver = new ChromeDriver();
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void closeBrowser(){driver.quit();}
}

