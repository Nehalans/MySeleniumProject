package handlingPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAlertPopUp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(option);
	    driver.get("file:///E:/Automation/alert.html");
	    
	    driver.findElement(By.xpath("//button[text()='click me!']")).click();
	    
	}

}
