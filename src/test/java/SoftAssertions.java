import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class SoftAssertions
{
    @Test
    public void method() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        driver.findElement(By.id("email")).sendKeys("wedfefefee", Keys.ENTER);
        Thread.sleep(5000);

        String actualTile = driver.getTitle();
        String expectedTitle = "Log in to Facebook";
        assertEquals(expectedTitle,actualTile,"title is mismatched");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100";
        assertEquals(expectedUrl,actualUrl,"url is mismatched");

        SoftAssert softAssert = new SoftAssert();

        String actualText = driver.findElement(By.name("email")).getAttribute("value");
        String expectedText ="";
        softAssert.assertEquals(expectedText,actualText,"text is mismatched");

        String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
        String expectedBorder ="0.666667px solid rgb(240, 40, 73)";
        softAssert.assertEquals(expectedBorder,actualBorder,"border is mismatched");

        String actualerrormsg = driver.findElement(By.xpath("//div[@id='email_container']//div[2]")).getText();
        String expectederrormsg ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        softAssert.assertEquals(expectederrormsg,actualerrormsg,"msg is wrong");


       // System.out.println(driver.getTitle());
        driver.quit();
        softAssert.assertAll();










    }
}
