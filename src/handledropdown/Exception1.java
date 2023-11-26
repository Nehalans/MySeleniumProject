package handledropdown;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exception1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/CHAHAT/Documents/MultiSelectDropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.xpath("//select[@name='menu']"));
		
		Select sel = new Select(dropDownElement);
        sel.selectByVisibleText("Samosa");
        Thread.sleep(8000);
		sel.deselectByVisibleText("Samosa");
		driver.close();

		}
	}
