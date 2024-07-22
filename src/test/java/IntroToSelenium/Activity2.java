package IntroToSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity2 {
    public static void main(String[] args) {
        //Navigate to "https:dev.insurance.tekschool-students.com/"
        ChromeDriver chromeDriver = new ChromeDriver();
        //Maximize windows
        chromeDriver.manage().window().maximize();
        //Print title
        chromeDriver.get("https:dev.insurance.tekschool-students.com/");
        String title = chromeDriver.getTitle();
        System.out.println(title);
        //Close browser
        chromeDriver.quit();
        //Push changes to repository
    }
}
