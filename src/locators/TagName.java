package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/CHAHAT/Desktop/Selenium%20Data/Webelement/usernameTB.html");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("prajwal");
		Thread.sleep(2000);
		driver.close();
	}
}
