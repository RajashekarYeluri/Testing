package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GroupsTest {

	String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
	public WebDriver driver;

	@Test(groups= {"smoke"})
	public void AppLaunch() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test(groups= {"smoke"})
	public void EnterLoginDetails() {
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

	}

	@Test(groups= {"smoke"})
	public void MenuAboutUsClick() {
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();
		
	}
	@Test(groups= {"functional"})
	public void ProductsPlatform() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//span[text()='Platform for Test']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("The unified platform")) {
			System.out.println("ProductsPlatform text is Present.");
		} else {
			System.out.println("ProductsPlatform text is not Present.");
		}	
		driver.get("https://saucelabs.com/");

	}

	@Test(groups= {"sanity"})
	public void ProductsSauceCross() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//span[text()='Sauce Cross-Browser']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Test your apps and websites")) {
			System.out.println("ProductsSauceCross text is Present.");
		} else {
			System.out.println("ProductsSauceCross text is not Present.");
		}	
		driver.get("https://saucelabs.com/");

	}

	@Test(groups= {"regression"})
	public void ProductsSauceMobile() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();  
		driver.findElement(By.xpath("//span[text()='Sauce Mobile']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Deliver seamless mobile app")) {
			System.out.println("ProductsSauceMobile text is Present.");
		} else {
			System.out.println("ProductsSauceMobile text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(groups= {"smoke", "regression"})
	public void ProductsSauceLowCode() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();  
		driver.findElement(By.xpath("//span[text()='Sauce Low-Code']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Low-code test automation accelerated")) {
			System.out.println("ProductsSauceLowCode text is Present.");
		} else {
			System.out.println("ProductsSauceLowCode text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(groups= {"smoke", "sanity"})
	public void ProductsSauceErrorReport() {
		driver.findElement(By.xpath("//span[text()='Products']")).click();
		driver.findElement(By.xpath("//img[@alt='location']")).click(); 
		// Check if the button click was successful
		if (driver.getPageSource().contains("Find and fix errors")) {
			System.out.println("ProductsSauceErrorReport text is Present.");
		} else {
			System.out.println("ProductsSauceErrorReport text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(groups= {"sanity", "functional"})
	public void SolutionsEnterprise() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();  
		driver.findElement(By.xpath("//span[text()='Enterprise']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Fast, reliable, and scalable testing solutions")) {
			System.out.println("SolutionsDropdown text is Present.");
		} else {
			System.out.println("SolutionsDropdown text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(groups= {"smoke", "functional"})
	public void SolutionsTeams() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();  
		driver.findElement(By.xpath("//span[text()='Teams']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Get started and move fast")) {
			System.out.println("SolutionsTeams text is Present.");
		} else {
			System.out.println("SolutionsTeams text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}
	
}

