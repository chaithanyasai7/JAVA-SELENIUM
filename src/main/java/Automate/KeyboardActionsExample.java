package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demoqa.com/text-box");

        WebElement textBox = driver.findElement(By.id("userName"));

        textBox.sendKeys("Hello, World!");

        Actions actions = new Actions(driver);


        Thread.sleep(2000);
        actions.sendKeys(textBox, Keys.ARROW_DOWN).perform(); // Press Down Arrow key
        Thread.sleep(2000);
        actions.sendKeys(textBox, Keys.ARROW_UP).perform(); // Press Up Arrow key
        Thread.sleep(2000);
        actions.sendKeys(textBox, Keys.ARROW_LEFT).perform(); // Press Left Arrow key
        Thread.sleep(2000);
        actions.sendKeys(textBox, Keys.ARROW_RIGHT).perform(); // Press Right Arrow key
        Thread.sleep(2000);
        actions.sendKeys(textBox, Keys.SPACE).perform(); // Press Space key
        Thread.sleep(2000);


    }
}



