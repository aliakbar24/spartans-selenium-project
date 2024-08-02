package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Activity2 {
    public static void main(String[] args){
        /*
        From the page https:retail.tekschool-students.com/selenium/dropdown
        select website's language drop down select last option.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https:retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement languageElement = driver.findElement(By.id("languageSelect"));
        Select languageSelect = new Select(languageElement);
        List<WebElement> options = languageSelect.getOptions();
        int size = options.size();

        languageSelect.selectByIndex(size - 1);
    }
}
