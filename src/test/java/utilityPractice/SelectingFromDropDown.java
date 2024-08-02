package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectingFromDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);
       //locate select element in web page
       //find it using driver
        WebElement element = driver.findElement(By.id("programmingLanguageSelect"));

        //Create an object from Select class and pass the element
        Select programmingSelect = new Select(element);

        //Option 1- Select from drop down is using index number.
        //programmingSelect.selectByIndex(2);

        //Option 2- Select from drop down using value attribute.
        //programmingSelect.selectByValue("cPlusPlus");

        //Option 3- Select from drop down using visible text of options.
        programmingSelect.selectByVisibleText("C#");
    }
}
