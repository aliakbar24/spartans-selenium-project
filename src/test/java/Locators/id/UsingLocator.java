package Locators.id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        //Locate the element.
        By searchInputLocator = By.id("searchInput");

        //Find the element
        WebElement searchInputElement = driver.findElement(searchInputLocator);

        //Perform the action
        searchInputElement.sendKeys("TV");

        By searchBtnLocator = By.id("searchBtn");
        WebElement searchBtnElement = driver.findElement(searchBtnLocator);
        searchBtnElement.click();
    }
}
