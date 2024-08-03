package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumUtility {

    private WebDriver driver;
    private WebDriverWait wait;

    public seleniumUtility(WebDriver driver) {
        this.driver = driver;
        //Declare WebDriver Wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void clickOnElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendTextToElement(By locator, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }

    public String getElementText(By locator){
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        System.out.println(text);
        return text;
    }
}
