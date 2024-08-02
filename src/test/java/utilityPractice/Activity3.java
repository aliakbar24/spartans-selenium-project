package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity3 {
    public static void main(String[] args){
        /*
        In retail app under computer section choose accessories and then choose keyboard and change quantitity
        to 5.
        Use implicit wait.
        Use Explicit wait for all elements.
        Push to repository.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("div > img[alt = 'Accessories']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("div > img[alt = 'Wireless Keyboard and Mouse Combo Backlit']"))).click();

        WebElement quantitySelectorElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.cssSelector("div > select[class = 'product__select']")));
        Select quantitySelector = new Select(quantitySelectorElement);
        quantitySelector.selectByIndex(4);

    }
}
