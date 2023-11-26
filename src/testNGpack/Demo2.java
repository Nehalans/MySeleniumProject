package testNGpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void dm2() {
	  
	  int a= 6;
	  int b=0;
	  int res=a/b;
	  
	  Reporter.log("Tuesday!!"+res, true);
	 
  }
  
  @Test
  public void m3()
  {
	  Reporter.log("Method name is m3", true);
  }
  
  @Test
  public void m4()
  {
	  Reporter.log("Method name is m4", true);
  }
}
