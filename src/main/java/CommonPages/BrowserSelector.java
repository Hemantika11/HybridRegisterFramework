package CommonPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {

    //Create an object to call load property

    LoadProperty loadProperty = new LoadProperty();

    String browserName = loadProperty.getProperty("browser");

    public void openSelectedBrowser()
    {
        //Open in Local Machine
        if (browserName.equals("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browserName.equals("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browserName.equals("edge"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        else
        {
            System.out.println("Browser not matched");
        }
        //Maximising browser window
        driver.manage().window().maximize();
        //Deleting cookies
        driver.manage().deleteAllCookies();
        //Page Loading timeout
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.SECONDS);
        //Applying implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Open Url
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }
}