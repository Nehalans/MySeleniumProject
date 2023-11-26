package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
  @Test(invocationCount = 5)
  public void ft() {
	  
	  Reporter.log("FTC1 is executing!!", true);
  }
}
