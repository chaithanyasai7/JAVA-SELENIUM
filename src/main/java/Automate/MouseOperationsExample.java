package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsExample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[2]/div[1]/span[1]")));
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"))).click().perform();
        driver.navigate().back();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.name("field-keywords"))).click().sendKeys("sweatshirts").doubleClick().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"))).contextClick().perform();




    }
}
