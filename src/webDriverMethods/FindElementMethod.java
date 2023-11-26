package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\CHAHAT\\Downloads\\CheckBox.html");
		
		WebElement automationCheckBox = driver.findElement(By.id("i4"));
		System.out.println(automationCheckBox);
		
		automationCheckBox.click();
		
	}

}