package homepage;

import commen.CommenTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends CommenTest {
    String baseUrl= "https://demo.nopcommerce.com/";

    @Before
    public void setBaseUrl(){openBrowser(baseUrl);}

    public void selectMenu(String menu){
        driver.findElement(By.linkText(menu)).click();
    }
    @Test
    public void verifyPageNavigation(){
        String menu = "Computers";
        selectMenu(menu);
        String expectedWord = menu;
        String actualWord= driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(actualWord,expectedWord);
        driver.quit();

    }

}
