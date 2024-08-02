package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args){
        /*
        From the page https:retail.tekschool-students.com/selenium/dropdown
        select your country drop down and select the United States.
         */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:retail.tekschool-students.com/selenium/dropdown");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement element = driver.findElement(By.id("countrySelect"));

        Select countrySelect = new Select(element);

        countrySelect.selectByVisibleText("United States");
    }
}
