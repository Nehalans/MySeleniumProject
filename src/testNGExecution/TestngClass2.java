package testNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestngClass2 extends BaseTest {
  @Test
  public void f() {
	  
	  driver.switchTo().activeElement().sendKeys("SQL Method",Keys.ENTER);
  
  }
  
}
