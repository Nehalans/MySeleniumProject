package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/?cp=76060516106_aff_bB3P*8BMeuM&ranMID=41134&ranEAID=bB3P*8BMeuM&ranSiteID=bB3P.8BMeuM-uCX6HWzjUMlK1Rli7FMS6A");
		driver.findElement(By.xpath("//input[@id=\"98d60526-baa3-4fab-bc7c-90b1b029d8be\"]")).sendKeys("nehal@97");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nehal876");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='SIGN IN']")).click();
	}

}
