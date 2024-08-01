package Locators.css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();

        By titleLocator = By.cssSelector("div.home__categories-grid > div:nth-child(2) > h1");
        String text = driver.findElement(titleLocator).getText();

        System.out.println(text);

        driver.quit();
    }
}
