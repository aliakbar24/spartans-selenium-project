package utilityPractice;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookActivity {
    /*
    Navigate to facebook.com click on create a new account and fill up the form
    DO NOT CLICK ON SIGN UP
     */
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com//");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("Ali");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastname"))).sendKeys("Akbar");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_email__"))).sendKeys("emailAli@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("reg_passwd__"))).sendKeys("Facebook@123");

        WebElement monthElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("month")));
        Select monthSelect = new Select(monthElement);
        monthSelect.selectByIndex(2);

        WebElement dayElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        Select daySelect = new Select(dayElement);
        daySelect.selectByValue("22");

        WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("year")));
        Select yearSelect = new Select(yearElement);
        yearSelect.selectByValue("2001");

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//input[@value='2']"))).click();
    }
}
