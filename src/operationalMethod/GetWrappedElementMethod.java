package operationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/CHAHAT/Documents/MultiSelectDropdown.html");
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		
		Select sel = new Select(dropDownElement);
		
		WebElement value = sel.getWrappedElement();
		
		String option = value.getText();
		System.out.println(option);
		
	}

}
