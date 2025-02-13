package crossbrowsing;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowsingHandling {
    public static void main(String[] args){
       //Activity is to find a way to ask user where to run
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser would you like to run: ");
        String browserType = scanner.next();

        WebDriver driver;

        if (browserType.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Wrong Driver");
        }
        driver.get("https://google.com");
    }
}
