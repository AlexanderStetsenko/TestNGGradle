package Tests;

import Drivers.DriverSingleton;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by St on 22.11.2016.
 */

@CucumberOptions(

        format = { "pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber1.json" },
        glue =  "Steps"
         )
public class BaseTest extends AbstractTestNGCucumberTests {

    public WebDriver driver;
    @BeforeSuite
    public void setUpSuite() throws Exception {

        driver = DriverSingleton.driverGetInstance().getDriver();
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDownSuite() throws Exception {
        driver.getClass();
        driver.quit();
    }
}
