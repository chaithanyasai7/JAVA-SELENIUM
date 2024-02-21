package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowsHandlingExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe"); // Correct the system property
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        String parentwindowhandle = driver.getWindowHandle();
        System.out.println("parent window handle--->" + parentwindowhandle + driver.getTitle());
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        for (String windowhandle : windowhandles) {
            if (!windowhandle.equals(parentwindowhandle)) {
                driver.switchTo().window(windowhandle);
                driver.manage().window().maximize();
                driver.findElement(By.id("firstName")).sendKeys("chaithanya");
                String childwindowhandle = driver.getWindowHandle();
                System.out.println("child window handle is"  + childwindowhandle);
                Thread.sleep(3000);
                driver.close();
            }
        }
        driver.switchTo().window(parentwindowhandle);
        driver.findElement(By.id("name")).sendKeys("vadde chaithanya sai");
        Thread.sleep(Long.parseLong("3000"));
        driver.quit();
    }
}


