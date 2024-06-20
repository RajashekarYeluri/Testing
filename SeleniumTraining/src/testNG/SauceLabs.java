package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SauceLabs {

	String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
	public WebDriver driver;

	@Test(priority = 0)
	public void AppLaunch() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority = 1)
	public void EnterLoginDetails() {
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();

	}

	@Test(priority = 2)
	public void MenuAboutUsClick() {
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();
		driver.get("https://saucelabs.com/");
	}
	@Test(priority = 8)
	public void SolutionsCIandCD() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();
		driver.findElement(By.xpath("//span[text()='CI/CD pipeline optimization']")).click();
		

		// Check if new tab is opened
		boolean newTabOpened = true;
		// Check if new tab is successfully opened
		if (newTabOpened) {
			System.out.println("New tab opened successfully.");
		} else {
			System.out.println("New tab opening failed.");
		}
		// Get the handle of the current tab
				String originalTab = driver.getWindowHandle();
				// Switch to the new tab
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(originalTab)) {
						driver.switchTo().window(handle);
						break;
					}
				}
				// Switch back to the original tab
				driver.switchTo().window(originalTab);
		driver.get("https://saucelabs.com/");
	}


	@Test(priority = 3)
	public void SolutionsBetaTesting() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();
		driver.findElement(By.xpath("//span[text()='Mobile beta testing']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Optimize mobile beta testing and streamline Android and iOS app distribution")) {
			System.out.println("SolutionsBetaTesting text is Present.");
		} else {
			System.out.println("SolutionsBetaTesting text is not Present.");
		}	
		driver.get("https://saucelabs.com/");

	}

	@Test(priority = 9)
	public void SolutionsContinuesTesting() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click(); 

		// Click on the link that opens in a new tab
		driver.findElement(By.xpath("//span[text()='Continuous testing']")).click();

		// Check if new tab is opened
		boolean newTabOpened = true;
		// Check if new tab is successfully opened
		if (newTabOpened) {
			System.out.println("New tab opened successfully.");
		} else {
			System.out.println("New tab opening failed.");
		}
		// Get the handle of the current tab
				String originalTab = driver.getWindowHandle();
				// Switch to the new tab
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(originalTab)) {
						driver.switchTo().window(handle);
						break;
					}
				}
				// Switch back to the original tab
				driver.switchTo().window(originalTab);
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 4)
	public void SolutionsTestAnalytics() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click();  
		driver.findElement(By.xpath("//span[text()='Test analytics']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Improve test efficiency with actionable insights")) {
			System.out.println("SolutionsTestAnalytics text is Present.");
		} else {
			System.out.println("SolutionsTestAnalytics text is not Present.");
		}	
		driver.get("https://saucelabs.com/");

	}

	@Test(priority = 5)
	public void SolutionsDebugging() {
		driver.findElement(By.xpath("//span[text()='Solutions']")).click(); 
		driver.findElement(By.xpath("//span[text()='Debugging']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Find and fix bugs faster and more efficiently")) {
			System.out.println("SolutionsDebugging text is Present.");
		} else {
			System.out.println("SolutionsDebugging text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 10)
	public void DevelopersDocumentation() {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();  
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();

		// Check if new tab is opened
		boolean newTabOpened = true;
		// Check if new tab is successfully opened
		if (newTabOpened) {
			System.out.println("New tab opened successfully.");
		} else {
			System.out.println("New tab opening failed.");
		}
		// Get the handle of the current tab
				String originalTab = driver.getWindowHandle();
				// Switch to the new tab
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(originalTab)) {
						driver.switchTo().window(handle);
						break;
					}
				}
				// Switch back to the original tab
				driver.switchTo().window(originalTab);
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 6)
	public void DevelopersSelenium() {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();  
		driver.findElement(By.xpath("//span[text()='Selenium']")).click();
		// Check if new tab is opened
				boolean newTabOpened = true;
				// Check if new tab is successfully opened
				if (newTabOpened) {
					System.out.println("New tab opened successfully.");
				} else {
					System.out.println("New tab opening failed.");
				}
				// Get the handle of the current tab
						String originalTab = driver.getWindowHandle();
						// Switch to the new tab
						for (String handle : driver.getWindowHandles()) {
							if (!handle.equals(originalTab)) {
								driver.switchTo().window(handle);
								break;
							}
						}
						// Switch back to the original tab
						driver.switchTo().window(originalTab);
		driver.get("https://saucelabs.com/");
	}
	@Test(priority = 11)
	public void DevelopersPlaywright()  {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();  
		driver.findElement(By.xpath("//span[text()='Playwright']")).click();
		// Check if new tab is opened
				boolean newTabOpened = true;
				// Check if new tab is successfully opened
				if (newTabOpened) {
					System.out.println("New tab opened successfully.");
				} else {
					System.out.println("New tab opening failed.");
				}
				// Get the handle of the current tab
				String originalTab = driver.getWindowHandle();
				// Switch to the new tab
				for (String handle : driver.getWindowHandles()) {
					if (!handle.equals(originalTab)) {
						driver.switchTo().window(handle);
						break;
					}
				}
				// Switch back to the original tab
				driver.switchTo().window(originalTab);
				driver.get("https://saucelabs.com/");
	
}
	
	@Test(priority = 7)
	public void DevelopersFAQs() {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();  
		driver.findElement(By.xpath("//span[text()='FAQs']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Sauce Labs FAQs")) {
			System.out.println("DevelopersFAQs text is Present.");
		} else {
			System.out.println("DevelopersFAQs text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}
	
}

