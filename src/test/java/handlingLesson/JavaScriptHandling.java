package handlingLesson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptHandling {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("alertBtn")).click();

        //Option 1- Switch to alert when it pops up
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);

        alert.accept();

        //Example: when alert accepting user input
        alert.sendKeys("Entering some value to alert");

        //when you want to cancel the alert or dismiss it
        alert.dismiss();



    }
}
