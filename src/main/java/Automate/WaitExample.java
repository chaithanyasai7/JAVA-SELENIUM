package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitExample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe"); // Correct the system property
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#search h3")));
        System.out.println("First search result: " + searchResult.getText());

        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);
        WebElement feelingLuckyBtn = fluentWait.until(ExpectedConditions.elementToBeClickable(By.className("RNmpXc")));
        feelingLuckyBtn.click();

        driver.quit();
    }
}
