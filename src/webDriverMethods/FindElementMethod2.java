package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\CHAHAT\\Downloads\\CheckBox.html");
		
		WebElement automationCheckBox = driver.findElement(By.id("i4"));
		System.out.println(automationCheckBox);
		
		automationCheckBox.click();
		Thread.sleep(2000);
		
		driver.navigate().to("http://ibarar-pc/login.do");
		driver.manage().window().maximize();
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("admin");
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}

}