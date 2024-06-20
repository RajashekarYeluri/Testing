package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SauceDemo {

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
	public void FMenuAboutUsClick() {
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();
	}
	@Test(priority = 3)
	public void DevelopersCypress() {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();
		driver.findElement(By.xpath("//span[text()='Cypress']")).click();
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
	public void DevelopersAppiumTesting() throws Exception {
		driver.findElement(By.xpath("//span[text()='Developers']")).click();
		driver.findElement(By.xpath("//span[text()='Appium']")).click();
		Thread.sleep(2000);
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

	@Test(priority = 5)
	public void ResourcesBlog() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click(); 
		driver.findElement(By.xpath("//span[text()='Blog']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Test automation tutorials,")) {
			System.out.println("ResourcesBlog text is Present.");
		} else {
			System.out.println("ResourcesBlog text is not Present.");
		}
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 6)
	public void ResourcesWebinars() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click();  
		driver.findElement(By.xpath("//span[text()='Webinars']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Join a live webinar or watch a past webinar on demand")) {
			System.out.println("ResourcesWebinars text is Present.");
		} else {
			System.out.println("ResourcesWebinars text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 7)
	public void ResourcesDatasheets() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click(); 
		driver.findElement(By.xpath("//span[text()='Data sheets']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Learn more about Sauce solutions")) {
			System.out.println("ResourcesDatasheets text is Present.");
		} else {
			System.out.println("ResourcesDatasheets text is not Present.");
		}
		driver.get("https://saucelabs.com/");
	}

	@Test(priority = 8)
	public void ResourcesCaseStudy() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click();  
		driver.findElement(By.xpath("//span[text()='Case studies']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Get started and move fast")) {
			System.out.println("ResourcesCaseStudy text is Present.");
		} else {
			System.out.println("ResourcesCaseStudy text is not Present.");
		}	

		driver.get("https://saucelabs.com/");
	}
	
	@Test(priority = 9)
	public void ResourcesTEIStudy() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click();  
		driver.findElement(By.xpath("//span[text()='TEI Study']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("Discover the potential ROI")) {
			System.out.println("ResourcesTEIStudy text is Present.");
		} else {
			System.out.println("ResourcesTEIStudy text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}
	
	@Test(priority = 10)
	public void ResourcesVideo() {
		driver.findElement(By.xpath("//span[text()='Resources']")).click();  
		driver.findElement(By.xpath("//span[text()='Videos']")).click();
		// Check if the button click was successful
		if (driver.getPageSource().contains("How-to's, demos, and solutions for Sauce Labs products and beyond")) {
			System.out.println("ResourcesVideo text is Present.");
		} else {
			System.out.println("ResourcesVideo text is not Present.");
		}	
		driver.get("https://saucelabs.com/");
	}
	@Test(priority = 11)
	public void SearchEngine() throws Exception {

		// Store the current window handle
		String originalHandle = driver.getWindowHandle();

		// Perform search action
		WebElement searchButton = driver.findElement(By.xpath("//img[@alt='search']"));
		searchButton.click();

		// Find the search input field
		WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
		searchInput.sendKeys("Sauce Labs");

		// Switch back to the original tab
		driver.switchTo().window(originalHandle);
		Thread.sleep(2000);
		driver.get("https://saucelabs.com/");
	}
	@Test(priority = 12)
	public void TryitNowButton() {
		driver.findElement(By.xpath("//button[text()='Try it free']")).click();  
		// Check if the button click was successful
		if (driver.getPageSource().contains("Already have an account?")) {
			System.out.println("TryitNowButton text is Present.");
		} else {
			System.out.println("TryitNowButton text is not Present.");
		}
	}	


	

}


