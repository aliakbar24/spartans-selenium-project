package utilityPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UsefulMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("Sign in")).click();

        driver.findElement(By.name("email")).sendKeys("akbar.ali@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Password@123");

        //If tyre means it is enabled. If false means element is disables.
        boolean isButtonEnabled = driver.findElement(By.id("loginBtn")).isEnabled();
        System.out.println(isButtonEnabled);

        //getting attribute values
        WebElement newCompanyElement = driver.findElement(By.id("newCompanyAccount"));

        String hrefAttribute = newCompanyElement.getAttribute("href");
        System.out.println(hrefAttribute);

        String classAttribute = newCompanyElement.getAttribute("class");
        System.out.println(classAttribute);
        driver.quit();
    }
}
