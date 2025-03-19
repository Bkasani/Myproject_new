package mytest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyDriver {
@Test
	public static void LoginTest() throws InterruptedException {
		// WebDriverManager.chromedriver();
		// WebDriverManager.edgedriver().setup();

		//WebDriver driver = WebDriverManager.chromedriver().create();

		 WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		

		
		
		

	}

	public void highlighter(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("agruments[0].setAttribute('style','border:2px solid red;background:yellow')",element);

	}

}
