package Automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe"); // Correct the system property
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
       // driver.get("https://www.hyrtutorials.com/");
       JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = (WebElement) js.executeScript("return document.getElementById(\"email\");");
        //WebElement element = (WebElement) ((JavascriptExecutor) driver).executeScript("return document.getElementById(\"email\");");
        element.sendKeys("id");
        //js.executeScript("document.getElementById(\"email\").value='chaithu';");
//        js.executeScript("document.getElementsByName('login')[0].click();");
//        js.executeScript("document.getElementById(\"email\").style.border='10px red solid';");
//        js.executeScript("document.getElementById(\"email\").style.backgrond='purple';");
//        js.executeScript("document.getElementById(\"email\").setAttribute('style','border:10px red solid;background:green');");
//        Thread.sleep(Long.parseLong(("2000")));
//        js.executeScript("window.scrollTo(0,500);");
//        Thread.sleep(Long.parseLong(("4000")));
//        js.executeScript("window.scrollBy(0,500);");
//        Thread.sleep(Long.parseLong(("5000")));
//        js.executeScript("document.getElementById('ty_footer').scrollIntoView();");

    }
}


