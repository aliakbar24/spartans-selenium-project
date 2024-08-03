package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ActivityReusableObject {
    /*
    In the retail app, sign in with invalid username and password and get the error message.
    Create SeleniumUtility on your own
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        seleniumUtility utility = new seleniumUtility(driver);
        utility.clickOnElement(By.linkText("Sign in"));

        utility.sendTextToElement(By.name("email"), "AliAk@gmail.com");
        utility.sendTextToElement(By.name("password"), "Pass@123");
        utility.clickOnElement(By.id("loginBtn"));

        String text = driver.findElement(By.cssSelector("form > div[class = 'error']")).getText();
        System.out.println(text);
        driver.quit();

    }
}
