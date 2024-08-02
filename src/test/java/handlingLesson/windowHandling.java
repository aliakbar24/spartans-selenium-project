package handlingLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class windowHandling {
    /*
    To handle new tab with selenium get current window id. Before the new tab open then open the new tab.
    Get all tabs id. (Make sure to have only two tabs).
    Loop through all tabs and switch to new tab when the tab is not equal to the current tab.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Step 1- Get current window ID.
        String currentWindowId = driver.getWindowHandle();

        driver.findElement(By.linkText("Test Selenium")).click();
        Thread.sleep(1000);

        //Step 2- Find all the tabs ID.
        Set<String> allTabs = driver.getWindowHandles();

        //Step 3- Switch to new tab.
        for(String tab : allTabs){
            //Finding the id for the new tab
            if(!tab.equals(currentWindowId)){
                driver.switchTo().window(tab);
                break;
            }
        }
        Thread.sleep(1000);

        driver.findElement(By.linkText("Inputs")).click();

        //To close the current tab
        driver.close();

        //Important to switch back.
        driver.switchTo().window(currentWindowId);

        Thread.sleep(1000);

        driver.findElement(By.linkText("Sign in")).click();

        driver.quit();

    }
}
