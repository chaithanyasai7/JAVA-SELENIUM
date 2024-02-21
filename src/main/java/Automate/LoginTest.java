//package Automate;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class LoginTest {
//
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
//         driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//@Test
//    public void testLogin() {
//        driver.get("https://www.example.com/login");
//        WebElement usernameInput = driver.findElement(By.id("username"));
//        WebElement passwordInput = driver.findElement(By.id("password"));
//        WebElement loginButton = driver.findElement(By.id("loginButton"));
//
//        usernameInput.sendKeys("chaithanya");
//        passwordInput.sendKeys("1234@3456");
//        loginButton.click();
//
//        String expectedUrl = "https://www.example.com/dashboard";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl, "Login failed! Redirected to incorrect page.");
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
//
//
