package Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2Me {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        Thread.sleep(15000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hims conditioner");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='hims Thick Fix Shampoo and Conditioner Set for Men- Thickening, Moisturizing, Reduces Shedding- Color Safe Hair Loss Shamp...']")).click();



    }
}
