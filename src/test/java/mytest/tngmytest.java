package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tngmytest {
	 WebDriver driver = new ChromeDriver();
	@Test(priority=0)
	void Openapp() throws InterruptedException {
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		
	}
	@Test(priority=1)
	void Loginapp() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	void logout() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
	
	
}
