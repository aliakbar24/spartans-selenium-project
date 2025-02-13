package tableLesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilityPractice.seleniumUtility;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingActivity {
    /*
    On insurance app "https://dev.insurance.tekschool-students.com/", log in with
    supervisor / tek_supervisor credentials, and go to plans section and map plan type with
    plan base price.
    Use SeleniumUtility
    Auto= $140.00
    Renter= $XX.XX
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.insurance.tekschool-students.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        seleniumUtility utility = new seleniumUtility(driver);
        utility.clickOnElement(By.linkText("Login"));

        utility.sendTextToElement(By.name("username"), "supervisor");
        utility.sendTextToElement(By.name("password"), "tek_supervisor");
        utility.clickOnElement(By.xpath("//button[text()='Sign In']"));

        utility.clickOnElement(By.linkText("Plans"));

        List<WebElement> tableRows = utility.getElements(By.xpath("//table/tbody/tr"));

        Map<String, String> plans = new HashMap<>();

        for (int row = 0; row < tableRows.size(); row++) {
            String xpathForPlanType = "//table/tbody/tr[" + (row + 1) + "]/td[2]";
            String xpathForPrice = "//table/tbody/tr[" + (row + 1) + "]/td[3]";

            String planeTypeKey = utility.getElementText(By.xpath(xpathForPlanType));
            String planePriceValue = utility.getElementText(By.xpath(xpathForPrice));

            plans.put(planeTypeKey, planePriceValue);

        }
        System.out.print(plans);

        //[PlaneType=Motorcycle, Plan Base price=104, Date Created=July 24, 2024, Date Expire= July 24, 2024]
        //[PlaneType=Motorcycle, Plan Base price=104, Date Created=July 24, 2024, Date Expire= July 24, 2024]
        //[PlaneType=Motorcycle, Plan Base price=104, Date Created=July 24, 2024, Date Expire= July 24, 2024]
        //[PlaneType=Motorcycle, Plan Base price=104, Date Created=July 24, 2024, Date Expire= July 24, 2024]
        //List<Map<String,String>     Map< KEY, Map<String, String>>
        List<Map<String, String>> data = new ArrayList<>();
        for (int row = 0; row < tableRows.size(); row++) {
            Map<String, String> rowData = new HashMap<>();
            List<WebElement> columns = utility.getElements(By.xpath("//table/tbody/tr[1]/td"));
            for (int col = 0; col < columns.size(); col++) {
                if (col == 0) continue;

                String xpathFromHeader = "//table/thead/tr/th[" + (col + 1) + "]";
                String xpathCell = "//table/tbody/tr[" + (row + 1) + "]";

                String key = utility.getElementText(By.xpath(xpathFromHeader));
                String value = utility.getElementText(By.xpath(xpathCell));

                rowData.put(key, value);
            }
            data.add(rowData);
        }
        System.out.println(data);
        driver.quit();
        
    }
}
