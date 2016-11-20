package Tests;

import Drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Created by St on 20.11.2016.
 */
public class BaseTest {

    WebDriver driver;
    @BeforeSuite
    public void setUpSuite() throws Exception {
        System.out.println("We use " + System.getProperty("driver") + " driver");
        driver = DriverSingleton.driverGetInstance().getDriver();


    }

    @Test
    public void testName() throws Exception {
        System.out.println(" test is working.... ");
        driver.get("https://google.com");
    }
}
