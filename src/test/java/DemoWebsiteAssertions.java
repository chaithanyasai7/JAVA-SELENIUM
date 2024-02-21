import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebsiteAssertions {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void testRegistrationForm() {
        // Find elements
        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement genderFemale = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement phoneNumberInput = driver.findElement(By.id("userNumber"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        // Fill out the registration form
        firstNameInput.sendKeys("John");
        lastNameInput.sendKeys("Doe");
        emailInput.sendKeys("johndoe@example.com");
        genderFemale.click();
        phoneNumberInput.sendKeys("1234567890");
        submitButton.sendKeys(Keys.RETURN);

        // Assertions
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "DEMOQA", "Page title is not as expected.");

//        WebElement confirmationMessage = driver.findElement(By.xpath("//div[@class='modal-body']"));
//        Assert.assertTrue(confirmationMessage.isDisplayed(), "Confirmation message is not displayed.");

//        String actualMessage = confirmationMessage.getText();
//        Assert.assertTrue(actualMessage.contains("Thanks for submitting the form"),
//                "Confirmation message is incorrect.");

        // Assert that a specific element is displayed
        WebElement closeIcon = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Assert.assertTrue(closeIcon.isDisplayed(), "Close icon is not displayed.");

        // Assert that a condition is false (here, an element that should not be present)
        boolean isElementPresent = !driver.findElements(By.linkText("Non-existent Element")).isEmpty();
        Assert.assertFalse(isElementPresent, "Non-existent element should not be present.");

        // Assert that two values are not equal
//        String expectedEmail = "joihndoe@example.com";
//        String actualEmail = driver.findElement(By.xpath("//td[text()='johndoe@example.com']")).getText();
//        Assert.assertNotEquals(actualEmail, expectedEmail, "Email should not match.");

        // Assert that a condition is null (here, an element that should not exist)
        WebElement nonExistentElement = driver.findElement(By.id("non_existent_element"));
        Assert.assertNull(nonExistentElement, "Non-existent element should be null.");
    }


}
