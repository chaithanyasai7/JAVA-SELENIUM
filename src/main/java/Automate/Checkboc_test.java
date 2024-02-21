//package Automate;
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class Checkbox_test
//{
//
//    public static void main(String[] args)
//    {
//        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.spicejet.com/");
//        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//
//    }
//
//}