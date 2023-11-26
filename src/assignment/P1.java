package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://appdividend.com/2022/09/08/method-overriding-in-java/");
		driver.findElement(By.id("")).sendKeys("Nehal");
		Thread.sleep(2000);
		driver.findElement(By.id("")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.close();
	}        

}
