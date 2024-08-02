package handlingLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertActivity1 {
    /*
    in link here "https://retail.tekschool-students.com/selenium/javascript-alerts"
    click on prompt button and when alert opens enter your name in the alert input box and click okay.
    Print the text below the alert.
     */
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("promptBtn")).click();

        //Option 1-
        //Alert alert = driver.switchTo().alert();

        //Option 2- using wait and expected condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.sendKeys("Ali Akbar");
        alert.accept();

        String text = driver.findElement(By.id("message")).getText();
        System.out.println(text);

        driver.quit();


    }
}
