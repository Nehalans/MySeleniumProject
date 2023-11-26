package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
  @Test
  public void dm4() {
	  
	  Reporter.log("Friday", true);
  }
  
  @Test
  public void dm5() {
	  
	  Reporter.log("main start", true);
	  
  }
}
