package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class ExplicitWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com/");
        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("Log in")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Email']")));
                driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ccccc@gmail.com");
                driver.quit();
            }
        }
    }
}
