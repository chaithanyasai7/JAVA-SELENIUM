package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("employees_c"));
        Select select = new Select(element);

        select.selectByValue("level2");
        Thread.sleep(5000);

        select.selectByIndex(6);
        Thread.sleep(2000);

        select.selectByVisibleText("101 - 250 employees");
        Thread.sleep(2000);



    }
}
