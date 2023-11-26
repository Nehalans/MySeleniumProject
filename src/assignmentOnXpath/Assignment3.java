package assignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://affiliate.flipkart.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("nehal123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("987654321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='submitLogin']")).click();
		Thread.sleep(2000);
	}

}


