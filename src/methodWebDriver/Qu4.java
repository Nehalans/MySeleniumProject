package methodWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Qu4 {
	
	// how to close only child browser
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://omayo.blogspot.com/");
		
		String parentHandle = driver.getWindowHandle();
		
		
		driver.findElement(By.linkText("open a popup window")).click();
		Thread.sleep(2000);
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			
			}
		}

}
