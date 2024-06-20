package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Login {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String Title = driver.getTitle();
		System.out.println("App Title: " +Title);
		driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.saucedemo.com/inventory.html")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
	
		WebElement cardTitleElement = driver.findElement(By.xpath("//a[@id=\"item_4_title_link\"]"));
		        String pageTitle = cardTitleElement.getText();
		        System.out.println("Card Title: " + pageTitle);
	    WebElement priceElement = driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]"));
				String price = priceElement.getText();
				System.out.println("BackPack Price: " + price);
				try {
		            Thread.sleep(2000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		WebElement addToCartMessage = driver.findElement(By.xpath("//span[@class=\"shopping_cart_badge\"]"));
        String messageText = addToCartMessage.getText();

        // Print the message to the console
        System.out.println("Add to Cart Message: " + messageText);
		driver.findElement(By.xpath("//button[@id=\"remove-sauce-labs-backpack\"]")).click();
		try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Clicked the remove button for sauce labs backpack.");
		driver.findElement(By.xpath("//option[@value=\"az\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Clicked the option with value 'az'.");
		driver.findElement(By.xpath("//option[@value=\"za\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Clicked the option with value 'za'.");
		driver.findElement(By.xpath("//option[@value=\"lohi\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Clicked the option with value 'lohi'.");
		driver.findElement(By.xpath("//option[@value=\"hilo\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("Clicked the option with value 'hilo'.");
		driver.findElement(By.xpath("//button[@id=\"react-burger-menu-btn\"]")).click();
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		driver.findElement(By.xpath("//a[@id=\"about_sidebar_link\"]")).click();
		
	}

}
