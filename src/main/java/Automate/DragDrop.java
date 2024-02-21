package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop
{
    public static void main(String[] args) {
        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement element =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(element);
        actions.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']"))).perform();
    }
}
