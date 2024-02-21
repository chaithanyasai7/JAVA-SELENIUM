package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AlertsExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
        Thread.sleep(3000);

        WebElement firstElement = driver.findElement(By.xpath("//input[@id='alertexamples']"));
        firstElement.click();
        Thread.sleep(3000);
        org.openqa.selenium.Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        WebElement secondElement = driver.findElement(By.xpath("//input[@id='confirmexample']"));
        secondElement.click();
        Thread.sleep(3000);
        org.openqa.selenium.Alert secondAlert = driver.switchTo().alert();
        secondAlert.dismiss();

        WebElement thirdElement = driver.findElement(By.xpath("//input[@id='promptexample']"));
        thirdElement.click();
        Thread.sleep(3000);
        org.openqa.selenium.Alert thirdAlert = driver.switchTo().alert();
        thirdAlert.sendKeys("HEY BRO!");
        Thread.sleep(3000);
        thirdAlert.accept();


    }
}
