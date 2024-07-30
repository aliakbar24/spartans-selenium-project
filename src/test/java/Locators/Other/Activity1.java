package Locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    /*
    In Retail app go to create new account and create new account.
    Use name, id, linkText or anything that is available.
    15min.
     */
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By singInLocator = By.linkText("Sign in");
        WebElement signInElement = driver.findElement(singInLocator);
        signInElement.click();

        //simpler method = all in one line
        driver.findElement(By.linkText("Create New Account")).click();

        driver.findElement(By.name("name")).sendKeys("Ali");

        driver.findElement(By.name("email")).sendKeys("ali@132@gmail.com");

        driver.findElement(By.name("password")).sendKeys("Password@123");

        driver.findElement(By.name("confirmPassword")).sendKeys("Passwrod@123");

        driver.findElement(By.id("signInBtn")).click();

        String errorText = driver.findElement(By.className("error")).getText();

        System.out.println(errorText);

        driver.quit();
    }
}
