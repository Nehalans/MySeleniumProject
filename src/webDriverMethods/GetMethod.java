package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
     
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver(); 
	 driver.manage().window().maximize();
	 driver.get("https:/www.instagram.com");
	 System.out.println(driver.getCurrentUrl());
	 
	 
 }
}