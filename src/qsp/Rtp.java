package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select The Browser U Want!!!!");
		String browserValue = sc.next();
		if(browserValue.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserValue.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver","./drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Select The Valid Browser");
		}
	}
}