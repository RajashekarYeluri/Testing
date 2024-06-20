package screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshot {

	
		@Test
		public static void captureScreenMethod() throws Throwable{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe");  
		WebDriver driver  = new FirefoxDriver();

		driver.manage().window().maximize();
       
		try{
			
		//driver.get("https://www.softwaretestingmaterial.com");
	    driver.get("https://www.saucedemo.com");

		driver.navigate().refresh();

		//driver.findElement(By.xpath("//*[@id= 'cse-search-box']/div/input[4]")).sendkeys("agile");  //Statement with correct Xpath
		driver.findElement(By.xpath("//*[@id= 'user-name']")).sendKeys("standard_user"); //Statement with incorrect Xpath
		driver.findElement(By.xpath("//*[@id= 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id= 'login-button']")).click();
		driver.findElement(By.xpath("//*[@id= 'add-to- ']"));
		


		}catch(Exception e) {

		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("D:\\Shekar.png"));
		}
		  
	}

}
