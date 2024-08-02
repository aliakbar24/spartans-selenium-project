package tableLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TableActivity {
    public static void main(String[] args){
        /*
        On insurance app "https://dev.insurance.tekschool-students.com/", login with supervisor credentials
        supervisor / tek_supervisor
        and go to plans section then print all the price values from table.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.linkText("Login")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.name("username"))).sendKeys("supervisor");
        wait.until((ExpectedConditions.visibilityOfElementLocated
                (By.name("password")))).sendKeys("tek_supervisor");
        wait.until(ExpectedConditions.elementToBeClickable
                (By.cssSelector("div > button[type = 'submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Plans"))).click();

        List<WebElement> pricesElement = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));

        for(WebElement element : pricesElement) {
            System.out.println(element.getText());

        }
        driver.quit();

    }
}
