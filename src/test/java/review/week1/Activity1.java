package review.week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {

        //In Retail app, click on sign in then click on Create new Account
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");

        By signInLocator = By.id("signinLink");
        WebElement signInElement = driver.findElement(signInLocator);
        signInElement.click();

        By createNewAccountLocator = By.id("newAccountBtn");
        WebElement createNewAccountElement = driver.findElement(createNewAccountLocator);
        createNewAccountElement.click();

        //Fill up the form and sign up. Expectation is to create new account.
        By nameInputLocator = By.id("nameInput");
        WebElement nameInputElement = driver.findElement(nameInputLocator);
        nameInputElement.sendKeys("ali akbar");

        String emailPrefix = "ali.akbar";
        int number = (int) (Math.random() * 1000);
        String randomEmail = emailPrefix + number + "@gmail.com";

        By emailInputLocator = By.id("emailInput");
        WebElement emailInputElement = driver.findElement(emailInputLocator);
        emailInputElement.sendKeys(randomEmail);

        By passwordInputLocator = By.id("passwordInput");
        WebElement passwordInputElement = driver.findElement(passwordInputLocator);
        passwordInputElement.sendKeys("AA@tekschool123");

        By confirmPasswordInputLocator = By.id("confirmPasswordInput");
        WebElement confirmPasswordInputElement = driver.findElement(confirmPasswordInputLocator);
        confirmPasswordInputElement.sendKeys("AA@tekschool123");

        By signupBtnLocator = By.id("signupBtn");
        WebElement signupBtnElement = driver.findElement(signupBtnLocator);
        signupBtnElement.click();

        Thread.sleep(2000);

        //Once account created make sure profile picture is displayed. (isDisplayed)
        By profileLocator = By.id("profileImage");
        WebElement profileElement = driver.findElement(profileLocator);

        //Print result of isDisplayed method.
        boolean isProfileDisplayed = profileElement.isDisplayed();

        if (isProfileDisplayed){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

        driver.quit();


    }
}
