package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
	
		// Initiate Firefox browser
		WebDriver driver = new FirefoxDriver();

		// Open the given URL in the browser 
		driver.get("http://www.facebook.com");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Type in the First Name Textbox
		driver.findElement(By.xpath("//*[@id=\"u_0_l\"]")).sendKeys("Test Selenium");
		
		// Click on "Male" Radio Button
		// driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
		
		// Select from Month Dropdown
		Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
		sel1.selectByVisibleText("Sept");
		
		// Select from Day Dropdown
		Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
		sel2.selectByValue("6");
		
		// Select from Year Dropdown
		Select sel3 = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
		sel3.selectByIndex(6);
		
		// Click on "Sign Up" Button
		driver.findElement(By.xpath("//*[@id=\"u_0_15\"]")).click();
		
		/// Click on "Create a Page" Link
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
		
		// Go to previous page
		driver.navigate().back();
		
		// driver.quit();
	}

}
