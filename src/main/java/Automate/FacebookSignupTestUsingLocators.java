package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignupTestUsingLocators {
    public static void main(String[] args) {

        System.setProperty("webdriver.Chrome.driver", "/Users/vadde.c.sai/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569894%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569894&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D9062010%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=EAIaIQobChMIlP6gkZK0hAMV7g6DAx1uBgPjEAAYASAAEgKpKvD_BwE");

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("vadde");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("chaithanyasai");
        WebElement mobileOrEmail = driver.findElement(By.name("reg_email__"));
        mobileOrEmail.sendKeys("Chaithu@gmail.com");
        WebElement reenter = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]"));
        reenter.sendKeys("Chaithu@gmail.com");
        WebElement newPassword = driver.findElement(By.name("reg_passwd__"));
        newPassword.sendKeys("password12$&_333");
        WebElement birthdayDay = driver.findElement(By.id("day"));
        birthdayDay.sendKeys("25");

        WebElement birthdayMonth = driver.findElement(By.id("month"));
        birthdayMonth.sendKeys("Dec");
        WebElement birthdayYear = driver.findElement(By.id("year"));

        birthdayYear.sendKeys("2001");
        WebElement genderMale = driver.findElement(By.xpath("//input[@value='2']"));
        genderMale.click();
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();
       // WebElement loginLink = driver.findElement(By.linkText("Log In"));
       // WebElement signUpLink = driver.findElement(By.partialLinkText("Sign up for"));
        //signUpLink.click();

    }
}

