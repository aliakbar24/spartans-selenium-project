package IntroToSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args){
        //Open browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Use this to maximize the screen size
        chromeDriver.manage().window().maximize();
        //Navigate to a url
        chromeDriver.get("https://google.com");
        //return string of application title.
        String title = chromeDriver.getTitle();
        System.out.println(title);
        //to close the window
        chromeDriver.quit();
    }
}
