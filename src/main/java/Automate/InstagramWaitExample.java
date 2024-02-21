package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;

public class InstagramWaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));


        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        driver.get("https://www.instagram.com/");


        WebElement loginButtonImplicit = driver.findElement(By.xpath("//a[text()='Log in']"));
        loginButtonImplicit.click();


        WebElement loginButtonExplicit = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));
        loginButtonExplicit.click();


        WebElement loginButtonFluent = fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log in']")));
        loginButtonFluent.click();


        driver.quit();
    }
}

