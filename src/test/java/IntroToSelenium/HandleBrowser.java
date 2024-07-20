package IntroToSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowser {
    public static void main(String[] args){
        //Open browser
        ChromeDriver chromeDriver = new ChromeDriver();
        //Navigate to a url
        chromeDriver.get("https://google.com");
    }
}
