package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by St on 20.11.2016.
 */
public class MyDriverFactory {

    public static WebDriver getDriver(String driverName) {
        WebDriver driver = null;
        switch (driverName){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            default:
                System.out.println("Driver wasn't loaded");
        }
        return driver;
    }
}
