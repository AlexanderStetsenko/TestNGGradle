package Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by St on 20.11.2016.
 */
public class DriverSingleton {

    private static DriverSingleton instance;
    private WebDriver driver = MyDriverFactory.getDriver(System.getProperty("driver"));

    private DriverSingleton()
    {

    }

    public static DriverSingleton driverGetInstance()
    {
        if( instance == null)
        {
            instance = new DriverSingleton();
        }else System.out.println("driver is working");
        return instance;
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
