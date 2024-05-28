package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;



    public void openbrowser(String baseUrl) {
        // Launch the browser
        driver = new ChromeDriver(); // launch the ChromeBrowser
        driver.get(baseUrl); // open the URL into the Browser
        driver.manage().window().maximize();// maximize browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public void closeBrowser() {
        driver.quit();

    }
}
