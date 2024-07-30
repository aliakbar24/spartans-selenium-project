package Locators.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        In retail App click on video games then choose PS5 console then click add to cart using relative xpath.
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(4000);

        //By locator = By.xpath("//img[@alt='Video Games']");
        //WebElement element = driver.findElement(locator);
        //element.click();
        driver.findElement(By.xpath("//img[@alt='Video Games']")).click();

        Thread.sleep(2000);

        //By productLocator = By.xpath("//p[text='PlayStation 5 Console']");
        //WebElement productElement = driver.findElement(productLocator);
        //productElement.click();
        driver.findElement(By.xpath("//p[text()='PlayStation 5 Console']")).click();
        //Can also use Contain with Text as well on Xpath = //p[contains(text(),'Console')]

        Thread.sleep(2000);

        //By cartBtnLocator = By.xpath("//span[text='Add to Cart']");
        //WebElement cartBtnElement = driver.findElement(cartBtnLocator);
        //cartBtnElement.click();
        driver.findElement(By.xpath("//button[@id='addToCartBtn']")).click();


    }
}
