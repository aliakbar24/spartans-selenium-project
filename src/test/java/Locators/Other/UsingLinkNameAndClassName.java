package Locators.Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkNameAndClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        By singInLocator = By.linkText("Sign in");
        WebElement singInElement = driver.findElement(singInLocator);
        singInElement.click();

        By emailLocator = By.name("email");
        WebElement emailElement = driver.findElement(emailLocator);
        emailElement.sendKeys("wrongEmail@gmail.com");

        By passwordLocator = By.name("password");
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys("Password123");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBtnElement = driver.findElement(loginBtnLocator);
        loginBtnElement.click();

        Thread.sleep(1000);

        By errorLocator = By.className("error");
        WebElement errorElement = driver.findElement(errorLocator);
        String errorText = errorElement.getText();

        System.out.println(errorText);

        driver.quit();
    }
}
