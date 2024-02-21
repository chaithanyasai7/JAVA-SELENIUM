

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import java.sql.Driver;

import static org.testng.Assert.*;

public class Assertions {
    @Test
    public void method(){
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);

        //String expectedTitle ="HYR Tutorials - Google Search";
        String expectedTitle ="HYR Tutolrials - Google Search";
        String actualTitle = driver.getTitle();
        //assertEquals(actualTitle,expectedTitle);
        assertNotEquals(expectedTitle,actualTitle);


        driver.quit();




    }
}



