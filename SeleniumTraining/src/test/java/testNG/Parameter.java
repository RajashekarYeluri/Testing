package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

    String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
    public WebDriver driver;

    @BeforeTest
    @Parameters("browserName")
    public void InitialiseBrowser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver", driverPath);
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
    }

    @Test
    @Parameters("url")
    public void AppLaunch(String url) {
        driver.get(url);
    }

    
    @Test
    @Parameters({"user-name", "password"})
    public void EnterLoginDetails(String userName, String password) throws Exception {
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
    }
}
