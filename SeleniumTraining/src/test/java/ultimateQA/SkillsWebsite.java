package ultimateQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SkillsWebsite {
	String driverPath = "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe";
	public WebDriver driver;

	@Test(priority = 0)
	public void AppLaunch() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/complicated-page/");

	}
	@Test(priority = 1)
	public void ServicesClick() throws Exception  {
		driver.findElement(By.xpath("//a[text()='Services']")).click();
		Thread.sleep(10000);
		driver.get("https://ultimateqa.com/complicated-page/");
	}

	@Test(priority = 2)
	public void AboutPageClick() throws Exception  {
		driver.findElement(By.xpath("//a[text()='About']")).click();
		Thread.sleep(10000);
		driver.get("https://ultimateqa.com/complicated-page/");
	}
	@Test(priority = 3)
	public void BlogPageClick() throws Exception  {
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
	Thread.sleep(10000);
	driver.get("https://ultimateqa.com/complicated-page/");
		
	}
	@Test(priority = 4)
	public void EducationPagedropdown() throws Exception  {
		driver.findElement(By.xpath("//a[text()='Education']")).click();
		driver.findElement(By.xpath("//a[text()='Java SDET Academy']")).click();
	Thread.sleep(10000);
	driver.get("https://ultimateqa.com/complicated-page/");
		
	}
	@Test(priority = 5)
	public void DetailsPage() throws Exception  {
		driver.findElement(By.xpath("//input[@id=\"et_pb_contact_name_0\"]")).sendKeys("Yeluri Durga Rajashekar");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"et_pb_contact_email_0\"]")).sendKeys("rajshekaruv@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@id=\"et_pb_contact_message_0\"]")).sendKeys("Hi This Is Rajashekar.");
		Thread.sleep(5000);
//		WebElement firstDigitElement = driver.findElement(By.cssSelector("input[data-first_digit]"));
//		WebElement secondDigitElement = driver.findElement(By.cssSelector("input[data-second_digit]"));
		WebElement firstDigitElement = driver.findElement(By.xpath("//input[@data-first_digit]"));
		WebElement secondDigitElement = driver.findElement(By.xpath("//input[@data-second_digit]"));

		int firstDigit = Integer.parseInt(firstDigitElement.getAttribute("data-first_digit"));
		int secondDigit = Integer.parseInt(secondDigitElement.getAttribute("data-second_digit"));

		// Calculating the sum
		int sum = firstDigit + secondDigit;

		// Find the captcha input field
		WebElement captchaInput = driver.findElement(By.xpath("//input[@class='input et_pb_contact_captcha']"));

		// Input the sum into the captcha field
		captchaInput.sendKeys(String.valueOf(sum));
		Thread.sleep(5000);
		
	}
	@Test(priority = 6)
	public void SubmitButton() {
	    driver.findElement(By.xpath("//button[@class=\"et_pb_contact_submit et_pb_button\"]")).click();
	    try {
	        Thread.sleep(10000); 
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }

	    // Locating the success message and printing it.
	    WebElement successMessage = driver.findElement(By.xpath("//div[@id='et_pb_contact_form_0']//div[contains(@class, 'et-pb-contact-message')]"));
	    System.out.println("Success Message: " + successMessage.getText());
	}

}

