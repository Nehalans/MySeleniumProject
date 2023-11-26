package assignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zoom.us/signin#/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nehal87@gmai.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='js_btn_login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Terms of Service']")).click();
		Thread.sleep(2000);
		
	}

}
