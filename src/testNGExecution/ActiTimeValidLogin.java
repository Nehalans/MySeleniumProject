package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTimeValidLogin {
	
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","username","password"})
  public void validLogin(String browser,String url,String username, String password) throws InterruptedException {
	  
	  if (browser.equalsIgnoreCase("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  
		  ChromeOptions co = new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
	      driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  
		  driver.findElement(By.name("username")).sendKeys(username);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  driver.findElement(By.id("loginButton")).click();
		  
	}
	  
	  else if (browser.equalsIgnoreCase("firefox")) {
		  
          System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  
		  ChromeOptions co = new ChromeOptions();
	      co.addArguments("--remote-allow-origins=*");
	      
	      driver=new ChromeDriver(co);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get(url);
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("username")).sendKeys(username);
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys(password);
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
		
	}
	 
  }
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }
}
