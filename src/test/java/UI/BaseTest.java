package UI;

import Driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public static WebDriver driver;

    @BeforeClass
    public void setDriver() {
        DriverManager.createDriver();
        driver = DriverManager.getDriver();
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }

}
