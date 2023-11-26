package testNGExecution;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Testngclass1 extends BaseTest {
  @Test
  public void f() {
	  
	  driver.switchTo().activeElement().sendKeys("Manual testing",Keys.ENTER);
  }
}
