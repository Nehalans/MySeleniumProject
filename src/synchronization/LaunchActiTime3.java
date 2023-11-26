package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime3 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://ibarar-pc/login.do");
		 
		 // explicitly wait
		 
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		// wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		 
		 System.out.println("Login page title is verified!!!");
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click(); 
		 
		 
		// wait.until(ExpectedConditions.titleContains("Nehal"));

	     String actualHomePageTitle = driver.getTitle();
		 System.out.println("Home page title is verified!!!");
		 
		 
		 
		 
		 

}

}
