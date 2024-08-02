package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleDropDownWithOutSelect {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retial.tekschool-students.com/selenium/dynamic-select");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//p[text()='From']following-sibling::input")).click();

        List<WebElement> fromOptions = driver.findElements
                (By.xpath("//p[text()='From']following-sibling::ul/li"));

        //fromOptions.get(2).click(); //this is the easiest option
        for(WebElement option : fromOptions) {
            String text = option.getText();

            if (text.equals("Bamyan")){
                option.click();
                break;
            }
    }

    }
}
