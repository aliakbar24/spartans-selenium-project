package Locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
    //Retail APP - Click on login
    //enter email and password
    //Click on login
        WebDriver website = new ChromeDriver();
        Thread.sleep(2000);

        website.manage().window().maximize();
        website.get("https://retail.tekschool-students.com/");

        By signInLocator = By.id("signinLink");
        WebElement signInElement = website.findElement(signInLocator);
        signInElement.click();

        By emailInputLocator = By.id("email");
        WebElement emailInputElement = website.findElement(emailInputLocator);
        emailInputElement.sendKeys("ollikbarr@gmail.com");

        By passWordLocator = By.id("password");
        WebElement passWordElement = website.findElement(passWordLocator);
        passWordElement.sendKeys("Ali123");

        By loginBtnLocator = By.id("loginBtn");
        WebElement loginBrnElement = website.findElement(loginBtnLocator);
        loginBrnElement.click();


    }
}
