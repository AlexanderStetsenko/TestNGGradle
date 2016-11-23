package Steps;

import Drivers.DriverSingleton;
import Tests.BaseTest;
import Tests.LoginTests;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by St on 22.11.2016.
 */
public class Steps {
    @When("^start$")
    public void start() throws Throwable {
        WebDriver driver = DriverSingleton.driverGetInstance().getDriver();
        driver.get("https:google.com");

    }

    @Then("^end$")
    public void end() throws Throwable {
        System.out.println("asada");
    }

    @And("^asdasd$")
    public void asdasd() throws Throwable {
        System.out.println("sdfsdf");
    }

    @Then("^end(\\d+)$")
    public void end(int arg0) throws Throwable {
       throw new Exception("asdasdasd");

    }
}
