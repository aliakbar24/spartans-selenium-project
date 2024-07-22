package crossbrowsing;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsing {
    public static void main(String[] args){
        EdgeDriver driver = new EdgeDriver();
        //You can change the driver and open another web browser
        //FirefoxDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");

        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();
    }
}
