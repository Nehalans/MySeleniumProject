package programming;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://www.testdome.com/questions/original/95123");
		
		driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-CodeMirror-HighlightJS-VS']")).click();
		driver.findElement(By.xpath("//div[@style='overflow: hidden; position: relative; width: 3px; height: 0px; top: 5px; left: 679.375px;']")).click();
		Thread.sleep(2000);
		
		
	}

}
