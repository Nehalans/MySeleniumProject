package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.className("q")).sendKeys("Ranveer Singh",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.className("GOE98c")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
