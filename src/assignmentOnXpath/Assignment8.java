package assignmentOnXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("http://ibarar-pc/login.jsp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}


