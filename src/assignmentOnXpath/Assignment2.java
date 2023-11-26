package assignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://m.facebook.com/login/?refsrc=deprecated");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys("nehal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("nehal@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
	}

}
