package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodExe {
	
  @Test
  public void method1() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" is the treadId", true);
	  Reporter.log("method1", true);
  }
  @Test
  public void method2() {
	  
	  long threadId = Thread.currentThread().getId();
	  Reporter.log(threadId+" is the treadId", true);
	  Reporter.log("method1", true);
  }
  
  
}
