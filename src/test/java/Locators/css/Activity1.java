package Locators.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        In Retail app navigate to sing in page and log in with valid credentials, and after you sing in,
        go to the account page and print your email.

        Only use CSS selector.
        Make sure to push to GitHub at the end.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#signinLink")).click();

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("akbar.ali@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Password@123");
        driver.findElement(By.cssSelector(".login__submit")).click();

        Thread.sleep(1000);

        driver.findElement(By.cssSelector("#accountLink")).click();

        String actualEmailText = driver.findElement(By.cssSelector("div.account__information-detail > h1:last-child")).getText();

        System.out.println(actualEmailText);

        driver.quit();


    }
}
