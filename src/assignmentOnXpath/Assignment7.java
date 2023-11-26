package assignmentOnXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		List<WebElement> mobiles = (List<WebElement>) driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> priceOfMobiles = (List<WebElement>) driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"));
		
		for(int i=0; i<mobiles.size(); i++)
		{
			String op = ((org.openqa.selenium.WebElement) mobiles.get(i)).getText();
			
			for(int j=0; j<=i; j++)
			{
				String opt = (String) ((org.openqa.selenium.WebElement) priceOfMobiles.get(j)).getText();
				Thread.sleep(2000);
				
				
			}
		}
	}

}

